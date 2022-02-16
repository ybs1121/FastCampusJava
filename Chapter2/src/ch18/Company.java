package ch18;

public class Company {
    private static Company company = new Company();



    private Company() {
    }

    public static Company getCompany() {
        return company;
    }

    public static void setCompany(Company company) {
        Company.company = company;
    }
}
