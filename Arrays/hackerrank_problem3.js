/*
print a staircase, for eg: if n=4   ====>>>>
    #
   ##
  ###
 ####         
*/

let pattern=(n)=>{
 let s="";

 for(let i=1;i<=n;i++){
      
      for(let k=0;k<n-i;k++){
       s+= " ";
      }
      for(let j=n-i;j<n;j++){
        s+="#";
      }
    s+=`\n`;
    }   
   return s;

}

console.log(pattern(4));

/*
#

##

###

####

#####

######
*/