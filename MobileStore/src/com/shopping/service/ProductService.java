package com.shopping.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.shopping.beans.Android;
import com.shopping.beans.Apple;
import com.shopping.beans.Symbian;
import com.shopping.db.DBConnection;

public class ProductService {

	private List<Apple> appleProducts = null;
	private List<Android> androidProducts = null;
	private List<Symbian> symbianProducts = null;

	private String categoryName;

	// Method to get all Apple products available
	public List<Apple> getAllAppleProducts() throws SQLException, ClassNotFoundException {
		DBConnection dbConnection= new DBConnection();
		Connection con=dbConnection.CONN();
		if(con==null){

			System.out.println("No Database Connected");
		}
		else{
			String query = "select * from apple";
			appleProducts = new ArrayList<Apple>();
			
				PreparedStatement pstmt=con.prepareStatement(query);
				ResultSet set=pstmt.executeQuery();

				while (set.next()) {
					Apple ap = new Apple();
					ap.setProductName(set.getString(2));
					ap.setProductPrice(set.getInt(3));
					ap.setProductQuantity(set.getInt(4));	
					appleProducts.add(ap);
				}
				pstmt.close();
				set.close();
			}	
			return appleProducts;
			
		}
		
	// Method to get all Android products available
	public List<Android> getAllAndroidProducts() throws SQLException, ClassNotFoundException {
		DBConnection dbConnection= new DBConnection();
		Connection con=dbConnection.CONN();
		if(con==null){

			System.out.println("No Database Connected");
		}
		else{
			String query = "select * from android";
			androidProducts = new ArrayList<Android>();
			
				PreparedStatement pstmt=con.prepareStatement(query);
				ResultSet set=pstmt.executeQuery();

				while (set.next()) {
					Android andr = new Android();
					andr.setProductName(set.getString(2));
					andr.setProductPrice(set.getInt(3));
					andr.setProductQuantity(set.getInt(4));	
					androidProducts.add(andr);
				}
				pstmt.close();
				set.close();
			}	
			return androidProducts;
			
		}
	// Method to get all Symbian products available
	public List<Symbian> getAllSymbianProducts() throws SQLException, ClassNotFoundException {
		DBConnection dbConnection= new DBConnection();
		Connection con=dbConnection.CONN();
		if(con==null){

			System.out.println("No Database Connected");
		}
		else{
			String query = "select * from symbian";
			symbianProducts = new ArrayList<Symbian>();
			
				PreparedStatement pstmt=con.prepareStatement(query);
				ResultSet set=pstmt.executeQuery();

				while (set.next()) {
					Symbian p = new Symbian();
					p.setProductName(set.getString(2));
					p.setProductPrice(set.getInt(3));
					p.setProductQuantity(set.getInt(4));	
					symbianProducts.add(p);
				}
				pstmt.close();
				set.close();
			}	
			return symbianProducts;
			
		}
		// Method to get the required Product Details
/*		public Product getProductDetails(int productId) {
			Connection conn = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			String sql;
			conn = DBConnection.getConnecton();
			Product p = new Product();
			sql = "select productName,productPrice,productSummary,productCategory,productSubCategory,productManufacturer from products where productId=?";

			try {
				ps = conn.prepareStatement(sql);
				ps.setInt(1, productId);
				rs = ps.executeQuery();
				while (rs.next()) {
					p.setProductId(productId);
					p.setProductName(rs.getString(1));
					p.setProductPrice(rs.getDouble(2));
					p.setDescription(rs.getString(3));
					p.setCategory(rs.getString(4));
					p.setSubCategory(rs.getString(5));
					p.setProductManufacturer(rs.getString(6));
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (rs != null) {
						rs.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

				try {
					if (ps != null) {
						ps.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}


			}
			return p;
		}
*/
				}

