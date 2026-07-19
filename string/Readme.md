**String**

String are the immutable (can not chnaged ) ,

string literals are stored in the string pool,

**String pool** -  it does not create  the dublicate for any object 

string sb="java"    --> it will bw stored in the string pool 

String sb= new String("Java");  --> it will be stored in the  heap  because we have use the  **new** keyword here 

use the string builder for the repeated modification ,espiacilly inside the loop 

string create a new object every time  inside the loop 

MEATHODS
-------------------------------------

intern()- return the poole string  refernce 

substring()- return  a string not  string builder.

length()- number of  cchareter currently stored , 

capacity()- total no of charecter that can  be stored  befor the java  need to allocate a larger intend array

String builder - default have 16 capacity

  **[new capacity = (old capacity *2)+2]** => roughly double the size of the stringbuilder

** when u pass  a string to a counstructor , the initial capacity is **[16+(length of the string )]**

KEYWORDS
--------------------------------
[count , find, check, search, verify, print] = traversal

[reverse , swap, palindrone, compare ends, sorted array,  pair, move, remove dublicate] = two pointer

[ Longest,sortest,maximum,minimum, substring, subarray , window, continous] = Sliding window

[frequency, dublicate, count ouccurance, lookup,store,mapping] = Hashmap
