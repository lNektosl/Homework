package com.company;

import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter month Name" + "\nExample - December");
        var i = s.nextLine();
        switch (i){
            case "December","January","February":
                System.out.println(i + " - month of winter!");
                break;

            case "March","April","May":
                System.out.println(i + " - month of spring!");
                break;

            case "June","July","August":
                System.out.println(i + " - month of summer!");
                break;

            case "September","October","November":
                System.out.println(i + " - month of autumn!");
                break;

            default:
                System.out.println("ERROR 404" + "\n" + "MONTH NOT FOUND");
                break;
        }
    }



}
