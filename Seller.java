import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class Seller {
    private String name;
    private String mail;
    private String password;
    private List<Product> productOnSaleList = new ArrayList<>();
    private float rating = 0;

    public Seller(String name, String mail, String password) {
        this.name = name;
        this.mail = mail;
        this.password = password;
    }
    public Seller(String name) {
        this.name = name;

    }
    public Seller() {

    }

    public String getName() {
        return name;
    }
    public String getMail() {
        return mail;
    }
    public String getPassword() {
        return password;
    }
    public List<Product> getProductOnSaleList() {
        return productOnSaleList;
    }
    public float getRating() {
        return rating;
    }

    public void inputName() {
        System.out.print("Введите имя пользователя: ");
        name = Functions.scanner().next();
    }
    public void inputPassword() {
        System.out.print("Введите пароль: ");
        password = Functions.scanner().next();
    }
    public void inputMail() {
        System.out.print("Введите адрес электронной почты: ");
        mail = Functions.scanner().next();
    }
    public void registration(List<Seller> sellersList) {
        System.out.println("--- Регистрация ---");
        do {
            inputName();
            inputMail();
        } while (Functions.isSellerExist(sellersList, name, mail));
        inputPassword();
        System.out.println("Регистрация успешно завершена!");
        sellersList.add(this);
    }
    public void printSellerInform() {
        System.out.println("--- Информация о продавце ---");
        System.out.println("Имя: " + name);
        if (rating != 0) System.out.println("Рейтинг: " + rating + " / 5.0");
        else System.out.println("Рейтинг: - / 5.0");
        System.out.println("Почтовый адрес: " + Functions.maskingMail(mail));
        System.out.println("Кол-во товаров:  " + productOnSaleList.size());
    }
    public void addProduct(Product product) {
        productOnSaleList.add(product);
    }
    public void ratingEdit(int grade) {
        this.rating = Functions.calculateSellerRating(this,grade);
    }

    public void printProductOnSaleList() throws Exception{
        System.out.println("--- Товары от продавца \"" + name + "\" ---");

        try {
            Functions.printProductList(this.productOnSaleList);
        }
        catch(Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
 }
