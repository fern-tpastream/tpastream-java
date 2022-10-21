package com.tpa.stream.api.client.claims;

import com.fern.java.jackson.ClientObjectMappers;
import com.tpa.stream.api.client.claims.exceptions.GetAllClaimsException;
import com.tpa.stream.api.client.claims.exceptions.GetClaimException;
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
      if (methodKey.contains("getAllClaims")) {
        return decodeException(response, GetAllClaimsException.class);
      }
      if (methodKey.contains("getClaim")) {
        return decodeException(response, GetClaimException.class);
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
