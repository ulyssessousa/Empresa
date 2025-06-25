/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.turma307.empresa;

/**
 *
 * @author ulyss
 */
public class Empresa {

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Daniela",
                                                  "68766", 
                                                  4000, 
                                                  "Supervisor");
        
        Programador funcionario2 = new Programador("Bianca",
                                                    "79878",
                                                     3500, 
                                                    "Programador");
        
        Secretaria funcionario3 = new Secretaria("Gabriela",
                                                 "0988324",
                                                 3000,
                                                 "Secretária");
        
        funcionario2.adicionarLinguagem("Java");
        funcionario2.adicionarLinguagem("Python");
        
        funcionario3.adicionarIdioma("Inglês");
        funcionario3.adicionarIdioma("Espanhol");
        funcionario3.adicionarIdioma("Italiano");
        
        System.out.println("Informações do Funcionário 1:");
        funcionario1.mostrarInformacoes();
        
        System.out.println("Informações do Funcionário 2:");
        funcionario2.mostrarInformacoes(); //método herdado
        funcionario2.mostrarLinguagens(); //método específico
        
        System.out.println("Informações do Funcionário 3:");
        funcionario3.mostrarInformacoes();
        funcionario3.mostrarIdiomas();
        
        
    }
}
