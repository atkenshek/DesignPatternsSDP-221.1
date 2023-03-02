import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(
                1L,
                "Meiram",
                3,
                LocalDate.of(2020, Month.DECEMBER, 13)
        );

        Person p2 = new Person(
                1L,
                "John",
                18,
                LocalDate.of(1991, Month.DECEMBER, 16)
        );

        System.out.println(p1);
        System.out.println(p2);

        System.out.println(p1.getName() + " " + p1.getDateOfBirth());
        System.out.println(p1.equals(p2));

//        Random random = new Random();
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(10);
//        }
//
//        System.out.println(Arrays.toString(arr));
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Write your name: ");
//        String name = sc.nextLine();
//        System.out.println("Write your age: ");
//        int age = sc.nextInt();
//        switch (age){
//            case 1:
//                System.out.println("You're baby");
//                break;
//            case 18:
//                System.out.print("You're big guy");
//                break;
//            case 25:
//                System.out.println("You're now adult");
//                break;
//            default:
//                System.out.println("You didn't entered your age");
//        }
//        System.out.println("Your name: " + name +
//                ", your age is: " + age);
//        int x = 5;
//        int y = 6;
//        String names = "ITStep";
//        System.out.println(x * 5);
    }
}
class Person{
    private Long id;
    private String name;
    private int age;
    private LocalDate dateOfBirth;

    public Person(Long id, String name, int age, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}