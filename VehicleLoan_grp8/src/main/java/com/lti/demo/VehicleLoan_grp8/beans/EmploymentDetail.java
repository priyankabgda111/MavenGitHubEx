package com.lti.demo.VehicleLoan_grp8.beans;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the EMPLOYMENT_DETAILS database table.
 * 
 */
@Entity
@Table(name="EMPLOYMENT_DETAILS")
@NamedQuery(name="EmploymentDetail.findAll", query="SELECT e FROM EmploymentDetail e")
public class EmploymentDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="EMPLOYEE_ID")
	private Integer employeeId;

	@Column(name="ANNUAL_SALARY")
	private BigDecimal annualSalary;

	@OneToOne
	@JoinColumn(name="ACCOUNT_TYPE_ID")
	private AccountType accountTypeDetail;

	@OneToOne
	@JoinColumn(name="USER_ID")
	private UserDetail userDetail;

	public EmploymentDetail() {
	}

	public Integer getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public BigDecimal getAnnualSalary() {
		return this.annualSalary;
	}

	public void setAnnualSalary(BigDecimal annualSalary) {
		this.annualSalary = annualSalary;
	}

	public AccountType getAccountTypeDetail() {
		return this.accountTypeDetail;
	}

	public void setAccountTypeDetail(AccountType accountTypeDetail) {
		this.accountTypeDetail = accountTypeDetail;
	}

	

	public UserDetail getUserDetail() {
		return this.userDetail;
	}

	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}

}