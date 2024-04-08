public class ImonesDarbuotojas {

    private String vardas;
    private String pavarde;
    private String pareigos;
    private int patirtis;

    ImonesDarbuotojas(String vardas, String pavarde, String pareigos, int patirtis){
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.pareigos = pareigos;
        this.patirtis = patirtis;
    }

    public int getPatirtis() {
        return patirtis;
    }
    public String getVardas() {
        return vardas;
    }
    public String getPavarde() {
        return pavarde;
    }
    public String getPareigos() {
        return pareigos;
    }

    @Override
    public String toString() {
        return vardas + " " + pavarde + " " + pareigos + " " + patirtis;
    }
}
