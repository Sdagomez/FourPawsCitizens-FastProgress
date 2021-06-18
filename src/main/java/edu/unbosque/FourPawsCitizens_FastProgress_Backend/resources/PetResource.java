package edu.unbosque.FourPawsCitizens_FastProgress_Backend.resources;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.resources.pojos.Pet;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.resources.pojos.Vet;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.services.services.VetService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("Owner/pet/{pet_id}")
public class PetResource {
    private List<Pet> pets = new ArrayList<>();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{pet_id}/visitsCasesAll")
    public Response listVisitsCasesAll(@PathParam("pet_id") Integer pet_id) {

        return Response.
                status(Response.Status.OK).
                entity(new PetService().listVisitsAndCaseAll(pet_id)).
                build();
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
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{pet_id}")
    public Response modifyPet(@PathParam("pet_id") Integer petId, Pet pet) {
        pet.setPet_id(petId);
        String message = new PetService().modifyPet(pet);
        return Response.status(Response.Status.OK).entity(message).build();
    }


}
