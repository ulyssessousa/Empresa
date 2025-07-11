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
public class Programador extends Funcionario{
    private ArrayList<String> linguagens;
    
    public Programador(String nome, String cpf, double salario, String cargo){
        
        super(nome, cpf, salario, cargo);
        
        linguagens = new ArrayList<>();
    }
    
    public void adicionarLinguagem(String linguagem){
        linguagens.add(linguagem);
    }
    
    public void mostrarLinguagens(){
        int i;
        System.out.println("Linguagens:");
        for(i = 0; i < linguagens.size(); i++){
            System.out.println(" - " + linguagens.get(i));
        }
    }
    
    @Override
    public void mostrarInformacoes(){
        super.mostrarInformacoes();
        mostrarLinguagens();
    }
}
