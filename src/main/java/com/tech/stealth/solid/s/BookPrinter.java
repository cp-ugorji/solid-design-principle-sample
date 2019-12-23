/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.stealth.solid.s;

/**
 *we should implement a separate class that is concerned only with printing our texts.
 * Awesome. Not only have we developed a class that relieves the Book of its printing duties, 
 * but we can also leverage our BookPrinter class to send our text to other media. 
 * Whether it's email, logging, or anything else, we have a separate class dedicated to this one concern.
 * @author Chukwudi Ugorji
 */
public class BookPrinter {
    // methods for outputting text
    void printTextToConsole(String text){
        //our code for formatting and printing the text
    }
 
    void printTextToAnotherMedium(String text){
        // code for writing to any other location..
    }
}
