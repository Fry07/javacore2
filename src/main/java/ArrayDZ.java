import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Иван on 06.01.2018.
 */
public class ArrayDZ {

    public void arrayA(){
        int maxValue = 20;
        int [] array = new int [maxValue/2];
        for (int i = 0; i < array.length; i++){
            array[i] = i*2+2;
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public void arrayB(){
        int [] array = new int [99];
        for (int i = 0; i < array.length; i++){
            array[i] = i + 1;
        }

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = array.length - 1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
    }

    public void arrayC(){
        int [] array = new int [15];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = rnd.nextInt(10);
        }

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        int even = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0)
                even++;
        }
        System.out.println("\neven = " + even);
    }

    public void arrayD() {
        int[] array = new int[15];
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(1000);
        }

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();
        System.out.println("\nMin = " + min);
        System.out.println("Max = " + max);
    }

    public void arrayEG(){
        int[][] array = new int[8][5];
        Random rnd = new Random();

        for (int i = 0; i < 8; i++)
        {
            System.out.print("\nLine " + (i+1) + ": ");
            for (int j = 0; j < 5; j++)
            {
                array[i][j] = rnd.nextInt(1000);
                System.out.print("\t" + array[i][j] + "\t");
            }
        }
    }

    public void sum(){
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter numbers (type \"exit\" to sum them):");

        while(true){
            String s = input.next();
            if (s.toLowerCase().equals("exit"))
            {
                //System.out.println("exit");
                break;
            }
            else
            {
                Integer tmp = Integer.valueOf(s);
                sum += tmp;
            }
        }
        System.out.println("Sum: " + sum);
    }

}
