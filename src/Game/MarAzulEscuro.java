package Game;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PVector;

import java.util.ArrayList;

public class MarAzulEscuro extends Territorio{
    private PVector pos2;
//    Pode ter mais de um ocupante
    public MarAzulEscuro(PApplet p, String name, ArrayList<String> fronteiras, PVector pos1, PVector pos2, int width, int height, ArrayList<Jogador> ocupante) {
        super(p, name, fronteiras, pos1, width, height, ocupante);
        this.pos2 = pos2;
    }

    public void show() {
        this.getP().fill(this.getColor());
        this.getP().rectMode(PConstants.CENTER);
        this.getP().rect(this.getPos().x, this.getPos().y, this.getWidth(), this.getHeight());
        this.getP().fill(0, 0, 0);
        this.getP().textAlign(PConstants.CENTER, PConstants.BOTTOM);
        this.getP().text(this.getName(), this.getPos().x, this.getPos().y);

        if (getPos2() != null) {
            this.getP().fill(this.getColor());
            this.getP().rectMode(PConstants.CENTER);
            this.getP().rect(this.getPos2().x, this.getPos2().y, this.getWidth(), this.getHeight());
            this.getP().fill(0, 0, 0);
            this.getP().textAlign(PConstants.CENTER, PConstants.BOTTOM);
            this.getP().text(this.getName(), this.getPos2().x, this.getPos2().y);
        }
    }

    @Override
    public boolean isPointInside(int x, int y) {
        // Verifica o primeiro e segundo botao
        if (getPos2() == null){
            return (x > this.getPos().x - this.getWidth()/2 && x < this.getPos().x + this.getWidth()/2 &&
                    y > this.getPos().y - this.getHeight()/2 && y < this.getPos().y + this.getHeight()/2);
        } else {
        return (x > this.getPos().x - this.getWidth()/2 && x < this.getPos().x + this.getWidth()/2 &&
                y > this.getPos().y - this.getHeight()/2 && y < this.getPos().y + this.getHeight()/2)
                || (x > this.getPos2().x - this.getWidth()/2 && x < this.getPos2().x + this.getWidth()/2 &&
                y > this.getPos2().y - this.getHeight()/2 && y < this.getPos2().y + this.getHeight()/2);
        }
    }

    public PVector getPos2() {
        return pos2;
    }

    public void setPos2(PVector pos2) {
        this.pos2 = pos2;
    }
}
