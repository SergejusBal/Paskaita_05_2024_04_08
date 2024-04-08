import java.util.ArrayList;

public class Imone {

    private String pavadinimas;
    private int metai;
    private ArrayList<ImonesDarbuotojas> darbSarasas;

    Imone(String pavadinimas,int metai){
        this.pavadinimas = pavadinimas;
        this.metai = metai;
        darbSarasas = new ArrayList<>();
    }
    public String getPavadinimas() {
        return pavadinimas;
    }
    public int getMetai() {
        return metai;
    }
    public ArrayList<ImonesDarbuotojas> getDarbSarasas() {
        return darbSarasas;
    }
    public void pridetiDarbuotoja(ImonesDarbuotojas b){
        darbSarasas.add(b);
    }

    public void atspaust(int metai){
        for(ImonesDarbuotojas d:darbSarasas){
            if(d.getPatirtis()>metai) System.out.println(d);
        }

    }



}
