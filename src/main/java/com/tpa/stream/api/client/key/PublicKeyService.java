package com.tpa.stream.api.client.key;

import com.fern.java.jackson.ClientObjectMappers;
import com.fern.java.jersey.contracts.OptionalAwareContract;
import com.tpa.stream.api.client.BasicAuth;
import com.tpa.stream.api.client.key.exceptions.CreateGpgException;
import com.tpa.stream.api.client.key.exceptions.CreateRsaException;
import com.tpa.stream.api.client.key.exceptions.DeleteGpgException;
import com.tpa.stream.api.client.key.exceptions.DeleteRsaException;
import com.tpa.stream.api.client.key.exceptions.GetGpgException;
import com.tpa.stream.api.client.key.exceptions.GetRsaException;
import com.tpa.stream.api.client.key.types.PublicKey;
import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.jaxrs.JAXRSContract;
import java.lang.String;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("/public_key/")
interface PublicKeyService {
  @GET
  @Path("/gpg")
  PublicKey getGpg(@HeaderParam("Authorization") BasicAuth auth) throws GetGpgException;

  @POST
  @Path("/gpg")
  PublicKey createGpg(@HeaderParam("Authorization") BasicAuth auth, String body) throws
      CreateGpgException;

  @DELETE
  @Path("/{name}")
  void deleteGpg(@HeaderParam("Authorization") BasicAuth auth, @PathParam("name") String name)
      throws DeleteGpgException;

  @GET
  @Path("/rsa")
  PublicKey getRsa(@HeaderParam("Authorization") BasicAuth auth) throws GetRsaException;

  @POST
  @Path("/rsa")
  PublicKey createRsa(@HeaderParam("Authorization") BasicAuth auth, String body) throws
      CreateRsaException;

  @DELETE
  @Path("/{name}")
  void deleteRsa(@HeaderParam("Authorization") BasicAuth auth, @PathParam("name") String name)
      throws DeleteRsaException;

  static PublicKeyService getClient(String url) {
    return Feign.builder()
        .contract(new OptionalAwareContract(new JAXRSContract()))
        .decoder(new JacksonDecoder(ClientObjectMappers.JSON_MAPPER))
        .encoder(new JacksonEncoder(ClientObjectMappers.JSON_MAPPER))
        .errorDecoder(new PublicKeyServiceErrorDecoder()).target(PublicKeyService.class, url);
  }
}
