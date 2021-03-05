/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import entities.Product;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Asus
 */
@Named(value = "productController")
@SessionScoped
public class ProductController implements Serializable {

    @EJB
    private project.NewSessionBean newSessionBean;

    
    public ProductController() {
    }
    public List<Product> findAll() {
		return this.newSessionBean.findAll();
	}
    
}
