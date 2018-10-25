package com.company;

import java.sql.SQLOutput;

public class IarmolenkoSong {

    public static void main(String[] args) {
        String nouns[] = {"The house that jack built. ", "The melt that lies in ", "The rat that ate ", "The cat that killed ", "The dog that worried"};
        System.out.println("This is the house that Jack built");
        for (int i = 1; i < nouns.length; i++) { //
            System.out.print("This is ");
            for (int n = i; n >= 0; n-=2) {
                System.out.print(nouns[n]);
                if(n >= 1) {
                    System.out.print(nouns[n - 1]);
                }
                System.out.println();
            }
        }

        /*
        System.out.print("This is ");
        theHouse();
        System.out.print("This is ");
        theMelt();
        System.out.print("This is ");
        theRat();
        System.out.print("This is ");
        theCat();

    }
    public static void theHouse(){
        System.out.println("The house that Jack built");
    }
    public static void theMelt(){
        System.out.println("The melt that lies in");
        theHouse();
    }
    public static void theRat(){
        System.out.println("The rat that ate");
        theMelt ();
    }
    public static void theCat(){
        System.out.println("The cat that killed");
        theRat();*/
    }

}
