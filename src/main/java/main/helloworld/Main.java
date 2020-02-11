package main.helloworld;

/**
 *
 * @author qa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
        Car fiat = new Car();
        fiat.showData();
        fiat.setModel("Fiat Punto");
        fiat.setBuildYear (2010);
        fiat.setColor ("black");
        fiat.setConsumption (6);
        fiat.setMaxSpeed (180);
        fiat.setCurrentFuel (20);
        fiat.setMaxFuel (45);   
        
        Car ford = new Car();
        ford.showData();
        ford.setModel("Mustang GT");
        ford.setBuildYear (2016);
        ford.setColor ("Black with red stripes");
        ford.setConsumption (20);
        ford.setMaxSpeed (280);
        ford.setCurrentFuel (50);
        ford.setMaxFuel (100);  
        
        Car golf = new Car("Golf2", 1990, "dark grey", 35);
        golf.showData();
        golf.setModel("Golf2");
        golf.setColor("dark grey");
        golf.setBuildYear (1990);
        golf.setConsumption(7);
        golf.setCurrentFuel(35);
        golf.setMaxSpeed(140);
        golf.setMaxFuel(50);
        //System.out.println("Model: "+ ford.model);
        //System.out.println("Build Year: "+ ford.buildYear);
        //System.out.println("Color: "+ ford.color);
        //System.out.println("Consumption: "+ ford.consumption);
        //System.out.println("Max Speed: "+ ford.maxSpeed);
        //System.out.println("Current Fuel: "+ ford.currentFuel);
        //System.out.println("Max Fuel: "+ ford.maxFuel);
        
        //fiat.showData();
        
        //ford.model = "Ford Fiesta";
        //ford.setModel("Ford Fiesta");
        //ford.buildYear = 2015;
        
        //ford.showData();
        
        //System.out.println("Model: " + ford.getModel());
}

}
       
        
    
    

