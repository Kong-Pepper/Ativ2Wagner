/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.administracaoescolar;

/**
 *
 * @author Admin
 */
/*Quando uma pessoa passa a existir no meu código? 
Qunando o Construtor termina de rodar!*/ 
public class AdministracaoEscolar {
    public static void main (String args[]){
    Pessoa p1 = new Pessoa("Huguinho");
    Pessoa p2 = new Pessoa("Zézinho");
    Aluno alun1 = new Aluno("Maya");
    Professor prof1 = new Professor("Wagner");
    
    p1.seteducador(false);
    p2.seteducador(false);
    alun1.seteducador(false);
    prof1.seteducador(true);
    
            System.out.println("pessoa p1: ");
            System.out.println(p1.estudo());
            System.out.println("pessoa p2: ");
            System.out.println(p2.estudo());
            System.out.println("Aluno 1: ");
            System.out.println(alun1.estudo());
            System.out.println("Professor: ");
            System.out.println(prof1.estudo());
}
}
