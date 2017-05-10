package application.Controller;

import application.Responses.ApacheResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by sanyam on 11/5/17.
 */

@RestController
public class ApacheController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/gsoc")
    public ApacheResponse gsoc(@RequestParam(value="name", defaultValue="Google Summer Of Code 17") String name) {
        return new ApacheResponse(counter.incrementAndGet(),
                String.format(template, name));
    }

//    @RequestMapping(method = RequestMethod.POST, value = "data")
//    public Greeting saveData(
//            @RequestBody Greeting greeting
//    ) {
//        return new Greeting(greeting.getId(), "Sanyam");
//    }



}
