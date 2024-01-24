/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linear_search;

/**
 *
 * @author ASUS ROG
 */
class search {
     public static void search(String[] array, String key) {
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(key)) {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found in the array.");
        }
    }
}
    

