package com.company;

public class RemoteController {

    private Tv tv;


    public RemoteController(){

        tv = new Tv("AnyOne");

    }

    public void pressButton(int buttonNumber){
        tv.showChannel(buttonNumber);
  }

    public void pressButtonShowList(){
        tv.showCnannelList();
    }

    public void showAllProgram(int buttonNumber){
        tv.showAllProgramChanel(buttonNumber);


    }


    public int countOfChaneels(){
        return tv.getCountChannels();
    }


}
