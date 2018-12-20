exports.matrixAddition = (a, b) => {
  let response = []

  for (let i = 0; i < a.length; i++) {
    response.push(rowSum(a[i], b[i]))
  }

  return response
}

function rowSum(r1, r2) {
  let response = []

  for (let i = 0; i < r1.length; i++) {
    response.push(r1[i] + r2[i])
  }

  return response
}

exports.matrixAddition2 = (a, b) => {
  return a.map((row, positionI) => {
    return row.map((num, positionJ) => {
      return num + b[positionI][positionJ]
    })
  })
}