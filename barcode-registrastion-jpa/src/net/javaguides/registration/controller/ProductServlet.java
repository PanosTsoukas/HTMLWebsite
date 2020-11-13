package net.javaguides.registration.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.javaguides.registration.dao.ProductDao;
import net.javaguides.registration.model.Product;


@WebServlet("/register")
public class ProductServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    private ProductDao productDao = new ProductDao();
    
    public ProductServlet() {
    	super();
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    	    throws ServletException, IOException {
    	
    	response.getWriter().append("Served at: ").append(request.getContextPath());
    	
    	RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/productregister.jsp");
    	dispatcher.forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String Barcode = request.getParameter("Barcode");
        String ProductName = request.getParameter("ProductName");
        String ProductColour = request.getParameter("ProductColour");
        String ProductDescription = request.getParameter("ProductDescription");

        Product product = new Product();
        product.setBarcode(Barcode);
        product.setProductName(ProductName);
        product.setProductColour(ProductColour);
        product.setProductDescription(ProductDescription);

        try {
            productDao.registerProduct(product);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/productdetails.jsp");
    	dispatcher.forward(request, response);
    }
}