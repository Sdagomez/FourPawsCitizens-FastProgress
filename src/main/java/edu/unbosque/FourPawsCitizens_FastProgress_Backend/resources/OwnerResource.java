package edu.unbosque.FourPawsCitizens_FastProgress_Backend.resources;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.resources.pojos.Owner;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.services.services.OwnerService;
//import edu.unbosque.FourPawsCitizens_FastProgress_Backend.services.CaseService;

import javax.servlet.ServletContext;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/owners/{username}")
public class OwnerResource {

        private List<Owner> owners = new ArrayList<>();
        private List<String> usaquen = new ArrayList<>();
        private List<String> suba = new ArrayList<>();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listPets(@PathParam("username") String username, @Context ServletContext servletContext) {

        return Response
                .ok()
                .entity(new OwnerService().
                        listPets(username, "http://35.206.97.221:8080/FourPawsCitizens-FastProgress-1.0-SNAPSHOT/image/"))
                .build();
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{username}")
    public Response create(@PathParam("username") String userName, Owner owner) {

        owner.setUserName(userName);

        return Response.status(Response.Status.CREATED)
                .entity(owner)
                .build();
    }

        @PUT
        @Produces(MediaType.APPLICATION_JSON)
        public Response modify(@PathParam("username") String username, Owner owner) {

            return Response.ok()
                    .entity(owner)
                    .build();
        }


    }

