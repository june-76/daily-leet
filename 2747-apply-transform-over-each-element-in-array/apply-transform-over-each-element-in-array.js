/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    const result = new Array();

    for (let i = 0; i < arr.length; i++) {
        const newArray = fn(arr[i], i);
        
        if (newArray === arr[i] + 1) {
            result.push(arr[i] + 1);
        } else if (newArray === arr[i] + i) {
            result.push(arr[i] + i);
        } else {
            result.push(newArray);
        }
    }

    return result;
};