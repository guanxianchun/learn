package com.martin.pattern.struct.adapter;

import com.martin.pattern.entity.ResultMessage;

/**
 * 登录接口
 *
 * @author 管贤春
 * @时间 2018年12月29日 下午2:20:54
 * @Email psyche19830113@163.com
 * @Description
 */
public interface IUserService {
    /**
     * 用户登录接口
     *
     * @param userName
     * @param password
     * @return
     * @author 管贤春
     * @时间 2018年12月29日 下午2:18:32
     */
    public ResultMessage login(String userName, String password);

    /**
     * 用户注册接口
     *
     * @param userName
     * @param password
     * @return
     * @author 管贤春
     * @时间 2018年12月29日 下午2:28:51
     */
    public ResultMessage register(String userName, String password);

    /**
     * 用户登录成功后生成会话token
     *
     * @param uid
     * @return
     * @author 管贤春
     * @时间 2018年12月29日 下午2:33:42
     */
    public String writeToken(String uid);

}
