package edu.unbosque.FourPawsCitizens_FastProgress_Backend.resources;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.resources.filters.Logged;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.resources.pojos.Owner;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.resources.pojos.Pet;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.resources.pojos.Vet;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.resources.pojos.Visit;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.services.services.VetService;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/vets/pet/visit/{visit_id}")

public class VisitResource {

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("visit_id") Integer visitid,  Visit vist) {
        return Response.ok()
                .entity(vist)
                .build();
    }

}

