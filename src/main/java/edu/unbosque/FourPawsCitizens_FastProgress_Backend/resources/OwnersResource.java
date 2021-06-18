package edu.unbosque.FourPawsCitizens_FastProgress_Backend.resources;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.resources.filters.Logged;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.resources.pojos.Owner;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.resources.pojos.Pet;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.services.services.OwnerService;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/owners/{username}")
public class OwnersResource {
    ArrayList<Owner> owners = new ArrayList<>();
    ArrayList<Pet> pets = new ArrayList<>();
    List<Owner> filtro = new ArrayList<Owner>();

    @Logged
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response hi(@HeaderParam("role") String role) {

        // If role doesn't match
        if (!"owner".equals(role)) {
            return Response.status(Response.Status.FORBIDDEN)
                    .entity("Role " + role + " cannot access to this method")
                    .build();
        }


        return Response.ok()
                .entity("Hello" + role )
                .build();

    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(Owner owner) {

        String message = new OwnerService().saveOwner(owner);

        return Response.
                status(Response.Status.CREATED)
                .entity(message)
                .build();
    }



}