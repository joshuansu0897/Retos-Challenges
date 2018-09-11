module.exports = function parse(data) {
  let arrResult = []

  let num = 0
  for (let i = 0; i < data.length; i++) {
    switch (data[i]) {
      case 'i':
        num++
        break
      case 'd':
        num--
        break
      case 's':
        num = Math.pow(num, 2)
        break
      case 'o':
        arrResult.push(num)
        break
      default:
        break
    }
  }

  return arrResult
}