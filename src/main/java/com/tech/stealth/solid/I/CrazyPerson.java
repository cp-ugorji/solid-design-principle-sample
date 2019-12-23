/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.stealth.solid.I;

/**
 *And finally, we can leave the dangerous stuff to the crazy people:
 * @author Chukwudi Ugorji
 */
public class CrazyPerson implements BearPetter{

    @Override
    public void petTheBear() {
        //Good luck with that!
    }
    /*Going further, we could even split our BookPrinter class from our example earlier to use 
    interface segregation in the same way. By implementing a Printer interface with a single print 
    method, we could instantiate separate ConsoleBookPrinter and OtherMediaBookPrinter classes.*/
}
