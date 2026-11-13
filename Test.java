public class Test {

    public static void main(String[] args) {
        Double[] myList = new Double[10];
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter " + myList.length + " values : ");
        
        for (int i = 0; i < myList.length; i++) {
            myList[i] = input.nextDouble();
        }
        
        System.out.println("You entered: ");
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " ");
        }
        
        // Close the scanner to prevent resource leaks
        input.close(); 
    }
}

// Note: Removed 'public' here so it can exist in the same file as 'Test'
class List2 {
    
    public static void main(String[] args) {
        double[] myList = new double[10];
        
        for (int i = 0; i < myList.length; i++) {
            myList[i] = Math.random() * 100;
        }
        
        double total = 0;
        
        // Completed the incomplete for loop to calculate the sum
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        
        System.out.println("\n\n--- List2 Results ---");
        System.out.println("Total sum of random numbers: " + total);
        System.out.println("Average: " + (total / myList.length));
    }
}