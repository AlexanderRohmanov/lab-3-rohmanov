import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;

public class Product {

    private String name;
    private int price;
    private String description;
    private int  id;
    private float rating = 0;
    private List<Review> reviews = new ArrayList<>();
    private Seller seller;

    static int countOfProducts;

    public Product(String name, int  price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.rating = rating;
        countOfProducts++;
        id = countOfProducts - 1;
    }
    public Product(String name, int  price, String description, Seller seller) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.rating = rating;
        this.seller = seller;
        countOfProducts++;
        id = countOfProducts - 1;
    }


    public Product(String name) {
        this.name = name;
        countOfProducts++;
        id = countOfProducts - 1;
    }

    public Product() {
        countOfProducts++;
        id = countOfProducts - 1;
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
    public Seller GetSeller() {return seller;}

    public static int GetCountOfProducts() {
        return countOfProducts;
    }
    public void inputName() {
        System.out.print("Введите название товара: ");
        name = Functions.scanner().nextLine();
    }
    public void inputPrice() {
        System.out.print("Введите цену: ");
        price = Functions.scanner().nextInt();
    }
    public void inputDescription() {
        System.out.print("Введите описание товара: ");
        description = Functions.scanner().nextLine();
    }

    public void creatNewProduct(List<Product> productList, Seller seller) {
        System.out.println("--- Добавление нового товара ---");
        inputName();
        inputPrice();
        inputDescription();
        this.seller = seller;
        seller.addProduct(this);
        System.out.println("Товар \"" + name + "\" успешно добавлен!");
    }

    public void printProductInform() {
        System.out.println("--- Информация о товаре ---");
        System.out.println(name);
        System.out.println("Цена: " + price);
        System.out.println("Описание товара: " + description);
        if (rating != 0) {
            System.out.println("Рейтинг: " + rating + "/ 5.0 (на основе " + reviews.size() + " отзыва/ов )");
        }
        else System.out.println("Рейтинг: - / 5");
    }

    public void ratingEdit(int rating) {
        this.rating = Functions.calculateRating(this, rating);
    }
    public void addReview(Review review) {
        reviews.add(review);
    }
}
