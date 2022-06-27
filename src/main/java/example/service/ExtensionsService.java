package example.service;

import io.vertx.core.json.JsonObject;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.QueryParam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("/")
@RegisterRestClient
public interface ExtensionsService {

    @GET
    JsonObject getByExtension(@QueryParam("resource_id") final String resource_id,
                              @QueryParam("filters") final String filters);
}
