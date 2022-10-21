package com.tpastream.api.client.key;

import com.fern.java.jackson.ClientObjectMappers;
import com.fern.java.jersey.contracts.OptionalAwareContract;
import com.tpastream.api.client.BasicAuth;
import com.tpastream.api.client.key.exceptions.CreateException;
import com.tpastream.api.client.key.exceptions.DeleteKeyException;
import com.tpastream.api.client.key.exceptions.GetException;
import com.tpastream.api.client.key.types.PublicKey;
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
@Path("/public_key/gpg")
interface PublicKeyService {
  @GET
  @Path("/")
  PublicKey get(@HeaderParam("Authorization") BasicAuth auth) throws GetException;

  @POST
  @Path("/")
  PublicKey create(@HeaderParam("Authorization") BasicAuth auth, String body) throws
      CreateException;

  @DELETE
  @Path("/{name}")
  void deleteKey(@HeaderParam("Authorization") BasicAuth auth, @PathParam("name") String name)
      throws DeleteKeyException;

  static PublicKeyService getClient(String url) {
    return Feign.builder()
        .contract(new OptionalAwareContract(new JAXRSContract()))
        .decoder(new JacksonDecoder(ClientObjectMappers.JSON_MAPPER))
        .encoder(new JacksonEncoder(ClientObjectMappers.JSON_MAPPER))
        .errorDecoder(new PublicKeyServiceErrorDecoder()).target(PublicKeyService.class, url);
  }
}
