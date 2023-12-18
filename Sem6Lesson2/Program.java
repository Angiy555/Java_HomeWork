package Sem6Lesson2;

import java.util.HashSet;
import java.util.Set;

/*1. Продумайте структуру класса Кот. Какие поля и методы будут 
актуальны для приложения, которое является
а) информационной системой ветеринарной клиники
б) архивом выставки котов
в) информационной системой Театра кошек Ю. Д. Куклачёва
Можно записать в текстовом виде, не обязательно реализовывать 
в java. */
public class Program {
    public static void main(String[] args) {
        Set<Cat> cats = new HashSet<>();
        Cat cat1 = new Cat();
        cat1.name = "Барсик";
        cat1.poroda = "персидская";
        cat1.age = 10;
        cat1.ownerName = "Мария Ивановна";

        Cat cat2 = new Cat();
        cat2.name = "Мурка";
        cat2.poroda = "персидская";
        cat2.age = 10;
        cat2.ownerName = "Мария Ивановна";

        Cat cat3 = new Cat();
        cat3.name = "Барсик";
        cat3.poroda = "персидская";
        cat3.age = 10;
        cat3.ownerName = "Мария Ивановна";

        Cat cat4 = new Cat();
        cat4.name = "Барсик";
        cat4.poroda = "персидская";
        cat4.age = 10;
        cat4.ownerName = "Мария Ивановна";

        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);

        //System.out.println(cats);
        printSet(findByAge(cats, 9));
    }

    static Set<Cat> findByAge(Set<Cat> cats, int minAge){
        Set<Cat> res = new HashSet<>();
        for (Cat cat: cats){
            if (cat.age >= minAge){
                res.add(cat);
            }
        }
        return res;
    }

    static void printSet(Set<Cat> cats){
        for (Cat cat: cats){
            System.out.println(cat);
        }
    }
    
}
