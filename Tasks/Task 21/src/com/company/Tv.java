package com.company;

import java.util.Random;

public class Tv {

    private static final int MAX_CHANNEL_OF_TV = 100;
    // модель телевизора
    private  String nameTv;
    // ТВ это множество программ
    private Channel [] channels;
    private int countChannels;
    private int currChanel;

    public String getNameTv() {
        return nameTv;
    }

    public void setNameTv(String nameTv) {
        this.nameTv = nameTv;
    }

    public int getCountChannels() {
        return countChannels;
    }

    public void setCountChannels(int countChannels) {
        this.countChannels = countChannels;
    }

    public int getCurrChanel() {
        return currChanel;
    }

    public void setCurrChanel(int currChanel) {

        if (currChanel < 0 && currChanel > getCountChannels()) this.currChanel = getCountChannels();
        else this.currChanel = currChanel;
    }

    public Tv(String nameTv){
        setNameTv(nameTv);
        Random random = new Random();
        setCountChannels(random.nextInt(MAX_CHANNEL_OF_TV));
        channels = new Channel[getCountChannels()];
        for (int i = 0; i < getCountChannels(); i++){
            channels[i] = new Channel("Channel " + i);
        }

        setCurrChanel(random.nextInt(getCountChannels()));


    }

    public void showCnannelList(){
        for (int i = 0; i < getCountChannels(); i++){

            System.out.println(channels[i].getNameChannel());

        }



    }



    public void showChannel(int channelNumber) {
        channels[getCurrChanel()].showCurrProgram();
    }

    public void showAllProgramChanel(int channelNumber){
        channels[getCurrChanel()].showAllPrograms();

    }



}