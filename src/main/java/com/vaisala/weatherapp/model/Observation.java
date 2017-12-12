/**
 * 
 */
package com.vaisala.weatherapp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * @author Dinesh Sapkota
 *
 */
@Entity
@Table (name = "OBSERVATIONS")
public class Observation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private int id;
	
	@Column(name="OBSERVED_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Date observedTime;
	
	@Column(name="RECEIVED_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Date receivedTime;
	
	@Column(name="VALUE")
	private Double value;
	
	@Column(name="QUALITY_CODE")
	private int qualityCode;
	
	@ManyToOne
	@JoinColumn(name="SENSOR_ID", nullable=false)
	@JsonBackReference
	private Sensor sensor;

	public int getId() {
		return id;
	}

	
	public Date getObservedTime() {
		return observedTime;
	}

	public void setObservedTime(Date observedTime) {
		this.observedTime = observedTime;
	}

	public Date getReceivedTime() {
		return receivedTime;
	}

	public void setReceivedTime(Date receivedTime) {
		this.receivedTime = receivedTime;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public int getQualityCode() {
		return qualityCode;
	}

	public void setQualityCode(int qualityCode) {
		this.qualityCode = qualityCode;
	}

	public Sensor getSensor() {
		return sensor;
	}

	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}
	
	
}
