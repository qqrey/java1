public class array_gpt {

    public static void main(String[] args) {
        // Example usage
        int[] resultArray = createIntArray(5);
        for (int value : resultArray) {
            System.out.println(value);
        }
    }

    // Method to create an int array of specified size
    public static int[] createIntArray(int size) {
        int[] newArray = new int[size];

        // You can initialize the array elements as per your requirement
        for (int i = 0; i < size; i++) {
            newArray[i] = i + 1; // Initializing elements with values 1, 2, 3, ..., size
        }

        return newArray;
    }
}
