package com.mycompany.myapp.service;

import com.mycompany.myapp.vo.FormVO;
import com.mycompany.myapp.vo.ResponseVO;

public interface IProjectService {
    /**
     * 注册项目，注册成功返回success=true，否则success=false
     * @param formVO
     * @return
     */
    ResponseVO registerProject(FormVO formVO);
    /**
     * 获取某个用户的项目列表
     * @return
     */
    ResponseVO userProject(String userId);
}
