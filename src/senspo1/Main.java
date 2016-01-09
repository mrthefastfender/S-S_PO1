/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senspo1;

/**
 *
 * @author Sven
 */
public class Main {

    public static void main(String[] args) {

        // maak een school en set het aantal studenten
        School school1 = new School(5);

        // print de studenten en de cijfers
        school1.print();

        MergeSort m = new MergeSort();

        System.out.println("________________________________\n");

        m.sort(school1.s);

        school1.print();

        System.out.println("________________________________\n");
        
        BST b = new BST();
 
    }

}
