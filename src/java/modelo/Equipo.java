package modelo;
import java.util.List;



/**
 * Class Equipo
 */
public class Equipo {

  //
  // Fields
  //

  private long idGrupo;
  private List<Integrante> integrante;
  
  //
  // Constructors
  //
  public Equipo () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of idGrupo
   * @param newVar the new value of idGrupo
   */
  private void setIdGrupo ( long newVar ) {
    idGrupo = newVar;
  }

  /**
   * Get the value of idGrupo
   * @return the value of idGrupo
   */
  private long getIdGrupo ( ) {
    return idGrupo;
  }

  /**
   * Set the value of integrante
   * @param newVar the new value of integrante
   */
  private void setIntegrante ( List<Integrante> newVar ) {
    integrante = newVar;
  }

  /**
   * Get the value of integrante
   * @return the value of integrante
   */
  private List<Integrante> getIntegrante ( ) {
    return integrante;
  }

  //
  // Other methods
  //

}
