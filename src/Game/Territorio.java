package Game;
import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PVector;
import java.util.ArrayList;

public class Territorio {
	private String name;
	private final ArrayList<String> fronteiras;
	private PVector pos;
	private final PApplet p;
	private int width, height;
	private ArrayList<Jogador> ocupante;
	private int custo;

	private int color = 150;
//	Apenas um ocupante
	public Territorio(PApplet p, String name, ArrayList<String> fronteiras, PVector pos, int width, int height, ArrayList<Jogador> ocupante) {
		this.name = name;
		this.fronteiras = fronteiras;
		this.pos = pos;
		this.width = width;
		this.height = height;
		this.p = p;
		this.ocupante = ocupante;
		this.custo = 1;
	}
	public String getName() {
		return name;
	}
	public ArrayList<String> getFronteiras() {
		return this.fronteiras;
	}

	public static Territorio getTerritorio(ArrayList<Territorio> territorios, String fronteira) {
		for (Territorio territorio : territorios) {
			if (fronteira.equals(territorio.getName())){
				return territorio;
			}
		}
		return null;
	}

	public void show() {
		p.fill(color);
		p.rectMode(PConstants.CENTER);
		p.rect(this.pos.x, this.pos.y, this.width, this.height);
		p.fill(0, 0, 0);
		p.textAlign(PConstants.CENTER, PConstants.BOTTOM);
		p.text(this.name, this.pos.x, this.pos.y);
	}
	static public void highlight(Territorio territorio) {
		territorio.color = 255;
	}
	public boolean isPointInside(int x, int y) {
		return x > this.pos.x - this.width/2 && x < this.pos.x + this.width/2 &&
				y > this.pos.y - this.height/2 && y < this.pos.y + this.height/2;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PVector getPos() {
		return pos;
	}

	public void setPos(PVector pos) {
		this.pos = pos;
	}

	public PApplet getP() {
		return p;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public ArrayList<Jogador> getOcupante() {
		return ocupante;
	}

	public void setOcupante(ArrayList<Jogador> ocupante) {
		this.ocupante = ocupante;
	}

	public int getCusto() {
		return custo;
	}

	public void setCusto(int custo) {
		this.custo = custo;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}
}
