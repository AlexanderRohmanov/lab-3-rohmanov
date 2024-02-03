import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer customerONE = new Customer("AlexCustomer", "12345", "alex@mail.ru");
        List<Customer> customerList = new ArrayList<>();
        customerList.add(customerONE);
        Customer customerTWO = new Customer();
        //customerTWO.registration(customerList);
        //customerTWO.printCustomerInform();

        //      РАБОТА С КЛАССОМ ТОВАРА
        List<Product> productList = new ArrayList<>();

        Product productONE = new Product();
        Review reviewONE = new Review();
        productONE.creatNewProduct(productList);
        productONE.printProductInform();

        reviewONE.createReview(productONE, customerONE);




        customerONE.printCustomerInform();
        customerONE.printReviewsInform();
        productONE.printProductInform();



    }
}