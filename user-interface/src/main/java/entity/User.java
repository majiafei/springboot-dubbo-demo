package entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @ProjectName: house
 * @Package: com.mjf.dubbo.serivice
 * @ClassName: UserService
 * @Author: majiafei
 * @Description:
 * @Date: 2019/4/21 15:36
 */
@Data
public class User implements Serializable {
    private Long userId;
    private String userName;
}
