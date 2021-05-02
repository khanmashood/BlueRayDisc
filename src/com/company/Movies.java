package com.company;

public class Movies {

    public static void main(String[] args) {
        BluRayCollection brc = new BluRayCollection();
        brc.add(new BluRayDisc("Invasion","Fyodor Sergeyevich Bondarchuk",2020,19.95));
        brc.add(new BluRayDisc("Time to Hunt","Yoon Sung-Hyun",2020,17.50));
        brc.add(new BluRayDisc("The Outpost","Rod Lurie",2019,15.95));
        brc.add(new BluRayDisc("Bloodshot","David S F Wilson",2020,19.95));
        brc.add(new BluRayDisc("The 2nd Brian","Skiba",2020,24.95));
        System.out.println(brc.toString());
        System.out.println(brc.search("Bloodshot"));
        System.out.println(brc.search("Jaws"));
        System.out.println(brc.remove("Bloodshot"));
        System.out.println(brc.remove("Jaws"));

    }
}
