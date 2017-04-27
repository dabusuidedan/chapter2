package org.smart4j.chapter2.service;

import org.smart4j.chapter2.helper.DatabaseHelper;
import org.smart4j.chapter2.model.Customer;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/27.
 */
public class CustomerService {


    public List<Customer> getCustomerList(){
        String sql="select * from customer";
        return DatabaseHelper.queryEntityList(Customer.class,sql);
    }
    public  List<Customer> getCustomerList(String contact){

        String sql="select * from customer where contact=?";
        return DatabaseHelper.queryEntityList(Customer.class,sql,contact);
    }
    public  Customer getCustomer(long id){
        String sql="select * from customer where id=?";
        return DatabaseHelper.queryEntity(Customer.class,sql,id);
    }
    public  Customer getCustomer(String contact){
        String sql="select * from customer where contact=?";
        return DatabaseHelper.queryEntity(Customer.class,sql,contact);
    }
    public boolean createCustomer(Map<String,Object> fieldMap){
        return  DatabaseHelper.insertEntity(Customer.class,fieldMap);
    }
    public boolean updateCustomer(long id,Map<String,Object> fieldMap){
        return  DatabaseHelper.updateEntity(Customer.class,id,fieldMap);
    }
    public  boolean deleteCustomer(long id){
        return  DatabaseHelper.deleteEntity(Customer.class,id);
    }
}
