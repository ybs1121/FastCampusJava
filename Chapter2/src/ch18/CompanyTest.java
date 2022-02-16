package ch18;

public class CompanyTest {
    public static void main(String[] args) {
        Company company = Company.getCompany();
        Company company1 = Company.getCompany();

        System.out.println(company);
        System.out.println(company1);
    }
}
