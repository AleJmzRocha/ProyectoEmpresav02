package conexionmysql;

import java.sql.*;
import javax.swing.JOptionPane;

public class Ejecucion {

    Conexion con;

    public Ejecucion() {
        con = new Conexion();
    }

    /* Añade un nuevo registro */
    public void NuevoEmpleado(String idempleado, String password, String nombrePila, String apellidoPaterno,
            String apellidoMaterno, String direccion, String celular, String numemergencia, String departamento,
            String estado) {
        try {
            try (PreparedStatement pstm = con.getConnection()
                    .prepareStatement("insert into "
                            + "empleado(idEmpleado, password, nombrePila, apellidoPaterno, apellidoMaterno, direccion, telefonoCelular, numeroEmergencia, idDepartamento, estado) "
                            + "values(?,?,?,?,?,?,?,?,?)")) {
                pstm.setString(1, idempleado);
                pstm.setString(2, password);
                pstm.setString(3, nombrePila);
                pstm.setString(4, apellidoPaterno);
                pstm.setString(5, apellidoMaterno);
                pstm.setString(6, direccion);
                pstm.setString(7, celular);
                pstm.setString(8, numemergencia);
                pstm.setString(9, departamento);
                pstm.setString(10, estado);
                pstm.execute();
                pstm.close();
            }
            JOptionPane.showMessageDialog(null, "Registro exitoso.");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public Object[][] getDatos() {
        Integer registros = 0;
        // obtenemos la cantidad de registros existentes en la tabla
        try {
            PreparedStatement pstm = con.getConnection()
                    .prepareStatement("SELECT count(idEmpleado) as total FROM empleado ");
            try (ResultSet res = pstm.executeQuery()) {
                res.next();
                registros = res.getInt("total");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        Object[][] data = new String[registros][9];
        // realizamos la consulta sql y llenamos los datos en "Object"
        try {
            PreparedStatement pstm = con.getConnection()
                    .prepareStatement("SELECT "
                            + " idEmpleado, nombrePila, apellidoPaterno, apellidoMaterno, direccion, telefonoCelular, numeroEmergencia, idDepartamento, estado"
                            + " FROM empleado" + " ORDER BY idEmpleado ");
            ResultSet res = pstm.executeQuery();
            Integer i = 0;
            while (res.next()) {
                String idemp = res.getString("idEmpleado");
                String nompila = res.getString("nombrePila");
                String apaterno = res.getString("apellidoPaterno");
                String amaterno = res.getString("apellidoMaterno");
                String direccion = res.getString("direccion");
                String telcel = res.getString("telefonoCelular");
                String numem = res.getString("numeroEmergencia");
                String idepa = res.getString("idDepartamento");
                String estado = res.getString("estado");
                data[i][0] = idemp;
                data[i][1] = nompila;
                data[i][2] = apaterno;
                data[i][3] = amaterno;
                data[i][4] = direccion;
                data[i][5] = telcel;
                data[i][6] = numem;
                data[i][7] = idepa;
                data[i][8] = estado;
                i++;
            }
            res.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return data;
    }

    public String[] getDepartamento() {
        Integer registros = 0;
        // obtenemos la cantidad de registros existentes en la tabla
        try {
            PreparedStatement pstm = con.getConnection()
                    .prepareStatement("SELECT count(idDepartamento) as total FROM departamento ");
            try (ResultSet res = pstm.executeQuery()) {
                res.next();
                registros = res.getInt("total");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        String[] data = new String[registros];
        // realizamos la consulta sql y llenamos los datos en "Object"
        try {
            PreparedStatement pstm = con.getConnection()
                    .prepareStatement("SELECT "
                            + " nombreDepartamento"
                            + " FROM departamento" + " ORDER BY idDepartamento ");
            ResultSet res = pstm.executeQuery();
            Integer i = 0;
            while (res.next()) {
                String nomdepa = res.getString("nombreDepartamento");
                data[i] = nomdepa;
                i++;
            }
            res.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return data;
    }

    // public void deleteEntidad(String cod) {
    // try {
    // PreparedStatement pstm = con.getConnection().prepareStatement("delete
    // from entidades where id_entidad = ?");
    // pstm.setString(1, cod);
    // pstm.execute();
    // pstm.close();
    // } catch (SQLException e) {
    // System.out.println(e);
    // }
    // }
    // public void updateEntidad(String identi, String nenti, String abrev,
    // String ncapi) {
    // try {
    // PreparedStatement pstm = con.getConnection().prepareStatement("update
    // entidades " + "set id_entidad = ? ,"
    // + "nom_entidad = ? ," + "abreviatura = ? ," + "nom_capital = ? " + "where
    // id_entidad = ? ");
    // pstm.setString(1, identi);
    // pstm.setString(2, nenti);
    // pstm.setString(3, abrev);
    // pstm.setString(4, ncapi);
    // pstm.setString(5, identi);
    // pstm.execute();
    // pstm.close();
    // } catch (SQLException e) {
    // System.out.println(e);
    // }
    // }
}
