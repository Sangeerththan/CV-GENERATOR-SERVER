package cv_server;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class example {



    public static void main(String[] args) {
        SpringApplication.run(example.class, args);
    }

}
