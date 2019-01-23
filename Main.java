package curs08IInterfaces;

public class Main {

    public static void main(String[] args) {

        StoragePersons sp = new BucketStorage();

        sp.add("123");
        sp.add("234");
        sp.add("156");
        sp.add("256");
        sp.add("278");
        sp.add("290");
        sp.add("300");
        sp.add("188");
        sp.add("278");

        System.out.println(sp.list());

        System.out.println(sp.exists("278"));

        sp.remove("234");

        System.out.println(sp.list());

        System.out.println("*******************");

//        StoragePersons ls = new ListStorage();
//
//        ls.add("Lila");
//        ls.add("Georgica");
//        ls.add("Veronica");
//        ls.add("Kaia");
//        ls.add("Marcel");
//
//        System.out.println(ls.list());


        System.out.println("*******************");

        StoragePersons ms = new MapStorage();

        ms.add("123");
        ms.add("2345678");
        ms.add("208978966");

        System.out.println(ms.toString());





    }
}
