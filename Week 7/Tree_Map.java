import java.util.*;

public class Tree_Map {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeMap_operations map = new TreeMap_operations();
        int testNumber = scan.nextInt();

        for (int i = 0; i < testNumber; i++) {

            int number_of_operations = scan.nextInt();

            for (int j = 0; j < number_of_operations; j++) {
                String operation = scan.next();
                int value , key;

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
                }
            }
        }
    }
    static class TreeMap_operations{
        Map<Integer,Integer> operations = new TreeMap<>();
        public TreeMap_operations() {
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
