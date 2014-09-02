/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ExercicioAvancado;

/**
 *
 * @author Jessica
 */
public class Jogador
   { 
   private String nome;
   private float altura;
   private int idade;
//--------------------------------------------------------------
   public Jogador(String n, float al, int id)
      {                               // comentario aqui
      nome = n;
      altura = al;
      idade = id;
      }
//--------------------------------------------------------------
   public void displayPessoa()
      {
      System.out.print("   Nome: " + nome);
      System.out.print(", Altura: " + altura);
      System.out.println(", Idade: " + idade);
      }
//--------------------------------------------------------------
   public String getNome()           // comentario aqui
      { return nome; }
   
   public double getIdade(){
       return idade;
   }

   }  // Final da Classe Jogador