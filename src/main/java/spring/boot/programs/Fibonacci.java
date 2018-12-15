package spring.boot.programs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Fibonacci {
	public static void main(String[] args) {
		SpringApplication.run(Fibonacci.class, args);
	}

	@RequestMapping("/{seriesLength}")
	public int[] getFibonacciSeries(@PathVariable("seriesLength") int seriesLength) {
		long startTime = System.nanoTime();
		int[] fibonacciSeries = new int[seriesLength];
		for (int i = 0; i < seriesLength; i++) {
			if (i == 0)
				fibonacciSeries[0] = 0;
			else if (i == 1)
				fibonacciSeries[1] = 1;
			else
				fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
		}
		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");
		return fibonacciSeries;
	}
}
