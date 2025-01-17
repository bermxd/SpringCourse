package org.example.springcourse;

import org.springframework.context.annotation.*;

//@Configuration
//@ComponentScan("org.example.springcourse")
@PropertySource("classpath:myApp.properties")
public class MyConfig {
    @Bean
    @Scope("singleton")
    public Pet catBean(){
        return new Cat();
    }

    @Bean
    public Person personBean(){
        return new Person(catBean());
    }


}
