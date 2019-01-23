package curs08IInterfaces;

import java.util.ArrayList;
import java.util.List;

public class BucketStorage implements StoragePersons {

    List<String> barbati = new ArrayList<>();
    List<String> femei = new ArrayList<>();

    @Override
    public String add(String cnp){

        if (cnp.startsWith("1")){

            this.barbati.add(cnp);
        } else if (cnp.startsWith("2")){

            this.femei.add(cnp);
        }else {

            System.err.println("nope");
        }

        return cnp;
    }

    @Override
    public void remove(String cnp){

        if (cnp.startsWith("1")){

            this.barbati.remove(cnp);
        } else if(cnp.startsWith("2")){

            this.femei.remove(cnp);
        }
    }

    @Override
    public Boolean exists(String cnp){

        if (cnp.startsWith("1")){

            return this.barbati.contains(cnp);
        } else if (cnp.startsWith("2")){

            return this.femei.contains(cnp);
        }

        return null;
    }


    @Override
    public List list(){

        List listaReturn = new ArrayList();

        listaReturn.addAll(barbati);
        listaReturn.addAll(femei);


        return listaReturn;
    }

    @Override
    public String toString(){

        return "barbati : " + this.barbati + "femei " + this.femei;
    }
}
