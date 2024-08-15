package org.example;

import java.util.ArrayList;

public class Student extends Person {
    private ArrayList<String> lendet = new ArrayList<>();
    private ArrayList<Integer> notat = new ArrayList<>();

    public Student(String emer, String adresa) {
        super(emer, adresa);
    }

    public void shtoLendeNota(String lenda, int nota) {
        if (lendet.size() < 30) {
            lendet.add(lenda);
            notat.add(nota);
        } else {
            System.out.println("Studentet nuk mund te kene me shume se 30 lende.");
        }
    }

    public void afishoNota() {
        for (int i = 0; i < lendet.size(); i++) {
            System.out.println("Lenda: " + lendet.get(i) + ", Nota: " + notat.get(i));
        }
    }

    public double merrPikeMesatare() {
        if (lendet.size() == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < notat.size(); i++) {
            sum += notat.get(i);
        }
        return (double) sum / lendet.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "lendet=" + lendet +
                ", notat=" + notat +
                ", emer='" + getEmer() + '\'' +
                ", adresa='" + getAdresa() + '\'' +
                '}';
    }
}