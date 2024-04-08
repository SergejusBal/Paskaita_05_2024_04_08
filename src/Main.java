//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ///////////////////////////////////////////////////////////////////////////////////////////
        /////// Uzduotis nr 1

        System.out.println();
        System.out.println("Uzduotis nr 1");
        System.out.println();

        Darbuotojas darbuotojas  = new Darbuotojas("Vardenis", "Pavarde", "38502140741");
        darbuotojas.setPareigos("Vairuotojas");
        darbuotojas.setDarboPatirtis(1);

        System.out.println(darbuotojas);

        ///////////////////////////////////////////////////////////////////////////////////////////
        /////// Uzduotis nr 2

        System.out.println();
        System.out.println("Uzduotis nr 2");
        System.out.println();

        Imone imone = new Imone("Musu Imone",1952);
        ImonesDarbuotojas dar1 = new ImonesDarbuotojas("Vard1","Pavard1","Pareigos1",2);
        ImonesDarbuotojas dar2 = new ImonesDarbuotojas("Vard2","Pavard2","Pareigos2",5);
        ImonesDarbuotojas dar3 = new ImonesDarbuotojas("Vard3","Pavard3","Pareigos3",8);
        ImonesDarbuotojas dar4 = new ImonesDarbuotojas("Vard4","Pavard4","Pareigos4",1);
        ImonesDarbuotojas dar5 = new ImonesDarbuotojas("Vard5","Pavard5","Pareigos5",10);

        imone.pridetiDarbuotoja(dar1);
        imone.pridetiDarbuotoja(dar2);
        imone.pridetiDarbuotoja(dar3);
        imone.pridetiDarbuotoja(dar4);
        imone.pridetiDarbuotoja(dar5);

        imone.atspaust(4);

        ///////////////////////////////////////////////////////////////////////////////////////////
        /////// Uzduotis nr 3

        System.out.println();
        System.out.println("Uzduotis nr 3");
        System.out.println();

    }
}