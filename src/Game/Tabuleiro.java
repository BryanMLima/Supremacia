package Game;

public class Tabuleiro {
    private boolean jogoEmProgresso = false;
    private int numRodadas = 0;
    private int maxRodadas;

    public Tabuleiro(){

    }


    public boolean isJogoEmProgresso() {
        return jogoEmProgresso;
    }

    public void setJogoEmProgresso(boolean jogoEmProgresso) {
        this.jogoEmProgresso = jogoEmProgresso;
    }
    public int getNumRodadas() {
        return numRodadas;
    }

    public void setNumRodadas(int numRodadas) {
        this.numRodadas = numRodadas;
    }

    public int getMaxRodadas() {
        return maxRodadas;
    }

    public void setMaxRodadas(int maxRodadas) {
        this.maxRodadas = maxRodadas;
    }
}
