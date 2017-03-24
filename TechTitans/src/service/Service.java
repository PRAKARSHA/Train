package service;

import java.util.ArrayList;

import bean.Techtitans;

public class Service {
Dao da=new Dao();
Techtitans f=new Techtitans();
public int adddetails(Techtitans f){
	int k=da.adddetails(f);
	return k;
}
public ArrayList<Techtitans> search(String e){
	 ArrayList<Techtitans> af=new  ArrayList<Techtitans>();
	 af=da.search(e);
	 return af;
	 
}
public ArrayList<Techtitans> delete(String n)
{
	ArrayList<Techtitans> g=new ArrayList<Techtitans>();
	
	g=da.Delete(n);
	System.out.println("ser");
	return g;

}
}
