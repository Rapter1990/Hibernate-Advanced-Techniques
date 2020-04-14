package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="IMAGE",catalog = "HIBERNATEADVANCEDTECHNIQUES")
public class Image implements Serializable{

	@Id
	@SequenceGenerator(name="IMAGE_SEQ", sequenceName="IMAGE_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="IMAGE_SEQ")
	@Column(name="IMAGE_ID", nullable = false)
	private int id;
	
	@Column(name="FILENAME")
	private String fileName;
	
	@Column(name="STUDENT_ID")
	private String studentId;

	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Image(int id, String fileName, String studentId) {
		super();
		this.id = id;
		this.fileName = fileName;
		this.studentId = studentId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return "Image [id=" + id + ", fileName=" + fileName + ", studentId=" + studentId + "]";
	}
	
	
}
