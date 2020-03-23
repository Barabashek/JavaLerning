package Lesson.Lesson8;

import java.util.Locale;

public class Solution {
    public static void main(String[] args) {
       System.out.printf(Locale.ENGLISH,"%,d%n", 1000000);
       System.out.printf(Locale.GERMAN,"%,d%n", 1000000);
       System.out.printf(Locale.FRANCE,"%,d%n", 1000000);

        System.out.printf(Locale.ENGLISH,"%.2f%n", 9.87);
        System.out.printf(Locale.FRANCE,"%.2f%n",9.87);

        String s = String.format("Курс валют: %-4s%-8.4f %-4s%-8.4f", "USD", 65.43, "EUR", 72.15);
        System.out.println(s);
        System.out.println();
        System.out.printf("%,.2f%n", 10000.0 / 3.0);
        System.out.printf("%, (.2f%n", -10000.0 / 3.0);
        System.out.printf("%09.2f%n", 10000.0 / 3.0);
        System.out.println();
        System.out.printf("Hello %1$s!%n%1$s, how are you?%n"
                        + "Welcome to the site %2$s",
                "John", "www.site.com");
        System.out.println();

        System.out.printf("%-5s%-11s%-25s%-11s%n","Код","За единиц","Валюты","Рублей РФ");
        System.out.println("-----------------------------------------------------");
        System.out.printf("%-5s%-11d%-25s%-11.4f%n","AUD",1,"Австралийский доллар",44.9883);
        System.out.printf("%-5s%-11d%-25s%-11.4f%n","GBP",1,"Фунт стерлингов",86.8429);
        System.out.printf("%-5s%-11d%-25s%-11.4f%n","BYR",10000,"Белорусский рубль",39.7716);
        System.out.printf("%-5s%-11d%-25s%-11.4f%n","DKK",10,"Датская крона",84.9192);
        System.out.printf("%-5s%-11d%-25s%-11.4f%n","USD",1,"Доллар США",58.4643);
        System.out.printf("%-5s%-11d%-25s%-11.4f%n","EUR",1,"Евро",63.3695);
        System.out.printf("%-5s%-11d%-25s%-11.4f%n","KZT",100,"Казахский тенге",31.4654);
    }

}


