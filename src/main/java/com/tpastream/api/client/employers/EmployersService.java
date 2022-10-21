package com.tpastream.api.client.employers;

import com.fern.java.jackson.ClientObjectMappers;
import com.fern.java.jersey.contracts.OptionalAwareContract;
import com.tpastream.api.client.BasicAuth;
import com.tpastream.api.client.employers.exceptions.GetAllEmployersException;
import com.tpastream.api.client.employers.types.AllAccounts;
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
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("/employer")
interface EmployersService {
  @GET
  @Path("/{employer_id}/member")
  AllAccounts getAllEmployers(@HeaderParam("Authorization") BasicAuth auth,
      @PathParam("employer_id") Integer employerId, @QueryParam("page") Optional<Integer> page,
      @QueryParam("per_page") Optional<Integer> perPage) throws GetAllEmployersException;

  static EmployersService getClient(String url) {
    return Feign.builder()
        .contract(new OptionalAwareContract(new JAXRSContract()))
        .decoder(new JacksonDecoder(ClientObjectMappers.JSON_MAPPER))
        .encoder(new JacksonEncoder(ClientObjectMappers.JSON_MAPPER))
        .errorDecoder(new EmployersServiceErrorDecoder()).target(EmployersService.class, url);
  }
}
