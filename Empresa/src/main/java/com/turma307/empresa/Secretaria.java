/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turma307.empresa;

import java.util.ArrayList;

/**
 *
 * @author ulyss
 */
public class Secretaria extends Funcionario{
    private ArrayList<String> idiomas;
    
    public Secretaria(String nome, String cpf, double salario, String cargo){
        super(nome, cpf, salario, cargo);
        idiomas = new ArrayList<>();
    }
    
    public void adicionarIdioma(String idioma){
        idiomas.add(idioma);
    }
    
    public void mostrarIdiomas(){
        System.out.println("Idiomas: ");
        for(String idiomaAtual : idiomas){
            System.out.println(" - " + idiomaAtual);
        }
    }
}
