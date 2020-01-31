# Functions


1) findDuplicates method will find a duplicate value in an ArrayList by checking to determine whether a given value is contained within a HashSet and if not adds values into the HashSet. If the value is found in the HashSet will add it to a separate ArrayList named duplicateStr.

2) findPalindrome method will determine whether a string is a palindrome or not by iterating through the first index incrementally and last index decrementally to return a boolean value of true if the String literal is indeed a palindrome.

3) Fizzbuzz will output "Fizz" if a given number is divisible by 3 and "Buzz" if it is divisible by 5 and will print "FizzBuzz" if it is divisble by both 3 and 5.

4) checkAnagrams will check if the String is an anagram by converting 2 given Strings into char arrays, sorting both, and determining whether each match.

5) printTable method will print a multiplication table from 1 to 10 by multiplying each index corresponding in a nested forloop with a runtime of O(n^2).

*****************************************
1. Hashtable won't allow null keys or values.  HashMap allows one null key and any number of null values. Hashtable is synchronized, and HashMap is not which HashTables better for multi-threaded applications. HashMaps are faster than Hashtables.

2. You should override them so the class can behave properly since the hash based collections are organized in a sequence where same hashcodes determines where the object is allocated and where to find them. 

3. They allow classes to defer instatiation to subclasses. Factory design patterns require a new operation instead of a new class.

4. Java garbage collections is how java performs auto memory management. It finds  unused object and remove them to free space in memory. Objects are created on the heap, which is a portion of memory dedicated to the application. When those objects will no longer be needed, the garbage collector finds these unused objects and deletes them. 

5. Same as #1 

6. Sparse arrays are arrays of data in which multiple values equals zero. They are in contrast to Dense Arrays which are arrays with many numerical values greater than 0. 

7. List is an interface and ArrayList is a class. 	List is used to create a list of objects which are associated with their index numbers.	ArrayList is used to create a dynamic array that contains objects.
  List<String> myList = new List<>();   //will require overloaded methods 
  List<String> myList = new ArrayList<>();   //won't require those methods in the List interface.
  
8. Comparator is an external type that uses multiple classes white comparables only have one chance to use the compare to objects. Comparables in objects compares itself with another object. 

