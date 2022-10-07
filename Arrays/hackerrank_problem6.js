/*
convert normal timing 'hh:mm:ssAM' or 'hh:mm:ssPM' into 24 hour clock
*/

let time24=(s)=>{
let str =s;
let regex = /PM/ig;
let bool= regex.test(str);
let arr = str.split(":");
let ans=""
if(bool){
    if(Number(arr[0])<12){
        arr[0]=12+Number(arr[0]);
    }
ans = arr.join(":").replace(/PM/ig,"");
}
else{
    if(Number(arr[0])==12){
        arr[0]="00";
    }
    ans = arr.join(":").replace(/AM/ig,"");
}
return console.log(ans);
}

time24('12:40:22AM');