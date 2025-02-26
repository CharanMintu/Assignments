class StudentWithValidation {
    name: string;
    age: number;

    constructor(name: string, age: number) {
        this.name = name;
        this.age = age > 0 ? age : 0;
    }
}
let objstu = new StudentWithValidation("Ravi", 23);
console.log(objstu.name, objstu.age);
let objstu1 = new StudentWithValidation("Ravi", -23);
console.log(objstu1.name, objstu1.age);