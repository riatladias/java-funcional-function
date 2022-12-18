package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

//		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList()); // implementação da interface Function
//		List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList()); // Referencia do método estático
//		List<String> names = list.stream().map(Product::noStaticUpperCaseName).collect(Collectors.toList()); // Referencia do método não estático
		
//		Function<Product, String> funcUpperCase = p -> p.getName().toUpperCase();
//		List<String> names = list.stream().map(funcUpperCase).collect(Collectors.toList()); // expressão lambda declarada
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList()); // expressão lambda inline
		
		names.forEach(System.out::println);

	}

}
