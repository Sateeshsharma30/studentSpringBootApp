package learn.war.spring.webdisplay.budgetLedger;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Amount {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String type;
	private int amount;
	private Date date;
	public Amount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Amount(String name, String type, int amount, Date date) {
		super();
		this.name = name;
		this.type = type;
		this.amount = amount;
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Amount [id=" + id + ", name=" + name + ", type=" + type + ", amount=" + amount + ", date=" + date + "]";
	}
	
	
}