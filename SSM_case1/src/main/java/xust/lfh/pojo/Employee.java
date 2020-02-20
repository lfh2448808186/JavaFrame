package xust.lfh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private Integer id;

    private String name;

    private String gender;

    private String email;

    private Integer deptId;

}