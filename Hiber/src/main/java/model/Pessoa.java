package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Pessoa implements Serializable{

		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
		private Integer id;
		
		
		private String nome;
		
		
		private Integer idade;
		
		public Integer getInteger() {
			return id;
		}
		public void setInteger(Integer id) {
			this.id= id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public Integer getIdade() {
			return idade;
		}
		public void setIdade(Integer idade) {
			this.idade = idade;
		}
		
		
}
