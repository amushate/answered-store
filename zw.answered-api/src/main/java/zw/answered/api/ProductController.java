package zw.answered.api;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import zw.answered.model.Product;

/**
 * 
 * @author amushate 27 Sep,2017
 */
@RestController
public class ProductController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/product")
	@GetMapping(produces={MediaType.APPLICATION_JSON_VALUE})
	public Product getProduct(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Product(counter.incrementAndGet(), String.format(template, name));
	}
}