class Cars {
    make: string;
    model: string;
    year: number;

    constructor(make: string, model: string, year: number) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

class SUV extends Cars {
    offRoadCapability: boolean;

    constructor(make: string, model: string, year: number, offRoadCapability: boolean) {
        super(make, model, year);
        this.offRoadCapability = offRoadCapability;
    }

    toggleOffRoad() {
        this.offRoadCapability = !this.offRoadCapability;
        console.log(`Off-road capability is now ${this.offRoadCapability ? 'enabled' : 'disabled'}.`);
    }
}
let objSUV = new SUV("Jeep", "Wrangler", 2020, true);
console.log(objSUV.make, objSUV.model, objSUV.year, objSUV.offRoadCapability);