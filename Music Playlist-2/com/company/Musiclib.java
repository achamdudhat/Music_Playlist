/*
Author: AchamD
File: Musiclib.java
Purpose: Java application that enables a user to create a playlist from
 an online music library
Compiler/IDE:  Java 17.0.1/Apache NetBeans 12.6
Operating
system: MS Windows 10 Home
Reference(s): Class Notes, lectures, ppts on canvas,etc.
*/
package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Musiclib extends MusicSelection{

    public static void main(String[] args) {
        // write your code here
        int finput=0,check=0;
        Scanner musicFile=null;
        try {
            musicFile= new Scanner(new File("Music.txt"));
        } catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        //Arraylist below
        ArrayList<MusicSelection> library=new ArrayList<>();
        ArrayList<MusicSelection> Playlist=new ArrayList<>();
        while(musicFile.hasNextLine()){
            String genre=musicFile.nextLine();
            String artist=musicFile.nextLine();
            String title=musicFile.nextLine();
            String album=musicFile.nextLine();
            String date=musicFile.nextLine();
            MusicSelection x=new MusicSelection(genre,artist,title,album,date);
            library.add(x);
            }
        do {
            System.out.println("Welcome to River's Personal Music Library!!!\n"+
                    "Choose an option:"+
                    "\n1) Create Playlist"+
                    "\n2) Delete Playlist"+
                    "\n3) Add Selection to Playlist"+
                    "\n4) Remove Selection from Playlist\n"+
                    "5) Quit"+
                    "\nYour Choice? ");
            int sinput=0,tinput=0,foinput;
            Scanner sc=new Scanner(System.in);
            boolean done = false;
            while (! done)
            {
                try
                {
                    finput = sc.nextInt();
                    done = true;
                }
                catch (InputMismatchException e)
                {
                    sc.nextLine();
                    System.out.println("Enter a number only"+"\nYour choice? ");
                }
            }
            //While loop for invalid entry
            while (!(finput>0&&finput<6)) {System.out.println("Please enter from 1-5only");
                boolean done1 = false;
                while (! done1)
                {
                    try
                    {
                        finput = sc.nextInt();
                        done1 = true;
                    }
                    catch (InputMismatchException e)
                    {
                        sc.nextLine();
                        System.out.println("Enter a number only"+"\nYour choice? ");
                    }
                }}

            if (finput == 1) {
            if (check==0)
            {System.out.println("\nPlaylist created\n");
            check=1;}
            else
                System.out.println("Playlist has already been created");
            }
            if (finput==2){
                if (check==0){System.out.println("Please create Playlist");
                }
                else{ System.out.println("Do you want to Delete the playlist?");

                    Scanner sc6=new Scanner(System.in);
                   String del=sc6.nextLine();
                   while (!(del.equals("Y")||del.equals("y")||del.equals("N")||del.equals("n"))){
                       System.out.println("Please enter Y,y,N or n.");
                        del= sc6.nextLine();

                   }
                   if (del.equals("Y")||del.equals("y")){
                    Playlist=null;
                    System.out.println("Playlist has been deleted");
                    check=0;}

                   else {System.out.println("Playlist hasn't been deleted.");}
                }
            }
            if (finput == 3) {
                if (check==0){System.out.println("Please create Playlist");
                }
                else {
                    System.out.println("\nChoose and artist: \n" +
                            "1) Pink Floyd \n" +
                            "2) The Who \n" +
                            "3) Led Zeppelin \n" +
                            "4) Stephane Grappelli \n" +
                            "5) Spyro Gyra \n" +
                            "6) Yo-Yo Ma & Friends \n" +
                            "7) Badshah\n" +
                            "Your choice\n");
                    Scanner sc1 = new Scanner(System.in);
                    boolean done2 = false;
                    while (! done2)
                    {
                        try
                        {
                            sinput = sc1.nextInt();
                            done2 = true;
                        }
                        catch (InputMismatchException e)
                        {
                            sc1.nextLine();
                            System.out.println("Enter a number only"+"\nYour choice? ");
                        }
                    }
                    while (!(sinput>0&&sinput<8)) {System.out.println("Please enter from 1-7 only");
                        boolean done1 = false;
                        while (! done1)
                        {
                            try
                            {
                                sinput = sc1.nextInt();
                                done1 = true;
                            }
                            catch (InputMismatchException e)
                            {
                                sc1.nextLine();
                                System.out.println("Enter a number only"+"\nYour choice? ");
                            }
                        }}

                    String[] Gaana = new String[20];
                    System.out.println("Choose a title:");
                    int length1=0;
                    if (sinput == 1) {
                        System.out.println("\n1)Another Brick In The Wall" +
                                "\n2)Hey You" +
                                "\n3)Is there Anybody Out There?");
                        String Gaana1 = "Another Brick In The Wall", Gaana2 = "Hey You", Gaana3 = "Is there Anybody Out There?";
                        Gaana[0] = Gaana1;
                        Gaana[1] = Gaana2;
                        Gaana[2] = Gaana3;
                        length1= Gaana.length;
                    }
                    if (sinput == 2) {
                        System.out.println("1) Pinball Wizard\n" +
                                "2) Listening to You / See Me, Feel Me\n");
                        String Gaana4 = "Pinball Wizard", Gaana5 = "Listening to You / See Me, Feel Me";
                        Gaana[0] = Gaana4;
                        Gaana[1] = Gaana5;
                        length1= Gaana.length;
                    }
                    if (sinput == 3) {
                        System.out.println("\n1) Kashmir\n" +
                                "2) Boogie With Stu\n" );
                        String Gaana7 = "Kashmir", Gaana8 = "Boogie With Stu";
                        Gaana[0] = Gaana7;
                        Gaana[1] = Gaana8;
                        length1= Gaana.length;
                    }
                    if (sinput == 4) {
                        System.out.println(
                                "1) Honeysuckle Rose \n" +
                                "2) Sweet Georgia Brown \n");
                        String Gaana10 = "Honeysuckle Rose", Gaana11 = "Sweet Georgia Brown";
                        Gaana[0] = Gaana10;
                        Gaana[1] = Gaana11;
                        length1= Gaana.length;
                    }
                    if (sinput == 5) {
                        System.out.println("1) Best Friends \n");

                        String Gaana13 = "Best Friends";
                        Gaana[0] = Gaana13;

                        length1= Gaana.length;
                    }
                    if (sinput == 6) {
                        System.out.println("1) Here Comes the Sun \n" +
                                "2) My One and Only Love \n"
                        );
                        String Gaana15 = "Here Comes the Sun", Gaana16 = "My One and Only Love";
                        Gaana[0] = Gaana15;
                        Gaana[1] = Gaana16;
                        length1= Gaana.length;
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
                        String Gaana18 = "Genda Pool", Gaana19 = "Garmi", Gaana20 = "Paani Paani", Gaana21 = "Therapy",
                                Gaana22 = "Toxic", Gaana23 = "Bawala", Gaana24 = "Slow Slow", Gaana25 = "Party;";
                        Gaana[0] = Gaana18;
                        Gaana[1] = Gaana19;
                        Gaana[2] = Gaana20;
                        Gaana[3] = Gaana21;
                        Gaana[4] = Gaana22;
                        Gaana[5] = Gaana23;
                        Gaana[6] = Gaana24;
                        Gaana[7] = Gaana25;
                        length1= Gaana.length;
                    }

                    System.out.println("Your choice: ");
                    Scanner sc2 = new Scanner(System.in);
                    boolean done3 = false;
                    while (! done3)
                    {
                        try
                        {
                            tinput = sc2.nextInt();
                            done3 = true;
                        }
                        catch (InputMismatchException e)
                        {
                            sc2.nextLine();
                            System.out.println("Enter a number only"+"\nYour choice? ");
                        }
                    }
                    while (!(tinput>0&&sinput<length1)) {System.out.println("Please enter from 1-"+length1+" only");
                        boolean done1 = false;
                        while (! done1)
                        {
                            try
                            {
                                tinput = sc2.nextInt();
                                done1 = true;
                            }
                            catch (InputMismatchException e)
                            {
                                sc2.nextLine();
                                System.out.println("Enter a number only"+"\nYour choice? ");
                            }
                        }}
                    String Gaa0 = Gaana[tinput - 1];
                    Gaa0 = Gaa0.toLowerCase();
                    Gaa0 = Gaa0.trim();
                    int length = library.size();
                    for (int i = 0; i < length; i++) {
                        MusicSelection Gaa = library.get(i);
                        String Gaa1 = Gaa.getTitle();
                        Gaa1 = Gaa1.toLowerCase();
                        Gaa1 = Gaa1.trim();
                        if (Gaa0.equals(Gaa1)) {
                            Playlist.add(library.get(i));
                        }
                    }
                    int select=1;
                    for (MusicSelection a : Playlist) {
                        System.out.println("Selection #"+select+":");
                        System.out.println(a);
                        System.out.println();
                        select=select+1;
                    }
                }
            }
            if (finput == 4) {
            if (check==0){System.out.println("Please create Playlist First");}
            else{
                System.out.println("Displaying Current Playlist:");
                int select=1;
                for (MusicSelection a : Playlist) {
                    System.out.println("Selection #"+select+":");
                    System.out.println(a);
                    System.out.println();
                    select=select+1;
                }
                System.out.println("Which Selection do you want to delete? ");
                int delete=0,length1 = Playlist.size();
                Scanner sc100=new Scanner(System.in);
                boolean done3 = false;
                while (! done3)
                {
                    try
                    {
                        delete = sc100.nextInt();
                        done3 = true;
                    }
                    catch (InputMismatchException e)
                    {
                        sc100.nextLine();
                        System.out.println("Enter a number only"+"\nYour choice? ");
                    }
                }
                while (!(delete>0&&delete<length1)) {System.out.println("Please enter from 1-"+length1+" only");
                    boolean done1 = false;
                    while (! done1)
                    {
                        try
                        {
                            delete = sc100.nextInt();
                            done1 = true;
                        }
                        catch (InputMismatchException e)
                        {
                            sc100.nextLine();
                            System.out.println("Enter a number only"+"\nYour choice? ");
                        }
                    }}
                Playlist.remove(delete-1);
                select=1;
                for (MusicSelection a : Playlist) {
                    System.out.println("Selection #"+select+":");
                    System.out.println(a);
                    System.out.println();
                    select=select+1;}
            }

            }

        }while(finput!=5);
        System.out.println("Thank you The end");
    }}

