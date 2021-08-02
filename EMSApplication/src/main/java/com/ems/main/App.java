package com.ems.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ems.model.Employee;
import com.ems.view.EmpUI;

public class App 
{
    public static void main( String[] args )
    {
    	 EmpUI eui=new EmpUI();
         eui.UI();
    }
}
