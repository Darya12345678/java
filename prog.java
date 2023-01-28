import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class prog {
 
    public static void main(String[] args)
    {
        Scanner vvod = new Scanner(System.in);  
        System.out.print("Введите число: ");  
        byte num = vvod.nextByte();
        System.out.println("Ваше число: " + num);  
    

        File file = new File("result.txt");
        byte text = num;
 
        try (FileOutputStream fos = new FileOutputStream(file);
            OutputStreamWriter osw = new OutputStreamWriter(fos,
                                        StandardCharsets.UTF_8))
        {
            osw.write(text);
            System.out.println("Successfully written data to the file");
            }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
 
