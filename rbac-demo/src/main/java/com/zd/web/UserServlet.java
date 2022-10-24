package com.zd.web;

import com.alibaba.fastjson.JSON;
import com.zd.pojo.User;
import com.zd.service.UserService;
import com.zd.service.impl.UserServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/User/*")
public class UserServlet extends BaseServlet{
    private UserService service = new UserServiceImpl();
    public void login(HttpServletRequest req, HttpServletResponse resp) throws IOException{
        BufferedReader br = req.getReader();
        String params = br.readLine();//json字符串

        //转为Brand对象
        User user = JSON.parseObject(params, User.class);

        //2. 调用service查找
        User user1 = service.selectUser(user);
        if(user1!=null) {
            HttpSession session = req.getSession();
            session.setAttribute("user",user1);
            resp.getWriter().write("success");
        }
    }

}
