var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var vehicle = /** @class */ (function () {
    function vehicle(name, price) {
        this.name = name;
        this.price = price;
    }
    return vehicle;
}());
var Carex = /** @class */ (function (_super) {
    __extends(Carex, _super);
    function Carex(engine, model, name, price) {
        var _this = _super.call(this, name, price) || this;
        _this.engine = engine;
        _this.model = model;
        return _this;
    }
    return Carex;
}(vehicle));
var SportsCar = /** @class */ (function (_super) {
    __extends(SportsCar, _super);
    function SportsCar(engine, model, name, price, speed) {
        var _this = _super.call(this, engine, model, name, price) || this;
        _this.speed = speed;
        return _this;
    }
    return SportsCar;
}(Carex));
var ojjectcar = new SportsCar("BMW-650", 2020, "BMW", 1000000, 200);
console.log(ojjectcar.engine, ojjectcar.model, ojjectcar.name, ojjectcar.price, ojjectcar.speed);
