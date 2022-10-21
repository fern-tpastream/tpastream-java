package com.tpa.stream.api.client.claims;

import com.fern.java.jackson.ClientObjectMappers;
import com.fern.java.jersey.contracts.OptionalAwareContract;
import com.tpa.stream.api.client.BasicAuth;
import com.tpa.stream.api.client.claims.exceptions.GetAllClaimsException;
import com.tpa.stream.api.client.claims.exceptions.GetClaimException;
import com.tpa.stream.api.client.claims.types.AllClaims;
import com.tpa.stream.api.client.claims.types.Claim;
import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.jaxrs.JAXRSContract;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("/claims")
interface ClaimsService {
  @GET
  @Path("/")
  AllClaims getAllClaims(@HeaderParam("Authorization") BasicAuth auth,
      @QueryParam("page") Optional<Integer> page, @QueryParam("per_page") Optional<Integer> perPage)
      throws GetAllClaimsException;

  @POST
  @Path("/{claim_medical_id}")
  Claim getClaim(@HeaderParam("Authorization") BasicAuth auth,
      @PathParam("claim_medical_id") Integer claimMedicalId) throws GetClaimException;

  static ClaimsService getClient(String url) {
    return Feign.builder()
        .contract(new OptionalAwareContract(new JAXRSContract()))
        .decoder(new JacksonDecoder(ClientObjectMappers.JSON_MAPPER))
        .encoder(new JacksonEncoder(ClientObjectMappers.JSON_MAPPER))
        .errorDecoder(new ClaimsServiceErrorDecoder()).target(ClaimsService.class, url);
  }
}
