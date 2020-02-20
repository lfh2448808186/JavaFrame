package xust.lfh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by LFH on 2020/2/16
 */

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dog {
    private String name;
    private int age;

}
