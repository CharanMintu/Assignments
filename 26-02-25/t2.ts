// Using var
var a: number = 10;
if (true) {
    var a: number = 20; // var is function-scoped, so this reassigns the outer 'a'
    console.log("Inside if block (var):", a); // Output: 20
}
console.log("Outside if block (var):", a); // Output: 20

// Using let
let b: number = 10;
if (true) {
    let b: number = 20; // let is block-scoped, so this 'b' is different from the outer 'b'
    console.log("Inside if block (let):", b); // Output: 20
}
console.log("Outside if block (let):", b); // Output: 10

// Using const
const c: number = 10;
if (true) {
    const c: number = 20; // const is block-scoped, so this 'c' is different from the outer 'c'
    console.log("Inside if block (const):", c); // Output: 20
}
console.log("Outside if block (const):", c); // Output: 10

// Demonstrating mutability
let d: number = 10;
d = 20; // Allowed, since 'let' allows reassignment
console.log("Reassigned (let):", d); // Output: 20

const e: number = 10;
// e = 20; // Error: Assignment to constant variable.
console.log("Constant (const):", e); // Output: 10