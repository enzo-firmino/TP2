package fr.umontpellier.iut.exercice1;

public class FizzBuzz {

    public String getValue(int i) {
        if (i % 5 == 0)
            return "Buzz";
        else if (i % 3 == 0)
            return "Fizz";
        else
            return String.valueOf(i);
    }

    public String[] computeList(int i) {
        String[] tab = new String[i];
        for (int j = 0; j < i; j++) {
            tab[j] = getValue(j+1);
        }
        return tab;
    }
}