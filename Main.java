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

        //List<Product> productList = new ArrayList<>();

        //Product productONE = new Product();
        //Review reviewONE = new Review();
        //productONE.creatNewProduct(productList);
        //productONE.printProductInform();
        //
        //reviewONE.createReview(productONE, customerONE);
        //
        //
        //
        //
        //customerONE.printCustomerInform();
        //customerONE.printReviewsInform();
        //productONE.printProductInform();

        //      СОРТИРОВКА СПИСКА
        List<Product> productList = new ArrayList<>();
        Review review = new Review();
        Product productONE = new Product("RTX 3060", 30000, "Видеокарта способная обеспечить необходимый уровень производительностти...");
        Product productTWO = new Product("RTX 3090", 50000, "Видеокарта способная обеспечить больше чем необходимый уровень производительностти...");
        productList.add(productONE);
        productList.add(productTWO);
        review.createReview(productONE, customerONE);
        Functions.printProductList(productList);

        System.out.println("--- Отсортированный список ---");
        ParamForSearch param = new ParamForSearch(20000, 40000, 0,false);
        Functions.printProductList(Functions.SortProductList(productList, param));
    }
}