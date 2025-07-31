# 📘 Java Arrays Cheat Sheet

## 📌 1. Declaring an Array
```java
int[] numbers;         // preferred style
int numbers[];         // also valid
````

## 📌 2. Creating an Array

```java
int[] numbers = new int[5];         // array of 5 integers (default 0)
String[] names = new String[3];     // array of 3 Strings (default null)
```

## 📌 3. Initializing an Array

```java
int[] nums = {1, 2, 3, 4};          // shorthand initialization
```

## 📌 4. Accessing Elements

```java
int first = nums[0];    // get first element
nums[1] = 10;           // set second element to 10
```

## 📌 5. Array Length

```java
int len = nums.length;  // no parentheses!
```

## 📌 6. Looping Through an Array

### Traditional for loop

```java
for (int i = 0; i < nums.length; i++) {
    System.out.println(nums[i]);
}
```

### Enhanced for-each loop

```java
for (int num : nums) {
    System.out.println(num);
}
```

## 📌 7. Copying Arrays

```java
int[] original = {1, 2, 3};
int[] copy = Arrays.copyOf(original, original.length);
```

## 📌 8. Sorting Arrays

```java
import java.util.Arrays;
Arrays.sort(nums);
```

## 📌 9. Comparing Arrays

```java
boolean isEqual = Arrays.equals(arr1, arr2);
```

## 📌 10. Converting to String

```java
System.out.println(Arrays.toString(nums)); // [1, 2, 3]
```

## 📌 11. Removing Duplicates (Using Set)

```java
import java.util.*;

Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 2, 3));
Integer[] unique = set.toArray(new Integer[0]);
```

## 📌 12. Multi-Dimensional Arrays

```java
int[][] matrix = new int[3][4];       // 3 rows, 4 columns
matrix[0][1] = 5;                     // assign value
System.out.println(matrix[0][1]);     // access value
```

## 📚 Useful Imports

```java
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
```

```
