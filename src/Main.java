import enums.PizzaAddtive;
import enums.PizzaSos;

import enums.*;
import Products.*;

public class Main {

    static ShoppingBasket koszyk ;

    public static void main(String[] args) {

        User user1 = new User.UserBuilder()
                .setName("tomek")
                .setAge(17)
                .build();

        koszyk = new ShoppingBasket(user1);

        new AdultObserver(koszyk);

    //    Pizza margarita = new Pizza("Margeritta",10);
    //    margarita.setSos(PizzaSos.TOMATO);
    //    margarita.setAdditives(PizzaAddtive.DOUBLE_CHEES);
    //    margarita.setAdditives(PizzaAddtive.EXTRA_MUSHROOM);


      //  Pizza hawajska = new Pizza("hawajska",30);
      //  hawajska.setSos(PizzaSos.GARLIC);
      //  hawajska.setAdditives(PizzaAddtive.DOUBLE_CHEES);

             Pizza rzeznicka = new Pizza.PizzaBuilder()
                     .setName("Rzeznicka")
                     .setPrice(13)
                     .setSos(PizzaSos.GARLIC)
                     .setAdditives(PizzaAddtive.DOUBLE_CHEES)
                     .build();

             rzeznicka.setAdditives(PizzaAddtive.EXTRA_MEAT);

             BeerFactory beerFactory = new BeerFactory();
             Beer piwo1 = beerFactory.getBeer(BeerType.DARK,BeerSize.BIG);
             Beer piwo2 = beerFactory.getBeer(BeerType.NONALCO,BeerSize.SMALL);
     //   koszyk.insertItem(margarita);
     //   koszyk.insertItem(hawajska);

        Pizza abc = new Pizza.PizzaBuilder().build();

        koszyk.insertItem(rzeznicka);
        koszyk.insertItem(abc);
        koszyk.insertItem(piwo1);
        koszyk.insertItem(piwo2);


        System.out.println("Piwo 1: " + piwo1.getName() + piwo1.getPrice());
        System.out.println("Piwo 2: " + piwo2.getName() + piwo2.getPrice());

        System.out.println(" Nazwa pizzy bez nazwy = " + abc.getName());
        System.out.println("Cena pizzy bez ceny" + abc.getPrice());
        System.out.println("Cena total " + koszyk.getTotalPrice());

        System.out.println("user: " + user1.getName() + " wiek= " + user1.getAge());
    }
}
