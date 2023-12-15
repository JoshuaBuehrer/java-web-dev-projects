
package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MenuItem onionRings = new MenuItem("onion rings",8.00, "Fried onions", "appetizer",false);
        MenuItem burger = new MenuItem("burger",14.00,"char grilled ground beef on two slabs of bread", "main coarse", false);
        MenuItem applePie = new MenuItem("apple pie",9.00,"cinnamon apple sweetness","dessert",true);


        ArrayList<MenuItem> holder = new ArrayList<>();

        holder.add(onionRings);
        holder.add(burger);
        holder.add(applePie);

        Menu sallys = new Menu();

        sallys.addItem(holder);

        System.out.println(onionRings);
        System.out.println(sallys);
    }

}
