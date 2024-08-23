
public class EdadException extends Exception {
    public EdadException(){}
    public EdadException(String message){
        super(message);
    }
    public EdadException(int edad)throws EdadException{
        this.validarEdad(edad);
    }
    public void validarEdad(int edad) throws EdadException{
        if(edad<18 && edad>=0){
            throw new EdadException("error de edad");
        }
    }
}
