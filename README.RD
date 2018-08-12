WE CAN CREATE STREAM IN THE FOLLOWING WAYS.

1. Create Streams from value 
   |  Stream<String> stream  = Stream.of("java2s.com"); 
   |  Stream<String> stream  = Stream.of("XML", "Java",  "CSS", "SQL");

2.Create Streams from Empty streams
   | Stream<String> stream  = Stream.empty();
   
3.Create Streams from functions
   |  Stream<Long> tenNaturalNumbers = Stream.iterate(1L, n  ->  n  + 1).limit(10);
   
4.Create Streams from arrays
	|	String[] names = { "XML", "Java", "SQL", "CSS" };
    |	Stream<String> stream = Stream.of(names);
    
    
5.Create Streams from collections
	|	Set<String> names = new HashSet<>(); 
   		 names.add("XML");
    	 names.add("Java");
       Stream<String> sequentialStream  = names.stream();
       
       
6.Create Streams from files

7.Create Streams from other sources

