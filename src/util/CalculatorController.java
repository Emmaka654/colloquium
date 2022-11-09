package util;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/fibonachi")
    public FindNFibonachi greeting(@RequestParam(value = "operation", defaultValue = "findNFib") String operation, @RequestParam(value = "Number", defaultValue = "1") String number) {
        int num = Integer.parseInt(number);
        Fibonachi fib = new Fibonachi();
        switch (operation) {
            // case "findFirstNNumbers": return new FindFirstNFibonachi(counter.incrementAndGet(), fib.findFirstNNumbers(num));
            case "findNFib":
                return new FindNFibonachi(counter.incrementAndGet(), fib.findNFib(num));
            default:
                throw new OperationNotFoundException(operation);
        }
    }
}