package org.smart4j.chapter2.controller;

import org.smart4j.chapter2.model.Customer;
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
@WebServlet("/customer_edit")
public class CustomerEditServlet extends HttpServlet {
    CustomerService customerService;
    @Override
    public void init() throws ServletException {
        customerService=new CustomerService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       long id= CastUtil.castLong(req.getParameter("id"));
       System.out.println(id);
       Customer customer=customerService.getCustomer(id);
       req.setAttribute("customer",customer);
        req.getRequestDispatcher("WEB-INF/view/customer_edit.jsp").forward(req,resp);
    }
}
