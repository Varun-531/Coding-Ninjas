const { sum, mean } = require("./math.js");

const Solution = () => {
    const nums = [1, 2, 3, 4, 5];
    const totalSum = sum(nums);
    const average = mean(nums);
    
    console.log("Sum:", totalSum);
    console.log("Mean:", average);
};
Solution();
module.exports = Solution;
