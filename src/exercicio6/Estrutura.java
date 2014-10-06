/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio6;

/**
 *
 * @author Aluno
 */
public class Estrutura 
{
    private long[] pacientes;
    private int maxSize;
    private int index;
//------------------------------------------------------------------------------
// MÉTODO CONSTRUTOR
// -----------------------------------------------------------------------------
    public Estrutura(int max)
    {
        pacientes = new long[max];
        index = 0;
        maxSize = max;
    }

//------------------------------------------------------------------------------
// MÉTODO DE INSERÇÃO
//------------------------------------------------------------------------------
    public void insert(long item)  
      {
      int j;

      if(index == 0)                         
         pacientes[index++] = item;         
      else                                
         {
         for(j = index-1; j >= 0; j--)         
            {
            if( item > pacientes[j] )      
               pacientes[j+1] = pacientes[j]; 
            else                          
               break;                     
            }  
         pacientes[j+1] = item;            
         index++;
         }  
      } 
    
 //-----------------------------------------------------------------------------
 // MÉTODO DE REMOÇÃO
 // ----------------------------------------------------------------------------
   public long remove()             
   { 
       return pacientes[--index]; 
   }

   public long peekMin()            // pega o último item
   { 
       return pacientes[index-1]; 
   }
   

   public boolean isFull()          // verifica se esta cheio
   { 
       return (index == maxSize); 
   }

   
    public boolean isEmpty()         // verifica se esta vazio
   { 
       return (index == 0); 
   }

}

