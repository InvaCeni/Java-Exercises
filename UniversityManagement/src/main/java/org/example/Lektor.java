package org.example;

import java.util.ArrayList;

public class Lektor extends Person {
    private ArrayList<String> lendet = new ArrayList<>();

    public Lektor(String emer, String adresa) {
        super(emer, adresa);
    }

    public void shtoLende(String lenda) {
        if (lendet.size() < 5) {
            lendet.add(lenda);
        } else {
            System.out.println("Lektori nuk mund te jap me shume se 5 lende.");
        }
    }

    public void hiqLende(String lenda) {
        if (lendet.contains(lenda)) {
            lendet.remove(lenda);
        } else {
            System.out.println("Lenda nuk gjendet ne listën e lendeve te Lektorit.");
        }
    }

    public double merrPikeMesatare() {
        return 0;
    }

    @Override
    public String toString() {
        return "Lektor{" +
                "lendet=" + lendet +
                ", emer='" + getEmer() + '\'' +
                ", adresa='" + getAdresa() + '\'' +
                '}';
    }
}
