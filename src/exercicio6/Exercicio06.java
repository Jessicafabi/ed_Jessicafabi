/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio6;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exercicio06 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        int maxSize = 5;
        Estrutura e = new Estrutura(maxSize); 
        Scanner entInt = new Scanner(System.in);
        Scanner entString = new Scanner(System.in);
        
        int prioridade;
        String nome;
        
        while(true)
        {
            System.out.println("Digite sua opção desejada: ");
            System.out.println("1 - Cadastrar Paciente: ");
            System.out.println("2 - Chamar o próximo: ");
            System.out.println("3 - Encerrar Sistema: ");
            int opcao = entInt.nextInt();
            
            switch(opcao)
            {
                case 1:
                {
                    System.out.println("Digite o nome do paciente: ");
                    nome = entString.nextLine();
                    System.out.println("Digite a prioridade do paciente: "); // inserir numero inteiro
                    prioridade = entInt.nextInt();
                    
                    
                    if(e.isFull())
                    {
                        System.out.println("Não há espaço !");
                    }
                    else
                    {
                        e.insert(prioridade);
                    }
                    break;
                }
                
                case 2:
                {
                  //System.out.println("Próximo!!! Compareça ao escritório: " + nome);
                }
                
                case 3:
                {
                    
                }
            }
        }
    }
}
