package curs08IInterfaces;

import java.util.ArrayList;
import java.util.List;

public class ListStorage implements StoragePersons {

    ArrayList list = new ArrayList();


    @Override
    public String add(String cnp) {

         this.add(cnp);

         return cnp;
    }

    @Override
    public void remove(String cnp){

        this.list.remove(cnp);
    }

    @Override
    public  Boolean exists(String cnp){

        this.list.contains(cnp);

        return true;
    }

    @Override
    public List<String> list(){

        return this.list;
    }

    @Override
    public String toString(){

        return this.list.toString();
    }
}
