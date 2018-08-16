package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela PROVA
 * @generated
 */
@Entity
@Table(name = "\"PROVA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Prova")
public class Prova implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "materia", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String materia;

  /**
  * @generated
  */
  @Column(name = "questoes", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String questoes;

  /**
  * @generated
  */
  @Column(name = "alternativas", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String alternativas;

  /**
   * Construtor
   * @generated
   */
  public Prova(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Prova setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém materia
   * return materia
   * @generated
   */
  
  public java.lang.String getMateria(){
    return this.materia;
  }

  /**
   * Define materia
   * @param materia materia
   * @generated
   */
  public Prova setMateria(java.lang.String materia){
    this.materia = materia;
    return this;
  }

  /**
   * Obtém questoes
   * return questoes
   * @generated
   */
  
  public java.lang.String getQuestoes(){
    return this.questoes;
  }

  /**
   * Define questoes
   * @param questoes questoes
   * @generated
   */
  public Prova setQuestoes(java.lang.String questoes){
    this.questoes = questoes;
    return this;
  }

  /**
   * Obtém alternativas
   * return alternativas
   * @generated
   */
  
  public java.lang.String getAlternativas(){
    return this.alternativas;
  }

  /**
   * Define alternativas
   * @param alternativas alternativas
   * @generated
   */
  public Prova setAlternativas(java.lang.String alternativas){
    this.alternativas = alternativas;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Prova object = (Prova)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
