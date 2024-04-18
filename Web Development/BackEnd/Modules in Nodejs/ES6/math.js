// math.js
// math.js - an ES6 module for performing calculations on a set of numbers

export function sum(nums) {
  return nums.reduce((total, num) => total + num, 0);
}

export function mean(nums) {
  return sum(nums) / nums.length;
}
