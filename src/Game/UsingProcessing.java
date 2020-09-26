package Game;
import processing.core.*;
import java.util.*;
public class UsingProcessing extends PApplet {
    protected ArrayList<Territorio> territorios = new ArrayList<>();
	PImage mapa;
    // The argument passed to main must match the class name
    public static void main(String[] args) {
        PApplet.main("Game.UsingProcessing");
    }

    // method used only for setting the size of the window
    public void settings(){
    	size(displayWidth, displayHeight);
    }

    // identical use to setup in Processing IDE except for size()
    public void setup(){
    	this.mapa = loadImage("supremacymap.png");
        image(this.mapa, 0, 0);
        // South America
        ArrayList<String> frontBrazil = new ArrayList<>(Arrays.asList("Venezuela",
                "Peru", "Argentina", "Carribean Sea", "Mid Atlantic", "Baia Santos"));
        Territorio brazil = new Territorio(this, "Brazil", frontBrazil,
                new PVector(460, 620), 60, 30);
        territorios.add(brazil);

        ArrayList<String> frontArg = new ArrayList<>(Arrays.asList("Brazil", "Peru",
                "Baia Santos", "Rio de la Plata", "South Pacific", "Lima Bay"));
        Territorio argentina = new Territorio(this, "Argentina", frontArg,
                new PVector(440,740), 60, 30);
        territorios.add(argentina);

        ArrayList<String> frontVene = new ArrayList<>(Arrays.asList("Brazil", "Peru",
                "Carribean Sea","Central America", "Gulf of Panama","Lima Bay"));
        Territorio venezuela = new Territorio(this, "Venezuela", frontVene,
                new PVector(330, 580), 60, 30);
        territorios.add(venezuela);

        ArrayList<String> frontPeru = new ArrayList<>(Arrays.asList("Venezuela", "Brazil",
                "Argentina","Lima Bay"));
        Territorio peru = new Territorio(this, "Peru", frontPeru,
                new PVector(380, 670), 60, 30);
        territorios.add(peru);

        // Central America
        ArrayList<String> frontCentralAmerica = new ArrayList<>(Arrays.asList("Carribean Sea",
                "Venezuela","Gulf of Panama", "Santa Barbara Passage","Western USA","Mid-West USA"));
        Territorio centralAmerica = new Territorio(this, "Central America", frontCentralAmerica,
                new PVector(260, 490), 100, 30);
        territorios.add(centralAmerica);

        // North America
        ArrayList<String> frontAlaska = new ArrayList<>(Arrays.asList("Nothern Canada",
                "Western Canada","North Pacific", "Barkley Sound"));
        Territorio alaska = new Territorio(this, "Alaska", frontAlaska,
                new PVector(180, 180), 60, 30);
        territorios.add(alaska);

        ArrayList<String> frontWesternUSA = new ArrayList<>(Arrays.asList("Mid-West USA",
                "Western Canada","Santa Barbara Passage", "Barkley Sound","Central America"));
        Territorio westernUSA = new Territorio(this, "Western USA", frontWesternUSA,
                new PVector(217, 333), 80, 30);
        territorios.add(westernUSA);

        ArrayList<String> frontMidWestUSA = new ArrayList<>(Arrays.asList("Western USA",
                "Western Canada","Eastern Canada", "Eastern USA","Central America"));
        Territorio midWestUSA = new Territorio(this, "Mid-West USA", frontMidWestUSA,
                new PVector(333, 297), 90, 30);
        territorios.add(midWestUSA);

        ArrayList<String> frontEasternUSA = new ArrayList<>(Arrays.asList("Mid-West USA",
                "Gulf of St. Lawrence","Eastern Canada", "Long Island Sound","Carribean Sea"));
        Territorio easternUSA = new Territorio(this, "Eastern USA", frontEasternUSA,
                new PVector(367, 337), 90, 30);
        territorios.add(easternUSA);

        ArrayList<String> frontNorthernCanada = new ArrayList<>(Arrays.asList("Alaska",
                "Western Canada", "Greenland", "Hudson Strait"));
        Territorio northernCanada = new Territorio(this, "Northern Canada", frontNorthernCanada,
                new PVector(305, 191), 100, 30);
        territorios.add(northernCanada);

        ArrayList<String> frontWesternCanada = new ArrayList<>(Arrays.asList("Alaska",
                "Northern Canada", "Barkley Sound", "Hudson Strait","Eastern Canada","Western USA"));
        Territorio westernCanada = new Territorio(this, "Western Canada", frontWesternCanada,
                new PVector(280, 252), 100, 30);
        territorios.add(westernCanada);

        ArrayList<String> frontEasternCanada = new ArrayList<>(Arrays.asList("Mid-West USA",
                "Eastern USA", "Barkley Sound", "Hudson Strait","Western Canada"));
        Territorio easternCanada = new Territorio(this, "Eastern Canada", frontEasternCanada,
                new PVector(423, 260), 100, 30);
        territorios.add(easternCanada);

        ArrayList<String> frontGreenland = new ArrayList<>(Arrays.asList("North Atlantic",
                "Northern Canada","Hudson Strait"));
        Territorio greenland = new Territorio(this, "Greenland", frontGreenland,
                new PVector(500, 140), 100, 30);
        territorios.add(greenland);
        
    }

    // identical use to draw in Prcessing IDE
    public void draw(){
        for (int i = 0; i < territorios.size(); i++) {
            territorios.get(i).show();
        }
    }
    public void mouseClicked() {
    	int x = mouseX;
    	int y = mouseY;
        System.out.println(x+"|"+y);
        for (int i = 0; i < territorios.size(); i++) {
            Territorio territorio = territorios.get(i);

            if(territorio.isPointInside(x, y)) {
                ArrayList<String> fronteiras = territorio.getFronteiras();
                for (int j = 0; j < fronteiras.size(); j++) {
//                  Itera sobre as fronteiras e retorna o seu Territorio pelo nome
                    Territorio fronteira = Territorio.getTerritorio(territorios, fronteiras.get(j));
                    if(fronteira != null) {
                        Territorio.highlight(fronteira);

                    }
                }
            }
        }
    }
}
