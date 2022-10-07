function miniMaxSum(arr) {
    // Write your code here
let arr1 = [...arr];
arr1.sort((a,b)=>{return a-b});
let max_sum = arr1.reduce((a,b)=>{return a+b}) - arr1[0];
let min_sum = arr1.reduce((a,b)=>{return a+b}) - arr1[arr1.length-1];
return console.log(`${min_sum} ${max_sum}`);
}
miniMaxSum([1,2,3,4,5]);