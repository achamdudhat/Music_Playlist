/*
Author: AchamD
File: Music.java
Purpose: Java application that enables a user to create a playlist from
 an online music library
Compiler/IDE:  Java 17.0.1/Apache NetBeans 12.6
Operating
system: MS Windows 10 Home
Reference(s):  Java 17 API - Oracle Documentation
 ( https://docs.oracle.com/en/java/javase/17/docs/api/);
 (Include ALL additional references (Web page, etc.) here.)
*/
package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Music extends MusicSelection{

    public static void main(String[] args) {
	// write your code here
        int finput;
        do {
            System.out.println("Welcome to River's Personal Music Library!!!\n"+
                        "Choose an option:"+
                        "\n1) Create Playlist"+
                        "\n2) Delete Playlist"+
                        "\n3) Add Selection to Playlist"+
                        "\n4) Remove Selection from Playlist\n"+
                        "5) Quit"+
                        "\nYour Choice? ");
            int sinput,tinput,foinput;
            Scanner sc=new Scanner(System.in);
            finput=sc.nextInt();

            //While loop for invalid entry
            while (!(finput>0&&finput<5)) {System.out.println("Please enter from 1-4only");
                finput= sc.nextInt();}

                if (finput == 1) {
                    System.out.println("\nPlaylist created\n");
                }
                if (finput == 3) {
                    System.out.println("\nChoose and artist: \n" +
                            "1) Pink Floyd \n" +
                            "2) The Who \n" +
                            "3) Led Zeppelin \n" +
                            "4) Stephane Grappelli \n" +
                            "5) Spyro Gyra \n" +
                            "6) Yo-Yo Ma & Friends \n" +
                            "7) Yo-Yo Ma & Roma Sinfonietta \n" +
                            "8) Badshah\n" + "Your choice\n");

                    Scanner sc1 = new Scanner(System.in);
                    sinput = sc1.nextInt();
                    System.out.println("Choose a title:");
                    Scanner sc2 = new Scanner(System.in);
                    tinput = sc2.nextInt();
                    if (sinput == 1) {
                        System.out.println("\n1)Another Brick in the Wall" +
                                "\n2)Hey You" +
                                "\n3)Is there Anybody Out There?");
                    }
                    if (sinput == 2) {
                        System.out.println("1) Pinball Wizard \n" +
                                "2) Listening to You / See Me, Feel Me \n" +
                                "3) Tommy, Can You Hear Me?\n");
                    }
                    if (sinput == 3) {
                        System.out.println("\n1) Kashmir\n" +
                                "2) Boogie With Stu \n" +
                                "3) Houses of the Holy\n");
                    }
                    if (sinput == 4) {
                        System.out.println("1) As Time Goes By \n" +
                                "2) Honeysuckle Rose \n" +
                                "3) Sweet Georgia Brown ");
                    }
                    if (sinput == 5) {
                        System.out.println("1) Best Friends \n" +
                                "2) Heart of the Night ");
                    }
                    if (sinput == 6) {
                        System.out.println("1) Here Comes the Sun \n" +
                                "2) My One and Only Love \n" +
                                "3) This Little Light of Mine \n");
                    }
                    if (sinput == 7) {
                        System.out.println("\n" +
                                "1)Genda Pool\n" +
                                "2)Garmi\n" +
                                "3)Paani Paani\n" +
                                "4)Therapy\n" +
                                "5)Toxic\n" +
                                "6)Bawala\n" +
                                "7)Slow Slow\n" +
                                "8)Party\n");
                    }
                    ;
                }
                if (finput == 4) {
                }

        //Arraylist below:
        ArrayList<String> setGenre=new ArrayList<>(20);
        ArrayList<String> setArtist=new ArrayList<>(20);
        ArrayList<String> setTitle=new ArrayList<>(20);
        ArrayList<String> setAlbum=new ArrayList<>(20);
        ArrayList<String> setDate=new ArrayList<>(20);
        ArrayList<MusicSelection> library=new ArrayList<>();

    }while(finput==5);
        System.out.println("Thank you The end");
}}
