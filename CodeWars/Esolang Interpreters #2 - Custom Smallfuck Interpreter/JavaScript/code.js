module.exports = function interpreter(code, tape) {
    let cod = code.split('')
    let tap = tape.split('')

    let posTab = 0

    for (let i = 0; i < cod.length; i++) {

        if (posTab < 0 || posTab == tap.length) {
            return tap.join("")
        }

        switch (cod[i]) {
            case '>':
                posTab++
                break;
            case '<':
                posTab--
                break;
            case '*':
                tap[posTab] = tap[posTab] == '0' ? '1' : '0'
                break;
            case '[':
                if (tap[posTab] == '0') {
                    while (cod[i] != ']') {
                        i--
                    }
                }
                break;
            case ']':
                if (tap[posTab] != '0') {
                    while (cod[i] != '[') {
                        i++
                    }
                }
                break;
        }
    }

    return tap.join("")
}