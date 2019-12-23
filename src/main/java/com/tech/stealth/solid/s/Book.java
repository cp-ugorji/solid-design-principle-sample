/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.stealth.solid.s;

import lombok.Data;

/**
 *The following 5 concepts make up our SOLID principles:
 *Single Responsibility
 *Open/Closed
 *Liskov Substitution
 *Interface Segregation
 *Dependency Inversion
 *While some of these words may sound daunting, they can be easily understood with some simple code examples. 
 * In the following sections, we'll take a deep dive into what each of these principles means, 
 * along with a quick Java example to illustrate each one.
 * @author Chukwudi Ugorji
 */
@Data
public class Book {
    /*Single Responsibility
    Let's kick things off with the single responsibility principle. 
    As we might expect, this principle states that a class should only have one responsibility. 
    Furthermore, it should only have one reason to change. 
    How does this principle help us to build better software? Let's see a few of its benefits:

    Testing – A class with one responsibility will have far fewer test cases
    Lower coupling – Less functionality in a single class will have fewer dependencies
    Organization – Smaller, well-organized classes are easier to search than monolithic ones
    
    Take, for example, a class to represent a simple book:*/
    private String name;
    private String author;
    private String text;
    
    public String changeWordInText(String word){
        return text.replaceAll(word, text);
    }
    
    public boolean isWordInText(String word){
        return text.contains(word);
    }
}
