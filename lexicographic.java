/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package average;

import java.util.Scanner;

/**
 *
 * @author Wangechi
 */
public class lexicographic {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any word: ");
        String s = input.next();

        char[] arr = s.toCharArray();
        int n = arr.length;
        int i;
        int x = 1;
        int y = 2;

        for (n = arr.length; n > 0; n--) {

            while (arr[n - x] > arr[n - y]) {

                char temp = arr[n - x];
                arr[n - x] = arr[n - y];
                arr[n - y] = temp;

                String new_string = new String(arr);
                System.out.println(new_string);

                x++;
                y++;

            }

        }
    }
}
