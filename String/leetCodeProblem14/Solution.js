/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
    let prefix = strs[0];

    strs.forEach(ele => {
        while(ele.indexOf(prefix) !== 0) {
            prefix = prefix.substring(0, prefix.length - 1);
        }
    })

    return prefix;
};