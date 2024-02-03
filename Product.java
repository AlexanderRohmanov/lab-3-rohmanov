import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;

public class Product {

    private String name;
    private int price;
    private String description;
    private int id;
    private float rating = 0;
    List<Review> reviews = new ArrayList<>();
    //Seller seller;

    public Product(String name, int  price, String description, float rating) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.rating = rating;
    }

    public Product(String name) {
        this.name = name;
    }

    public Product() {
    }

    public String GetName() {
        return name;
    }
    public int GetPrice() {
        return price;
    }
    public String GetDescription() {
        return description;
    }
    public int GetId() {
        return id;
    }
    public float GetRating() {
        return rating;
    }

    public List<Review> GetReviews() {return reviews;}

    public void inputName() {
        System.out.print("Введите название товара: ");
        name = Functions.scanner().next();
    }
    public void inputPrice() {
        System.out.print("Введите цену: ");
        price = Functions.scanner().nextInt();
    }
    public void inputDescription() {
        System.out.print("Введите описание товара: ");
        description = Functions.scanner().nextLine();
    }

    public void creatNewProduct(List<Product> productList) {
        System.out.println("--- Добавление нового товара ---");
        inputName();
        inputPrice();
        inputDescription();
        System.out.println("Товар \"" + name + "\" успешно добавлен!");
    }

    public void printProductInform() {
        System.out.println("--- Информация о товаре ---");
        System.out.println(name);
        System.out.println("Цена: " + price);
        System.out.println("Описание товара: " + description);
        if (rating != 0) {
            System.out.println("Рейтинг: " + rating + "/ 5.0");
        }
        else System.out.println("Рейтинг: - / 5");
    }

    public void ratingEdit(int rating) {
        this.rating = Functions.calculateRating(this, rating);
    }
}
