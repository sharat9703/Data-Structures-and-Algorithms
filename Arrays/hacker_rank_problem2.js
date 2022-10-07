/*
given an array >>
write the propotion of positive negative and 0

*/

let proportion=(arr)=>{
let arr1 = [...arr];
let total = arr1.length;
let positive=0;
let negative=0;
let zero=0;
arr1.map(item=>{
if(item>0){
positive++;
}else if(item<0){
    negative++;
}else{
    zero++;
}
});
positive= (positive/total).toFixed(6);
negative=(negative/total).toFixed(6);
zero=(zero/total).toFixed(6);
    return `${positive}\n${negative}\n${zero}`;
}

console.log(proportion([1,1,0,-1,-1]));