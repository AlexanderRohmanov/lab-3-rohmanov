import java.util.List;
import java.util.Scanner;
import java.lang.String;

public class Functions {

    public static Scanner scanner() {
        return new Scanner(System.in);
    }

    public static boolean isNameExist(List<Customer> customerList, String name) {

        for (Customer customer : customerList) {
            if (customer.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    public static boolean isMailExist(List<Customer> customerList, String mail) {

        for (Customer customer : customerList) {
            if (customer.getMail().equals(mail)) {
                return true;
            }
        }
        return false;
    }

    public static boolean customerLogin(List<Customer> customerList, Customer custom) {
        Customer customer = new Customer();

        customer.inputName();
        customer.inputPassword();

        for (Customer currentUser : customerList) {
            if (currentUser.getName().equals(customer.getName()) &&  currentUser.getPassword().equals(customer.getPassword())) {
                System.out.println("Вход выполнен! Здравствуйте, " + customer.getName() + "!");
                custom = customer;
                return true;
            }

        }
        System.out.println("Неверное имя пользователя или пароль!");
        return false;

    }

    public static String maskingMail(String mail) {
        String maskMail;
        if (mail.indexOf('@') != -1) {
            maskMail =  mail.charAt(0) + "*****" + mail.substring(mail.indexOf('@'), mail.length());
        } else {
            maskMail = mail.charAt(0) + "***" + mail.substring(mail.length()/2,mail.length()-1);
        }
        return maskMail;
    }
    public static float calculateRating(Product product, int grade) {
        int countOfGrade = 0, sumOfGrade = grade;
        for (Review review : product.GetReviews()) {
            sumOfGrade+= review.GetGrade();
            countOfGrade++;
        }
        if (sumOfGrade != 0) {
            return  (float)sumOfGrade /(countOfGrade+1);
        }
        else return 0;

    }
    public static boolean isIntCorrect(int intForCheck, int param) {
        return intForCheck <= param && intForCheck >= 0;
    }
}
