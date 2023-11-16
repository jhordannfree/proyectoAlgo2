package models;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ManejadorCSV {
    
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    
    public static Alumno encontrarAlumno(String usuarioIngresado, String contraseñaIngresada){
        try
        {
            Alumno alumnoEncontrado;
            String fileLine = "";  
            BufferedReader readerAlumnos = new BufferedReader(new FileReader("src\\csv\\alumnos.csv"));  
            
            while ((fileLine = readerAlumnos.readLine()) != null){
                String[] alumno = fileLine.split(",");
                
                if(usuarioIngresado.equals(alumno[1])&&contraseñaIngresada.equals(alumno[2])){
                    alumnoEncontrado=new Alumno(alumno[0],alumno[1],alumno[2],alumno[3],alumno[4],LocalDate.parse(alumno[5],formatter),alumno[6],Integer.parseInt(alumno[7]),Integer.parseInt(alumno[8]),Double.parseDouble(alumno[9]),Double.parseDouble(alumno[10]),Double.parseDouble(alumno[11])) ;
                    return alumnoEncontrado;
                }
            }  
            return null;
                    
        }
        catch (IOException exception)   
        {  
          exception.printStackTrace();  
        }  
        
        return null;
    
    }
    
    public static Docente encontrarDocente(String usuarioIngresado, String contraseñaIngresada){
        try
        {
            Docente docenteEncontrado;
            String fileLine = "";  
            BufferedReader readerDocentes = new BufferedReader(new FileReader("src\\csv\\docentes.csv"));  
            
            while ((fileLine = readerDocentes.readLine()) != null){
                String[] docente = fileLine.split(",");
                
                if(usuarioIngresado.equals(docente[1])&&contraseñaIngresada.equals(docente[2])){
                    docenteEncontrado=new Docente(docente[0],docente[1],docente[2],docente[3],docente[4],LocalDate.parse(docente[5],formatter),docente[6]) ;
                    return docenteEncontrado;
                }
            }  
            return null;
                    
        }
        catch (IOException exception)   
        {  
          exception.printStackTrace();  
        }  
        
        return null;
    
    }
    
    public static ArrayList<String> getNombresGrupos(){
        try
        {
           ArrayList<String> nombresGrupos=new ArrayList<String>();
           String fileLine = ""; 
           BufferedReader readerGrupos = new BufferedReader(new FileReader("src\\csv\\grupos.csv")); 
           
           while ((fileLine = readerGrupos.readLine()) != null){
               String[] grupo = fileLine.split(",");
               nombresGrupos.add(grupo[1]);
           }
           return nombresGrupos;
        }
        
        catch (IOException exception)   
        {  
            exception.printStackTrace();  
        } 
        
        return null;
    }
    
    public static boolean esUsuarioNuevo(String usuarioIngresado){
        try
        {
           String fileLine = ""; 
           BufferedReader readerAlumnos = new BufferedReader(new FileReader("src\\csv\\alumnos.csv")); 
           BufferedReader readerDocentes = new BufferedReader(new FileReader("src\\csv\\docentes.csv")); 
           
           while ((fileLine = readerAlumnos.readLine()) != null){
               String[] alumno = fileLine.split(",");
               if(alumno[1].equals(usuarioIngresado)){
                   return false;
               }
           }
           
           while ((fileLine = readerDocentes.readLine()) != null){
               String[] docente = fileLine.split(",");
               if(docente[1].equals(usuarioIngresado)){
                   return false;
               }
           }
           
           return true;
        }
        catch (IOException exception)   
        {  
            exception.printStackTrace();  
        } 
        
        return true;
    }
    
    public static String obtenerCodigoGrupo(String nombreGrupo){
        try
        {
            String fileLine = ""; 
            BufferedReader readerGrupos = new BufferedReader(new FileReader("src\\csv\\grupos.csv"));
            System.out.println("Group Name: " + nombreGrupo);
            while ((fileLine = readerGrupos.readLine()) != null){
               String[] grupo = fileLine.split(",");
               if(grupo[1].equals(nombreGrupo)){
                   return grupo[0];
               }
           }
        }
        catch (IOException exception)   
        {  
            exception.printStackTrace();  
        } 
        
        return null;
        
    }
    
    public static Alumno registrarAlumno(String usuario, String contraseña, String nombres, String apellidos, String fechaNacimiento, String codigoGrupo){
        try
        {   
            int nAlumnos=0;
            BufferedReader readerAlumnos = new BufferedReader(new FileReader("src\\csv\\alumnos.csv")); 
            while (readerAlumnos.readLine() != null){
                nAlumnos++;
            }
            
            BufferedWriter writerAlumnos = new BufferedWriter(new FileWriter("src\\csv\\alumnos.csv",true));
            writerAlumnos.newLine();
            writerAlumnos.write("A"+String.valueOf(nAlumnos+1)+","+usuario+","+contraseña+","+nombres+","+apellidos+","+fechaNacimiento+","+codigoGrupo+","+"0"+","+"0"+","+"0"+","+"0"+","+"0");
            writerAlumnos.close();
            
            return(new Alumno("A"+String.valueOf(nAlumnos+1),usuario,contraseña,nombres,apellidos,LocalDate.parse(fechaNacimiento,formatter),codigoGrupo));
        }
        catch (IOException exception) 
        {
            exception.printStackTrace();  
        }    
        
        return null;
    }
}
