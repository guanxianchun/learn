package com.martin.pattern.struct.decorator;

import com.martin.pattern.entity.ResultMessage;
import com.martin.pattern.struct.adapter.IUserService;

/**
 * @author 管贤春
 * @时间 2018年12月29日 下午3:13:15
 * @Email psyche19830113@163.com
 * @Description
 */
public interface IUserServiceDecorator extends IUserService {
    /**
     * @param openId
     * @return
     * @author 管贤春
     * @时间 2018年12月29日 下午3:47:02
     */
    public ResultMessage loginForQQ(String openId);

    /**
     * @param openId
     * @return
     * @author 管贤春
     * @时间 2018年12月29日 下午3:47:23
     */
    public ResultMessage loginForWeiXin(String openId);
}
