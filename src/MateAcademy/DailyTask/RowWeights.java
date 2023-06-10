package MateAcademy.DailyTask;

import java.lang.reflect.Array;

public class RowWeights {
    public static int[] getTotalWeight(int[] weights) {
        int weightCountFirstTeam = 0;
        int weightCountSecondTeam = 0;
        for (int i = 0; i < weights.length; i++) {
            if (i % 2 == 0) {
                weightCountFirstTeam += weights[i];
            } else {
                weightCountSecondTeam += weights[i];
            }
        }

        return new int[]{weightCountFirstTeam, weightCountSecondTeam};
    }
}


/*

public class RowWeights {
  public static int[] getTotalWeight(int[] weights) {
    int[] sums = Arrays.stream(weights)
        .reduce(new int[2], (result, weight) -> {
          result[0] += weight;
          result[1] += weight;
          return (result[0] == result[1]) ? result : new int[]{result[0], result[1]};
        });

    return sums;
  }
}
In this updated code, the getTotalWeight method uses the Arrays.stream() method to convert the weights array into a stream. Then, we use the reduce operation to accumulate the weights and calculate the sums for both teams.

Within the reduce operation, we provide an initial value of [0, 0], representing the initial sums for both teams. For each weight in the stream, we update both sums by adding the weight to each element of the result array. Then, we use the ternary operator to check if the sums for both teams are equal. If they are equal, we return the current result array; otherwise, we create a new array with the updated sums.

Finally, the sums array containing the final sums for both teams is returned.

Using Java Stream API provides a more concise and functional approach to calculate the sums of both teams in the given array of weights.





User
What you think which method the best practice to solve this task ?
ChatGPT
Both the traditional loop-based approach and the Stream API approach have their own advantages and considerations. The choice between them depends on factors such as code readability, performance, and personal preference.

Traditional Loop-Based Approach:

Advantages:
Simple and familiar syntax.
Straightforward to understand for developers with less experience with functional programming concepts.
Potentially more efficient for small arrays or when low-level control is required.
Considerations:
Requires manual iteration and conditional checks.
May involve more lines of code compared to the Stream API approach.
May require explicit mutation of variables.
Stream API Approach:

Advantages:
Utilizes functional programming concepts.
Concise and expressive code.
Abstracts away the iteration and provides built-in operations for aggregation and transformation.
Offers potential parallelization and optimization by the Stream API implementation.
Considerations:
May introduce a learning curve for developers new to functional programming.
Performance impact for very large arrays due to the overhead of creating streams and lambdas (although this can be mitigated by using parallel streams).
In terms of best practice, there is no definitive answer. It depends on the specific requirements of your project, the complexity of the task, and the coding style of your team. If the task is simple and the code needs to be straightforward, the traditional loop-based approach may be more suitable. On the other hand, if you value expressive and functional code or anticipate the need for additional stream operations, the Stream API approach could be a good choice.

Ultimately, the best practice is to consider factors such as code readability, maintainability, performance requirements, and team familiarity when selecting an approach for solving a particular task.







 */

/*
Both the traditional loop-based approach and the Stream API approach have their own advantages and considerations. The choice between them depends on factors such as code readability, performance, and personal preference.

Traditional Loop-Based Approach:

Advantages:
Simple and familiar syntax.
Straightforward to understand for developers with less experience with functional programming concepts.
Potentially more efficient for small arrays or when low-level control is required.
Considerations:
Requires manual iteration and conditional checks.
May involve more lines of code compared to the Stream API approach.
May require explicit mutation of variables.
Stream API Approach:

Advantages:
Utilizes functional programming concepts.
Concise and expressive code.
Abstracts away the iteration and provides built-in operations for aggregation and transformation.
Offers potential parallelization and optimization by the Stream API implementation.
Considerations:
May introduce a learning curve for developers new to functional programming.
Performance impact for very large arrays due to the overhead of creating streams and lambdas (although this can be mitigated by using parallel streams).
In terms of best practice, there is no definitive answer. It depends on the specific requirements of your project, the complexity of the task, and the coding style of your team. If the task is simple and the code needs to be straightforward, the traditional loop-based approach may be more suitable. On the other hand, if you value expressive and functional code or anticipate the need for additional stream operations, the Stream API approach could be a good choice.

Ultimately, the best practice is to consider factors such as code readability, maintainability, performance requirements, and team familiarity when selecting an approach for solving a particular task.
 */