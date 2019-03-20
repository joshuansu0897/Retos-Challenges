module.exports = function elevator(left, right, call) {
  if (left === right) {
    return 'right';
  }

  if (Math.abs(left - call) < Math.abs(right - call)) {
    return 'left';
  }

  return 'right';
}