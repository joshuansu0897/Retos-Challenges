const myFunc = require('./code')

console.log(myFunc('rkqodlw', 'world'), true);
console.log(myFunc('cedewaraaossoqqyt', 'codewars'), true);
console.log(myFunc('katas', 'steak'), false);
console.log(myFunc('scriptjava', 'javascript'), true);
console.log(myFunc('scriptingjava', 'javascript'), true);
console.log(myFunc('scriptsjava', 'javascripts'), true);
console.log(myFunc('jscripts', 'javascript'), false);
console.log(myFunc('aabbcamaomsccdd', 'commas'), true);
console.log(myFunc('scriptjavx', 'javascript'), false);
