const myFunc = require('./code')

var data = [
  { name: 'Joe', age: 20 },
  { name: 'Bill', age: 30 },
  { name: 'Kate', age: 23 }
]

console.log(myFunc(data), ['Joe', 'Bill', 'Kate'])