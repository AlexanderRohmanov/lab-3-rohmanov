import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{



        Customer customerONE = new Customer("AlexCustomer", "12345", "alex@mail.ru");
        Seller sellerONE = new Seller("sashaSeller", "sashaseller@mail.ru" , "12345");



        //Product productONE = new Product("RTX 3060", 30000, "Видеокарта способная обеспечить необходимый уровень производительностти..." , sellerONE);
        //
        //Product productTWO = new Product("RTX 3060 ti", 45000, "Видеокарта способная обеспечить необходимый уровень производительностти..." , sellerONE);
        //
        //Product productTHREE = new Product("RTX 3070", 6000, "Видеокарта способная обеспечить необходимый уровень производительностти..." , sellerONE);

        Product[][] productONE = {{new Product("RTX 3060"), new Product("RTX 3060 ti")}, { new Product("RTX 4060"), new Product("RTX 4090")}};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("ID: " + productONE[i][j].GetId() + " " + productONE[i][j].GetName());
            }
        }



    }
}