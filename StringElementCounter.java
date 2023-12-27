public class StringElementCounter {
    public static void main(String[] args) {
        // Sample array (replace this with your actual data)
        String[] dataArray = {"apple", "banana", "orange", "apple", "grape", "banana", "apple", "orange"};

        // Create arrays to store unique elements and their counts
        String[] uniqueElements = new String[dataArray.length];
        int[] elementCounts = new int[dataArray.length];

        // Initialize counts to zero
        int uniqueCount = 0;

        // Count the occurrences of each element
        for (int i = 0; i < dataArray.length; i++) {
            String currentElement = dataArray[i];
            boolean isNewElement = true;

            // Check if the element is already in the uniqueElements array
            for (int j = 0; j < uniqueCount; j++) {
                if (currentElement.equals(uniqueElements[j])) {
                    isNewElement = false;
                    elementCounts[j]++;
                    break;
                }
            }

            // If it's a new element, add it to the uniqueElements array
            if (isNewElement) {
                uniqueElements[uniqueCount] = currentElement;
                elementCounts[uniqueCount]++;
                uniqueCount++;
            }
        }

        // Display the count of each unique element
        for (int i = 0; i < uniqueCount; i++) {
            System.out.println(uniqueElements[i] + ": " + elementCounts[i] + " occurrences");
        }
    }
}
