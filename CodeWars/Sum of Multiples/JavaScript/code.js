module.exports = function sumMul(n, m) {
    if (m <= 0) {
        return "INVALID"
    }

    let acum = 0;
    for (let i = 1; i * n < m; i++) {
        acum += (i * n)
    }
    return acum
}