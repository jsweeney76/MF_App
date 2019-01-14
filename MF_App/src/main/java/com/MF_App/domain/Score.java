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
	private int calmScore;
	private int focusScore;
	private int engagedScore;
	private int integratedScore;
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
	
	public int getCalmScore() 
	{
		return calmScore;
	}

	public void setCalmScore(int calmScore) 
	{
		this.calmScore = calmScore;
	}

	public int getFocusScore() 
	{
		return focusScore;
	}

	public void setFocusScore(int focusScore) 
	{
		this.focusScore = focusScore;
	}

	public int getEngagedScore() 
	{
		return engagedScore;
	}

	public void setEngagedScore(int engagedScore) 
	{
		this.engagedScore = engagedScore;
	}

	public int getIntegratedScore() 
	{
		return integratedScore;
	}

	public void setIntegratedScore(int integratedScore) 
	{
		this.integratedScore = integratedScore;
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
