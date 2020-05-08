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
        int i=0; // количество мороженого

            if (m<k) {
                System.out.println("У Пети недостаточно денег даже на одно мороженое");
            }
            else{
                while (m>=k){
                    m-=k;
                    i++;
                }
                System.out.println("У Пети останется "+m+" рублей и он съест "+i+" мороженых");
            }
        }
    }

