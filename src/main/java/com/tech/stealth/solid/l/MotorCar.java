/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.stealth.solid.L;

/**
 *Let's implement our interface and provide some code for the methods:
 * @author Chukwudi Ugorji
 */
public class MotorCar implements Car{
    private Engine engine;

    @Override
    public void turnOnEngine() {
        //turn on the engine!
        engine.on();
    }

    @Override
    public void accelerate() {
        //move forward!
        engine.powerThrough(100);
    }
    /*As our code describes, we have an engine that we can turn on, and we can increase the power. 
    But wait, its 2019, and Elon Musk has been a busy man. 
    We are now living in the era of electric cars without engine*/
    
}
