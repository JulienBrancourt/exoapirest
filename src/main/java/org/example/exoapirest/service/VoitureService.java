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

    public Voiture create(int id, String marque, int anneeFabrication, String couleur ) {
        return new Voiture(id, marque, anneeFabrication, couleur);
    }

    public List<Voiture> getVoitures() {
        return voitures;
    }

    public Voiture getVoitureById(int id) {
        for (Voiture voiture : voitures) {
            if (voiture.getId() == id) {
                return voiture;
            }
        }
        return null;
    }

//    public Voiture delete(int id) {
//        for (Voiture voiture : voitures) {
//            if (voiture.getId() == id) {
//                v;
//            }
//        }
//        return null;
//    }
}
