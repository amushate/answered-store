package zw.answered.api;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import zw.answered.model.Product;

@RestController
public class ProductController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/product")
    public Product getProduct(@RequestParam(value="name", defaultValue="World") String name) {
        return new Product(counter.incrementAndGet(),
                            String.format(template, name));
    }
}