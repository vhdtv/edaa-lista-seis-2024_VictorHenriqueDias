import java.util.ArrayList;

public class ShoppingList implements ShoppingListInterface {
    private ArrayList<Product> products;

    public ShoppingList() {
        this.products = new ArrayList<>();
    }

    @Override
    public void addProduct(Product p) {
        products.add(p);
    }

    @Override
    public void removeProduct(Product p) {
        products.remove(p);
    }

    @Override
    public void showCompleteList() {
        for (Product product : products) {
            if (products.isEmpty()) {
                System.out.println("Nenhum produto registrado.");
            } else {
                System.out.println(product.toString());
            }
        }
    }

}
