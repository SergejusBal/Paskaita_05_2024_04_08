import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FailuTvarkykle {
    public static void main(String[] args) {

        ///////////////////////////////////////////////////////////////////////////////////////////
        /////// Uzduotis nr 1
        System.out.println();
        System.out.println("Uzduotis nr 1");
        System.out.println();

        File file = new File("C:/Users/Sergejus/Desktop/Tekstas.txt");
        boolean failasSukurtas;
        String tekstas = "Mano tekstas \n";

        try {
            failasSukurtas = file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Failas susikure: " + failasSukurtas);
        rasyti(file,tekstas);

        System.out.println(perskaityti(file));

        ///////////////////////////////////////////////////////////////////////////////////////////
        /////// Uzduotis nr 2
        System.out.println();
        System.out.println("Uzduotis nr 2");
        System.out.println();

        File file1 = new File("C:/Users/Sergejus/Desktop/Tekstas2.txt");
        kopijoti(file,file1);
        rasyti(file1,tekstas);

        System.out.println(perskaityti(file1));

        if (perskaityti(file1).size()>10){
            istrinti(file);
            istrinti(file1);
        }

    }
    public static void rasyti(File file, String tekstas){
        try {
            FileWriter writer = new FileWriter(file,true);
            writer.append(tekstas);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void kopijoti(File file,File file1){

        StringBuilder stringBuilder = new StringBuilder();
        try {
            FileReader fileReader = new FileReader(file);
            int i;
            while ((i = fileReader.read()) != -1) {
                stringBuilder.append((char) i);
            }
            FileWriter writer = new FileWriter(file1,true);
            writer.append(stringBuilder.toString());
            writer.close();
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static ArrayList<String> perskaityti(File file){
        ArrayList<String> tekstas = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        try {
            FileReader fileReader = new FileReader(file);
            int i;
            while ((i = fileReader.read()) != -1) {
                stringBuilder.append((char) i);
                if(i=='\n'){
                    tekstas.add(stringBuilder.toString());
                    stringBuilder.setLength(0);
                }
            }
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return tekstas;
    }
    public static void istrinti(File file){
        try {
            Files.deleteIfExists(Paths.get(file.getPath()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
