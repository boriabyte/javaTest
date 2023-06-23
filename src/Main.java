import java.util.*;

public class Main {
    public static void main(String[] args) {

        person personOne = new person();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String newName = sc.nextLine();
        System.out.println("Enter age: ");
        int newAge = sc.nextInt();
        System.out.println("Enter height: ");
        double newHeight = sc.nextDouble();
        System.out.println("Enter weight: ");
        double newWeight = sc.nextDouble();

        personOne.setName(newName);
        personOne.setAge(newAge);
        personOne.setHeight(newHeight);
        personOne.setWeight(newWeight);

        System.out.println("Name: " + personOne.getName());
        System.out.println("Age: " + personOne.getAge());
        System.out.println("Height: " + personOne.getHeight());
        System.out.println("Weight: " + personOne.getWeight());

    }
}