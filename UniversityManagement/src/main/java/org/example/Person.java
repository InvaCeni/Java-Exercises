package org.example;
public class Person {
    private String emer;
    private String adresa;

    public Person(String emer, String adresa) {
        this.emer = emer;
        this.adresa = adresa;
    }

    public String getEmer() {
        return emer;
    }

    public String getAdresa() {
        return adresa;
    }

    public void vendosAdrese(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return "Person{" +
                "emer='" + emer + '\'' +
                ", adresa='" + adresa + '\'' +
                '}';
    }
}