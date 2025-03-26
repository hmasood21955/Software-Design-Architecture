import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PipeAndFilter {

    public static void main(String[] args) {
        List<Integer> input = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Create a pipeline
        List<Function<List<Integer>, List<Integer>>> filters = new ArrayList<>();
        filters.add(PipeAndFilter::filterEvenNumbers);  // Step 1: Keep only even numbers
        filters.add(PipeAndFilter::squareNumbers);      // Step 2: Square the numbers
        filters.add(PipeAndFilter::addFiveToNumbers);   // Step 3: Add 5 to each number
        filters.add(PipeAndFilter::filterNumbersGreaterThanTen);  // Step 4: Keep numbers > 10
        filters.add(PipeAndFilter::filterDivisibleByThree); // Step 5: Keep numbers divisible by 3

    
        // Process the input through the pipeline

        List<Integer> result = processPipeline(input, filters);

        // Output the result
        System.out.println(result);
    }
      
        private static List<Integer> addFiveToNumbers(List<Integer> input) {
            return input.stream()
                    .map(n -> n + 5)
                    .collect(Collectors.toList());
        }

        private static List<Integer> filterDivisibleByThree(List<Integer> input) {
            return input.stream()
                    .filter(n -> n % 3 == 0)
                    .collect(Collectors.toList());
        }

    // Process the input through the pipeline of filters
    private static List<Integer> processPipeline(List<Integer> input, List<Function<List<Integer>, List<Integer>>> filters) {
        List<Integer> output = input;
        for (Function<List<Integer>, List<Integer>> filter : filters) {
            output = filter.apply(output);
        }
        return output;
    }

    // Filter to keep even numbers
    private static List<Integer> filterEvenNumbers(List<Integer> input) {
        return input.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }

    // Filter to square the numbers
    private static List<Integer> squareNumbers(List<Integer> input) {
        return input.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }



    // Filter to keep numbers greater than 10

    private static List<Integer> filterNumbersGreaterThanTen(List<Integer> input) {
        return input.stream()
                .filter(n -> n > 10)
                .collect(Collectors.toList());
    }
}
