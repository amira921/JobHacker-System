import java.util.*;

public class set {
    public static void main(String[] args) {
        Set_operations operations = new Set_operations();
        Scanner scan = new Scanner(System.in);
        int testNumber = scan.nextInt();

        for (int i = 0; i < testNumber; i++) {

            int number_of_operations = scan.nextInt();

            for (int j = 0; j < number_of_operations; j++) {

                String operation = scan.next();
                int number;

                switch (operation) {
                    case "a":
                        number = scan.nextInt();
                        operations.addValue(number);
                        break;

                    case "b":
                        operations.printSortedSet();
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
                }
            }
        }
    }
    static class Set_operations{
        Set<Integer> operations;
        public Set_operations(){
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
