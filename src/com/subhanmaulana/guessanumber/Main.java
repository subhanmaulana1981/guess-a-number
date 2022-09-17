package com.subhanmaulana.guessanumber;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Selamat datang di dunia antah-berantah");
        System.out.println("Boleh aku tau namamu?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Halo, " + name);
        System.out.println("Kita mulai? [1 or 2]");
        System.out.println("\t1. Ya");
        System.out.println("\t2. Tidak");

        for(int beginAnswer = scanner.nextInt(); beginAnswer != 1; beginAnswer = scanner.nextInt()) {
            System.out.println("Kita mulai? [1 or 2]");
            System.out.println("\t1. Ya");
            System.out.println("\t2. Tidak");
        }

        Random random = new Random();
        int x = random.nextInt(20) + 1;
        System.out.println("(Antara 1 s.d 20)");
        System.out.println("Coba tebak angka berapa: ");
        int userAnswer = scanner.nextInt();
        int timesTried = 0;
        boolean hasWon = false;
        boolean shouldFinish = false;

        while(!shouldFinish) {
            ++timesTried;
            if (timesTried < 5) {
                if (userAnswer == x) {
                    hasWon = true;
                    shouldFinish = true;
                } else if (userAnswer > x) {
                    System.out.println("Coba lebih rendah");
                    userAnswer = scanner.nextInt();
                } else {
                    System.out.println("Lebih tinggi lagi");
                    userAnswer = scanner.nextInt();
                }
            } else {
                shouldFinish = true;
            }
        }

        if (hasWon) {
            System.out.println("Selamat! Kamu berhasil menjawab dalam " + timesTried + " kali tebakan.");
        } else {
            System.out.println("Permainan berakhir!");
            System.out.println("Jawabannya adalah: " + x);
        }

    }
}

