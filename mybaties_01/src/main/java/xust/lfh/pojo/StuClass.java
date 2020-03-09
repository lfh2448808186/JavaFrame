package xust.lfh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Description:
 * @author: LFH
 * @date: 2020/2/22  下午5:19
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StuClass {
    private int cid;
    private String cname;
    private int sum;
    private List<StuInfo> stuInfoList;
}
