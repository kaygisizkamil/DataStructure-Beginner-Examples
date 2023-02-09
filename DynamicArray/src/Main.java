public class Main {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        Employee employee1 = new Employee(1, "John", "Doe");
        Employee employee2 = new Employee(2, "Jane", "Doe");
        Employee employee3 = new Employee(3, "Jim", "Smith");

        dynamicArray.add(employee1);
        dynamicArray.add(employee2);
        dynamicArray.add(employee3);

        System.out.println("Size of the dynamic array: " + dynamicArray.getCurrent() + 1);
        System.out.println("Capacity of the dynamic array: " + dynamicArray.getCapacity());

        System.out.println("\nEmployee at index 0: " + dynamicArray.get(0));
        System.out.println("Employee at index 1: " + dynamicArray.get(1));
        System.out.println("Employee at index 2: " + dynamicArray.get(2));

        System.out.println("\nCheck if the dynamic array contains employee1: " + dynamicArray.contains(employee1));
        System.out.println("Check if the dynamic array contains employee2: " + dynamicArray.contains(employee2));

        System.out.println("\nIndex of employee1: " + dynamicArray.indexOf(employee1));
        System.out.println("Index of employee2: " + dynamicArray.indexOf(employee2));

        dynamicArray.delete(0);
        System.out.println("\nEmployee at index 0 after deletion: " + dynamicArray.get(0));

        System.out.println("\nCheck if the dynamic array contains employee1 after deletion: " + dynamicArray.contains(employee1));
        System.out.println("Check if the dynamic array contains employee2 after deletion: " + dynamicArray.contains(employee2));

        dynamicArray.set(0, employee1);
        System.out.println("\nEmployee at index 0 after set: " + dynamicArray.get(0));

    }

}