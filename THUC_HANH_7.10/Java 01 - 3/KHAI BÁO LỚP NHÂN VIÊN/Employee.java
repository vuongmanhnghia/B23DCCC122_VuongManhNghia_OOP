import java.util.Scanner;

public class Employee {
    private String Id;
    private String Name;
    private String Gender;
    private String DateOfBirth;
    private String Address;
    private String TaxCode;
    private String ContractDate;

    public Employee(String Id, String Name, String Gender, String DateOfBirth, String Address, String TaxCode, String ContractDate) {
        this.Id = Id;
        this.Name = Name;
        this.Gender = Gender;
        this.DateOfBirth = DateOfBirth;
        this.Address = Address;
        this.TaxCode = TaxCode;
        this.ContractDate = ContractDate;
    }

    public String getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getGender() {
        return Gender;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public String getAddress() {
        return Address;
    }

    public String getTaxCode() {
        return TaxCode;
    }

    public String getContractDate() {
        return ContractDate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();
        String Gender = sc.nextLine();
        String DateOfBirth = sc.nextLine();
        String Address = sc.nextLine();
        String TaxCode = sc.nextLine();
        String ContractDate = sc.nextLine();
        Employee employee = new Employee("00001", Name, Gender, DateOfBirth, Address, TaxCode, ContractDate);
        System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getGender() + " " + employee.getDateOfBirth() + " " + employee.getAddress() + " " + employee.getTaxCode() + " " + employee.getContractDate());
        sc.close();
    }

}
