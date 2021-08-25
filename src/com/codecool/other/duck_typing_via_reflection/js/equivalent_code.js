// ECMA-2015

class Duck {
    constructor() {
    }

    walk() {
        console.log("Lipa-lipa lipa-lipa");
    }

    quack() {
        console.log("Mac mac mac!");
    }
}


// the quack doctor ain't got no time for (empty) constructor declaration
class QuackDoctor {
    walk() {
        console.log("I got the moves like Jagger!");
    }

    quack() {
        console.log("Here, friend, try this tonic beverage to cure your ailments. I call it Coke!");
    }
}

class Truck {
    constructor(speedInMPH, cargoCapacityInTonnes) {
        this.speedInMPH = speedInMPH;
        this.cargoCapacityInTonnes = cargoCapacityInTonnes;
    }
}

function isADuck(obj) {

    // note that merely returning "undefined" for 'obj.walk' when 'walk' is a non-existing method
    // or "function" for (typeof obj.walk) when 'walk' is a method and not a field
    // is a non-trivial task in strongly-typed languages
    // in JS, however, it is par for the course

    let walksLikeADuck = (typeof obj.walk === "function");
    let quacksLikeADuck = (typeof obj.quack === "function");
    return walksLikeADuck && quacksLikeADuck;
}

let theDuck = new Duck();
let mountebank = new QuackDoctor();
let bigHorn = new Truck(65, 15.88);

console.log(theDuck.constructor.name + " is a duck: " + isADuck(theDuck));
console.log(mountebank.constructor.name + " is a duck: " + isADuck(mountebank));
console.log(bigHorn.constructor.name + " is a duck: " + isADuck(bigHorn));
