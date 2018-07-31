module.exports = function workNeeded(projectMinutes, freelancers) {

  let tot = 0
  freelancers.forEach(time => {
    tot += time[0] * 60
    tot += time[1]
  });

  let result = projectMinutes - tot

  return result <= 0 ? "Easy Money!" : `I need to work ${Math.trunc(result/60)} hour(s) and ${result%60} minute(s)`
}