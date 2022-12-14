package com.tpa.stream.api.client.claim;

import com.fern.java.jackson.ClientObjectMappers;
import com.tpa.stream.api.client.claim.exceptions.GetAllException;
import com.tpa.stream.api.client.claim.exceptions.GetException;
import feign.Response;
import feign.codec.ErrorDecoder;
import java.io.IOException;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;

final class ClaimsServiceErrorDecoder implements ErrorDecoder {
  @Override
  public Exception decode(String methodKey, Response response) {
    try {
      if (methodKey.contains("getAll")) {
        return decodeException(response, GetAllException.class);
      }
      if (methodKey.contains("get")) {
        return decodeException(response, GetException.class);
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
