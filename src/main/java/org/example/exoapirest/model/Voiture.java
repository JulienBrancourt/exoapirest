package org.example.exoapirest.model;

import java.util.Date;

public class Voiture {
    private int id;
    private String marque;
    private int anneeFabrication;
    private String couleur;

    public Voiture() {

    }

    public Voiture(int id, String marque, int anneeFabrication, String couleur) {
        this.id = id;
        this.marque = marque;
        this.anneeFabrication = anneeFabrication;
        this.couleur = couleur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getAnneeFabrication() {
        return anneeFabrication;
    }

    public void setAnneeFabrication(int anneeFabrication) {
        this.anneeFabrication = anneeFabrication;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
}
