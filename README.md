# Functions


1.Hashtable won't allow null keys or values.  HashMap allows one null key and any number of null values. Hashtable is synchronized, and HashMap is not which HashTables better for multi-threaded applications. HashMaps are faster than Hashtables.
2. You should override them so the class can behave properly since the hash based collections are organized in a sequence where same hashcodes determines where the object is allocated and where to find them. 
3. They allow classes to defer instatiation to subclasses. Factory design patterns require a new operation instead of a new class.
4. Java garbage collections is how java performs auto memory management. It finds  unused object and remove them to free space in memory. Objects are created on the heap, which is a portion of memory dedicated to the application. When those objects will no longer be needed, the garbage collector finds these unused objects and deletes them. 
5. Same as #1 
6. Sparse arrays are arrays of data in which multiple values equals zero. They are in contrast to Dense Arrays which are arrays with many numerical values greater than 0. 
7. List is an interface and ArrayList is a class. 	List is used to create a list of objects which are associated with their index numbers.	ArrayList is used to create a dynamic array that contains objects.
  List<String> myList = new List<>();   //will require overloaded methods 
  List<String> myList = new ArrayList<>();   //won't require those methods in the List interface.
  
8. Comparator is an external type that uses multiple classes white comparables only have one chance to use the compare to objects. Comparables in objects compares itself with another object. 
