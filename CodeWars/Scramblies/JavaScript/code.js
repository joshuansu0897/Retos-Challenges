module.exports = function scramble(str1, str2) {

  let evaluated = []
  for (let i = 0; i < str2.length; i++) {
    const c = str2[i];

    if (evaluated.includes(c)) {
      continue
    }

    evaluated.push(c)
    const countStr1 = [...str1].filter(l => l === c).length;
    const countStr2 = [...str2].filter(l => l === c).length;

    if (countStr1 < countStr2) {
      return false
    }
  }

  return true
}
