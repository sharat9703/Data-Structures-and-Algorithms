/* 
gien an array>> print the frequency of the highest element

**/

let highestFreq=(arr)=>{
let freq=0;
let ar = [...arr];
ar.sort((a,b)=>{return a-b});
let highest = ar[ar.length-1];

ar.map(item=>{
    if(item==highest){
        freq++;
    }
});

    return console.log(freq);
}

highestFreq([4,4,1,4,3,3]);