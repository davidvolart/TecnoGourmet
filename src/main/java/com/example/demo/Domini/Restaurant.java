package com.example.demo.Domini;

import javax.validation.constraints.NotNull;
import java.awt.*;
import java.io.File;

public class Restaurant {

    private String nomRestaurant;
    private String password;
    private String direccio;
    private String poblacio;
    private double puntuacio;
    private String descripcio;
    private long numTelefon;
    private int capacitat;
    //private String src;


    public Restaurant(){

    }

    private Restaurant(RestaurantBuilder builder) {
        nomRestaurant = builder.nomRestaurant;
        direccio = builder.direccio;
        poblacio = builder.poblacio;
        puntuacio = 0;
        descripcio = builder.descripcio;
        numTelefon = builder.numTelefon;
        capacitat= builder.capacitat;
        //src=builder.imatge.getAbsolutePath();

    }

    public String getNomRestaurant() {
        return nomRestaurant;
    }

    public String getPassword() {
        return this.password;
    }

    public String getDireccio() {
        return direccio;
    }

    public String getPoblacio() {
        return poblacio;
    }

    public double getPuntuacio() {
        return puntuacio;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public long getNumTelefon() {
        return numTelefon;
    }

    public int getCapacitat() {
        return capacitat;
    }

    /*
    public String getSrc() { return src;}

    public void setSrc(String src){ this.src=src; }
    */

    public void setNomRestaurant(String nomRestaurant) {
        this.nomRestaurant=nomRestaurant;
    }

    public void setPassword(String password) {
        this.password=password;
    }

    public void setDireccio(String direccio) {
        this.direccio=direccio;
    }

    public void setPoblacio(String poblacio) {
        this.poblacio=poblacio;
    }

    public void setPuntuacio(double puntuacio) {
        this.puntuacio = puntuacio;
    }

    public void setDescripcio(String descripcio){
        this.descripcio=descripcio;
    }

    public void setNumTelefon(long numTelefon ){
        this.numTelefon=numTelefon;
    }

    public void setCapacitat(int capacitat) {
        this.capacitat=capacitat;
    }

    public String toString(){
        return "nom: "+this.nomRestaurant+", direcció: "+this.direccio+" capcitat:"+this.capacitat+", poblacio: "+ this.poblacio+", puntuacio: "+this.puntuacio+",descripcio: "+this.descripcio+", telefon: "+numTelefon;
    }


    public static class RestaurantBuilder{

        private String nomRestaurant;
        private String direccio;
        private String poblacio;
        private double puntuacio;
        private String descripcio;
        private long numTelefon;
        private int capacitat;
        private String password;
        //private File imatge;


        public  RestaurantBuilder() {
        }

        /*
        public RestaurantBuilder imatge(File imatge) {
            System.out.println(imatge.getAbsolutePath());
            this.imatge = imatge;
            return this;
        }
        */
        public RestaurantBuilder password(String password) {
            this.password = password;
            return this;
        }
        public RestaurantBuilder nomRestaurant(String nomRestaurant) {
            this.nomRestaurant = nomRestaurant;
            return this;
        }

        public RestaurantBuilder direccio(String direccio) {
            this.direccio = direccio;
            return this;
        }

        public RestaurantBuilder poblacio(String poblacio) {
            this.poblacio = poblacio;
            return this;
        }

        public RestaurantBuilder puntuacio(double puntuacio) {
            this.puntuacio = puntuacio;
            return this;
        }

        public RestaurantBuilder descripcio(String descripcio) {
            this.descripcio = descripcio;
            return this;
        }

        public RestaurantBuilder numTelefon(long numTelefon) {
            this.numTelefon = numTelefon;
            return this;
        }

        public RestaurantBuilder capacitat(int capacitat) {
            this.capacitat = capacitat;
            return this;
        }

        public Restaurant build(){
            return new Restaurant(this);
        }

    }
}
