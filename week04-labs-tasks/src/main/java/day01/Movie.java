package day01;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private int year;
    List<Actor> actorList = new ArrayList<>();

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }
    public void addActor(Actor actor){
        actorList.add(actor);
    }
    public int actorsInTheirTwenties(){
        int output=0;
        int age;
        for(Actor actor:actorList){
            age=year-actor.getYearOfBirth();
            if(19<age && age<30){
                output++;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        Movie movie=new Movie("Brazil", 1985);

        Actor actor1=new Actor("Robert De Niro", 1943);
        movie.addActor(actor1);
        System.out.println("Number of actors in their twenties:"+movie.actorsInTheirTwenties());

        Actor actor2=new Actor("Michael Palin", 1943);
        movie.addActor(actor2);
        System.out.println("Number of actors in their twenties:"+movie.actorsInTheirTwenties());

        Actor actor3=new Actor("Kim Greist", 1958);
        movie.addActor(actor3);
        System.out.println("Number of actors in their twenties:"+movie.actorsInTheirTwenties());

        Actor actor4=new Actor("Jonathan Pryce", 1947);
        movie.addActor(actor4);
        System.out.println("Number of actors in their twenties:"+movie.actorsInTheirTwenties());

        Actor actor5=new Actor(" Bob Hoskins", 1942);
        movie.addActor(actor5);
        System.out.println("Number of actors in their twenties:"+movie.actorsInTheirTwenties());

    }
}
