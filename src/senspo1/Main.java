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

        // maak een mergesort aan om het geheel te sorteren
        MergeSort m = new MergeSort();

        // format voor output
        System.out.println("________________________________\n");
        
        // sorteer de lijst met studenten van de school
        m.sort(school1.s);

        // print de gesorteerde lijst en de cijfers
        school1.print();
        
        // format voor output
        System.out.println("________________________________\n");
        
        // maak een binary search tree aan om de studenten in op te slaan
        // met de fore worden alle studenten op basis van het cijfer en
        // het ldap in de bst gestopt
        BST bst = new BST();
        for (Student s : school1.s) {
            bst.put(s.getCijfer(), s.getStudentnummer());
        }
 
    }

}
