# Pipe and Filter Pattern in Java

This project demonstrates the **Pipe and Filter** design pattern in Java. It processes a list of numbers through a series of transformations using functional programming.

## Features
- Filters even numbers from the list
- Squares each number
- Adds 5 to each number
- Filters numbers greater than 10
- Keeps numbers divisible by 3

## How It Works
The program applies a series of transformations to a list of numbers step by step:

1. **Filter Even Numbers** → `[1,2,3,4,5,6,7,8,9,10]` → `[2,4,6,8,10]`
2. **Square Numbers** → `[2,4,6,8,10]` → `[4,16,36,64,100]`
3. **Add 5 to Each Number** → `[4,16,36,64,100]` → `[9,21,41,69,105]`
4. **Filter Numbers Greater Than 10** → `[9,21,41,69,105]` → `[21,41,69,105]`
5. **Filter Numbers Divisible by 3** → `[21,41,69,105]` → `[21,69,105]`

## Final Output
[21, 69, 105]
