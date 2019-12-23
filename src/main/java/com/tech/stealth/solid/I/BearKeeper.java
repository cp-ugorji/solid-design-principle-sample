/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.stealth.solid.I;

/**Interface Segregation
 *The ‘I ‘ in SOLID stands for interface segregation, and it simply means that larger interfaces 
 * should be split into smaller ones. By doing so, we can ensure that implementing classes only need 
 * to be concerned about the methods that are of interest to them. 
 * For this example, we're going to try our hands as zookeepers. And more specifically, 
 * we'll be working in the bear enclosure. 
 * Let's start with an interface that outlines our roles as a bear keeper:
 * @author Chukwudi Ugorji
 */
public interface BearKeeper {
    void washTheBear();
    void feedTheBear();
    void petTheBear();
    /*As avid zookeepers, we're more than happy to wash and feed our beloved bears. 
    However, we're all too aware of the dangers of petting them. Unfortunately, 
    our interface is rather large, and we have no choice than to implement the code to pet the bear.
    
    Let's fix this by splitting our large interface into 3 separate ones:
    */
}
