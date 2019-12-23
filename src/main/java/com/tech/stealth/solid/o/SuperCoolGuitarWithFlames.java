/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.stealth.solid.O;

import lombok.Data;

/**
 *By extending the Guitar class we can be sure that our existing application won't be affected.
 * @author Chukwudi Ugorji
 */
@Data
public class SuperCoolGuitarWithFlames extends Guitar{
    private String flameColor;
}
