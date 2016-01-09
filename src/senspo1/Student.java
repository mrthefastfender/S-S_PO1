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
public class Student implements Comparable<Student> {

    // Een student heeft een cijfer en een studentnummer
    // Het studetnnummer telt vanaf 5006001

    private double cijfer;
    private int studentnummer = 5006001;

    //Constructor voor het Student Object
    public Student(double cijfer, int studentnummer) {
        this.cijfer = cijfer;
        this.studentnummer = studentnummer;
    }

    //Getters en Setters voor de attributen.
    public double getCijfer() {
        return cijfer;
    }

    public void setCijfer(double cijfer) {
        this.cijfer = cijfer;
    }

    public int getStudentnummer() {
        return studentnummer;
    }

    public void setStudentnummer(int studentnummer) {
        this.studentnummer = studentnummer;
    }

    @Override
    public String toString() {
        return "Student{" + "cijfer=" + cijfer + ", studentnummer=" + studentnummer + '}';
    }

    @Override
    public int compareTo(Student anotherStudent) {
        return Double.valueOf(anotherStudent.getCijfer()).compareTo(this.getCijfer());
    }

}
