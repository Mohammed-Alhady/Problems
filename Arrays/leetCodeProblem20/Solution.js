/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    var stack = []
    let array = s.split('').join(',');

    array.forEach(ele => {
        if(ele == ')' && !(stack.length === 0) && stack.peek() == '(' ) {
            stack.pop();
        }
        else if(ele == '}' && !stack.isEmpty() && stack.peek() == '{') {
            stack.pop();
        }
        else if(ele == ']' && !stack.isEmpty() && stack.peek() == '[') {
            stack.pop();
        }
        else {
            stack.push(ele);
        }
    });
    return stack.isEmpty();
}