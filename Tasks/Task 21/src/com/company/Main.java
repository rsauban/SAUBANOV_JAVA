package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        RemoteController remote = new RemoteController();
        remote.pressButtonShowList();
        System.out.println("Введите номер канала (от 1 до "+ remote.countOfChaneels()+")");
        Scanner scanner =new Scanner(System.in);
        remote.pressButton(scanner.nextInt());
        remote.pressButton(scanner.nextInt());
//        remote.showProgrammName();
//        remote.pressChannelButton(scanner.nextInt());


    }
}
