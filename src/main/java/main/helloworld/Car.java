/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.helloworld;

/**
 *
 * @author qa
 */
class Car {
   private String model;
   private int buildYear;
   private int maxSpeed;
   private String color;
   private int maxFuel;
   private int currentFuel;
   private int consumption;
    
    public Car() {
        this.model = "";
        this.buildYear = 0;
        this.color = "";
        this.maxFuel = 0;
        this.currentFuel = 0;
        this.consumption = 0;
    }
    
    public Car(String customModel, int custombuildYear, String customColor, int customMaxFuel) {
        this.model = customModel;
        this.buildYear = custombuildYear;
        this.color = customColor;
        this.maxFuel = customMaxFuel;
        
    } 
    
        public Car(String customModel, int custombuildYear, String customColor, int customMaxFuel, int customCurrentFuel, int customConsumption) {
        this.model = customModel;
        this.buildYear = custombuildYear;
        this.color = customColor;
        this.maxFuel = customMaxFuel;
        this.currentFuel = customCurrentFuel;
        this.consumption = customConsumption;
        
        } 
    
    public String getModel () {
        return this.model;
    }
    
    public void setModel (String customModel) {
        this.model = customModel;
    }
    
    public void showData() {
        System.out.println("Model: " + this.model);
        System.out.println("Godina proizvodnje: " + this.buildYear);
        System.out.println("Boja: " + this.color);
    }
    
    public int getBuildYear() {
        return this.buildYear;
    }
    
    public void setBuildYear(int customBuildYear) {
       this.buildYear = customBuildYear;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public void setColor(String customColor) {
        this.color = customColor;
    }
    
    public int getMaxFuel () {
        return this.maxFuel;
    }
    
    public void setMaxFuel (int customMaxFuel) {
        this.maxFuel = customMaxFuel;
    }
    
    public int getCurrentFuel (int customCurrentFuel) {
        return this.currentFuel;
    }
    
    public void setCurrentFuel (int customCurrentFuel) {
        this.currentFuel = customCurrentFuel;
    }
    
    public int getConsumption () {
        return this.consumption;
    }
    
    public void setConsumption (int customConsumption) {
        this.consumption = customConsumption;
    }

    public int getMaxSpeed () {
        return this.maxSpeed;
    }
    
    public void setMaxSpeed (int customMaxSpeed) {
        this.maxSpeed = customMaxSpeed;
    }
    
    public void travel(int distanceTraveled) {
        //kolicina goriva treba da se smanji za kolicinu potrosene
        //kilometraza treba da se uveca
        //novi atribut kreirati - mileage
        //napraviti get i set metode
        //prosiriti jedan od konstruktora tako da moze da se koristi mileage
        
    }

    }

 



