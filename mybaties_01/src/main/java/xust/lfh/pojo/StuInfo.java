package xust.lfh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @author: LFH
 * @date: 2020/2/22  下午5:16
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StuInfo {
    private int sid;
    private String sname;
    private String age;
    private String course;
    private int classid;

}
