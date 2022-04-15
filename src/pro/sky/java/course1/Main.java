package pro.sky.java.course1;

public class Main {

    public static void main(String[] args) {
        //Задание1
        int a=0;
        while (a!=10){
            a++;
            System.out.print(a+ " ");
        }
        System.out.println();
        for (;a>0;a--)
            System.out.print(a+" ");
        //Задание 2
        System.out.println();
        int friday =1;
        for (int i=friday; i<31;i+=7)
            System.out.println("Сегодня пятница "+i+" число");

        //Задание3
        int currentYear=2022;
        for (int i =0; i<currentYear+100;i+=79){
            if (i>currentYear-200)
                System.out.println(i);
        }

    }
}
