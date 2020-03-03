package me.renedo;

import static java.util.Optional.ofNullable;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import me.renedo.repository.TelephoneRepository;

@Path("/phone")
public class TelephoneResource {

    @Inject
    private TelephoneRepository telephoneRepository;

    protected static final Response RESPONSE_NOT_FOUND = Response.status(407).build();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{number}")
    @Transactional
    public Response get(@PathParam String number) {
        return ofNullable(telephoneRepository.findByNumber(number)).map(t->Response.ok(t).build()).orElse(RESPONSE_NOT_FOUND);
    }
}
