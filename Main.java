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

        //      СОЗДАНИЕ ОТЗЫВОВ И СОРТИРОВКА СПИСКА ПО ПАРАМЕТРАМ ПОИСКА
        //List<Product> productList = new ArrayList<>();
        //Review review1 = new Review();
        //Review review2 = new Review();
        //Product productONE = new Product("RTX 3060", 30000, "Видеокарта способная обеспечить необходимый уровень производительностти...");
        //Product productTWO = new Product("RTX 3090", 50000, "Видеокарта способная обеспечить больше чем необходимый уровень производительностти...");
        //
        //productList.add(productONE);
        //productList.add(productTWO);
        //
        //review1.createReview(productONE, customerONE);
        //review2.createReview(productONE, customerTWO);
        //Functions.printProductList(productList);
        //
        //System.out.println("--- Отсортированный список ---");
        //ParamForSearch param = new ParamForSearch(20000, 40000, 0,false);
        //Functions.printProductList(Functions.SortProductList(productList, param));

        //               СОЗДАНИЕ АККАУНТА ПРОДАВЦА И ДОБАВЛЕНИЕ ТОВАРОВ
        List<Seller> sellerList = new ArrayList<>();
        List<Product> poductList = new ArrayList<>();
        Seller sellerONE = new Seller();
        sellerONE.registration(sellerList);

        sellerONE.printSellerInform();

        Product productONE = new Product();
        productONE.creatNewProduct(poductList, sellerONE);

        sellerONE.printSellerInform();

        sellerONE.printProductOnSaleList();

    }
}