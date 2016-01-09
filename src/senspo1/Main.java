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
        
        
        school1.s[4] = new Student(0.0, 5007061);
        school1.s[3] = new Student(0, 5007062);
        school1.s[2] = new Student(1, 5007063);
        school1.s[1] = new Student(4, 5007064);
        school1.s[0] = new Student(5, 5007065);
        

        // print de studenten en de cijfers
        school1.print();

        MergeSort m = new MergeSort();

        System.out.println("________________________________\n");

        m.sort(school1.s);

        school1.print();

        System.out.println("________________________________\n");
        
        BST b = new BST();
        b.put(school1.s[4].getCijfer(), school1.s[4].getStudentnummer());
        
        System.out.println(b.get(0.0));
        
    }

}
