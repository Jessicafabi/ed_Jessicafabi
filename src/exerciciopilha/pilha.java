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
public class pilha {
   private int maxSize;        
   private String[] pilhaArray;   
   private int top;            
//--------------------------------------------------------------
   public pilha(int s)         
      {
      maxSize = s;             
      pilhaArray = new String[maxSize]; 
      top = -1;                
      }
//--------------------------------------------------------------
   public void inserir(String j)    
      {
      pilhaArray[++top] = j;     
   }
//--------------------------------------------------------------
   public String remove()           
      {
      return pilhaArray[top--];  
      
      }
//--------------------------------------------------------------
   public String pegaitem()         
      {
      return pilhaArray[top];      
      }
//--------------------------------------------------------------
   public boolean estaVazio()    
      {
      return (top == -1);       
      }
//--------------------------------------------------------------
   public boolean estaCheio()     
      {
      return (top == maxSize-1);    
      }
//--------------------------------------------------------------
    
}
