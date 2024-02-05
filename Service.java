import java.util.List;

public class Service extends Product{
    private String additionalRequirement;

    public Service(String name, int  price, String description, String additionalRequirement) {
        super(name, price, description);
        this.additionalRequirement = additionalRequirement;
    }

    @Override
    public void creatNewProduct(List<Product> productList, Seller seller){
        super.creatNewProduct(productList, seller);
        System.out.println("Введите дополнительные требования от клиента: ");
        additionalRequirement = Functions.scanner().nextLine();
    }
    @Override
    public void printProductInform() {
        System.out.println("Название услуги: " + name);
        System.out.println("Доп. требования от клиента:" + additionalRequirement);
    }
}
