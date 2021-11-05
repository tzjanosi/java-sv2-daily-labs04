package day04;

import java.util.ArrayList;
import java.util.List;

public class Plane {
    private int capacity;
    private List<Passenger> passangersList=new ArrayList<>();
    private int numberOfBaggage;

    public Plane(int capacity) {
        this.capacity = capacity;
    }

    public boolean addPassanger(Passenger passenger){
        if(passangersList.size()<capacity) {
            passangersList.add(passenger);
            numberOfBaggage+=passenger.getNumberOfBaggage();
            return true;
        }
        return false;
    }

    public int numberOfPackages(){
        return numberOfBaggage;
    }

    public static void main(String[] args) {
        Plane plane=new Plane(4);
        Passenger passenger=new Passenger("Barna Béla","FK452-1234",2);
        if(plane.addPassanger(passenger)){
            System.out.println(passenger.getName()+" is registered to the plane.");
        }
        else{
            System.out.println("There is no free capacity on the plane.");
            System.out.println(passenger.getName()+" is NOT registered to the plane.");
        }
        System.out.println();

        passenger=new Passenger("Fekete Ferenc","FK248-6352",3);
        if(plane.addPassanger(passenger)){
            System.out.println(passenger.getName()+" is registered to the plane.");
        }
        else{
            System.out.println("There is no free capacity on the plane.");
            System.out.println(passenger.getName()+" is NOT registered to the plane.");
        }
        System.out.println();

        passenger=new Passenger("Piros Péter","FK789-5487",1);
        if(plane.addPassanger(passenger)){
            System.out.println(passenger.getName()+" is registered to the plane.");
        }
        else{
            System.out.println("There is no free capacity on the plane.");
            System.out.println(passenger.getName()+" is NOT registered to the plane.");
        }
        System.out.println();

        passenger=new Passenger("Szürke Szilárd","FK426-9823",6);
        if(plane.addPassanger(passenger)){
            System.out.println(passenger.getName()+" is registered to the plane.");
        }
        else{
            System.out.println("There is no free capacity on the plane.");
            System.out.println(passenger.getName()+" is NOT registered to the plane.");
        }
        System.out.println();

        passenger=new Passenger("Fehér Ottó","FK523-7459",2);
        if(plane.addPassanger(passenger)){
            System.out.println(passenger.getName()+" is registered to the plane.");
        }
        else{
            System.out.println("There is no free capacity on the plane.");
            System.out.println(passenger.getName()+" is NOT registered to the plane.");
        }
        System.out.println();

        System.out.println("Number of baggage is: "+plane.numberOfPackages());
    }
}

