package xust.lfh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Description:
 * @author: LFH
 * @date: 2020/2/22  下午8:43
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeachInfo {

    private int tid;
    private String tname;
    private String age;
    private String course;
    private List<ClassInfo> classInfoList;
}
