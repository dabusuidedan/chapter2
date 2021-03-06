package org.smart4j.chapter2.controller;

import org.smart4j.chapter2.service.CustomerService;
import org.smart4j.chapter2.util.StringUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/27.
 */
@WebServlet("/customer_add")
public class CustomerAddServlet extends HttpServlet {
    private CustomerService customerService;

    @Override
    public void init() throws ServletException {
        customerService=new CustomerService();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String name=req.getParameter("name");
      String contact=req.getParameter("contact");
      String telephone=req.getParameter("telephone");
      String email=req.getParameter("email");
      String  remark=req.getParameter("remark");
        Map<String,Object> fieldMap=new HashMap<String, Object>();
        if(StringUtil.isNotEmpty(name)){
            fieldMap.put("name",name);
        }
        if(StringUtil.isNotEmpty(contact)){
            fieldMap.put("contact",contact);
        }
        if(StringUtil.isNotEmpty(telephone)){
    fieldMap.put("telephone",telephone);
        }
       if(StringUtil.isNotEmpty(email)){
           fieldMap.put("email",email);
       }
       if(StringUtil.isNotEmpty(remark)){
           fieldMap.put("remark",remark);
       }
        customerService.createCustomer(fieldMap);
        resp.sendRedirect("/chapter2/customer");
    }
}
