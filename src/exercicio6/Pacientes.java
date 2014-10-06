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
public class Pacientes 
{
    private String nome;
    private int prioridade;
    
    public Pacientes (String n, int p) //método construtor
    {
        nome = n;
        prioridade = p;
    }
    
    public void displayPaciente()
    {
        System.out.println("Nome do Paciente: " + nome);
        System.out.println("Prioridade: " + prioridade);
    }
    
    
    public String getNome()           
    { 
        return nome; 
    }
   
    public int getPrioridade()           
    { 
        return prioridade; 
    }
}
