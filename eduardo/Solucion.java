import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Solucion{
    public Solucion(){
        try{
            String content = new String(Files.readAllBytes(Paths.get("dimesions.txt")));
            String[] array = content.split("\n");
            List<Dimension> listDimension = new ArrayList<>();
            for(String exp: array){
                String[] arrayDim = exp.split("x");
                Dimension dimension = new Dimension(new Integer(arrayDim[0]), new Integer(arrayDim[1]), new Integer(arrayDim[2]));
                listDimension.add(dimension);
            }
            int suma = 0;
            for(Dimension dimension: listDimension){
                int parcial =   2 * dimension.getlength() * dimension.getWidth() + 2 * dimension.getWidth() * dimension.getlength() +2 * dimension.getHeight() * dimension.getWidth();
                parcial = parcial + dimension.getLargest();
                System.out.println(parcial);
                suma += parcial;
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String... args){
        new Solucion();
    }
}