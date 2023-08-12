import java.util.*;
public class TreeMapOperations {
    public static void main(String[] args) {
        treemap map = new treemap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of tests: ");
        int testNumber = scanner.nextInt();

        for (int i = 0; i < testNumber; i++) {
            System.out.print("Enter the number of operations: ");
            int numberOfOperations = scanner.nextInt();
            for (int j = 0; j < numberOfOperations; j++) {
                chooseOperation(map);
            }
        }
    }

     public static void chooseOperation(treemap map) {
         int value, key;
         Scanner scan = new Scanner(System.in);
         System.out.print("Enter an operation: ");
         String operation = scan.next();

         switch (operation) {
             case "a":
                 key = scan.nextInt();
                 value = scan.nextInt();
                 map.addValue(key,value);
                 break;

             case "b":
                 key = scan.nextInt();
                 map.findKey(key);
                 break;

             case "c":
                 map.getSize();
                 break;

             case "d":
                 key = scan.nextInt();
                 map.removeElement(key);
                 break;

             case "e":
                 map.printElements();
                 break;

             default:
                 System.out.println("Choose a valid option");
         }
     }

    static class treemap{
        Map<Integer,Integer> operations;
        public treemap() {
            operations= new TreeMap<>();
        }
        private void addValue(int key,int value){
            operations.put(key,value);
        }
        private void findKey(int key){
            if(operations.containsKey(key)) System.out.println(operations.get(key)); else System.out.println(-1);
        }
        private void getSize(){
            System.out.println(operations.size());
        }
        private void removeElement(int key){
            System.out.println(operations.remove(key));
        }
        private void printElements(){
            for(Map.Entry m: operations.entrySet()) System.out.println(m.getKey() + ":" + m.getValue());
        }
    }
}
