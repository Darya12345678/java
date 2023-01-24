/*Task1
Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 300]. */

import java.util.Arrays;
public class program {
    public static void main(String[] args) {
    int n = 6;
    double[] array = new double[n];
    for (int i = 0; i < array.length; i++) {
        array[i] = Math.random() * 301;
    }

    double max = array[0]; // Массив не должен быть пустым
    double min = array[0];
    double avg = 0;
    for (int i = 0; i < array.length; i++) {
        if(max < array[i])
            max = array[i];
        if(min > array[i])
            min = array[i];
        avg += array[i]/array.length;
        System.out.println(array[i]);
    }

    System.out.println("max значение= " + max);
    System.out.println("min значение= " + min);
    System.out.println("среднее значение = " + avg);
    System.out.println("Массив:" + Arrays.toString(array));
}
}


/*Task2
Реализуйте алгоритм сортировки пузырьком для сортировки массива */

public class program {
    public static void main(String[] args) {
        int [] mas = {200, 5, 14, 160, 7};
 
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;
 
                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}

/*Task3
Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы. */

public class program {
    public static void main(String [] args) {
        int a = 2, b = 100;
        System.out.println("Простые числа в промежутке [2, 100]: ");
        for(int i = a; i <= b; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
 
    public static boolean isPrime(int x) {
        if (x < 2) return false;
        int temp;
        for (int i = 2; i <= x / 2; i++) {
            temp = x % i;
            if (temp == 0) {
                return false;
            }
        }
        return true;
    }
}

