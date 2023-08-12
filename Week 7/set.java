import java.util.*;
class set {
    public static void main(String[] args) {
        SetOperations operation = new SetOperations();
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
    private static void chooseOperation(SetOperations operation){
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an operation: ");
        String query = scan.next();

        switch (query) {
            case "a":
                number = scan.nextInt();
                operation.addValue(number);
                break;

            case "b":
                operation.printSortedSet();
                break;

            case "c":
                number = scan.nextInt();
                operation.removeElement(number);
                break;

            case "d":
                number = scan.nextInt();
                operation.findNumber(number);
                break;

            case "e":
                operation.getSize();
                break;

            default:
                System.out.println("Choose a valid option");
        }
    }
    private static class SetOperations{
        Set<Integer> operations;
        public SetOperations(){
            operations = new HashSet<>();
        }
        private void addValue(int number){
            operations.add(number);
        }
        private void printSortedSet(){
            List<Integer> sortedNumbers = new ArrayList<>(operations);
            Collections.sort(sortedNumbers);
            for (Integer n : sortedNumbers) System.out.print(n + " ");
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
