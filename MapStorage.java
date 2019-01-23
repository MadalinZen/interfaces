package curs08IInterfaces;

import java.util.ArrayList;
import java.util.List;

public class MapStorage implements StoragePersons {

    List<String> listOfMasculinePersons = new ArrayList<>();
    List<String> listOfFemininePersons = new ArrayList<>();

    @Override
    public String add(String cnp) {

        if (( cnp.length()> 0) & (cnp.length()<=4) ){

            this.listOfMasculinePersons.add(cnp);
        } else if ( (cnp.length() >= 4 ) & (cnp.length() <=13) ){

            this.listOfFemininePersons.add(cnp);
        } else{

            System.err.println("Error");
        }
        return null;
    }

    @Override
    public void remove(String cnp) {

        if (( cnp.length()> 0) & (cnp.length()<=4) ){

            this.listOfMasculinePersons.remove(cnp);
        } else if ( (cnp.length() >= 4 ) & (cnp.length() <=8) ){

            this.listOfFemininePersons.remove(cnp);
        }
    }

    @Override
    public Boolean exists(String cnp) {
        return null;
    }

    @Override
    public List<String> list() {

        List<String> humans = new ArrayList<>();

        humans.addAll(listOfMasculinePersons);
        humans.addAll(listOfFemininePersons);
        return humans;
    }

    @Override
    public String toString() {
        return "mens : " + this.listOfMasculinePersons + "womens " + this.listOfFemininePersons;
    }
}
