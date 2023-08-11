/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function(s) {
    const m = new Map();
    
    m.set('I', 1);
    m.set('V', 5);
    m.set('X', 10);
    m.set('L', 50);
    m.set('C', 100);
    m.set('D', 500);
    m.set('M', 1000);

    let sum = 0; 

    for (let i = 0; i < s.length; i++) {
        if (i < s.length - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
            sum -= m.get(s.charAt(i));
        } else {
            sum += m.get(s.charAt(i));
        }
    }
    return sum;
}