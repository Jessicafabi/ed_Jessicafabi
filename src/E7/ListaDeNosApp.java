/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package E7;

/**
 *
 * @author aleaguado traduzido de Robert Lafore
 */
////////////////////////////////////////////////////////////////
class ListaDeNosApp
   {
   public static void main(String[] args)
      {
      ListaDeNos theList = new ListaDeNos();  // criamos uma nova lista

      theList.insertFirst("Cristiane", "Gratidão");      // inserimos quatro itens nela
      theList.insertFirst("Jéssica", "Vida");
      theList.insertFirst("Moisés", "Programar" );
      theList.insertFirst("Fábio", "Percepção");

      theList.displayList();              // mostramos a lista

    /*  while( !theList.isEmpty() )         // until it's empty,
         {
         No aLink = theList.deleteFirst();   // deletamos o primeiro nó da lista e colocamos em aLink
         System.out.print("Deletado ");         // 
         aLink.displayNo();                     // mostramos o nó deletado
         System.out.println("");
         
         No fLink = theList.find();
         System.out.print("Encontrado");
         fLink.displayNo();
         System.out.println("");
      }*/
      theList.displayList();   
      if(theList.find("Cristiane") != null)
      {
          System.out.println("\n"+"Encontrado!");
      }
      else
      {
          System.out.println("\n"+"Não encontrado!");
      }
// mostramos a lista
      }  // final do método main()
   }  // final da classe usuária
////////////////////////////////////////////////////////////////

