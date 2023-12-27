import java.util.Scanner;

public class author_list {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int max_size = 40; // Set a maximum size for the arrays, set a lower number for eazy debug
            String[] authors = new String[max_size];
            String[] book_name_array = new String[max_size];
            String[] book_type_array = new String[max_size];
            String[] unique_elements = new String[max_size];
            int[] element_counts = new int[max_size];
            int unique_count = 0;
            int[] min_age_range_array = new int[max_size];
            int[] max_age_range_array = new int[max_size];
            int currentSize = 0;

            while(currentSize !=  max_size) {
                System.out.print("Enter author name: ");
                String author_name = scanner.nextLine();

                System.out.print("Enter book name: ");
                String book_name = scanner.nextLine();

                System.out.print("Enter the minimum age range of the books: ");
                int min_age_range = scanner.nextInt();

                System.out.print("Enter the maximum age range of the books: ");
                int max_age_range = scanner.nextInt();

                System.out.print("Enter the type of the book: ");

                String fake_book_type = scanner.nextLine();   //don know why but if don have this code, program will crash by ignore one of the scanner,
                                                            //this will let the input sequences mess up
                String book_type = scanner.nextLine();

                // Store the information into arrays
                authors[currentSize] = author_name;
                book_name_array[currentSize] = book_name;
                min_age_range_array[currentSize] = min_age_range;
                max_age_range_array[currentSize] = max_age_range;
                book_type_array[currentSize] = book_type;
                
                currentSize++;
                }
                 // Count each element
        for (int i = 0; i < book_type_array.length; i++) {
            String current_element = book_type_array[i];
            boolean new_element = true;

            // if element is in the unique array
            for (int j = 0; j < unique_count; j++) {
                if (current_element.equals(unique_elements[j])) {
                    new_element = false;
                    element_counts[j]++;
                    break;
                }
            }

            //if element is not in the unique array, then add into
            if (new_element) {
                unique_elements[unique_count] = current_element;
                element_counts[unique_count]++;
                unique_count++;
            }
        }

        System.out.println("\t\tauthors\t\tbook_name\t\tmin_age\t\tmax_age");
        for(int i = 0; i < authors.length; i++){
            System.out.println("\t\t" + authors[i] + "\t\t" + book_name_array[i] + "\t\t" + min_age_range_array[i] + "\t\t" + max_age_range_array[i]);
        }

        for (int i = 0; i < element_counts.length - 1; i++) {  //bubble sort
            if (element_counts[i] < element_counts[i + 1]) {
                int temp_element_counts = element_counts[i];
                element_counts[i] = element_counts[i + 1];
                element_counts[i + 1] = temp_element_counts;
        
                String temp_unique_elements = unique_elements[i];
                unique_elements[i] = unique_elements[i + 1];
                unique_elements[i + 1] = temp_unique_elements;
            }
        }

        System.out.println("--------------------------------------------------------------");
        System.out.println("\t\tbook_type" + "\t\tcount");
        for (int i = 0; i < unique_count; i++) {
            System.out.println("\t\t" + unique_elements[i] + "\t\t" + element_counts[i]);
        }
    }
    }
}
    


