module.exports = function planeSeat(a) {
  const number = a.match(/\d+/)[0]
  const letter = a.replace(/\d+/, '')

  if (number > 60 || letter.match(/[i-j]/i)) {
    return 'No Seat!!'
  }

  let directionNumber = ''
  if (number >= 1 && number <= 20) {
    directionNumber = 'Front'
  } else if (number >= 21 && number <= 40) {
    directionNumber = 'Middle'
  } else if (number >= 41) {
    directionNumber = 'Back'
  }

  let directionLetter = ''
  if (letter.match(/[a-c]/i)) {
    directionLetter = 'Left'
  } else if (letter.match(/[d-f]/i)) {
    directionLetter = 'Middle'
  } else if (letter.match(/[g-k]/i)) {
    directionLetter = 'Right'
  }

  return `${directionNumber}-${directionLetter}`
}
