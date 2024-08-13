/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) 
{
    let res = init;
    for(let i =0;i < nums.length;i++)
    {
        res = fn(res,nums[i])
    }
    return res
};

var reduce = function(nums ,fn ,init)
{
    let res = init;
    nums.forEach(x => (res = fn(res,x)));
    return res;
};

var reduce = function(nums ,fn, init)
{
    let ans = init;
    for( let i of nums)
    ans =fn(ans,i);
    return ans;
};