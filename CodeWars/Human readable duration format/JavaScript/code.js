module.exports = function formatDuration(seconds) {

    if (seconds == 0) {
        return "now"
    } 

    let year = 0
    let day = 0
    let hrs = 0
    let min = 0  

    year = Math.floor(seconds / 31536000)
    seconds = Math.floor(seconds % 31536000)

    day = Math.floor(seconds / 86400)
    seconds = Math.floor(seconds % 86400)

    hrs = Math.floor(seconds / 3600)
    seconds = Math.floor(seconds % 3600)

    min = Math.floor(seconds / 60)
    seconds = Math.floor(seconds % 60)

    let output = ''

    if (year > 0) {
        output += year == 1 ? year + " year" : year + " years"
    }

    if (year > 0 && day > 0) {
        output += ", "
        output += day == 1 ? day + " day" : day + " days"
    } else if (day > 0) {
        output += day == 1 ? day + " day" : day + " days"
    }

    if (day > 0 && hrs > 0) {
        output += ", "
        output += hrs == 1 ? hrs + " hour" : hrs + " hours"
    } else if (hrs > 0) {
        output += hrs == 1 ? hrs + " hour" : hrs + " hours"
    }

    if (hrs > 0 && min > 0) {
        output += ", "
        output += min == 1 ? min + " minute" : min + " minutes"
    } else if (min > 0) {
        output += min == 1 ? min + " minute" : min + " minutes"
    }

    if (min > 0 && seconds > 0) {
        output += ", "
        output += seconds == 1 ? seconds + " second" : seconds + " seconds"
    } else if (seconds > 0) {
        output += seconds == 1 ? seconds + " second" : seconds + " seconds"
    }

    return output.replace(/,([^,]*)$/, ' and$1')

}
