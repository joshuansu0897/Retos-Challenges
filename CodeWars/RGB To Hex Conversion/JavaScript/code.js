module.exports = function rgb(r, g, b) {
    return (operation(r) + operation(g) + operation(b)).toUpperCase()
}

function operation(number) {
    
    if(number < 0){
        return "00"
    } else if (number > 255){
        return "FF"
    }

    let numberHex = number.toString(16)
    return numberHex.length == 1 ? "0" + numberHex : numberHex
}