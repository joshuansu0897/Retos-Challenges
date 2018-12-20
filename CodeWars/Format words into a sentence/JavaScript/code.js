module.exports = function formatWords(words) {
  if (!words || words.length == 0) {
    return ''
  }

  return words.filter(w => w !== '').join(', ').replace(/, ([^, ]*)$/, ' and $1');
}