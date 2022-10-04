package com.Author.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;
@Entity
@Table(name="AUTHOR")
public class Author {
	
	
		@Id
	    @Column(name="AUTHOR_ID")
	    @GeneratedValue(strategy=GenerationType.AUTO)
		private int author_Id;
		@Column(name="AUTHOR_NAME")
		@NotNull
		private String author_name;
		@Column(name="AUTHOR_EMAIL")
		@NotNull
		private String author_Email;
		
		@Column(name="AUTHOR_PASSWORD")
		@NotNull
		private String author_Password;
		@NotNull
		@Column(name="AUTHOR_CATEGORY")
		private String author_category;
		public Author() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Author(int author_Id, String author_name, String author_Email, String author_Password,
				String author_category) {
			super();
			this.author_Id = author_Id;
			this.author_name = author_name;
			this.author_Email = author_Email;
			this.author_Password = author_Password;
			this.author_category = author_category;
		}
		public int getAuthor_Id() {
			return author_Id;
		}
		public void setAuthor_Id(int author_Id) {
			this.author_Id = author_Id;
		}
		public String getAuthor_name() {
			return author_name;
		}
		public void setAuthor_name(String author_name) {
			this.author_name = author_name;
		}
		public String getAuthor_Email() {
			return author_Email;
		}
		public void setAuthor_Email(String author_Email) {
			this.author_Email = author_Email;
		}
		public String getAuthor_Password() {
			return author_Password;
		}
		public void setAuthor_Password(String author_Password) {
			this.author_Password = author_Password;
		}
		public String getAuthor_category() {
			return author_category;
		}
		public void setAuthor_category(String author_category) {
			this.author_category = author_category;
		}
		@Override
		public String toString() {
			return "Author [author_Id=" + author_Id + ", author_name=" + author_name + ", author_Email=" + author_Email
					+ ", author_Password=" + author_Password + ", author_category=" + author_category + "]";
		}
		

}
