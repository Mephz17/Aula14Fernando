/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q1;

/**
 *
 * @author iagom
 */
public class No {
    int dado;
    No proximo;
    No anterior;

    No(int dado) {
        this.dado = dado;
        this.proximo = null;
        this.anterior = null;
    }
}
