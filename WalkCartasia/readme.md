Walk Validation in Cartesia
Constraints and Exceptions:

    The array must contain exactly 10 directions.

        If the array size is greater or less than 10, the result will be False.

    The walk must return to the starting point (0, 0).

        If the walk does not end at the initial coordinates (0, 0), the result will be False.

Explanation of Directions:

    Each letter in the array represents a direction:

        'n' - Increases the Y coordinate (North).

        's' - Decreases the Y coordinate (South).

        'e' - Increases the X coordinate (East).

        'w' - Decreases the X coordinate (West).

Examples:
Valid Walks:

    Array: ['n', 's', 'n', 's', 'e', 'w', 'e', 'w', 'n', 's']

        Reason: Contains exactly 10 directions and returns to (0, 0).

    Array: ['n', 'e', 'w', 's', 'n', 'w', 'e', 's', 'n', 's']

        Reason: Fulfills all constraints and returns to the starting point.

Invalid Walks:

    Array: ['n', 's', 'e', 'w', 'n', 's', 'e', 'w']

        Reason: The array contains fewer than 10 directions.

    Array: ['n', 'n', 'n', 'n', 'e', 'e', 's', 's', 'w', 'w']

        Reason: While the array has 10 directions, it does not return to the starting point (0, 0).

    Array: ['n', 's', 'e', 'w', 'n', 'n', 'e', 'w', 's', 'w']

        Reason: Contains 10 directions but ends outside the starting point
