const DELIMITER = '@@@'

module.exports = function changeCase(identifier, targetCase) {

    let camelAndSnake = identifier.match(/[A-Z]/) && identifier.includes('_')
    let snakeAndKebab = identifier.includes('_') && identifier.includes('-')
    let kebanAndCamel = identifier.includes('-') && identifier.match(/[A-Z]/)

    if (camelAndSnake || snakeAndKebab || kebanAndCamel) {
        return undefined;
    }

    switch (targetCase) {
        case 'snake':
            return snake(identifier);
        case 'camel':
            return camel(identifier);
        case 'kebab':
            return kebab(identifier);
        default:
            return undefined;
    }
}

function snake(str){
    let result
    if (str.match(/[A-Z]/)) {
        result = getFromCamelCase(str).split(DELIMITER).map(s => s.toLowerCase()).join('_')
    } else {
        result = getFromKebab(str).map(s => s.toLowerCase()).join('_')
    }

    result = result.charAt(0) == '_' ? result.substr(1) : result
    return result
}

function camel(str){
    let result
    if (str.includes('_')) {
        result = getFromSnake(str).map(s => capitalize(s)).join('')
    } else {
        result = getFromKebab(str).map(s => capitalize(s)).join('')
    }

    result = result.charAt(0).toLowerCase() + result.substr(1)
    return result
}

function kebab(str) {
    let result
    if (str.match(/[A-Z]/)) {
        result = getFromCamelCase(str).split(DELIMITER).map(s => s.toLowerCase()).join('-')
    } else {
        result = getFromSnake(str).map(s => s.toLowerCase()).join('-')
    }

    result = result.charAt(0) == '-' ? result.substr(1) : result
    return result
}

function getFromCamelCase(str) {
    str = str.replace(/[0-9]/g, '')
    let arr = str.split('')

    let arreglo = ''
    arr.forEach(ar => {
        if (ar.match(/[A-Z]/)) {
            arreglo += DELIMITER + ar
        } else {
            arreglo += ar
        }
    });

    return arreglo
}

function getFromKebab(str) {
    return str.split('-')
}

function getFromSnake(str) {
    return str.split('_')
}

function capitalize(str){
    return str.replace(/\b\w/g, l => l.toUpperCase())
}