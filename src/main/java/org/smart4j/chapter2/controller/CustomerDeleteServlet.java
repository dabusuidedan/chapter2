package org.smart4j.chapter2.controller;

import org.smart4j.chapter2.service.CustomerService;
import org.smart4j.chapter2.util.CastUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2017/4/27.
 */
@WebServlet("/customer_delete")
public class CustomerDeleteServlet extends HttpServlet{

    private CustomerService customerService;
    @Override
    public void init() throws ServletException {
       customerService=new CustomerService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        long id= CastUtil.castLong(req.getParameter("id"));
        customerService.deleteCustomer(id);
        resp.sendRedirect("/chapter2/customer");
}
}





