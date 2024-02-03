public class ParamForSearch {
    private int minPrice;
    private int maxPrice;
    private float minRating = 0;
    private boolean withReview = false;

    public ParamForSearch(int minPrice, int maxPrice, float minRating, boolean withReview) {
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.minRating = minRating;
        this.withReview = withReview;
    }
    public ParamForSearch(int maxPrice) {
        this.maxPrice = maxPrice;
    }
    public ParamForSearch() {}
    public int getMinPrice() {
        return minPrice;
    }
    public int getMaxPrice() {
        return maxPrice;
    }
    public float  getMinRating() {
        return minRating;
    }
    public boolean getWithReview() {
        return withReview;
    }
    public void inputMinPrice() {
        System.out.print("Введите минмиальную цену товара: ");
        minPrice = Functions.scanner().nextInt();
    }

    public void inputMaxPrice() {
        System.out.print("Введите максимальную цену товара: ");
        maxPrice = Functions.scanner().nextInt();
    }
    public void inputMinRating() {
        System.out.print("Введите минимальный рейтинг товара: ");
        minRating = Functions.scanner().nextInt();
    }
    public void inputWithReview() {
        int check;
       do {
           System.out.print("Обязательно ли у товара наличие отзывов?\n1 - Да, 0 - нет");
           check = Functions.scanner().nextInt();
       } while (check > 1 || check < 0);
       if (check == 1) withReview = true;
       else withReview = false;
    }

    public void makeParam() {
        System.out.println("--- Параметры поиска ---");
        inputMinPrice();
        inputMaxPrice();
        inputWithReview();
        if (withReview) inputMinRating();
    }


 }
