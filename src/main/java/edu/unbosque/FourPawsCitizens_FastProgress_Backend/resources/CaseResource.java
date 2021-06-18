package edu.unbosque.FourPawsCitizens_FastProgress_Backend.resources;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.resources.pojos.Case;
//import edu.unbosque.FourPawsCitizens_FastProgress_Backend.services.CaseService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.xml.ws.Response;
import java.awt.*;

@Path("/Pet/{pet_id}/cases")
public class CaseResource {

    @POST
    @Consumes(PageAttributes.MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public javax.xml.ws.Response create(@PathParam("pet_id") Integer pet_id, Case cases) {

        cases.setCase_id(1);
        cases.setPet_id(pet_id);

        return javax.xml.ws.Response.status(Response.Status.CREATED)
                .entity(cases)
                .build();
    }

}