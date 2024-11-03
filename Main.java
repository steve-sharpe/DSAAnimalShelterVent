import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnimalShelter animalShelter = new AnimalShelter(); // Changed variable name to camel case
        Scanner scanner = new Scanner(System.in);
        String command;

        do {
            System.out.println("\n===============================");
            System.out.println("       Animal Shelter Menu      ");
            System.out.println("===============================");
            System.out.println("1. Add Cat");
            System.out.println("2. Add Dog");
            System.out.println("3. Adopt Cat");
            System.out.println("4. Adopt Dog");
            System.out.println("5. List Cats with Addition Order");
            System.out.println("6. List Dogs with Addition Order");
            System.out.println("0. Exit");
            System.out.println("===============================");
            System.out.print("Choose an option: ");
            command = scanner.nextLine();

            switch (command) {
                case "1":
                    System.out.print("Enter cat name: ");
                    String catName = scanner.nextLine();
                    animalShelter.addAnimal(new Cat(catName, animalShelter.getNextOrder())); // Updated method name
                    break;

                case "2":
                    System.out.print("Enter dog name: ");
                    String dogName = scanner.nextLine();
                    animalShelter.addAnimal(new Dog(dogName, animalShelter.getNextOrder())); // Updated method name
                    break;

                case "3":
                    Animal adoptedCat = animalShelter.adoptCat(); // Updated method name
                    if (adoptedCat != null) {
                        System.out.println("Adopted Cat: " + adoptedCat.getName());
                    } else {
                        System.out.println("No cats available for adoption.");
                    }
                    break;

                case "4":
                    Animal adoptedDog = animalShelter.adoptDog(); // Updated method name
                    if (adoptedDog != null) {
                        System.out.println("Adopted Dog: " + adoptedDog.getName());
                    } else {
                        System.out.println("No dogs available for adoption.");
                    }
                    break;

                case "5":
                    System.out.println("List of Cats with Addition Order:");
                    animalShelter.listCatsWithAdditionDate(); // Updated method name
                    break;

                case "6":
                    System.out.println("List of Dogs with Addition Order:");
                    animalShelter.listDogsWithAdditionDate(); // Updated method name
                    break;

                case "0":
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (!command.equals("0"));

        scanner.close();
    }
}