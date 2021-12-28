package pl.camp.it.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Janusz");
        list.add("Adam");
        list.add("Zbyszek");
        list.add("Abelard");

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        List<User> users = new ArrayList<>();

        users.add(new User(2, "Janusz", "Kowalski"));
        users.add(new User(1, "Adam", "Malinowski"));
        users.add(new User(3, "Zbyszek", "Krawczyk"));
        users.add(new User(4, "Abelard", "Giza"));

        System.out.println(users);

        Collections.sort(users, new KomparatorImionRosnaco());
        System.out.println(users);

        Collections.sort(users, new KomparatorIdMalejaco());
        System.out.println(users);

        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getSurname().compareTo(o2.getSurname());
            }
        });

        System.out.println(users);
    }
}
