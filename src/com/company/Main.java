package com.company;

import com.sun.xml.internal.ws.api.pipe.Fiber;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static  ArrayList<Fordulo> fordulok;
    public static void main(String[] args) throws FileNotFoundException {
	    f2();
	    f3();
	    f4();
	    f5();
	    f6();
	    f7();
	    f8();
    }

    private static void f8() {
        boolean nincs = true;
        for (int i = 0; i < fordulok.size() && nincs; i++) {
            System.out.println(i);
            EredmenyElemzo eredmenyElemzo = new EredmenyElemzo(fordulok.get(i).eredmények);
            if ( !eredmenyElemzo.memvoltDontetlenMerkozes()){
                nincs=false;

            }
        }
        System.out.println(nincs);
    }

    private static void f7() {
        // EredmenyElemzo eredmenyElemzo = new EredmenyElemzo("");
    }

    private static void f6() {
        int max=0;
        for (int i = 0; i < fordulok.size(); i++) {
            if (fordulok.get(i).ny13p1 > fordulok.get(max).ny13p1){ max=i;}
        }

        int min=max;
        for (int i = 0; i < fordulok.size(); i++) {
            if (fordulok.get(i).ny13p1 !=0 && fordulok.get(i).ny13p1 < fordulok.get(min).ny13p1){ min=i;}
        }
        System.out.println(fordulok.get(max));
        System.out.println(fordulok.get(min));
    }

    private static void f5() {
        long osszeg=0;
        for (Fordulo ford:fordulok){
            osszeg+=ford.t13p1* ford.ny13p1 ;
        }
        System.out.println(osszeg/ fordulok.size());
    }

    private static void f4() {
        int db=0;
        for (Fordulo ford:fordulok){
             db+=ford.t13p1;
        }
        System.out.println("4. feladat: Tetlitalálatos szelvény száma: "+db+" db");
    }

    private static void f3() {
        System.out.println(fordulok.size()+" forduló volt ");
    }

    private static void f2() throws FileNotFoundException {
        File f = new File("toto.txt");
        fordulok= new ArrayList<>();
        Scanner olvas = new Scanner(f);
        olvas.nextLine();
        while (olvas.hasNextLine()){
            String sor = olvas.nextLine();
            Fordulo fordulo = new Fordulo(sor);
            fordulok.add(fordulo);
        }
        olvas.close();
       // System.out.println(fordulok);
    }
}














