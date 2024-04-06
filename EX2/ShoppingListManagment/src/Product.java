public class Product {

    private String name;
    private float value;
    private String barcode;

    public Product(String name, float value, String barcode) {
        this.name = name;
        this.value = value;
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", value=" + value + ", barcode=" + barcode + "]";
    }

}
