const myFunc = require('./code')


console.log(myFunc("COLIN,AMANDBA,AMANDAB,CAROL,PauL,JOSEPH", [1, 4, 4, 5, 2, 1], 4), "PauL")

console.log(myFunc("Addison,Jayden,Sofia,Michael,Andrew,Lily,Benjamin", [4, 2, 1, 4, 3, 1, 2], 4), "Benjamin")
console.log(myFunc("Lagon,Lily", [1, 5], 2), "Lagon")
console.log(myFunc("Addison,Jayden,Sofia,Michael,Andrew,Lily,Benjamin", [4, 2, 1, 4, 3, 1, 2], 8), "Not enough participants")
console.log(myFunc("", [4, 2, 1, 4, 3, 1, 2], 6), "No participants")

console.log(myFunc("Daniel,Olivia,Aiden,Liam,Grace,Olivai,Ethan,Matthew,Sofia,Sophia,Noah,Chloe,Samantha,Benjamin,Lily,Joshua,Elijah,Isabella,Emma,Mia,Willaim,Ava,Elizabeth,Aubrey,Logan,Ella,Mason,Emily", [1, 1, 3, 4, 4, 1, 6, 5, 6, 3, 5, 5, 4, 1, 3, 6, 4, 6, 4, 4, 2, 2, 2, 6, 4, 6, 1, 2], 25), "Olivia")

console.log(myFunc("James,Sophia,Madison,Jacob,Willaim,Daniel,Aiden,Logan,Naoh,Michael,Andrew,Olivia,Alexander,Robert,Ella,Joshua,Samantha,Avery,Benjamin", [5, 5, 5, 3, 1, 1, 6, 3, 6, 2, 1, 4, 2, 2, 1, 2, 3, 3, 1], 7), "Aiden")
