import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Solucion{
    public Solucion(){
        try{
            String content = new String(Files.readAllBytes(Paths.get("dimesions.txt")));
            String[] array = content.split("\n");
            System.out.println(array.length);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String... args){
        new Solucion();
    }
}