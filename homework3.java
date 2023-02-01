// Пусть дан произвольный список целых чисел
// Нужно удалить из него четные числа
// Найти минимальное значение
import java.util.ArrayList;
import java.util.Collections;
public class homework3 {

    private static double getAverage(ArrayList<Integer> num) {
        long sum = 0;
        for (int i: num) {
            sum += i;
        }
        return num.size() > 0 ? (double) sum / num.size() : 0;
    }
    public static void main(String[] args) {

    ArrayList<Integer> num = new ArrayList<>();
    num.add(1);
    num.add(2);
    num.add(3);
    num.add(4);
    
    System.out.println("Список: " + num);
    System.out.println("Максимальное значение: " + Collections.max(num));
    System.out.println("Минимальное значение: "+ Collections.min(num));
    double avg = getAverage(num);
    System.out.println("Среднее значение: " + avg); 
    
   
    
    for (int i = 0; i < num.size(); i++) 
     if ( num.get (i) % 2 == 0 )
     {
        num.remove(i);
        i--;
     }
    
    System.out.println("С удаленными четными числами: " + num);

    
 }
}