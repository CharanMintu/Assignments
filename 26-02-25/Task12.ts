class vehicle {
    name: string;
    price: number;
    constructor(name: string, price: number) {
        this.name = name;
        this.price = price;
    }
}
class Carex extends vehicle {
    engine: string;
    model: number;
    constructor(engine: string, model: number, name: string, price: number) {
        super(name, price);
        this.engine = engine;
        this.model = model;
    }
}
class SportsCar extends Carex {
    speed: number;
    constructor(engine: string, model: number, name: string, price: number, speed: number) {
        super(engine, model, name, price);
        this.speed = speed;
    }
}
let ojjectcar = new SportsCar("BMW-650", 2020, "BMW", 1000000, 200);
console.log(ojjectcar.engine, ojjectcar.model, ojjectcar.name, ojjectcar.price, ojjectcar.speed);