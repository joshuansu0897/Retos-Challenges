const myFunc = require('./code')

console.log(myFunc(['ninja', 'samurai', 'ronin']), "=>", "ninja, samurai and ronin")
console.log(myFunc(['ninja', '', 'ronin']), "=>", "ninja and ronin")
console.log(myFunc([]), "=>", "")
