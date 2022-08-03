public class FabricaHeredada extends AbstractFactory{

    @Override
    protected Conexion crearConexion(String tipo){
        if (tipo.equalsIgnoreCase("Oracle")){
            return new OracleConexion();
        } else if (tipo.equalsIgnoreCase("SQLServer")) {
            return new SqlServerConexion();
        } else {
            return new MySqlConexion();
        }
    }
}
