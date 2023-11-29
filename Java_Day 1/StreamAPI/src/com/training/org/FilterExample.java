package com.training.org;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterExample {
	public static void main(String[] args) throws IOException {
		
		
		////////////////////////////////////////////////////////////////////////
		// sum of array using the stream
		final List<Integer> sumlist = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		// using multiple statements usingg {}
		// final int sumans = sumlist.stream().reduce(0, (value,sum) -> {System.out.println("Sum "+sum+" value "+value); sum += value; return sum;});
        final int sumans = sumlist.stream().reduce(0, (value, sum) -> sum += value);
		System.out.println("Ans: " + sumans);
		
		////////////////////////////////////////////////////////////////////////
		// difference between foreach and foreachorder
		Stream.of("A","B","C")
        .parallel()
        .forEach(x -> System.out.println("forEach: " + x));

		Stream.of("A","B","C")
        .parallel()
        .forEachOrdered(x -> System.out.println("forEachOrdered: " + x));
		
		////////////////////////////////////////////////////////////////////////
		// file handling using the stream 
		 // Creating a File object 
        File fileName = new File("C:\\Users\\vipulp\\Desktop\\Java\\filehandling text files\\myfiles.txt"); 
  
        // Create a Stream of string type 
        // using the lines() method to 
        // read one line at a time from the text file 
        Stream<String> text = Files.lines(fileName.toPath()); 
        
        // Creating parallel streams using parallel() method 
        // using the parallel the lines are getting printed ramdomly
        text.parallel().forEach(System.out::println);
        
        // later using forEach() to print on console 
        // without using parallel the same fromate that we have writen in the text file
         text.forEach(System.out::println); 
        
        // Closing the Stream 
        // using close() method 
        text.close(); 

		
		////////////////////////////////////////////////////////////////////////
		// normal for each loop
		final List<Integer> forlist = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

		for (Integer val : forlist) {
			System.out.println(val);
		}
		System.out.println("//////////////");
		
		////////////////////////////////////////////////////////////////////////
		// for each loop usimng the stream
		final List<Integer> foreachlist = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

		foreachlist.stream().forEach(System.out::println);
		
		////////////////////////////////////////////////////////////////////////
		// skip the element
		final List<Integer> skiplist = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        final List<Integer> skipans = skiplist.stream()
                .skip(2)
                .collect(Collectors.toList());

        System.out.println("Skipped List: " + Arrays.toString(skipans.toArray()));
        
        ////////////////////////////////////////////////////////////////////////
        // limit 
        final List<Integer> limitlist = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        final List<Integer> limitans = limitlist.stream()
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("Limited List: " + Arrays.toString(limitans.toArray()));
		
		////////////////////////////////////////////////////////////////////////
		// find the even number from the list and multiple it by 10
		final List<Integer> peeklist = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        final List<Integer> peekans = peeklist.stream()
                .filter(value -> value % 2 == 0)
                .peek(value -> System.out.println("Filtered " + value))
                .map(value -> value * 10)
                // write multiple ststement in map
                .map(value -> {System.out.println(value);return value;})
                .collect(Collectors.toList());

        System.out.println(Arrays.toString(peekans.toArray()));
        // System.out.println(peekans);
		
		////////////////////////////////////////////////////////////////////////
        // find the unique value from the list using distinct
		final List<Integer> Distinctlist = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3));

        final List<Integer> Distinctlistans = Distinctlist.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Distinct List: " + Arrays.toString(Distinctlistans.toArray()));
		
		////////////////////////////////////////////////////////////////////////
        // sort the array in ascending and in descending
		final List<Integer> sortlist = new ArrayList<>(Arrays.asList(5, 1, 3, 4, 2));

        System.out.println("Ascending Order");
        sortlist.stream().sorted()
        	.collect(Collectors.toList())
            .forEach(System.out::println);
        
        System.out.println("\nDescending Order");
        sortlist.stream().sorted(Comparator.reverseOrder())
            .forEach(System.out::println);
        
		////////////////////////////////////////////////////////////////////////
        // multiply each value from the array with 10
		final List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        final List<Integer> ans = list.stream()
                .map(value -> value * 10)
                .collect(Collectors.toList());

        System.out.println(Arrays.toString(ans.toArray()));
        
		////////////////////////////////////////////////////////////////////////
        // find the even number from the list
		System.out.println(Stream.of(1, 2, 3, 4, 5)
				.filter(x -> x % 2 == 0)
				.collect(Collectors.toList()));
		
		////////////////////////////////////////////////////////////////////////
		// find the name starts with J from the array and convert it to uppercase and print the names
		List<String> names = Arrays.asList("John", "Jane", "Adam", "Eve", "Mike");
		List<String> filteredNames = names.stream()
											.filter(name -> name.startsWith("J"))
											.map(String::toUpperCase)
											.collect(Collectors.toList());
		
		System.out.println(filteredNames);
	}

}
