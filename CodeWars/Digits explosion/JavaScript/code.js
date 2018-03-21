module.exports = function explode(s) {
    let values = s.split('')

    let result = ''
    values.forEach(e => {
        for (let i = 0; i < Number.parseInt(e); i++) {
            result += e
        }
    });

    return result
}