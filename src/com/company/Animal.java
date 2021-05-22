package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class Animal {
    final public String species;
    private  Double weight;
    String name;

public Animal (String species){
    this.species = species;
    if(this.species =="dog") {
        this.weight = 23.4;
    }
    else if(this.species=="cat"){
        this.weight=5.0;
    }

}




    void printName(){
        System.out.println ("my name is " + this.name);

    }

    void printNameAndOwner(String owner){
        System.out.println(owner+" has "+this.name);

    }
    Double downloadWeight(){
    return this.weight;
    }
    String getNameAndOwner(String owner){
        return owner+" has "+this.name;
    }

    void feed(){
        if (this.weight > 0) {

            this.weight += 1.1;
            System.out.println("thx for food " + this.weight);
        }
        else {
            System.out.println(" tera to troche pozno ");
        }

    }
    void takeForAWalk(){
        if (this.weight > 0) {

            this.weight -= 0.5;
            System.out.println("thx, nice walk " + this.weight);
        }
        else {
            System.out.println("nie zyje");
        }
    }
}
