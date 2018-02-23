module.exports = function myFirstInterpreter(code) {
  let charsOfWord = code.split("")
  let str = '';  
  let asciCode = 0;

  charsOfWord.forEach(char => {
    if(char == '+'){
      if(asciCode == 255 ){
        asciCode = 0
      }else{
        asciCode++
      }
    }else if(char == '.'){
      str += String.fromCharCode(asciCode)
    }
  });

  return str;
}