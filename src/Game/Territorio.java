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

	private int color = 150;
	public Territorio(PApplet p, String name, ArrayList<String> fronteiras, PVector pos, int width, int height) {
		this.name = name;
		this.fronteiras = fronteiras;
		this.pos = pos;
		this.width = width;
		this.height = height;
		this.p = p;
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
		return x > this.pos.x - this.width/2 && x < this.pos.x + this.width/2 && y > this.pos.y - this.height/2 && y < this.pos.y + this.height/2;
	}
}
