exports.array_diff = (a, b) => {

  let response = []
  a.forEach(element => {
    if (!b.includes(element)) {
      response.push(element)
    }
  })

  return response
}

exports.array_diff2 = (a, b) => {
  return a.filter(element => !b.includes(element))
}