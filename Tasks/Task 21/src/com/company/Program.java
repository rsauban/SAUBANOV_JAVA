package com.company;

import java.util.Random;

public class Program {
    private String nameProgram;

    public  String getNameProgram(){
        return nameProgram;
    }

    public  void setNameProgram(String nameProgram){

        this.nameProgram = nameProgram;

    }


    public Program(){
        Random random = new Random();
        this.nameProgram = "Программа " + random.nextInt(100);
    }


    public Program(int number){
        this.nameProgram = "Программа " + number;
    }

    public String show(){
        return (getNameProgram());
    }






}


