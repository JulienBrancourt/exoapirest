package org.example.exoapirest.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.example.exoapirest.model.Voiture;
import org.example.exoapirest.service.VoitureService;

import java.util.List;

@Path("/car")
@Produces(MediaType.APPLICATION_JSON)
public class VoitureResource {

    private final VoitureService voitureService;

    @Inject
    public VoitureResource(VoitureService voitureService) {
        this.voitureService = voitureService;
    }

//    @POST
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.APPLICATION_JSON)
//    public Voiture (@QueryParam("id") int id,@QueryParam("marque") String marque, @QueryParam("anneeFabrication") int anneeFabrication, @QueryParam("couleur") String couleur) {
//        return voitureService.create(id, marque, anneeFabrication, couleur);
//    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Voiture createVoiture(Voiture voiture) {
        return voitureService.create(voiture.getId(), voiture.getMarque(), voiture.getAnneeFabrication(), voiture.getCouleur());
    }

    @GET
    public List<Voiture> getAllVoitures() {
        return voitureService.getVoitures();
    }

    @GET
    @Path("{id}")
    public Voiture getVoitureById(@PathParam("id")int id) {
        return voitureService.getVoitureById(id);
    }
}

//    @DELETE
//@Path("{id}")
//    public int delete(@PathParam("id") int id){
//        return id;
//    }

