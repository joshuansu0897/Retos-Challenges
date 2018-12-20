const myFunc = require('./code')

let content = 'hola'

console.log(myFunc(content), content)

content = myFunc(content)

console.log(myFunc(content), content)
