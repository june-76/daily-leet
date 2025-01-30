/**
 * @param {Array} arr
 * @param {number} depth
 * @return {Array}
 */
var flat = function (arr, n, depth = 0) {
    let result = [];

    for (let e of arr) {
        if (Array.isArray(e) && depth < n) {
            result.push(...flat(e, n, depth + 1));
        } else {
            result.push(e);
        }
    }

    return result;
};