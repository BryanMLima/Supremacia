package Game;

import processing.core.PApplet;
import processing.core.PVector;

import java.util.ArrayList;

public class MarAzulClaro extends Territorio{
//    Apenas um ocupante por vez
    public MarAzulClaro(PApplet p, String name, ArrayList<String> fronteiras, PVector pos, int width, int height, ArrayList<Jogador> ocupante) {
        super(p, name, fronteiras, pos, width, height, ocupante);
    }



}
