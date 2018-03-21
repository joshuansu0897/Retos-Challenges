const myFunc = require('./code')

let str = 'snakeCase'
let cas = 'snake'
console.log(myFunc(str, cas)) // snake_case

str = 'some-lisp-name'
cas = 'camel'
console.log(myFunc(str, cas)) // someLispName

str = 'map_to_all'
cas = 'kebab'
console.log(myFunc(str, cas)) // map-to-all

str = 'doHTMLRequest'
cas = 'kebab'
console.log(myFunc(str, cas)) // do-h-t-m-l-request

str = 'invalid-inPut_bad'
cas = 'kebab'
console.log(myFunc(str, cas)) // undefined

str = 'valid-input'
cas = 'huh???'
console.log(myFunc(str, cas)) // undefined