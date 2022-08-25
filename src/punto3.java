import java.util.ArrayList;

public class punto3 {
	ArrayList<String> materias = new ArrayList<String>();
	String materia;
	public void calculariva(int estudiante) {
		try {
			for(int i=0;i<=materias.size();i+=1) {
				materia= materias.get(i);
				System.out.println("materia:"+materia);
			}
	      } catch (ArrayStoreException ex) {
	          System.out.println("no tiene materias");
	      }
	}
}
/*
Si es recomendable lanzar una excepcion la cual si seria comprobada, porque hay listas de materias 
que puede que esten vacias, y con la exception se haria una verificacion
*/