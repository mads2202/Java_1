package hw10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {
    // использовал хэшмап потому что книжка не подробная и логично раз всего 2 поля, хранить телефоны людей с одинаковыми фамилиями в 1 месте.
    // Поидее по-умному использовать  как ключ id
    HashMap<String, HashSet<String>> phoneBook;

    public PhoneBook() {
         this.phoneBook = new HashMap<>();
    }

    public void add(String surname, String phoneNumber){
        if(!phoneBook.containsKey(surname)){
            phoneBook.put(surname,new HashSet<>(Collections.singleton(phoneNumber)));
        } else{
           phoneBook.get(surname).add(phoneNumber);
        }
    }
    public HashSet<String> get(String surname){
        return phoneBook.get(surname);
    }
}
