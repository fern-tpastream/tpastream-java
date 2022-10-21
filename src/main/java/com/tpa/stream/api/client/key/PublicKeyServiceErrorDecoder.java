package com.tpa.stream.api.client.key;

import com.fern.java.jackson.ClientObjectMappers;
import com.tpa.stream.api.client.key.exceptions.CreateGpgException;
import com.tpa.stream.api.client.key.exceptions.CreateRsaException;
import com.tpa.stream.api.client.key.exceptions.DeleteGpgException;
import com.tpa.stream.api.client.key.exceptions.DeleteRsaException;
import com.tpa.stream.api.client.key.exceptions.GetGpgException;
import com.tpa.stream.api.client.key.exceptions.GetRsaException;
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
      if (methodKey.contains("getGpg")) {
        return decodeException(response, GetGpgException.class);
      }
      if (methodKey.contains("createGpg")) {
        return decodeException(response, CreateGpgException.class);
      }
      if (methodKey.contains("deleteGpg")) {
        return decodeException(response, DeleteGpgException.class);
      }
      if (methodKey.contains("getRsa")) {
        return decodeException(response, GetRsaException.class);
      }
      if (methodKey.contains("createRsa")) {
        return decodeException(response, CreateRsaException.class);
      }
      if (methodKey.contains("deleteRsa")) {
        return decodeException(response, DeleteRsaException.class);
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
