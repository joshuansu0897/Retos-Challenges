module.exports = function bingo(ticket, win) {
  let count = 0

  ticket.forEach(subArray => {
    const str = subArray[0]
    for (let i = 0; i < str.length; i++) {
      if (str.charCodeAt(i) == subArray[1]) {
        count++;
        break;
      }
    }
  });

  return count >= win ? 'Winner!' : 'Loser!'
}