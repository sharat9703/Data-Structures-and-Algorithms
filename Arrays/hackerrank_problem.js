/*
Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix

is shown below:

1 2 3
4 5 6
9 8 9  

The left-to-right diagonal =
. The right to left diagonal = . Their absolute difference is

.

Function description

Complete the

function in the editor below.

diagonalDifference takes the following parameter:

    int arr[n][m]: an array of integers

Return

    int: the absolute diagonal difference

Input Format

The first line contains a single integer,
, the number of rows and columns in the square matrix .
Each of the next lines describes a row, , and consists of space-separated integers

.

Constraints

Output Format

Return the absolute difference between the sums of the matrix's two diagonals as a single integer.

Sample Input

3
11 2 4
4 5 6
10 8 -12

Sample Output

15

Explanation

The primary diagonal is:

11
   5
     -12

Sum across the primary diagonal: 11 + 5 - 12 = 4

The secondary diagonal is:

     4
   5
10

Sum across the secondary diagonal: 4 + 5 + 10 = 19
Difference: |4 - 19| = 15

Note: |x| is the absolute value of x
*/

/*'use strict';

const fs = require('fs');

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', function(inputStdin) {
    inputString += inputStdin;
});

process.stdin.on('end', function() {
    inputString = inputString.split('\n');

    main();
});

function readLine() {
    return inputString[currentLine++];
}

/*
 * Complete the 'diagonalDifference' function below.
 *[1 2 3 4
   5 6 7 8
   1 4 6 7
   3 5 7 9]
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

function diagonalDifference(arr) {
    // Write your code here

let newArr =[...arr];
let n= Math.sqrt(newArr.length);
let diagonal_left =0;
let diagonal_right=0;
for(let i=0;i<=arr.length;i=i+n+1){
diagonal_left += newArr[i];    
}
for(let j=n-1;j<arr.length-1;j=j+n-1){
 diagonal_right += newArr[j];
}
return Math.abs(diagonal_left - diagonal_right);
}
console.log(diagonalDifference([1,2,3,4,5,6,9,8,9]));