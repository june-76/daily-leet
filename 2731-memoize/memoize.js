/**
 * @param {Function} fn
 * @return {Function}
 */
function memoize(fn) {
    
    // let memory = new Map();
    const memory = new Map();

    // callCount?

    return function(...args) {
        const key = JSON.stringify(args);

        if (memory.has(key)) {
            return memory.get(key);
        }

        const result = fn(...args);
        memory.set(key, result);

        return result;
    }
}


/** 
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1 
 */