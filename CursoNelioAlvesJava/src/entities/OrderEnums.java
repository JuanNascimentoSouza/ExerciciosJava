package entities;

import java.util.Date;

import entities.enums.Enumeracao;

public class OrderEnums {

	private Integer id;
	private Date moment;
	private Enumeracao status;
	
	public OrderEnums() {
		
	}

	public OrderEnums(Integer id, Date moment, Enumeracao status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public Enumeracao getStatus() {
		return status;
	}

	public void setStatus(Enumeracao status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "OrderEnums [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
	
}
