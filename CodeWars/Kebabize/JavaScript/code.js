const DELIMITER = '@@@'

module.exports = function kebabize(str) {
    str = str.replace( /[0-9]/g, '')
    let arr = str.split('')

    let arreglo = ''
    arr.forEach(ar => {
        if (ar.match(/[A-Z]/)) {
            arreglo += DELIMITER + ar
        } else {
            arreglo += ar
        }
    });

    let result = arreglo.split(DELIMITER).map(s => s.toLowerCase()).join('-')
    return result.charAt(0) == '-' ? result.substr(1) : result
}