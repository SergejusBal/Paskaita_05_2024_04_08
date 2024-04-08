public class Darbuotojas {
    private String vardas;
    private String pavarde;
    private String asmensKodas;
    private int amzius;
    private String pareigos;
    private int darboPatirtis;
    Darbuotojas(String vardas, String pavarde, String asmensKodas){
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.asmensKodas = asmensKodas;

        this.amzius = skaiciokDarbuotojoAmziu();
    }

    public String getVardas(){
        return vardas;
    }
    public String getPavarde(){
        return pavarde;
    }
    public String getAsmensKodas() {
        return asmensKodas;
    }
    public void setPareigos(String pareigos) {
        this.pareigos = pareigos;
    }
    public  void setDarboPatirtis(int darboPatirtis){
        this.darboPatirtis=darboPatirtis;
    }

    private int skaiciokDarbuotojoAmziu() {
        String sk = asmensKodas.substring(0,1);
        String metai = "";

        switch (sk) {
            case "3", "4":
                metai = "19" + asmensKodas.substring(1,3);
            case "5", "6":
                metai = "20" + asmensKodas.substring(1,3);
        }
        return 2024 - Integer.valueOf(metai);
    }



}
