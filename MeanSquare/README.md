# Average of Squared Absolute Differences

## Problem Description

Complete the function that:

1. Accepts **two integer arrays** of equal length.
2. Compares the value of each member in one array to the corresponding member in the other.
3. Squares the absolute value difference between those two values.
4. Returns the **average** of those squared absolute value differences between each member pair.

---

## Examples

### Example 1
**Input:**  
`arrA = [1, 2, 3]`  
`arrB = [4, 5, 6]`  

**Calculation:**  
- Differences squared: `(9, 9, 9)`  
- Average: `(9 + 9 + 9) / 3 = 9`  

**Output:**  
`9`

---

### Example 2
**Input:**  
`arrA = [10, 20, 10, 2]`  
`arrB = [10, 25, 5, -2]`  

**Calculation:**  
- Differences squared: `(0, 25, 25, 16)`  
- Average: `(0 + 25 + 25 + 16) / 4 = 16.5`  

**Output:**  
`16.5`

---

### Example 3
**Input:**  
`arrA = [-1, 0]`  
`arrB = [0, -1]`  

**Calculation:**  
- Differences squared: `(1, 1)`  
- Average: `(1 + 1) / 2 = 1`  

**Output:**  
`1`

---

## Constraints
- Both arrays must have the **same length**.
- The function assumes valid input (no null values or mismatched lengths).
