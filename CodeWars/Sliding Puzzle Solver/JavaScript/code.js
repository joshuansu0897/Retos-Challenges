// Invalid solution type 
module.exports = function slidePuzzle(arr){
    const n = arr.length
    const max = (Math.pow(n,2) - 1)

    let array = []
    let contador = 1
    for (let i = 0; i < n; i++) {
      let ar = []
      for (let j = 0; j < n; j++) {
        if (max < contador){
          ar.push(0)
          continue
        }
        ar.push(contador++)
      }
      array.push(ar)
    }

    return array
}