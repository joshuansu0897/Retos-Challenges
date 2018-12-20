module.exports = function product(values) {
  if (!values || values.length === 0) {
    return null
  }
  
  return values.reduce((n, total) => total = n * total)
}