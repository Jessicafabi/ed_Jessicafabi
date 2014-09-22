/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exerciciopilha;

/**
 *
 * @author Semec_2
 */
public class Usuaria {
    public static void main(String[] args)
      {
      System.out.println("Bem vindo! Vamos empilhar as roupas...");
      pilha p = new pilha(10);  
      p.inserir("Camisa");               
      p.inserir("Calça");
      p.inserir("Shorts");
      p.inserir("Jaqueta");
      p.inserir("Vestido");
      p.inserir("Meia");
      p.inserir("Blazer");
      
      System.out.println("\nDesempilhando...\n");
      while( !p.estaVazio())     // enquanto não estiver vazia a pilha
         { 
         String value = p.remove();       //remova o item do topo
         System.out.print(value);      // e retorne o valor dele
         System.out.print("\n");
         }  
      System.out.println(" ");
      }    
}
