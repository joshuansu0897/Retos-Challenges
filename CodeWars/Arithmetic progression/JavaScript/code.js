module.exports = function arithmeticSequenceElements(a, r, n) {
    let res = []
    for (let i = 0; i < n; i++) {
        res.push(a)
        a += r
    }
    return res.join(', ')
}