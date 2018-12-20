const myFunc = require('./code').array_diff
const myFunc2 = require('./code').array_diff2

console.log(myFunc([], [4, 5]), []);
console.log(myFunc([3, 4], [3]), [4]);
console.log(myFunc([1, 8, 2], []), [1, 8, 2]);

console.log(myFunc2([], [4, 5]), []);
console.log(myFunc2([3, 4], [3]), [4]);
console.log(myFunc2([1, 8, 2], []), [1, 8, 2]);
