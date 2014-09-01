/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package desafio2;

/**
 *
 * @author Asus
 */
public class Pessoa {
  
        private String nome;
        private String profissao;
        private int idade;
        
//-----------------------------------------------------------------------//
// Método Construtor
//-----------------------------------------------------------------------//
        
public Pessoa(String n, String prof, int i)
{
    nome = n;
    profissao = prof;
    idade = i;
}

public void displayPessoa()
{
   System.out.println("O nome é: " + nome);
   System.out.println("Sua profissão é: " + profissao);
   System.out.println("Sua idade é: " + idade);
}
 
public String getLast() //obtém o último nome
{
    return nome;
}
}// fim da classe Pessoa

class ClassDataArray
{
    private Pessoa[] a;                  //referência ao vetor
    private int NElems;                 //número de intens de dados
    
    public ClassDataArray(int max)  //construtor
    {
        a = new Pessoa[max];        //cria o vetor
        NElems = 0;                 //sem intens ainda           
    }

    //-------------------------------------------------------------------------
    // Encontra um valor especifico
    //-------------------------------------------------------------------------
    
    public void find(String searchName)
    {                                      //encontra valor especifico
        int j;
        for(j=0; j<NElems; j++)     // para cada elemento
            if(a[j].getLast().equals(searchName))  //achou o item?
                break; //sair do laço antes do fim
        if(j == NElems) //chegou ao fim?
      System.out.println("Não Encontrado");
       else {
        }   //não, o encontrou
       
    } //fim do find()
        
    
    //-------------------------------------------------------------------------
    // insere uma pessoa no vetor
    //-------------------------------------------------------------------------
    
    public void insert(String nome, String profissao, int idade)
    {
        a[NElems] = new Pessoa(nome, profissao, idade);
        NElems++;           //aumenta o tamanho     
    }
    
    public boolean delete(String searchName)
    {
        int j;
        
        for(j=0; j<NElems; j++)     //pesquisá-la
            if(a[j].equals(searchName))
                break;
        if(j == NElems)             //não pode encontrá-lo
            return false;
        else                        // a encontrou
        {
            for (int k=j; k<NElems; k++)  //deslocar para baixo
                a[k] = a[k + 1];
            NElems --;  //diminuir tamanho
            return true;
        }
    } //fim do delete
          
    public void Display() //mostra o conteúdo do vetor
    {        
        for (int j=0; j<NElems; j++)  //para cada elemento,
            a[j].displayPessoa();  //mostrá-lo
    }
} // fim da classe ClassDataArray
    
class ClassDataApp
{
    public static void main(String[] args)
    {
        int maxSize = 100;          //tamanho do vetor
        ClassDataArray arr;         // referencia ao vetor
        arr = new ClassDataArray(maxSize);  //cria o vetor
        
        //inserir 10 intens
        arr.insert("Eduardo", "Cabelereiro", 25);
        arr.insert("Suzana", "Professora", 30);
        arr.insert("Ingrid", "Estagiária", 22);
        arr.insert("Adriano", "Caminhoneiro", 41);
        arr.insert("Julio", "Gerente", 33);
        arr.insert("Felipo", "Advogado", 42);
        arr.insert("Keli", "Dançarina", 22);
        arr.insert("Valquiria","Cozinheira", 50);
        arr.insert("Marcos", "Empresário", 35);
        arr.insert("Hugo", "Musico", 18);
        
        arr.Display(); //mostrar intens
        
        String searchKey = "Julio"; //pesquisa item
        Pessoa found;
        found = arr.find(searchKey);
        if(found != null)
        {
            System.out.println("\nEncontrado!\n");
            found.displayPessoa();
        }
          else  
            System.out.println("Não encontrado" + searchKey);
            
        System.out.println("\nDeletando!\n");
            
            arr.delete("Suzana");   //remover 3 itens
            arr.delete("Ingrid");
            arr.delete("Hugo");
            
            arr.Display(); //mostrar intens novamente
        } //fim da classe main()
        
    } //fim da classe ClassDataApp


