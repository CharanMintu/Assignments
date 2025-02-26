var StudentWithValidation = /** @class */ (function () {
    function StudentWithValidation(name, age) {
        this.name = name;
        this.age = age > 0 ? age : 0;
    }
    return StudentWithValidation;
}());
var objstu = new StudentWithValidation("Ravi", 23);
console.log(objstu.name, objstu.age);
var objstu1 = new StudentWithValidation("Ravi", -23);
console.log(objstu1.name, objstu1.age);
