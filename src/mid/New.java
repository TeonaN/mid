package mid;

import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class New {
    public static int n;

    public static void method1(){
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        Random rand = new Random();
        int a = -48;
        int b = 12;
        int c = 0;


        try {
            File file = new File("number.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            PrintWriter writer = new PrintWriter(file);
            if (n>10){
                for(int i = 0; i <= n; i++){
                    c = rand.nextInt(b-a+1)+a;
                    writer.println(c);
                }

            }
            else {
                System.out.println("n must be more than 10");
            }

            writer.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void method2(){
        Scanner input = null;
        try {
            input = new Scanner(new File("number.txt"));
        } catch (Exception ex) {
            System.exit(0);
        }


        int num = 1;
        //int a = input.nextInt();

        while(input.hasNextInt()) {
            int a = input.nextInt();
            if (a<0){
                System.out.println(a);
                num *= a;
            }
        }
        System.out.println(num);



    }
}

