/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Components;

import java.util.Date;

/**
 *
 * @author Windows
 */
public class client_req_data {
    private String client, product_name, status;
    private int quantity;
    private Date date;
    
    public client_req_data(String client, Date date, String product_name, int quantity, String status)
    {
        this.client = client;
        this.date = date;
        this.product_name = product_name;
        this.quantity = quantity;
        this.status = status;
    }
    public String getClient() {
        return client;
    }
    public Date getDate() {
        return date;
    }
    public String getProductName() {
        return product_name;
    }
    public int getQuantity() {
        return quantity;
    }
    public String getStatus() {
        return status;
    }
}
