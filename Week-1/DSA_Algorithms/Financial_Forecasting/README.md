# Financial Forecasting

## Overview
This project demonstrates a simple recursive calculation of future value for an investment over a fixed number of years, using a constant annual growth rate.

## Java Implementation
- `Main.java` contains the recursive method `CalculateFutureValue`.
- The program computes the future value of a starting principal amount after applying annual growth recursively for the given period.

## Key Concepts
- Recursion: The method calls itself with the updated amount and decremented period until the base case is reached.
- Compound growth: Each year, the new amount becomes the principal for the next year.

## Analysis
- Time Complexity: O(N) — the recursive method executes once per year in the period.
- Space Complexity: O(N) — recursion creates a call stack frame for each year in the period.

### Practical Notes
- The current implementation uses a decimal rate (`0.09` for 9%) instead of a percentage input.
- For larger forecasting horizons, an iterative or formula-based approach is more efficient and avoids deep recursion.
- This code is useful for demonstrating recursive forecasting logic and the concept of compounding.

## Example
Input:
- Principal amount: `2000`
- Annual growth rate: `0.09`
- Period: `5` years

Output:
- `The Predicted amount after 5 years is : 3077.2479008000013.`
