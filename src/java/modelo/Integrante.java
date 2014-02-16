package modelo;
import java.util.*;


/**
 * Class Integrante
 */
public class Integrante {

  //
  // Fields
  //

  private String email;
  private long cedula_;
  private String nombre;
  private int edad;
  private String password;
  private String facebook;
  private String google;
  private String twitter;
  private String foto;
  private Ciudad ciudad;
  private List<Profesion> profesion;
  
  //
  // Constructors
  //
  public Integrante () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of email
   * @param newVar the new value of email
   */
  private void setEmail ( String newVar ) {
    email = newVar;
  }

  /**
   * Get the value of email
   * @return the value of email
   */
  private String getEmail ( ) {
    return email;
  }

  /**
   * Set the value of cedula_
   * @param newVar the new value of cedula_
   */
  private void setCedula_ ( long newVar ) {
    cedula_ = newVar;
  }

  /**
   * Get the value of cedula_
   * @return the value of cedula_
   */
  private long getCedula_ ( ) {
    return cedula_;
  }

  /**
   * Set the value of nombre
   * @param newVar the new value of nombre
   */
  private void setNombre ( String newVar ) {
    nombre = newVar;
  }

  /**
   * Get the value of nombre
   * @return the value of nombre
   */
  private String getNombre ( ) {
    return nombre;
  }

  /**
   * Set the value of edad
   * @param newVar the new value of edad
   */
  private void setEdad ( int newVar ) {
    edad = newVar;
  }

  /**
   * Get the value of edad
   * @return the value of edad
   */
  private int getEdad ( ) {
    return edad;
  }

  /**
   * Set the value of password
   * @param newVar the new value of password
   */
  private void setPassword ( String newVar ) {
    password = newVar;
  }

  /**
   * Get the value of password
   * @return the value of password
   */
  private String getPassword ( ) {
    return password;
  }

  /**
   * Set the value of facebook
   * @param newVar the new value of facebook
   */
  private void setFacebook ( String newVar ) {
    facebook = newVar;
  }

  /**
   * Get the value of facebook
   * @return the value of facebook
   */
  private String getFacebook ( ) {
    return facebook;
  }

  /**
   * Set the value of google
   * @param newVar the new value of google
   */
  private void setGoogle ( String newVar ) {
    google = newVar;
  }

  /**
   * Get the value of google
   * @return the value of google
   */
  private String getGoogle ( ) {
    return google;
  }

  /**
   * Set the value of twitter
   * @param newVar the new value of twitter
   */
  private void setTwitter ( String newVar ) {
    twitter = newVar;
  }

  /**
   * Get the value of twitter
   * @return the value of twitter
   */
  private String getTwitter ( ) {
    return twitter;
  }

  /**
   * Set the value of foto
   * @param newVar the new value of foto
   */
  private void setFoto ( String newVar ) {
    foto = newVar;
  }

  /**
   * Get the value of foto
   * @return the value of foto
   */
  private String getFoto ( ) {
    return foto;
  }

  /**
   * Set the value of ciudad
   * @param newVar the new value of ciudad
   */
  private void setCiudad ( Ciudad newVar ) {
    ciudad = newVar;
  }

  /**
   * Get the value of ciudad
   * @return the value of ciudad
   */
  private Ciudad getCiudad ( ) {
    return ciudad;
  }

  /**
   * Set the value of profesion
   * @param newVar the new value of profesion
   */
  private void setProfesion ( List<Profesion> newVar ) {
    profesion = newVar;
  }

  /**
   * Get the value of profesion
   * @return the value of profesion
   */
  private List<Profesion> getProfesion ( ) {
    return profesion;
  }

  //
  // Other methods
  //

}
