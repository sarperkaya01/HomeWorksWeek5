package InnerClass;

public class InnerClassRunner {
    public static void main(String[] args) {
        Employee e1 = new Employee("Sarper", "Kaya", "555-1234", "sarper.kaya@sarperkaya.site");
        Employee e2 = new Employee("I@m", "Groot", "555-4321", "I@m.Groot@sarperkaya.site");

        e1.displayEmployeeInfo();
        e2.displayEmployeeInfo();
    }
}
