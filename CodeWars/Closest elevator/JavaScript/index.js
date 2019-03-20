const myFunc = require('./code')

console.log(myFunc(0, 1, 0), 'left');
console.log(myFunc(0, 1, 1), 'right');
console.log(myFunc(0, 1, 2), 'right');
console.log(myFunc(0, 0, 0), 'right');
console.log(myFunc(0, 2, 1), 'right');
