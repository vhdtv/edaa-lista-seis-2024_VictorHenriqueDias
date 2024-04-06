import java.util.Scanner;

public class AppShoppingList {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ShoppingListInterface shoppingListInterface = new ShoppingList();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Product");
            System.out.println("2. Show Shopping List");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter product name:");
                    String name = scanner.next();
                    System.out.println("Enter product value:");
                    float value = scanner.nextFloat();
                    System.out.println("Enter product barcode (optional):");
                    String barcode = scanner.nextLine().trim(); // Consume newline character and trim whitespace

                    shoppingListInterface.addProduct(new Product(name, value, barcode));
                    System.out.println("Product added successfully!");
                    break;
                case 2:
                    shoppingListInterface.showCompleteList();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
