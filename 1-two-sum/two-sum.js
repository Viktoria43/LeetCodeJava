var twoSum = function(nums, target) {
    let out = [];
    for (let i =0;i<nums.length;i++){
        for (let j=i+1;j<nums.length;j++){
            if (nums[i]+nums[j] === target){
                out[0]=i;
                out[1]=j
                return out;
            }
        }
    }
};

console.log(twoSum([2,7,11,15],9))