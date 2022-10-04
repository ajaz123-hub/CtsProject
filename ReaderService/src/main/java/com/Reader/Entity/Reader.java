package com.Reader.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;
@Entity
@Table(name="READER")
public class Reader {
	
	
		@Id
	    @Column(name="READER_ID")
	    @GeneratedValue(strategy=GenerationType.AUTO)
		private int reader_Id;
		@Column(name="READER_NAME")
		@NotNull
		private String reader_name;
		@Column(name="READER_EMAIL")
		@NotNull
		private String reader_Email;
		
		@Column(name="READER_PASSWORD")
		@NotNull
		private String reader_Password;
		
		public Reader() {
			super();
			// TODO Auto-generated constructor stub
		}

		public int getReader_Id() {
			return reader_Id;
		}

		public void setReader_Id(int reader_Id) {
			this.reader_Id = reader_Id;
		}

		public String getReader_name() {
			return reader_name;
		}

		public void setReader_name(String reader_name) {
			this.reader_name = reader_name;
		}

		public String getReader_Email() {
			return reader_Email;
		}

		public void setReader_Email(String reader_Email) {
			this.reader_Email = reader_Email;
		}

		public String getReader_Password() {
			return reader_Password;
		}

		public void setReader_Password(String reader_Password) {
			this.reader_Password = reader_Password;
		}

		public Reader(int reader_Id, String reader_name, String reader_Email, String reader_Password) {
			super();
			this.reader_Id = reader_Id;
			this.reader_name = reader_name;
			this.reader_Email = reader_Email;
			this.reader_Password = reader_Password;
		}

		@Override
		public String toString() {
			return "Reader [reader_Id=" + reader_Id + ", reader_name=" + reader_name + ", reader_Email=" + reader_Email
					+ ", reader_Password=" + reader_Password + "]";
		}
		
		
		
}