package com.company;

import java.util.Random;

public class Channel {

    private static final int MAX_COUNT_CHANELLS = 100;
    private String nameChannel;
    private Program[] programs;
    private int countPrograms;
    private int currProgram;


    public String getNameChannel(){
        return nameChannel;
    }

    public void setNameChannel(String nameChannel){
        this.nameChannel = nameChannel;
    }

    public int getCountPrograms(){
        return countPrograms;
    }

    public void setCountPrograms(int countPrograms){
        this.countPrograms = countPrograms;

    }

    public int getCurrProgram(){
        return currProgram;

    }


    public void setCurrProgram(int currProgram){
        if (currProgram < 0 && currProgram > getCountPrograms()) {
            System.err.println("нет такой программы !!!"); return; }
        this.currProgram = currProgram;

    }



    public Channel(String nameChannel){
        // устанавливаем название канала
        setNameChannel(nameChannel);
        Random random = new Random();
        // случайно формируем количество передач на канале
        setCountPrograms(random.nextInt(MAX_COUNT_CHANELLS));
        programs = new Program[getCountPrograms()];
        for (int i = 0; i < countPrograms; i++) {
            programs[i] = new Program();
        }
        //берем случайную передачу
        setCurrProgram(random.nextInt(getCountPrograms()));


    }

    public void showCurrProgram(){

      System.out.println("com.company.Channel:" + nameChannel + "Programm: " + programs[getCurrProgram()].show());
    }

   public  void showAllPrograms (){
       for (int i = 0; i < getCountPrograms(); i++) {
        System.out.println(programs[i].getNameProgram());
       }
   }




}
