package InnerClass;

public class Employee {
    private String firstName;
    private String lastName;
    private ContactInfo contactInfo; // her çalışanın iletişim bilgisi

    // Dış sınıf constructor
    public Employee(String firstName, String lastName, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactInfo = new ContactInfo(phone, email); // inner class örneği
    }

    // İç sınıf (Inner Class)
    public class ContactInfo {
        private String phone;
        private String email;

        public ContactInfo(String phone, String email) {
            this.phone = phone;
            this.email = email;
        }

        public void displayContact() {
            System.out.println("Telefon: " + phone + ", Email: " + email);
        }
    }

    // Çalışanın bilgilerini ve iletişim bilgilerini gösterecek metot
    public void displayEmployeeInfo() {
        System.out.println("Çalışan: " + firstName + " " + lastName);
        contactInfo.displayContact();
    }
}