/**
 * @param {Function} fn
 * @param {Array} args
 * @param {number} t
 * @return {Function}
 */
var cancellable = function(fn, args, t) {

    // 캔슬 여부를 판단할 변수(플래그)
    let cancelled = false;

    // 인터벌 ID를 저장할 변수
    let intervalId;

    // 캔슬을 true로 설정
    const cancelFn = () => {
        cancelled = true;
        clearInterval(intervalId);
    };

    // 초기 실행
    fn(...args);

    // 함수 인터벌 실행
    intervalId = setInterval(() => {
        if (!cancelled) {
            fn(...args);
        }
    }, t);

    // cancelFn() 함수 실행
    return cancelFn;
};

/**
 *  const result = [];
 *
 *  const fn = (x) => x * 2;
 *  const args = [4], t = 35, cancelTimeMs = 190;
 *
 *  const start = performance.now();
 *
 *  const log = (...argsArr) => {
 *      const diff = Math.floor(performance.now() - start);
 *      result.push({"time": diff, "returned": fn(...argsArr)});
 *  }
 *       
 *  const cancel = cancellable(log, args, t);
 *
 *  setTimeout(cancel, cancelTimeMs);
 *   
 *  setTimeout(() => {
 *      console.log(result); // [
 *                           //     {"time":0,"returned":8},
 *                           //     {"time":35,"returned":8},
 *                           //     {"time":70,"returned":8},
 *                           //     {"time":105,"returned":8},
 *                           //     {"time":140,"returned":8},
 *                           //     {"time":175,"returned":8}
 *                           // ]
 *  }, cancelTimeMs + t + 15)    
 */