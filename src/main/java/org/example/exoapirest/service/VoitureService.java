package org.example.exoapirest.service;

import jakarta.enterprise.context.ApplicationScoped;
import org.example.exoapirest.model.Voiture;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class VoitureService {

    private final List<Voiture> voitures = new ArrayList<>();

    public VoitureService() {
        voitures.add(new Voiture(1, "audi", 2000, "rouge"));
        voitures.add(new Voiture(2, "bmw", 2001, "bleu"));
        voitures.add(new Voiture(3, "ford", 2002, "jaune"));
    }

    public Voiture create(int id, String marque, int anneeFabrication, String couleur) {
        Voiture voiture = new Voiture(id, marque, anneeFabrication, couleur);
        voitures.add(voiture);
        return voiture;
    }

    public List<Voiture> getVoitures() {
        return voitures;
    }

    public Voiture getVoitureById(int id) {
//        for (Voiture voiture : voitures) {
//            if (voiture.getId() == id) {
//                return voiture;
//            }
//        }
//        return null;
        return voitures
                .stream()
                .filter(voiture -> voiture.getId() == id)
                .findFirst()
                .get();
    }

    public boolean deleteVoiture(int id) {
        voitures.removeIf(voiture -> voiture.getId() == id);
        return true;

    }

    public Voiture updateVoiture(Voiture voiture) {
        Voiture voituremaj = getVoitureById(voiture.getId());
        voituremaj.setMarque(voiture.getMarque());
        voituremaj.setAnneeFabrication(voiture.getAnneeFabrication());
        voituremaj.setCouleur(voiture.getCouleur());
        return voituremaj;
    }
}