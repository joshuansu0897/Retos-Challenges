const myFunc = require('./code')

console.log(myFunc([66, 101], 66))// true
console.log(myFunc([80, 117, 115, 104, 45, 85, 112, 115], 45))// true
console.log(myFunc(['t', 'e', 's', 't'], 'e'))// true
console.log(myFunc(['what', 'a', 'great', 'kata'], 'kat'))// false
