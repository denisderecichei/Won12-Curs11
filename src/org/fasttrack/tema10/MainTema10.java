package org.fasttrack.tema10;

public class MainTema10 {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("mar");
        basket.add("mar");
        basket.add("mar");
        basket.add("par");
        System.out.println("count: " + basket.count());
        System.out.println("are mere: " + basket.find("mar"));
        System.out.println("are pere: " + basket.find("par"));
        System.out.println("cate unice: " + basket.uniqueFruitsCount());
        System.out.println("am sters mar: " + basket.remove("mar"));
        System.out.println("am sters mar: " + basket.remove("mar"));
        System.out.println("am sters ananas: " + basket.remove("ananas"));
        System.out.println("count: " + basket.count());

        System.out.println("------------------------------");
        Buquet buq = new Buquet();
        buq.add("crin");
        buq.add("crin");
        buq.add("crin");
        buq.add("crin");
        buq.add("crin");
        buq.add("trandafir");
        buq.add("trandafir");
        buq.add("trandafir");
        buq.add("trandafir");
        buq.add("trandafir");
        buq.add("trandafir");
        buq.add("trandafir");
        System.out.println("Size: " + buq.getAll().size());
        buq.remove("trandafir");
        buq.remove("hortensie");
        System.out.println("Size: " + buq.getAll().size());
        System.out.println("------------------------------");

        Person p1 = new Person("Alin", "manager", 40);
        Person p2 = new Person("Alin", "welder", 19);
        Person p3 = new Person("Alin", "plumber", 60);
        Person p4 = new Person("Marius", "welder", 30);
        Company company = new Company();
        company.employ(p1);
        company.employ(p2);
        company.employ(p3);
        company.employ(p4);
        System.out.println(company.getManager());
        System.out.println(company.getPersonByName("Alin"));
        System.out.println(company.getPersonsOlderThan(39));
        System.out.println(company.getPersons("welder"));
    }
}
