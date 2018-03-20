module.exports = function count(string) {
    let obj = {}
    let arr = string.split("")

    arr.forEach(e => {
        obj[e] = (obj[e] == undefined ? 1 : obj[e]+1)
    });

    return obj;
}