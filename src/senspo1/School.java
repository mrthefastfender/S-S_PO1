/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senspo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Sven
 */
public class School {
    
    // Het studentnr telt vanaf 5006001
    int studentnr = 5006001;

    // Maak een lijst voor alle studenten
    ArrayList<Student> studenten = new ArrayList<>();

    //Define aantal studenten
    private int aantalStudenten;
    
    Student[] s;
    

    // Setter voor het aantal studenten
    public void setAantalStudenten(int aantalStudenten) {
        this.aantalStudenten = aantalStudenten;
    }

    public int getAantalStudenten() {
        return aantalStudenten;
    }
    
    
//    public School(int aantalStudenten){
//        this.aantalStudenten =aantalStudenten;
//        s = new Student[aantalStudenten];
//    }
    public School(int aantalStudenten) {
        this.aantalStudenten = aantalStudenten;
        s = new Student[aantalStudenten];
        for (int i = 0; i < aantalStudenten; i++) {
            s[i] = (new Student(GenerateMark(), studentnr));
            studentnr++;
        }
    }

    public School() {

    }

    public Double GenerateMark() {

        Random r = new Random();

        return (r.nextInt((int) ((10 - 1) * 10 + 1)) + 1 * 10) / 10.0;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        for (Student stu : studenten) {
            s.append(stu.toString()).append(" " + "\n");
        }

        return s.toString();
    }

    public void print() {
        List temp = new ArrayList();

        for (int i = 0; i < s.length; i++) {
            temp.add(s[i] + "\n");
        }
        
        System.out.println(temp.toString());
    }
    
   

}
