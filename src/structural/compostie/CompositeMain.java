package structural.compostie;

public class CompositeMain {
    public static void main(String[] args) {
        Employee ceo = new Employee("John", "CEO");
        Employee headSales = new Employee("Robert", "Head Sales");
        Employee headMarketing = new Employee("Michel", "Head Marketing");
        Employee clerk1 = new Employee("Laura", "Marketing");
        Employee clerk2 = new Employee("Bob", "Marketing");
        Employee clerk3 = new Employee("Carol", "Sales");
        Employee clerk4 = new Employee("Ted", "Sales");

        ceo.add(headSales);
        ceo.add(clerk2);
        headSales.add(headMarketing);
        headMarketing.add(clerk1);
        clerk3.add(clerk4);
        clerk4.add(clerk1);


        System.out.println(ceo);
        System.out.println(headSales);
        System.out.println(headMarketing);
        System.out.println(clerk1);
        System.out.println(clerk2);
        System.out.println(clerk3);
        System.out.println(clerk4);

    }
}
