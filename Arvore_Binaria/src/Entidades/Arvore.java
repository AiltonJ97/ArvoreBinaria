package Entidades;

public class Arvore {
	
	private No Raiz;
	
	public Arvore() {
        this.Raiz = null;
    }
	
	public No getRaiz() {
        return Raiz;
    }
	//Metodo Inserir valor
	public void inserir(int valor) {
        Raiz = inserirRecursivo(Raiz, valor);
    }
	
	private No inserirRecursivo(No no, int valor) {
        if (no == null) {
            return new No(valor);
        }

        if (valor < no.getValor()) {
            no.setEsquerda(inserirRecursivo(no.getEsquerda(), valor));
        } else if (valor > no.getValor()) {
            no.setDireita(inserirRecursivo(no.getDireita(), valor));
        }

        return no;
    }
	
	
	//Metodo Buscar Valor
	public boolean buscar(int valor) {
        return buscarRecursivo(Raiz, valor);
    }

    private boolean buscarRecursivo(No no, int valor) {
        if (no == null) {
            return false;
        }

        if (valor == no.getValor()) {
            return true;
        } else if (valor < no.getValor()) {
            return buscarRecursivo(no.getEsquerda(), valor);
        } else {
            return buscarRecursivo(no.getDireita(), valor);
        }
    }
    
    //Metodo remover Valor
    public void remover(int valor) {
        Raiz = removerRecursivo(Raiz, valor);
    }

    private No removerRecursivo(No no, int valor) {
        if (no == null) {
            return null;
        }

        if (valor == no.getValor()) {
            // Nó sem filhos
            if (no.getEsquerda() == null && no.getDireita() == null) {
                return null;
            }

            // Nó com apenas um filho
            if (no.getDireita() == null) {
                return no.getEsquerda();
            }
            if (no.getEsquerda() == null) {
                return no.getDireita();
            }

            // Nó com dois filhos
            int menorValor = encontrarMenorValor(no.getDireita());
            no.setValor(menorValor);
            no.setDireita(removerRecursivo(no.getDireita(), menorValor));
            return no;
        }

        if (valor < no.getValor()) {
            no.setEsquerda(removerRecursivo(no.getEsquerda(), valor));
            return no;
        }

        no.setDireita(removerRecursivo(no.getDireita(), valor));
        return no;
    }

    private int encontrarMenorValor(No no) {
        return no.getEsquerda() == null ? no.getValor() : encontrarMenorValor(no.getEsquerda());
    }
    
    //Imprimir Valores em Pre-Ordem
    public void imprimirPreOrdem() {
        imprimirPreOrdemRecursivo(Raiz);
    }

    private void imprimirPreOrdemRecursivo(No no) {
        if (no != null) {
            System.out.println(no.getValor()); //  O nó atual
            imprimirPreOrdemRecursivo(no.getEsquerda()); // O filho à esquerda
            imprimirPreOrdemRecursivo(no.getDireita()); // O filho à direita
        }
    }
	
}
