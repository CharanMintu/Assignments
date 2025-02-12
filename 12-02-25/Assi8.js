// 11. Temperature Conversion
convertTemperature = (value, type) => {
    console.log(type === "C" ? `${value}°C is ${(value * 9 / 5) + 32}°F` : `${value}°F is ${(value - 32) * 5 / 9}°C`);
};

convertTemperature(60, "C");
convertTemperature(45, "F");

// 12. Largest Integer
largestOfTwo = (a, b) => console.log(a > b ? a : b);
largestOfTwo(10, 20);

// 13. Sign of Product
findSign = (a, b, c) => alert(`The sign is ${a * b * c > 0 ? "+" : "-"}`);
findSign(3, -7, 2);

// 14. Sort Three Numbers
sortNumbers = (a, b, c) => alert([a, b, c].sort((x, y) => y - x).join(", "));
sortNumbers(0, -1, 4);
