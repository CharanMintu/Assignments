class StudentOverloaded {
    name: string;
    rollNumber: number;

    constructor(name: string, rollNumber: number = -1) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
} let objov = new StudentOverloaded("Ravi");
console.log(objov.name, objov.rollNumber);
let objov1 = new StudentOverloaded("Ravi", 101);
console.log(objov1.name, objov1.rollNumber);