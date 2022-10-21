package com.tpa.stream.api.client.key;

import com.fern.java.jackson.ClientObjectMappers;
import com.tpa.stream.api.client.key.exceptions.CreateException;
import com.tpa.stream.api.client.key.exceptions.DeleteKeyException;
import com.tpa.stream.api.client.key.exceptions.GetException;
import feign.Response;
import feign.codec.ErrorDecoder;
import java.io.IOException;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;

final class PublicKeyServiceErrorDecoder implements ErrorDecoder {
  @Override
  public Exception decode(String methodKey, Response response) {
    try {
      if (methodKey.contains("get")) {
        return decodeException(response, GetException.class);
      }
      if (methodKey.contains("create")) {
        return decodeException(response, CreateException.class);
      }
      if (methodKey.contains("deleteKey")) {
        return decodeException(response, DeleteKeyException.class);
      }
    }
    catch (IOException e) {
    }
    return new RuntimeException("Failed to read response body. Received status " + response.status() + " for method " + methodKey);
  }

  private static <T extends Exception> Exception decodeException(Response response, Class<T> clazz)
      throws IOException {
    return ClientObjectMappers.JSON_MAPPER.reader().withAttribute("statusCode", response.status()).readValue(response.body().asInputStream(), clazz);
  }
}
