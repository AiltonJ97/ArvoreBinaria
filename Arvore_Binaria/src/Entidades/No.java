package Entidades;

public class No {
	
	private Integer valor;
    private No esq;
    private No dir;
    
    public No(int valor) {
        this.valor = valor;
        this.esq = null;
        this.dir = null;
    }

	public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public No getEsquerda() {
        return esq;
    }

    public void setEsquerda(No esq) {
        this.esq = esq;
    }

    public No getDireita() {
        return dir;
    }

    public void setDireita(No dir) {
        this.dir = dir;
    }
    
    public static void percorrerEmOrdem(No no) {
        if (no != null) {
            percorrerEmOrdem(no.getEsquerda());
            System.out.println(no.getValor());
            percorrerEmOrdem(no.getDireita());
        }
    }

}
