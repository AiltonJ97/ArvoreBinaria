package Programa;

import Entidades.Arvore;
import Entidades.No;

public class Executor {

	public static void main(String[] args) {
		
		Arvore arvore = new Arvore();
		
		//Inserir Valores
		arvore.inserir(10);
		arvore.inserir(5);
        arvore.inserir(15);
        arvore.inserir(7);
        arvore.inserir(12);
        arvore.inserir(16);
        arvore.inserir(8);
        arvore.inserir(3);
        
        //Imprimindo Arvore
        System.out.println("Percurso em ordem:");
        No.percorrerEmOrdem(arvore.getRaiz());
        
     // Imprimir valores em pr�-ordem
        System.out.println("\nValores em pr�-ordem:");
        arvore.imprimirPreOrdem();
        
        //Buscar Valor
        int valorBuscado = 7;
        if (arvore.buscar(valorBuscado)) {
            System.out.println("\nO valor " + valorBuscado + " est� presente na �rvore.");
        } else {
            System.out.println("O valor " + valorBuscado + " n�o est� presente na �rvore.");
        }
        
     // Remover valor 
        int valorRemover = 12;
        arvore.remover(valorRemover);

        // Verificar se o valor foi removido
        if (arvore.buscar(valorRemover)) {
            System.out.println("O valor " + valorRemover + " ainda est� presente na �rvore.");
        } else {
            System.out.println("O valor " + valorRemover + " foi removido da �rvore.");
        }
        
      //Imprimindo Arvore em ordem
        System.out.println("\nPercurso em ordem:");
        No.percorrerEmOrdem(arvore.getRaiz());
        
	}
}
