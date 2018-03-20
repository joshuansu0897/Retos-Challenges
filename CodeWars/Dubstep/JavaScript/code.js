module.exports = function songDecoder(song) {
    return song.split(/WUB/g).filter(e => e != "").join(" ")
}