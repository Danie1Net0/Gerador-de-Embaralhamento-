package model.bean;

import java.util.Random;

public abstract class Embaralhamento {
    //ATRIBUTOS
    private final String [][] MOVIMENTOS = {{"F", "F'", "F2", "Fw", "Fw'", "Fw2"},
                                            {"R", "R'", "R2", "Rw", "Rw'", "Rw2"}, 
                                            {"U", "U'", "U2", "Uw", "Uw'", "Uw2"},
                                            {"D", "D'", "D2", "Dw", "Dw'", "Dw2"},
                                            {"B", "B'", "B2", "Bw", "Bw'", "Bw2"},
                                            {"L", "L'", "L2", "Lw", "Lw'", "Lw2"}};
    private int linhaMatriz, colunaMatriz;
    private int ultimaLinha, ultimaColuna;
    private int numMovimentos;
    
    //CONSTRUTOR
    public Embaralhamento(int linhaMatriz, int colunaMatriz, int numMovimentos){
        this.linhaMatriz = linhaMatriz;
        this.colunaMatriz = colunaMatriz;
        this.numMovimentos = numMovimentos;
        this.ultimaLinha = -1;
        this.ultimaColuna = -1;
    }
    
    //GETTERS & SETTERS
    protected int getLinhaMatriz() {
        return linhaMatriz;
    }

    protected void setLinhaMatriz(int linhaMatriz) {
        this.linhaMatriz = linhaMatriz;
    }

    protected int getColunaMatriz() {
        return colunaMatriz;
    }

    protected void setColunaMatriz(int colunaMatriz) {
        this.colunaMatriz = colunaMatriz;
    }

    protected int getUltimaLinha() {
        return ultimaLinha;
    }

    protected void setUltimaLinha(int ultimaLinha) {
        this.ultimaLinha = ultimaLinha;
    }

    protected int getUltimaColuna() {
        return ultimaColuna;
    }

    protected void setUltimaColuna(int ultimaColuna) {
        this.ultimaColuna = ultimaColuna;
    }

    protected int getNumMovimentos() {
        return numMovimentos;
    }

    protected void setNumMovimentos(int numMovimentos) {
        this.numMovimentos = numMovimentos;
    }
    
    protected String[][] getMOVIMENTOS() {
        return MOVIMENTOS;
    }
    
    //METODOS
    protected int geraNumero(int ultimo, int intervalo){
        int numero = ultimo;
        while(numero == ultimo){
            numero = new Random().nextInt(intervalo);
        }
        return numero;
    }

    public String getScramble(){
        StringBuilder scramble = new StringBuilder();
        for(int c = 1; c <= this.getNumMovimentos(); c++){
            this.setUltimaLinha(geraNumero(this.getUltimaLinha(), this.getLinhaMatriz()));
            this.setUltimaColuna(geraNumero(this.getUltimaColuna(), this.getColunaMatriz()));
            scramble.append(this.getMOVIMENTOS()[this.getUltimaLinha()][this.getUltimaColuna()]).append(c != this.getNumMovimentos() ? " " : "");
        }
        
        return scramble.toString();
    }
    
}
