package xust.lfh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Description:
 * @author: LFH
 * @date: 2020/2/22  下午8:42
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClassInfo {
    private int cid;
    private String cname;
    private String sum;
    private List<TeachInfo> teachInfoList;


}
