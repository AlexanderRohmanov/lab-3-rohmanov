import java.util.ArrayList;
import java.util.List;
public class Customer {
    private String name;
    private String password;
    private String mail;
    List<Review> reviews = new ArrayList<>();
    public Customer(String name, String password, String mail) {
        this.name = name;
        this.password = password;
        this.mail = mail;
    }
    public Customer(String name){
        this.name =  name;
    }
    public Customer(){

    }
    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }
    public String getMail() {
        return mail;
    }
    public  List<Review> getReviews() {
        return reviews;
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
    public void registration(List<Customer> customerList) {
        System.out.println("--- Регистрация ---");
        do {
            inputName();
        } while (Functions.isNameExist(customerList, name));
        do {
            inputMail();
        } while (Functions.isMailExist(customerList, mail));
        inputPassword();
        System.out.println("Регистрация успешно завершена!");
        customerList.add(this);
    }
    public void printCustomerInform() {
        System.out.println("--- Информация о пользователе ---");
        System.out.println("Имя: " + name);
        System.out.println("Почтовый адрес: " + Functions.maskingMail(mail));
        System.out.println("Кол-во отзывов:  " + reviews.size());
    }
    public void printReviewsInform() {
        System.out.println("--- Отзывы от "+ this.getName()+" ---");
        for (int i = 0; i < reviews.size(); i++) {
            System.out.println(i+1 + ". \"" + reviews.get(i).GetProduct().GetName()+ "\" - " + reviews.get(i).GetGrade() + " / 5");
        }
    }
    public void addReview(Review review) {
        reviews.add(review);

    }
    public void printProductReview(Product product) {
        for (Review review : getReviews()) {
            if (review.GetProduct().equals(product)) {

            }
        }

    }
}
