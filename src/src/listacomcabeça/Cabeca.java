
package listacomcabeça;

public class Cabeca {     

    public static void main(String[] args) {
        ListaCircularComCabeca lista = new ListaCircularComCabeca();

        System.out.println(" Testando Insercao ");
        lista.inserir("A");
        lista.inserir("B");
        lista.inserir("C");
        lista.exibir(); 

        lista.inserirDepois("B", "X");
        lista.exibir(); 

        lista.remover("A");
        lista.exibir(); 

        boolean achouX = lista.buscar("X");
        System.out.println("X encontrado? " + achouX);

        boolean achouZ = lista.buscar("Z");
        System.out.println("Z encontrado? " + achouZ); 

        lista.remover("B");
        lista.remover("X");
        lista.remover("C");
        lista.exibir(); 
    }
}

