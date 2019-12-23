/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.stealth.solid.L;

/**
 *
 * @author Chukwudi Ugorji
 */
public class ElectricCar implements Car{

    @Override
    public void turnOnEngine() {
        throw new AssertionError("This electric cars has no engine."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void accelerate() {
        //the acceleration is super fast
    }
    /*By throwing a car without an engine into the mix, we are inherently changing the behavior of our program. 
    This is a blatant violation of Liskov substitution and is a bit harder to fix than our previous 2 principles. 
    One possible solution would be to rework our model into interfaces that take into account the engine-less state of our Car.*/
}
