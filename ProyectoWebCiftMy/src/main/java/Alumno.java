
	public class Alumno {
	    private String nombre;
	    private String apellido;
	    private String sexo;
	    private String materia;
	    private String textArea;

	    // Constructor, getters y setters
	
	    
	    
		public Alumno(String nombre, String apellido, String sexo, String materia, String textArea) {
			super();
			this.nombre = nombre;
			this.apellido = apellido;
			this.sexo = sexo;
			this.materia = materia;
			this.textArea = textArea;
		}

			
		
		public Alumno() {
			super();
		}

		public String getNombre() {
			return nombre;
		}
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}



		public String getSexo() {
			return sexo;
		}



		public void setSexo(String sexo) {
			this.sexo = sexo;
		}



		public String getMateria() {
			return materia;
		}



		public void setMateria(String materia) {
			this.materia = materia;
		}



		public String getTextArea() {
			return textArea;
		}



		public void setTextArea(String textArea) {
			this.textArea = textArea;
		}



		@Override
		public String toString() {
			return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", materia=" + materia
					+ ", textArea=" + textArea + "]";
		}

	
	    
	    
	}
	

