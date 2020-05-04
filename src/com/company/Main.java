package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Сколько денег у Пети?");
        Scanner scanner=new Scanner(System.in);
        int m=scanner.nextInt();
        System.out.println("Сколько стоит мороженое?");
        Scanner scanner1=new Scanner(System.in);
        int k=scanner1.nextInt();
        int i=0; // количество мореженого
        do {
            m=m-k;
            i++;
        } while (m>0 & m>=k);
        System.out.println("У Пети останется "+m+" рублей и он съест "+i+" мороженых");
        }
    }

