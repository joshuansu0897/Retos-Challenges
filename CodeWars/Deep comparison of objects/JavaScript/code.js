module.exports = function deepCompare(o1, o2) {
  if (o1 === undefined && o2 === null) {
    return false
  }

  if (o2 === undefined && o1 === null) {
    return false
  }

  for (let key in o1) {

    if (!o2.hasOwnProperty(key)) {
      return false
    }

    const value1 = o1[key]
    const value2 = o2[key]

    if (value1 instanceof Object) {
      if (!deepCompare(value1, value2)) {
        return false
      }
    } else if (value1 !== value2) {
      return false
    }

    delete o1[key]
    delete o2[key]
  }

  for (let key in o2) {
    if (!o1.hasOwnProperty(key)) {
      return false
    }
  }

  return true
}