/**
 * @param {Promise} promise1
 * @param {Promise} promise2
 * @return {Promise}
 */
var addTwoPromises = async function(promise1, promise2) {
    // promise가 완료(resolve) 될 때까지 대기
    const result1 = await promise1;
    const result2 = await promise2;

    // Promise.all 병렬 처리 가능, 하나라도 실패하면 모두 실패
    // const resolvedPromiseArray = await Promise.all([promise1, promise2]);

    return result1 + result2;
};

/**
 * addTwoPromises(Promise.resolve(2), Promise.resolve(2))
 *   .then(console.log); // 4
 */