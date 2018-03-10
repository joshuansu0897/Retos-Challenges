module.exports = function evenBinary(n) {

    const IDENTIFIER = "XXX"

    let numbers = n.split(" ")

    let evenNumbers = []

    for (let i = 0; i < numbers.length; i++) {
        let number = numbers[i]
        if ((parseInt(number, 10) % 2) == 0) {
            numbers[i] = IDENTIFIER
            evenNumbers.push(number)
        }
    }

    evenNumbers.sort((a, b) => a - b)

    evenNumbers.forEach(e => {
        let index = numbers.indexOf(IDENTIFIER)
        numbers[index] = e
    })

    return numbers.join(" ")
}