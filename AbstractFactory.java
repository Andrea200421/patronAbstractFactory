public abstract class AbstractFactory {

    public AbstractFactory(){}

    protected abstract Conexion crearConexion(String tipo);
}
