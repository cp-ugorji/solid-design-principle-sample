/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.stealth.solid.L;

/**Liskov Substitution
 *Next up on our list is Liskov substitution, which is arguably the most complex of the 5 principles. 
 * Simply put, if class A is a subtype of class B, then we should be able to replace B with A without 
 * disrupting the behavior of our program. 
 * Let's just jump straight to the code to help wrap our heads around this concept:
 * @author Chukwudi Ugorji
 */
public interface Car {
    void turnOnEngine();
    void accelerate();
    /*Above, we define a simple Car interface with a couple of methods that all cars should be able to 
    fulfill – turning on the engine, and accelerating forward.*/
}
