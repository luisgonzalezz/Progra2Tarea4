import java.util.ArrayList;

class MiClase
{
	int x;
	public MiClase(int x) {
		this.x = x;
	}
};

public class Ejercicios {

	//Devuelve la division entre 'a' y 'b'
	//Se deben manejar las excepciones en caso de dividir entre 0
	static int dividir(int a, int b)
	{
		try{return a/b;}  //Divide a entre b
		catch (Exception e){return 0;}// Si b es cero, retorna 0
	}
	
	//Devuelve el valor almacenado en 'arreglo' en la posicion 'pos'
	//Se deben manejar las excepciones en caso la posicion se salga de los limites
	static int getNumero(int arreglo[], int pos)
	{
		try{return arreglo[pos];} //retorna el valor de la posicion en el arreglo
		catch(Exception e){return 0;} //Devuelve 0 si la posicion se sale de los limites
	}
	
	//Devuelve la variable 'x' de 'mi_clase'
	//Se debe manejar las excepciones en caso que 'mi_clase' sea igual a null
	static int getX(MiClase mi_clase)
	{
		try{return mi_clase.x;} //Retorna el valor x de mi_clase
		catch(NullPointerException e){return 0;} //Devuelve 0 si es null
	 
	}
	
	//Devuelve el promedio de todos los elementos de 'mi_lista'
	static int getPromedio(ArrayList<Integer> mi_lista)
	{
     int promedio, suma=0; //variables
     for(Integer numero : mi_lista) //Ciclo para sumar cada numero en 'mi_lista'
     {suma=suma+numero;}
     promedio=suma/mi_lista.size(); //Asigna a promedio, la division entre 'suma' y el tamano de la lista
     return promedio;//Retorna promedio

	}
	
	//Devuelve el numero menor almacenado en 'mi_lista'
	static int getMenor(ArrayList<Integer> mi_lista)
	{
     int menor = Integer.MAX_VALUE;  //Asigna a variable menor como el numero maximo
     for(int x=0;x<mi_lista.size();x++)//Ciclo que parte de 0 hasta el tamano de mi_lista
     {if(menor>mi_lista.get(x)) //Si menor es mayor al valor de mi_lista.get(x)
    	 menor=mi_lista.get(x);//Asignar el valor de mi_lista.get(x) a menor.
     }
     return menor; //Devuelve el numero menor
		
	}
	
	//Devuelve la cantidad de veces que existe 'str' (dado) en mi_lista (dado)
	static int contar(ArrayList<String> mi_lista, String str)
	{
	 int cant=0; //variable para cantidad
	 for(int x=0; x<mi_lista.size(); x++) //Ciclo empieza 0 y termina en el tamano de la lista
	 { if(str==mi_lista.get(x)) //si la posicion es igual a "str" suma 1 a 'cant'
		 cant=cant+1;
	 } return cant; //Devuelve la cantidad que existe de 'str'
	 
	}
	
	public static void main(String[] args)
	{ 
	}

}
