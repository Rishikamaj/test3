package com.newt;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;
import java.util.stream.Stream;

import com.newt.Dish.Type;

public class Streamdemo1 {

	public static void main(String[] args) {

		/*List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);

		Optional<Integer> sum = intList.stream().reduce((a, b) -> a + b);
		System.out.println(sum.isPresent() ? sum.get() : "Invalid input");

		// Stream.of(1,2,3,4,5).reduce((a,b)->a+b);
		// Stream.generate(Math::random().limit(5));
		Integer sumInitial = intList.stream().reduce(0, (a, b) -> a + b);*/

		List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER), new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER), new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 300, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));
		Stream<Dish> myDishStream = menu.stream();
		String s = "";
		Predicate mymethod = (Dish) -> true;
		mymethod.test(menu);
		// Dish d1=new Dish("pork", false, 800, Dish.Type.MEAT);
		// Dish d2=new Dish("beef", false, 700, Dish.Type.MEAT);

		// Supplier<Dish> mySupplier =Dish()::new;
		// Dish d=mySupplier.get();

		/*Consumer<String> myConsumer = (String) -> {
		};
		myConsumer.accept(s);

		myDishStream.limit(4).filter(Dish::isVegetarian).forEach(System.out::println);
		Stream<String> stringStream = Stream.of("hello world ", "newt global");
		Stream<String[]> mycharArrayStream = stringStream.map(word -> word.split(""));
		Stream<String> mystream = mycharArrayStream.flatMap(Arrays::stream);
		mystream.forEach(System.out::println);
		Stream.of("pork", "beef", "chicken", "french fries", "rice").limit(3).forEach(System.out::println);
		Stream.of("pork", "beef", "chicken", "french fries", "rice", "rice", "beef").distinct()
		.forEach(System.out::println);*/

		// menu.stream() .sorted((e1,e2)->e1.getCalories().compareTo(e2.getCalories()))
		// .forEach(System.out::println);

		//Map<Dish.Type, List<Dish>> mymap = myDishStream.collect(groupingBy(Dish::getType));
		//System.out.println(mymap);
		//Map<Dish.Type, Long> mymap1 = myDishStream.collect(groupingBy(Dish::getType,counting()));
		//System.out.println(mymap1);
		Map<Boolean, Long>mydish=myDishStream.collect(partitioningBy(Dish::isVegetarian,counting()));
		System.out.println(mydish);
	}

	
	

	
	}

	
	

	
	




