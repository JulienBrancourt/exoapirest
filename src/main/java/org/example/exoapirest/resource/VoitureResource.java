package org.example.exoapirest.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.example.exoapirest.model.Voiture;
import org.example.exoapirest.service.VoitureService;

import java.util.List;

@Path("/car")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class VoitureResource {

    private final VoitureService voitureService;

    @Inject
    public VoitureResource(VoitureService voitureService) {
        this.voitureService = voitureService;
    }

    @POST
    public Voiture createVoiture(Voiture voiture) {
        return voitureService.create(voiture.getId(), voiture.getMarque(), voiture.getAnneeFabrication(), voiture.getCouleur());
    }

    @GET
    public List<Voiture> getAllVoitures() {
        return voitureService.getVoitures();
    }

    @GET
    @Path("{id}")
    public Voiture getVoitureById(@PathParam("id") int id) {
        return voitureService.getVoitureById(id);
    }


    @DELETE
//    @Consumes(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public boolean delete(@PathParam("id") int id) {
        return voitureService.deleteVoiture(id);
    }

    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Voiture updateVoiture(Voiture voiture) {
        return voitureService.updateVoiture(voiture);
    }

}



