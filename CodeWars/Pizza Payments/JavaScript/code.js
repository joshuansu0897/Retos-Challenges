module.exports = function michaelPays(costs) {
  if (costs < 5) {
    return Math.round(costs * 100) / 100
  }

  let result = costs / 3
  if (result > 10) {
    return Math.round((costs - 10) * 100) / 100;
  }

  return Math.round((costs - result) * 100) / 100;
}