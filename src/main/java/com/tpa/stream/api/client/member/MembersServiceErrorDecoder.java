package com.tpa.stream.api.client.member;

import com.fern.java.jackson.ClientObjectMappers;
import com.tpa.stream.api.client.member.exceptions.GetAllMembersException;
import com.tpa.stream.api.client.member.exceptions.GetMemberException;
import feign.Response;
import feign.codec.ErrorDecoder;
import java.io.IOException;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;

final class MembersServiceErrorDecoder implements ErrorDecoder {
  @Override
  public Exception decode(String methodKey, Response response) {
    try {
      if (methodKey.contains("getAllMembers")) {
        return decodeException(response, GetAllMembersException.class);
      }
      if (methodKey.contains("getMember")) {
        return decodeException(response, GetMemberException.class);
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
