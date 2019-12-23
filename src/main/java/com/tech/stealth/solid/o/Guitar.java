/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.stealth.solid.O;

import lombok.Data;

/*Open for Extension, Closed for Modification
 *Now, time for the ‘O' – more formally known as the open-closed principle. 
 * Simply put, classes should be open for extension, but closed for modification. 
 * In doing so, we stop ourselves from modifying existing code and causing potential 
 * new bugs in an otherwise happy application.
 * Of course, the one exception to the rule is when fixing bugs in existing code.
 * @author Chukwudi Ugorji
 */
@Data
public class Guitar {
    private String make;
    private String model;
    private int volume;
    /*We launch the application, and everyone loves it. However, after a few months, 
    we decide the Guitar is a little bit boring and could do with an awesome flame pattern 
    to make it look a bit more ‘rock and roll'. 
    At this point, it might be tempting to just open up the Guitar class and add 
    a flame pattern – but who knows what errors that might throw up in our application. 
    Instead, let's stick to the open-closed principle and simply extend our Guitar class:*/
}
