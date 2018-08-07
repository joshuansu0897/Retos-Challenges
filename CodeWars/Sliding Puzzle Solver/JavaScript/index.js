const myFunc = require('./code')

let puzzle1 = [
  [4, 1, 3],
  [2, 8, 0],
  [7, 6, 5]
];

let puzzle2 = [
  [10, 3, 6, 4],
  [1, 5, 8, 0],
  [2, 13, 7, 15],
  [14, 9, 12, 11]
];

let puzzle3 = [
  [3, 7, 14, 15, 10],
  [1, 0, 5, 9, 4],
  [16, 2, 11, 12, 8],
  [17, 6, 13, 18, 20],
  [21, 22, 23, 19, 24]
];

console.log(myFunc(puzzle1))
console.log(myFunc(puzzle2))
console.log(myFunc(puzzle3))