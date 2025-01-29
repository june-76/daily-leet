/**
 * @param {Array} arr1
 * @param {Array} arr2
 * @return {Array}
 */
var join = function(arr1, arr2) {
    // 배열을 합치되, 키가 같을 경우 덮어 쓴다.
    const result = new Map();

    for (let obj of arr1) {
        result.set(obj.id, obj);
    }

    for (let obj of arr2) {
        if (result.has(obj.id)) {
            result.set(obj.id, { ...result.get(obj.id), ...obj });
        } else {
            result.set(obj.id, obj);
        }
    }

    // return Array.from(result.values()).sort((arr1, arr2) => arr1.id - arr2.id);
    return Array.from(result.values()).sort((a, b) => a.id - b.id);
};