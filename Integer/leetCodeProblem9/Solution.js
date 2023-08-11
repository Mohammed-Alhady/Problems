/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    let holder = 0, temp = x;

    if (x < 0) {
        return false;
    }

    if (x == 0 ) {
        return true;
    }

    while (x > 0) {
        let mod = x % 10;
        holder = holder * 10 + mod;
        x = ~~ (x / 10);
    }
    
    return holder == temp ? true: false ;
};