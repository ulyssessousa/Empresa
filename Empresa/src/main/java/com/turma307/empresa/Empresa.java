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
        
        
        mostrarDadosFuncionarios(funcionario1);
        mostrarDadosFuncionarios(funcionario2);
        mostrarDadosFuncionarios(funcionario3);
        
    }
    
    private static void mostrarDadosFuncionarios(Funcionario f){
        System.out.println("Informações do Funcionário:");
        f.mostrarInformacoes();
        
        if (f instanceof Programador){
            Programador p = (Programador) f;
            p.mostrarLinguagens(); //método específico de programador
        }else if (f instanceof Secretaria s){
            //Secretaria s = (Secretaria) f;
            s.mostrarIdiomas();//método específico de secretária
        }
        
        
        
       
    }
}
