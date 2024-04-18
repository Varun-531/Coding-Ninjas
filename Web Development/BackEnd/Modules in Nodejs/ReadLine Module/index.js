// Import required module
const readline = require("readline");

const Solution = () => {
  // Create readline interface
  const qInterface = readline.createInterface({
    input: process.stdin,
    output: process.stdout
  });

  // Ask user for input
  qInterface.question("Enter the first number: ", (firstNumber) => {
    // Convert input to numeric format
    const num1 = Number(firstNumber);

    // Ask user for second number
    qInterface.question("Enter the second number: ", (secondNumber) => {
      // Convert input to numeric format
      const num2 = Number(secondNumber);

      // Calculate maximum of the two numbers
      const max = Math.max(num1, num2);

      // Log the maximum value to the console
      console.log("The maximum value is:", max);

      // Close the interface
      qInterface.close();
    });
  });
};

Solution();
module.exports = Solution;
