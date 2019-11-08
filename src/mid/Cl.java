package mid;

import java.util.Random;

public class Cl {
    public int a;
    public int b;
    public int[] m = new int[12];

    public void method1(){
        Random rand = new Random();
        int d = -10;
        int e = 10;
        a = rand.nextInt( e - d + 1 ) + d;
        b = rand.nextInt( e - d + 1 ) + d;

    }

    public void method2(){
        Random rand = new Random();
        int d = -10;
        int e = 10;
        int c=0;
        for(int i=0; i<m.length; i++ ){
            m[i] = rand.nextInt( e - d + 1 ) + d;
            System.out.println(m[i]);
        }

    }
    public int method3(){
        int i;
        int j = 0;
        for(i = 0; i<m.length ; i++){
            if(m[i]<0){
                if (j == 0 || m[i] > j)
                    j = m[i];
            }

        }
        return j;

    }

    public void method4(){
        int i;
        for (i=0; i<m.length; i++){
            System.out.println("Index " + i + " " + m[i]);
        }
    }
    public void method5(){
        for (int num : m) {
            int k = num;
            int count = 0;
            while (num!=0){
                num/=10;
                count++;
            }
            System.out.println(count);
        }
    }
}