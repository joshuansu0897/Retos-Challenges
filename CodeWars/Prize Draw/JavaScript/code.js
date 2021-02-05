module.exports = function rank(st, we, n) {
  if (st === '') {
    return "No participants"
  }

  if (we.length < n) {
    return "Not enough participants"
  }

  let participants = st.split(",").map(name => { return { name } })

  participants = participants
    .map((p, index) => {
      let name = p.name.toUpperCase()

      let letters = name.split('')

      let winningNumber = letters.map(l => l.charCodeAt() - 64).reduce((a, b) => a + b, 0) + letters.length

      winningNumber = winningNumber * we[index]

      p.winningNumber = winningNumber

      return p
    })

  participants = participants.sort((a, b) => {
    if (b.winningNumber === a.winningNumber) {
      return a.name.localeCompare(b.name)
    }
    return b.winningNumber - a.winningNumber
  })

  return participants[n - 1].name
}
