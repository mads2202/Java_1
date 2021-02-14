package hw10;


import java.util.*;

public class Main {
    public static Map<String, Integer> wordCounter(String[] arr) {
        Map<String, Integer> words = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (words.containsKey(arr[i])) {
                words.put(arr[i], words.get(arr[i]) + 1);
            } else {
                words.put(arr[i], 1);
            }

        }
        return words;
    }

    public static void main(String[] args) {
        String[] array = {"developer", "java", "array", "collection", "software", "stack", "java", "bean", "spring",
                "developer", "collection", "java", "android", "kotlin", "developer", "android", "spring", "bean", "bean", "developer"};
        System.out.println(wordCounter(array).toString());
        PhoneBook phoneBook=new PhoneBook();
        phoneBook.add("Malyshev","+71234567890");
        phoneBook.add("Malyshev","+71234567890");
        phoneBook.add("Malyshev","+70987654321");
        phoneBook.add("Petrov","+75556667788");
        System.out.println(phoneBook.get("Petrov"));
        System.out.println(phoneBook.get("Malyshev"));

    }
}
