package xust.lfh.springboot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by LFH on 2020/2/16
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@PropertySource(value = {"classpath:person.properties"})
@ConfigurationProperties(prefix = "dog")
public class Dog {
    private String name;
    private int age;
}
