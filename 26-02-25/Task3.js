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
var Cars = /** @class */ (function () {
    function Cars(make, model, year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    return Cars;
}());
var SUV = /** @class */ (function (_super) {
    __extends(SUV, _super);
    function SUV(make, model, year, offRoadCapability) {
        var _this = _super.call(this, make, model, year) || this;
        _this.offRoadCapability = offRoadCapability;
        return _this;
    }
    SUV.prototype.toggleOffRoad = function () {
        this.offRoadCapability = !this.offRoadCapability;
        console.log("Off-road capability is now ".concat(this.offRoadCapability ? 'enabled' : 'disabled', "."));
    };
    return SUV;
}(Cars));
var objSUV = new SUV("Jeep", "Wrangler", 2020, true);
console.log(objSUV.make, objSUV.model, objSUV.year, objSUV.offRoadCapability);
