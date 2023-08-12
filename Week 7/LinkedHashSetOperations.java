import java.util.*;
public class LinkedHashSetOperations {
    public static void main(String[] args) {
        linkedhashset operation = new linkedhashset();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of tests: ");
        int testNumber = scanner.nextInt();
        for (int i = 0; i < testNumber; i++) {
            System.out.print("Enter the number of operations: ");
            int numberOfOperations = scanner.nextInt();
            for (int j = 0; j < numberOfOperations; j++) {
                chooseOperation(operation);
            }
        }
    }
    private static void chooseOperation(linkedhashset operations){
        int number;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an operation: ");
        String operation = scan.next();

        switch (operation) {
            case "a":
                number = scan.nextInt();
                operations.addValue(number);
                break;

            case "b":
                operations.printSortedLinkedHashSet();
                break;

            case "c":
                number = scan.nextInt();
                operations.removeElement(number);
                break;

            case "d":
                number = scan.nextInt();
                operations.findNumber(number);
                break;

            case "e":
                operations.getSize();
                break;

            case "f":
                operations.printElement();

            default:
                System.out.println("Choose a valid option");
        }
    }
    private static class linkedhashset{
        LinkedHashSet<Integer> operations;
        public linkedhashset(){
            operations = new LinkedHashSet<>();
        }
        private void addValue(int number){
            operations.add(number);
        }
        private void printSortedLinkedHashSet(){
            List<Integer> sortedNumbers = new ArrayList<>(operations);
            Collections.sort(sortedNumbers);
            for (Integer n : sortedNumbers) System.out.print(n + " ");
            System.out.println();
        }
        private void printElement(){
            for(Integer item: operations) System.out.print(item + " ");
            System.out.println();
        }
        private void removeElement(int number){
            operations.remove(number);
        }
        private void findNumber(int number){
            System.out.println(operations.contains(number));
        }
        private void getSize(){
            System.out.println(operations.size());
        }
    }
}
