module.exports = function wave(str) {
  str = str.toLowerCase()

  let arr = []
  for (let i = 0; i < str.length; i++) {
    
    if(str[i] === ' '){
      continue
    }
    
    const letter = str[i].toUpperCase();
    let word = str.substring(0, i) + letter + str.substring(i + 1)
    arr.push(word)
  }

  return arr
}