package com.example.shopping_;

        import java.util.ArrayList;
        import java.util.List;

public class Customer {

    private int id;
    private String name;
    private String username;
    private String password;
    private List<Integer>proName = new ArrayList<Integer>();


    public  Customer (int id, String name, String username, String password){
        this.id = id;
        this.name = name;
        this.username = username;
        this.password =password;
    }
    public  void addpuchasedproduct(int prodNo){
        this.prodNo.add(prodNo);
    }
    public int getId(){
        return id;

    }
    public String getName() {return name;}
    public String getUsername(){return username;}
    public  String getPassword(){return password;}

}
