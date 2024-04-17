/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Components;

/**
 *
 * @author Windows
 */
public class User_data {
    private String username, email;
    private int id;
    
    public User_data(int id, String username, String email)
    {
        this.id = id;
        this.username = username;
        this.email = email;
    }
    public int getID() {
        return id;
    }
    public String getUser() {
        return username;
    }
    public String getEmail() {
        return email;
    }
}
