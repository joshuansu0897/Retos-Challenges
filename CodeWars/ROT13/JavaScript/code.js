module.exports = function rot13(str) {
  return str.split('').map(charToRot10).join('')
}

function charToRot10(c) {
  const asciiCode = c.charCodeAt()

  if (asciiCode >= 65 && asciiCode <= 77) {
    return String.fromCharCode(asciiCode + 13)
  }

  if (asciiCode >= 78 && asciiCode <= 90) {
    return String.fromCharCode(asciiCode - 13)
  }

  if (asciiCode >= 97 && asciiCode <= 109) {
    return String.fromCharCode(asciiCode + 13)
  }

  if (asciiCode >= 110 && asciiCode <= 122) {
    return String.fromCharCode(asciiCode - 13)
  }

  return String.fromCharCode(asciiCode)
}