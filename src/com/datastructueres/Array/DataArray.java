package com.datastructueres.Array;

import com.datastructueres.Person;

public class DataArray {
    private Person person[];
    private int nElems;

    public DataArray(int max) {
        person = new Person[max];
        nElems = 0;
    }

    public Person find(String searchName) {
        for (int i = 0; i < nElems; i++) {
            if (person[i].getLast().equals(searchName)) {
                return person[i];
            }
        }
        return null;
    }

    public void insert(String lastName, String firstName, int age) {
        Person person = new Person(lastName, firstName, age);
        nElems++;
    }
}
