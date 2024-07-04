// first.js

// A basic JavaScript program that prints "Hello, World!" to the console
console.log("Hello, World!");

let x = 5;
let y = 10;
let z = x + y;
console.log(z);

// Function to count the occurrences of each letter in a string
function countAllOccurrences(str) {
    let counts = {};
    for (let i = 0; i < str.length; i++) {
        let letter = str[i];
        if (counts[letter]) {
            counts[letter]++;
        } else {
            counts[letter] = 1;
        }
    }
    return counts;
}

// Example usage
let exampleString = "Hello, World!";
let allOccurrences = countAllOccurrences(exampleString);
console.log(`Occurrences of each letter in the string "${exampleString}":`, allOccurrences);


console.table(allOccurrences);


function myfunc(str){
    let count={};
    for(let i=0;i<str.length;i++){
        let letter=str[i];
        if(count[letter]){
            count[letter]++;
        }
        else{
            count[letter]=1;
        }
    }
    return count;
}
let all= myfunc("Hello");
console.table(all);

function palindrome(str){
    let reversed=str.split('').reverse().join('');
    return str===reversed;
}   
console.log(palindrome("madam"));
