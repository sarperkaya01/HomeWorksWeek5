package Enums;

import java.util.Scanner;

public class Enumrunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean validInput = true;

        while (validInput) { // Kullanıcı geçerli gün girene kadar dön
            System.out.println("Lütfen bir gün seçin (örn: MONDAY): ");
            String input = scanner.nextLine().toUpperCase(); // Büyük harfe çevir

            try {
                Days selectedDay = Days.valueOf(input); // String'i enum'a çevir
                validInput = false; // Başarılı ise döngüyü bitir

                if (selectedDay.isWorkingDay()) { System.out.println(selectedDay ); }
                else { System.out.println(selectedDay ); }

            } catch (IllegalArgumentException e) {
                System.out.println("Geçersiz gün girdiniz! Tekrar deneyin.\n");
                // Döngü başa döner
            }
        }

        scanner.close();
    }
}
