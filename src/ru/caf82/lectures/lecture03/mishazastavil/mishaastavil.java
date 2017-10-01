
package ru.caf82.lectures.lecture03.mishazastavil;

import java.util.InputMismatchException;
import java.util.Scanner;

public class mishaastavil {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int val = scanner.nextInt();
            System.out.println(1000 / val);

        } catch (InputMismatchException e) {
            System.out.println("Поймали ошибку со словом еее");
        } catch (ArithmeticException e) {
            System.out.println("Поймали ошибку с делением на 0");
        } finally {
            System.out.println("А тут мы всегда?");
        }
    }
}
