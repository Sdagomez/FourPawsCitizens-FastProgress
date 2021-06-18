package edu.unbosque.FourPawsCitizens_FastProgress_Backend.resources;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.resources.filters.Logged;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.resources.pojos.*;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.services.services.VetService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/visit")
public class VisitsTResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listOfTotalVisits() {

        List<Visit> visitByType = new ArrayList<>();

        visitByType.add(new Visit("Desparasitación", 85));
        visitByType.add(new Visit("Urgencia", 1));
        visitByType.add(new Visit("Implantación de microchip", 22));
        visitByType.add(new Visit("Control", 32));
        visitByType.add(new Visit("Vacunación", 10));
        visitByType.add(new Visit("Esterilización", 41));

        List<Visit> visitByVets = new ArrayList<Visit>();

        visitByVets.add(new Visit("prueba 1", 22));
        visitByVets.add(new Visit("prueba 2", 18));
        visitByVets.add(new Visit("prueba 3", 97));
        visitByVets.add(new Visit("prueba 4", 30));

        VisitsT visitsT = new VisitsT(167, visitByType, visitByVets);

        return Response.ok()
                .entity(visitsT)
                .build();
    }
}