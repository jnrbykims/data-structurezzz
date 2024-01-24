/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linear_search;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ASUS ROG
 */
public class Linear_search {

    /**
     * @param args the command line arguments
     */
   
    public static Random rand = new Random();
    public static String[] x = new String[10];
    public static Scanner sc = new Scanner(System.in);
    static search search = new search();

    public static void main(String[] args) {
        for (int i = 0; i < x.length; i++) {
            String ans = Integer.toString(rand.nextInt(10)); // Convert integer to string
            System.out.println(ans);
            x[i] = ans;
        }

        System.out.println("Strings in each index: " + x[0] + " " + x[1] + " " + x[2] + " " + x[3] + " " + x[4] + " " +
                x[5] + " " + x[6] + " " + x[7] + " " + x[8] + " " + x[9]);

        System.out.print("Input string to search: ");
        String searchString = sc.next();
        search.search(x, searchString);
    }
   }
 
    

