import java.util.ArrayList;

class Sede{
// Atributos
	private int idSede;
	private String nombre;
	private String direccion;
	private ArrayList<ProgramaAcademico> programasAcademicos;
// Metodos
	// Constructor
	public Sede(int idSede, String nombre, String direccion){
		this.idSede = idSede;
		this.nombre = nombre;
		this.direccion = direccion;
	}
	// Setters & Getters
	public String getNombre(){
		return nombre;
	}
	public void setProgramasAcademicos(ArrayList<ProgramaAcademico> programasAcademicos){
		this.programasAcademicos = programasAcademicos;
	}
	public ArrayList<ProgramaAcademico> getProgramasAcademicos(){
		return programasAcademicos;
	}
	// Consulta
	public String consultarProgramas(){
		String cadena = "";
		for(ProgramaAcademico pa : programasAcademicos){
			cadena += pa.consultarDatos() + '\n';
		}
		return cadena;
	}
}