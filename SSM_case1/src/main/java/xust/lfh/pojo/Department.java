package xust.lfh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    private Integer id;

    private String name;


//    public void setName(String name) {
//        this.name = name == null ? null : name.trim();
//    }
}