package com.MF_App.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Score implements Serializable
{

	private static final long serialVersionUID = -142180557196028404L;
	private Integer id;
	private Integer user_ID;
	private int task1;
	private int task2;
	private int task3;
	private int task4;
	private int BioQ;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() 
	{
		return id;
	}
	
	public void setId(Integer id) 
	{
		this.id = id;
	}
	
	public Integer getUser_ID() 
	{
		return user_ID;
	}
	
	public void setUser_ID(Integer user_ID) 
	{
		this.user_ID = user_ID;
	}
	
	public int getTask1() 
	{
		return task1;
	}
	
	public void setTask1(int task1) 
	{
		this.task1 = task1;
	}
	
	public int getTask2() 
	{
		return task2;
	}
	
	public void setTask2(int task2) 
	{
		this.task2 = task2;
	}
	
	public int getTask3() 
	{
		return task3;
	}
	
	public void setTask3(int task3) 
	{
		this.task3 = task3;
	}
	
	public int getTask4() 
	{
		return task4;
	}
	
	public void setTask4(int task4) 
	{
		this.task4 = task4;
	}
	
	public int getBioQ() 
	{
		return BioQ;
	}
	
	public void setBioQ(int bioQ) 
	{
		BioQ = bioQ;
	}
	
	
	
}
