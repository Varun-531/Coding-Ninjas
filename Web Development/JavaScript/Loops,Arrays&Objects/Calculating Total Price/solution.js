// Complete the calculatePrice function
// Do not alter the starter code.

const goods = {
    apple: { price: 150, quantity: 2 },
    banana: { price: 75, quantity: 3 },
    orange: { price: 125, quantity: 1 }
};

function calculatePrice(goods) {
    // Implement your function here
    let sum = 0;

    for (const item in goods) {
        if (Object.hasOwnProperty.call(goods, item)) {
            const { price, quantity } = goods[item];
            sum += price * quantity;
        }
    }

    return sum;
}

console.log(calculatePrice(goods));
// Output: 650
