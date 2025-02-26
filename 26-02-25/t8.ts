// Declare an array of numbers
let numbers: number[] = [1, 23, 4, 3, 2, 1];

// Add elements to the array
numbers.push(5);
numbers.push(6);

// Remove elements from the array
numbers.pop(); // Removes the last element (6)

// Iterate through the array
for (let i = 0; i < numbers.length; i++) {
    console.log(numbers[i]);
}

// Using forEach to iterate through the array
numbers.forEach((num) => {
    console.log(num);
});

// Using map to create a new array with each element doubled
let doubledNumbers = numbers.map((num) => num * 2);
console.log(doubledNumbers);

// Using filter to create a new array with elements greater than 2
let filteredNumbers = numbers.filter((num) => num > 2 && num < 20);
console.log(filteredNumbers);