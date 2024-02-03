import java.util.List;

public class Review {

    private Customer customer;
    private int grade;
    private String text;
    private Product product;

    public Review(Customer customer, int grade, String text, Product product) {
        this.customer = customer;
        this.grade = grade;
        this.text = text;
        this.product = product;
    }

    public Review(int grade) {
        this.grade = grade;
    }
    public  Review() {

    }

    public Customer GetCustomer() {
        return customer;
    }
    public int GetGrade() {
        return grade;
    }

    public String GetText() {
        return text;
    }
    public Product GetProduct(){
        return product;
    }

    public void inputGrade() {
        do {
            System.out.print("Введите оценку (по 5-тибалльной шкале): ");
            grade = Functions.scanner().nextInt();
        } while (!Functions.isIntCorrect(grade, 5));

    }
    public void inputText() {
        System.out.println("Введите текст вашего отзыва:");
        text = Functions.scanner().nextLine();
    }

    public void createReview(Product product, Customer customer) {
        System.out.println("--- Составление отзыва ---");
        inputGrade();
        inputText();
        this.product = product;
        this.customer = customer;
        customer.addReview(this);
        product.ratingEdit(grade);

    }
    public void printReview() {
        System.out.println("--- Отзыв на " + product.GetName() +" ---");
        System.out.println("Автор отзыва: " + customer.getName());
        System.out.println("Оценка: " + grade + " / 5");
        System.out.println("Комментарий: " + text);
    }

}
