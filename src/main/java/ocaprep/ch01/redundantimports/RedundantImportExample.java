package ocaprep.ch01.redundantimports;

import java.util.Random;

// import java.lang.System; // lang is automatically imported
// import java.lang.*; // redundant import

/* 
    one of these import statements has to be removed, otherwise one of the import statement is redundant
*/
// import java.util.Random; 
// import java.util.*; 

public class RedundantImportExample {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10));
    }
}
