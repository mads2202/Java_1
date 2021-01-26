package hw5;

public class Main {
    public static void main(String[] args) {
        Employee empl1=new Employee("Dmitry", "Sergeevich","Malyshev","software designer","malyshev@mail.ru",
                "+88005553535",35000,23);
        Employee empl2=new Employee("Petr", "Evgenich","Petrov","sunior software designer","petrov@gmail.ru",
                "+81112223355",115000,42);
        Employee empl3=new Employee("Vasiliy", "Ivanovich","Pupkin","middle software designer","pupkin@yandex.ru",
                "+89008004545",70000,37);
        Employee empl4=new Employee("Anastasia", "Vladimirovna","Zhirova","accountant","accountant123@mail.ru",
                "+83454567890",50000,22);
        Employee empl5=new Employee("Vladimir", "Petrovich","Zasorin","project manager","manager@gmail.ru",
                "+81941194550",150000,53);
        Employee[] arr={empl1,empl2,empl3,empl4,empl5};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getAge()>40)
                System.out.println(arr[i].toString());


        }
    }
}
