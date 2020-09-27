package Game;
import processing.core.*;

import javax.swing.*;
import java.util.*;

public class UsingProcessing extends PApplet {
    private ArrayList<Territorio> territorios = new ArrayList<>();
	PImage mapa;
    // The argument passed to main must match the class name
    public static void main(String[] args) {
        PApplet.main("Game.UsingProcessing");
//        JFrame frame = new SupremaciaGUI("Supremacia");
//        frame.setVisible(true);
    }

    // method used only for setting the size of the window
    public void settings(){
    	size(displayWidth, displayHeight);
    }

    public void setupSouthAmerica(){
        ArrayList<String> frontBrazil = new ArrayList<>(Arrays.asList("Venezuela",
                "Peru", "Argentina", "Carribean Sea", "Mid Atlantic", "Baia Santos"));
        Territorio brazil = new Territorio(this, "Brazil", frontBrazil,
                new PVector(460, 620), 60, 30,null);
        territorios.add(brazil);

        ArrayList<String> frontArg = new ArrayList<>(Arrays.asList("Brazil", "Peru",
                "Baia Santos", "Rio de la Plata", "South Pacific", "Lima Bay"));
        Territorio argentina = new Territorio(this, "Argentina", frontArg,
                new PVector(440,740), 60, 30,null);
        territorios.add(argentina);

        ArrayList<String> frontVene = new ArrayList<>(Arrays.asList("Brazil", "Peru",
                "Carribean Sea","Central America", "Gulf of Panama","Lima Bay"));
        Territorio venezuela = new Territorio(this, "Venezuela", frontVene,
                new PVector(330, 580), 60, 30,null);
        territorios.add(venezuela);

        ArrayList<String> frontPeru = new ArrayList<>(Arrays.asList("Venezuela", "Brazil",
                "Argentina","Lima Bay"));
        Territorio peru = new Territorio(this, "Peru", frontPeru,
                new PVector(380, 670), 60, 30,null);
        territorios.add(peru);

    }
    public void setupCentralAmerica(){
        ArrayList<String> frontCentralAmerica = new ArrayList<>(Arrays.asList("Carribean Sea",
                "Venezuela","Gulf of Panama", "Santa Barbara Passage","Western USA","Mid-West USA"));
        Territorio centralAmerica = new Territorio(this, "Central America", frontCentralAmerica,
                new PVector(260, 490), 100, 30,null);
        territorios.add(centralAmerica);
    }
    public void setupNorthAmerica(){
        ArrayList<String> frontAlaska = new ArrayList<>(Arrays.asList("Nothern Canada",
                "Western Canada","North Pacific", "Barkley Sound"));
        Territorio alaska = new Territorio(this, "Alaska", frontAlaska,
                new PVector(180, 180), 60, 30,null);
        territorios.add(alaska);

        ArrayList<String> frontWesternUSA = new ArrayList<>(Arrays.asList("Mid-West USA",
                "Western Canada","Santa Barbara Passage", "Barkley Sound","Central America"));
        Territorio westernUSA = new Territorio(this, "Western USA", frontWesternUSA,
                new PVector(217, 333), 80, 30,null);
        territorios.add(westernUSA);

        ArrayList<String> frontMidWestUSA = new ArrayList<>(Arrays.asList("Western USA",
                "Western Canada","Eastern Canada", "Eastern USA","Central America"));
        Territorio midWestUSA = new Territorio(this, "Mid-West USA", frontMidWestUSA,
                new PVector(333, 297), 90, 30,null);
        territorios.add(midWestUSA);

        ArrayList<String> frontEasternUSA = new ArrayList<>(Arrays.asList("Mid-West USA",
                "Gulf of St. Lawrence","Eastern Canada", "Long Island Sound","Carribean Sea"));
        Territorio easternUSA = new Territorio(this, "Eastern USA", frontEasternUSA,
                new PVector(367, 337), 90, 30,null);
        territorios.add(easternUSA);

        ArrayList<String> frontNorthernCanada = new ArrayList<>(Arrays.asList("Alaska",
                "Western Canada", "Greenland", "Hudson Strait"));
        Territorio northernCanada = new Territorio(this, "Northern Canada", frontNorthernCanada,
                new PVector(305, 191), 100, 30,null);
        territorios.add(northernCanada);

        ArrayList<String> frontWesternCanada = new ArrayList<>(Arrays.asList("Alaska",
                "Northern Canada", "Barkley Sound", "Hudson Strait","Eastern Canada","Western USA"));
        Territorio westernCanada = new Territorio(this, "Western Canada", frontWesternCanada,
                new PVector(280, 252), 100, 30,null);
        territorios.add(westernCanada);

        ArrayList<String> frontEasternCanada = new ArrayList<>(Arrays.asList("Mid-West USA",
                "Eastern USA", "Barkley Sound", "Hudson Strait","Western Canada"));
        Territorio easternCanada = new Territorio(this, "Eastern Canada", frontEasternCanada,
                new PVector(423, 260), 100, 30,null);
        territorios.add(easternCanada);

        ArrayList<String> frontGreenland = new ArrayList<>(Arrays.asList("North Atlantic",
                "Northern Canada","Hudson Strait"));
        Territorio greenland = new Territorio(this, "Greenland", frontGreenland,
                new PVector(500, 140), 100, 30,null);
        territorios.add(greenland);
    }
    public void setupAfrica(){
        ArrayList<String> frontAlaska = new ArrayList<>(Arrays.asList("Nothern Canada",
                "Western Canada","North Pacific", "Barkley Sound"));
        Territorio alaska = new Territorio(this, "Alaska", frontAlaska,
                new PVector(180, 180), 60, 30,null);
        territorios.add(alaska);

    }
    public void setupEurope(){
        ArrayList<String> frontBritishIsles = new ArrayList<>(Arrays.asList("North Sea"));
        Territorio britishIsles = new Territorio(this, "British Isles", frontBritishIsles,
                new PVector(705, 246), 70, 30,null);
        territorios.add(britishIsles);

        ArrayList<String> frontScandinavia = new ArrayList<>(Arrays.asList("North Sea",
                "Barents Sea","Baltic Sea", "Kola","Russia"));
        Territorio scandinavia = new Territorio(this, "Scandinavia", frontScandinavia,
                new PVector(785, 190), 90, 30,null);
        territorios.add(scandinavia);

        ArrayList<String> frontPoland = new ArrayList<>(Arrays.asList("Eastern Europe",
                "Greece","Romania", "Kola","Russia","Baltic Sea"));
        Territorio poland = new Territorio(this, "Poland", frontPoland,
                new PVector(859, 262), 60, 30,null);
        territorios.add(poland);

        ArrayList<String> frontIberia = new ArrayList<>(Arrays.asList("Western Europe",
                "Bay of Biscay","Mediterranean Sea"));
        Territorio iberia = new Territorio(this, "Iberia", frontIberia,
                new PVector(683, 374), 60, 30,null);
        territorios.add(iberia);

        ArrayList<String> frontWesternEurope = new ArrayList<>(Arrays.asList("Iberia",
                "Bay of Biscay","Mediterranean Sea","North Sea","Eastern Europe","Baltic Sea"));
        Territorio westernEurope = new Territorio(this, "Western Europe", frontWesternEurope,
                new PVector(740, 323), 90, 30,null);
        territorios.add(westernEurope);

        ArrayList<String> frontEasternEurope = new ArrayList<>(Arrays.asList("Poland",
                "Greece","Mediterranean Sea","Western Europe","Baltic Sea"));
        Territorio easternEurope = new Territorio(this, "Eastern Europe", frontEasternEurope,
                new PVector(809, 290), 90, 30,null);
        territorios.add(easternEurope);

        ArrayList<String> frontGreece = new ArrayList<>(Arrays.asList("Poland",
                "Romania","Sea of Crete","Black Sea","Eastern Europe"));
        Territorio greece = new Territorio(this, "Greece", frontGreece,
                new PVector(851, 343), 60, 30,null);
        territorios.add(greece);

        ArrayList<String> frontRomania = new ArrayList<>(Arrays.asList("Poland",
                "Greece","Russia","Black Sea","Kazakh"));
        Territorio romania = new Territorio(this, "Romania", frontRomania,
                new PVector(900, 305), 60, 30,null);
        territorios.add(romania);

    }
    public void setupMarAzulClaro(){
        // South America
        ArrayList<String> frontBarkleySound = new ArrayList<>(Arrays.asList("Alaska",
                "Western Canada","North Pacific", "Western USA","Santa Barbara Passage"));
        MarAzulClaro barkleySound = new MarAzulClaro(this, "Barkley Sound", frontBarkleySound,
                new PVector(158, 245), 100, 30,null);
        territorios.add(barkleySound);

        ArrayList<String> frontSantaBarbara = new ArrayList<>(Arrays.asList("Mid Pacific",
                "Gulf of Panama","North Pacific", "Western USA","Central America", "Barkley Sound"));
        MarAzulClaro santaBarbara = new MarAzulClaro(this, "Santa Barbara Passage", frontSantaBarbara,
                new PVector(100, 351), 130, 30,null);
        territorios.add(santaBarbara);

        ArrayList<String> frontGulfOfPanama = new ArrayList<>(Arrays.asList("Mid Pacific",
                "Santa Barbara Passage","Venezuela", "Lima Bay","Central America"));
        MarAzulClaro gulfOfPanama = new MarAzulClaro(this, "Gulf of Panama", frontGulfOfPanama,
                new PVector(190, 524), 100, 30,null);
        territorios.add(gulfOfPanama);

        ArrayList<String> frontLimaBay = new ArrayList<>(Arrays.asList("Mid Pacific",
                "Argentina","Venezuela", "Peru","Gulf of Panama"));
        MarAzulClaro limaBay = new MarAzulClaro(this, "Lima Bay", frontLimaBay,
                new PVector(290, 717), 100, 30,null);
        territorios.add(limaBay);

        ArrayList<String> frontRioDeLaPlata = new ArrayList<>(Arrays.asList("South Atlantic",
                "Argentina","Baia Santos"));
        MarAzulClaro RioDeLaPlata = new MarAzulClaro(this, "Rio de la Plata", frontRioDeLaPlata,
                new PVector(490, 832), 100, 30,null);
        territorios.add(RioDeLaPlata);

        ArrayList<String> frontBaiaSantos = new ArrayList<>(Arrays.asList("South Atlantic",
                "Argentina","Rio de la Plata", "Brazil", "Mid Atlantic"));
        MarAzulClaro baiaSantos = new MarAzulClaro(this, "Baia Santos", frontBaiaSantos,
                new PVector(537, 697), 70, 30,null);
        territorios.add(baiaSantos);

        ArrayList<String> frontCarribeanSea = new ArrayList<>(Arrays.asList("Central America",
                "Venezuela","Mid-West USA", "Brazil", "Mid Atlantic","Eastern USA","Long Island Sound"));
        MarAzulClaro carribeanSea = new MarAzulClaro(this, "Carribean Sea", frontCarribeanSea,
                new PVector(380, 492), 100, 30,null);
        territorios.add(carribeanSea);

        ArrayList<String> frontLongIslandSound = new ArrayList<>(Arrays.asList("Carribean Sea",
                "Gulf of St. Lawrence", "Mid Atlantic","Eastern USA","North Atlantic"));
        MarAzulClaro longIslandSound = new MarAzulClaro(this, "Long Island Sound", frontLongIslandSound,
                new PVector(400, 390), 100, 30,null);
        territorios.add(longIslandSound);

        ArrayList<String> frontGulfOfStLawrence = new ArrayList<>(Arrays.asList("Eastern Canada",
                "Long Island Sound", "Hudson Strait","Eastern USA","North Atlantic"));
        MarAzulClaro gulfOfStLawrence = new MarAzulClaro(this, "Gulf of St. Lawrence", frontGulfOfStLawrence,
                new PVector(488, 311), 110, 30,null);
        territorios.add(gulfOfStLawrence);

        ArrayList<String> frontHudsonStrait = new ArrayList<>(Arrays.asList("Eastern Canada",
                "Gulf of St. Lawrence", "Greenland","Western Canada","North Atlantic","Northern Canada"));
        MarAzulClaro hudsonStrait = new MarAzulClaro(this, "Hudson Strait", frontHudsonStrait,
                new PVector(454, 188), 90, 30,null);
        territorios.add(hudsonStrait);
        // Europe
        ArrayList<String> frontNorthSea = new ArrayList<>(Arrays.asList("Scandinavia",
                "British Isles", "Baltic Sea","Barents Sea","North Atlantic","Bay of Biscay",
                "Western Europe"));
        MarAzulClaro northSea = new MarAzulClaro(this, "North Sea", frontNorthSea,
                new PVector(701, 149), 70, 30,null);
        territorios.add(northSea);

        ArrayList<String> frontBarentsSea = new ArrayList<>(Arrays.asList("Scandinavia",
                "Kola", "Siberia","North Sea"));
        MarAzulClaro barentsSea = new MarAzulClaro(this, "Barents Sea", frontBarentsSea,
                new PVector(1011, 107), 90, 30,null);
        territorios.add(barentsSea);

        ArrayList<String> frontBalticSea = new ArrayList<>(Arrays.asList("Scandinavia",
                "Russia", "Poland","North Sea","Eastern Europe","Western Europe"));
        MarAzulClaro balticSea = new MarAzulClaro(this, "Baltic Sea", frontBalticSea,
                new PVector(861, 205), 60, 30,null);
        territorios.add(balticSea);

        ArrayList<String> frontBayOfBiscay = new ArrayList<>(Arrays.asList("North Sea",
                "Mediterranean Sea","North Atlantic","Iberia","Western Europe"));
        MarAzulClaro bayOfBiscay = new MarAzulClaro(this, "Bay of Biscay", frontBayOfBiscay,
                new PVector(641, 319), 90, 30,null);
        territorios.add(bayOfBiscay);

        // Oriente Medio
        ArrayList<String> frontMediterraneanSea = new ArrayList<>(Arrays.asList("Iberia",
                "Sea of Crete","North Atlantic","Red Sea","Western Europe","Mid Atlantic",
                "Eastern Europe","Sahara","Egypt"));
        MarAzulClaro mediterraneanSea = new MarAzulClaro(this, "Mediterranean Sea", frontMediterraneanSea,
                new PVector(702, 426), 130, 30,null);
        territorios.add(mediterraneanSea);


    }
    public void setupMarAzulEscuro(){
        ArrayList<String> frontNorthPacific = new ArrayList<>(Arrays.asList("Alaska",
                "Barkley Sound","", "Mid Pacific","Santa Barbara Passage","Yakutsk",
                "Sea of Okhotsk","Tokyo Bay","Sea of Japan"));
        MarAzulEscuro northPacific = new MarAzulEscuro(this, "North Pacific", frontNorthPacific,
                new PVector(63, 191),new PVector(1436,208), 70, 30,null);
        territorios.add(northPacific);

        ArrayList<String> frontMidPacific = new ArrayList<>(Arrays.asList("Gulf of Panama",
                "Lima Bay", "North Pacific","Santa Barbara Passage","South Pacific",
                "Sea of Japan","South China Sea","Java Sea", "Indonesia","Timor Sea"));
        MarAzulEscuro midPacific = new MarAzulEscuro(this, "Mid Pacific", frontMidPacific,
                new PVector(58, 561),new PVector(1423,522), 70, 40,null);
        territorios.add(midPacific);

        ArrayList<String> frontSouthPacific = new ArrayList<>(Arrays.asList("Argentina",
                "Lima Bay", "Mid Pacific","South Atlantic","Tasman Sea",
                "Great Australian Blight"));
        MarAzulEscuro southPacific = new MarAzulEscuro(this, "South Pacific", frontSouthPacific,
                new PVector(73, 751),new PVector(1429,760), 70, 40,null);
        territorios.add(southPacific);

        ArrayList<String> frontSouthAtlantic = new ArrayList<>(Arrays.asList("Rio de la Plata",
                "Baia Santos", "Mid Atlantic","South Pacific","Gulf of Guinea",
                "Cape of Good Hope","Indian Ocean"));
        MarAzulEscuro southAtlantic = new MarAzulEscuro(this, "South Atlantic", frontSouthAtlantic,
                new PVector(630, 824),null, 80, 40,null);
        territorios.add(southAtlantic);

        ArrayList<String> frontMidAtlantic = new ArrayList<>(Arrays.asList("Brazil",
                "Baia Santos", "North Atlantic","Sahara","Gulf of Guinea",
                "Carribean Sea","Long Island Sound","Mediterranean Sea","South Atlantic"));
        MarAzulEscuro midAtlantic = new MarAzulEscuro(this, "Mid Atlantic", frontMidAtlantic,
                new PVector(543, 543),null, 80, 40,null);
        territorios.add(midAtlantic);

        ArrayList<String> frontNorthAtlantic = new ArrayList<>(Arrays.asList("Gulf of St. Lawrence",
                "Mid Atlantic", "Hudson Strait","North Sea","Bay of Biscay",
                "Long Island Sound","Mediterranean Sea"));
        MarAzulEscuro northAtlantic = new MarAzulEscuro(this, "North Atlantic", frontNorthAtlantic,
                new PVector(533, 370),null, 90, 40,null);
        territorios.add(northAtlantic);

        ArrayList<String> frontIndianOcean = new ArrayList<>(Arrays.asList("Cape of Good Hope",
                "South Atlantic", "Straits of Malacca","Red Sea","Arabian Sea","Bay of Bengal",
                "Timor Sea","Shark Bay", "Great Australian Blight"));
        MarAzulEscuro indianOcean = new MarAzulEscuro(this, "Indian Ocean", frontIndianOcean,
                new PVector(960, 878),null, 90, 40,null);
        territorios.add(indianOcean);

        ArrayList<String> frontGreatAusBlight = new ArrayList<>(Arrays.asList("Indian Ocean",
                "Western Australia","Shark Bay", "Eastern Australia","Tasman Sea","South Pacific"));
        MarAzulEscuro greatAusBlight = new MarAzulEscuro(this, "Great Australian Blight", frontGreatAusBlight,
                new PVector(1195, 956),null, 140, 40,null);
        territorios.add(greatAusBlight);

    }
    // identical use to setup in Processing IDE except for size()
    public void setup(){
    	this.mapa = loadImage("supremacymap.png");
        image(this.mapa, 0, 0);
        // South America
        setupSouthAmerica();
        // Central America
        setupCentralAmerica();
        // North America
        setupNorthAmerica();
        // Mar azul
        setupMarAzulClaro();
        //Mar escuro
        setupMarAzulEscuro();
        //Europa
        setupEurope();
        
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
