var StudentOverloaded = /** @class */ (function () {
    function StudentOverloaded(name, rollNumber) {
        if (rollNumber === void 0) { rollNumber = -1; }
        this.name = name;
        this.rollNumber = rollNumber !== null && rollNumber !== void 0 ? rollNumber : -1;
    }
    return StudentOverloaded;
}());
var objov = new StudentOverloaded("Ravi");
console.log(objov.name, objov.rollNumber);
var objov1 = new StudentOverloaded("Ravi", 101);
console.log(objov1.name, objov1.rollNumber);
