package The_Blob.dao;

public class Demo {
    
    // Se tiene un solo DAO que hace 'de todo'... esto genera problemas de mantenibilidad,
    //pues el grado de cohesión es muy deficiente...
    
public List<Estudiante> loadAllEstudiantes() throws PersistenceException;
public String loadPlanDeEstudio(int codigoEstudiante) throws PersistenceException;
public String loadSyllabusProgramaById(int codigoEstudiante) throws PersistenceException;
public List<Asignatura> loadCoursesById(int codigo) throws PersistenceException;
public String consultImpactById(int codigo, String nemonico) throws PersistenceException;
public String consultProyectionById(int codigo, String nemonico) throws PersistenceException;
public void updateJustification(int codigo, String materia, String justificacion, int numero, boolean acuse, String impacto, String proyeccion) throws PersistenceException;
public Estudiante loadEstudianteById(int codigo) throws PersistenceException;
public List<Solicitud> loadSolicitudes() throws PersistenceException;
public void updateCredits(int creditos, String programa) throws PersistenceException;
public int consultCredits(String programa) throws PersistenceException;
public Estudiante consultStudentByEmail(String correo) throws PersistenceException;
public List<String> consultCourse(int codigo) throws PersistenceException;
public List<ProgramaAcademico> consultarProgramasAcademicos() throws PersistenceException;
public PlanDeEstudios consultarPlanDeEstudios(String programa, int numero) throws PersistenceException; 
public ProgramaAcademico consultarProgramaAcademicoPorNombre(String nombre) throws PersistenceException;
public void actualizarSyllabus(String syllabus, int numero, String programa) throws PersistenceException;
public void actualizarPlanDeEstudio(String plan,int version,String programa) throws PersistenceException;

}
