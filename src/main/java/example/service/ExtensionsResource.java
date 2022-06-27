package example.service;

import io.vertx.core.json.JsonObject;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.annotations.jaxrs.QueryParam;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/extension")
public class ExtensionsResource {

    @Inject
    @RestClient
    ExtensionsService extensionsService;

    @GET
    @Path("savekau")
    public JsonObject haha(@QueryParam("resource_id") final String resource_id,
                           @QueryParam("filters") final String filters) {
        return extensionsService.getByExtension(resource_id, filters);
    }
}