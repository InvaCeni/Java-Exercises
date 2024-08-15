package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //krijojme lektorin
        Lektor lektor = new Lektor("John Doe", "Adresa1");
        lektor.shtoLende("Math");
        lektor.shtoLende("Science");
        lektor.shtoLende("English");
        System.out.println(lektor.toString());

        // krijojme nje student
        Student student = new Student("Jane Doe", "Adresa2");
        student.shtoLendeNota("Math", 8);
        student.shtoLendeNota("Science", 9);
        student.shtoLendeNota("English", 7);
        student.afishoNota();
        System.out.println("Average grade: " + student.merrPikeMesatare());

        // vendosim adresen e studentit
        student.vendosAdrese("Adresa e re");
        System.out.println(student.toString());
    }
}