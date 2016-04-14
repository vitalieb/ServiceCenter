package com.bevvis.servicecenter.entities;

import javax.persistence.*;
import java.util.*;

@Entity
public class Order {

	@Id
	@GeneratedValue
	private int id;
	private Date date;
	@OneToOne(cascade=CascadeType.ALL)
	private Contractor contractor;
	private String itemName;
	private String inComplect;
	private ArrayList<String> serials;
	private String defectDescription;
	private boolean onlyDiagnostics;
	private boolean onWarranty;
	private String numberOfSale;
	private Date dateOfSale;
	private double priceAtMomentOfSale;
	private String itemVisualAspect;
	@OneToOne(cascade=CascadeType.ALL)
	private Repairer repairer;
	@OneToOne(cascade=CascadeType.ALL)
	private StatusOfRepair statusOfRepair;
	private HashMap<Date, String> commentsOnStatus;
	@OneToMany(cascade=CascadeType.ALL)
	private Set<RepairExpense> expenses = new HashSet<>();
	@ElementCollection
	private Set<Date> informedOfStatusTimes = new HashSet<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Contractor getContractor() {
		return contractor;
	}

	public void setContractor(Contractor contractor) {
		this.contractor = contractor;
	}

	public String getItemVisualAspect() {
		return itemVisualAspect;
	}

	public void setItemVisualAspect(String itemVisualAspect) {
		this.itemVisualAspect = itemVisualAspect;
	}

	public Repairer getRepairer() {
		return repairer;
	}

	public void setRepairer(Repairer repairer) {
		this.repairer = repairer;
	}

	public StatusOfRepair getStatusOfRepair() {
		return statusOfRepair;
	}

	public void setStatusOfRepair(StatusOfRepair statusOfRepair) {
		this.statusOfRepair = statusOfRepair;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getInComplect() {
		return inComplect;
	}

	public void setInComplect(String inComplect) {
		this.inComplect = inComplect;
	}

	public ArrayList<String> getSerials() {
		return serials;
	}

	public void setSerials(ArrayList<String> serials) {
		this.serials = serials;
	}

	public String getDefectDescription() {
		return defectDescription;
	}

	public void setDefectDescription(String defectDescription) {
		this.defectDescription = defectDescription;
	}

	public boolean isOnlyDiagnostics() {
		return onlyDiagnostics;
	}

	public void setOnlyDiagnostics(boolean onlyDiagnostics) {
		this.onlyDiagnostics = onlyDiagnostics;
	}

	public boolean isOnWarranty() {
		return onWarranty;
	}

	public void setOnWarranty(boolean onWarranty) {
		this.onWarranty = onWarranty;
	}

	public String getNumberOfSale() {
		return numberOfSale;
	}

	public void setNumberOfSale(String numberOfSale) {
		this.numberOfSale = numberOfSale;
	}

	public Date getDateOfSale() {
		return dateOfSale;
	}

	public void setDateOfSale(Date dateOfSale) {
		this.dateOfSale = dateOfSale;
	}

	public double getPriceAtMomentOfSale() {
		return priceAtMomentOfSale;
	}

	public void setPriceAtMomentOfSale(double priceAtMomentOfSale) {
		this.priceAtMomentOfSale = priceAtMomentOfSale;
	}

	public HashMap<Date, String> getCommentsOnStatus() {
		return commentsOnStatus;
	}

	public void setCommentsOnStatus(HashMap<Date, String> commentsOnStatus) {
		this.commentsOnStatus = commentsOnStatus;
	}

	public Set<RepairExpense> getExpenses() {
		return expenses;
	}

	public void setExpenses(Set<RepairExpense> expenses) {
		this.expenses = expenses;
	}

	public Set<Date> getInformedOfStatusTimes() {
		return informedOfStatusTimes;
	}

	public void setInformedOfStatusTimes(Set<Date> informedOfStatusTimes) {
		this.informedOfStatusTimes = informedOfStatusTimes;
	}



}
