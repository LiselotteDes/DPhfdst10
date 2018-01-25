package be.vdab.taak;
public class Vervoer {
    public void doeEenOversteek(VervoerAlgoritme algoritme) {
        System.out.println("Inpakken");
        algoritme.vervoer();
        System.out.println("Uitpakken");
    }
}
