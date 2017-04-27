package org.smart4j.chapter2.controller;

import org.smart4j.chapter2.model.Customer;
import org.smart4j.chapter2.service.CustomerService;
import org.smart4j.chapter2.util.StringUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Administrator on 2017/4/27.
 */
@WebServlet("/customer_show")
public class CustomerShowServlet extends HttpServlet {
    CustomerService customerService;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String contact=req.getParameter("search");
        if(StringUtil.isNotEmpty(contact)){
            List<Customer> customerList=customerService.getCustomerList(contact);
            req.setAttribute("customerList",customerList);
            req.getRequestDispatcher("WEB-INF/view/customer.jsp").forward(req,resp);
        }
        else{
            List<Customer> customerList=customerService.getCustomerList();
            req.setAttribute("customerList",customerList);
            req.getRequestDispatcher("WEB-INF/view/customer.jsp").forward(req,resp);
        }




    }

    @Override
    public void init() throws ServletException {
        customerService=new CustomerService();
    }
}