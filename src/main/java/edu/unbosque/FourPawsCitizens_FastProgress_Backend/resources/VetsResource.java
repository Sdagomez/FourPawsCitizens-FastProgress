package edu.unbosque.FourPawsCitizens_FastProgress_Backend.resources;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.resources.filters.Logged;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.resources.pojos.Owner;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.resources.pojos.Pet;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.resources.pojos.Vet;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.services.services.VetService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/user/{user_id}/Vet")
public class VetsResource {
    List<Vet> vets = new ArrayList<Vet>();

    @Logged
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response hello(@HeaderParam("role") String role) {

        if (!"vet".equals(role))
            return Response.status(Response.Status.FORBIDDEN)
                    .entity("Role " + role + " cannot access to this method")
                    .build();
        return Response.ok()
                .entity("H + role" )
                .build();

    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(Vet vet) {
        String message = new VetService().saveVet(vet);
        return Response.
                status(Response.Status.CREATED)
                .entity(message)
                .build();
    }

    @PUT
    @Path("/{username}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("username") String username, Vet vet) {
        String message = new VetService().modifyVet(vet);

        return Response.
                status(Response.Status.OK)
                .entity(message)
                .build();
    }





}