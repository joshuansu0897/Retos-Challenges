module.exports = function spinWords(str) {
    let words = str.split(" ")
    let output = '';

    words.forEach(word => {
        if(word.length >= 5){
            output += word.split('').reverse().join('') + ' '
        }else{
            output += word + ' '
        }
    });
    
    return output.trim();
}