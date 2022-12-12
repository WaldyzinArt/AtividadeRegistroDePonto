package projeto;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


import java.sql.*;
public class MainController {
    @FXML
    TextField campoCPF;

    public void entrada() throws SQLException {
        Connection conexao = DriverManager.getConnection("jdbc:sqlite:projeto_ponto.db");
        String consulta = "select id from ponto where cpf_user = ? order by id desc limit 1";
        PreparedStatement comando = conexao.prepareStatement(consulta);
        comando.setString(1, campoCPF.getText());
        ResultSet resultID = comando.executeQuery();
        while (resultID.next()){
            int id = resultID.getInt("id");
            System.out.println("Entrada Confirmada!");
            String entrada = "update ponto set entrada = datetime('now') where id = ?";
            PreparedStatement update01 = conexao.prepareStatement(entrada);
            update01.setInt(1, id);
            update01.executeUpdate();
        }
    }
    public void almoco() throws SQLException {
        Connection conexao = DriverManager.getConnection("jdbc:sqlite:projeto_ponto.db");
        String consulta = "select id from ponto where cpf_user = ? order by id desc limit 1";
        PreparedStatement comando = conexao.prepareStatement(consulta);
        comando.setString(1, campoCPF.getText());
        ResultSet resultID = comando.executeQuery();
        while (resultID.next()){
            int id = resultID.getInt("id");
            System.out.println("Saída para Almoço Confirmado!");
            String almoco = "update ponto set almoco = datetime('now') where id = ?";
            PreparedStatement update01 = conexao.prepareStatement(almoco);
            update01.setInt(1, id);
            update01.executeUpdate();
        }
    }
    public void retorno() throws SQLException {
        Connection conexao = DriverManager.getConnection("jdbc:sqlite:projeto_ponto.db");
        String consulta = "select id from ponto where cpf_user = ? order by id desc limit 1";
        PreparedStatement comando = conexao.prepareStatement(consulta);
        comando.setString(1, campoCPF.getText());
        ResultSet resultID = comando.executeQuery();
        while (resultID.next()){
            int id = resultID.getInt("id");
            System.out.println("Retorno Confirmado!");
            String retorno = "update ponto set retorno = datetime('now') where id = ?";
            PreparedStatement update01 = conexao.prepareStatement(retorno);
            update01.setInt(1, id);
            update01.executeUpdate();
        }
    }
    public void saida() throws SQLException {
        Connection conexao = DriverManager.getConnection("jdbc:sqlite:projeto_ponto.db");
        String consulta = "select id from ponto where cpf_user = ? order by id desc limit 1";
        PreparedStatement comando = conexao.prepareStatement(consulta);
        comando.setString(1, campoCPF.getText());
        ResultSet resultID = comando.executeQuery();
        while (resultID.next()){
            int id = resultID.getInt("id");
            System.out.println("Saída Confirmada!");
            String saida = "update ponto set saida = datetime('now') where id = ?";
            PreparedStatement update01 = conexao.prepareStatement(saida);
            update01.setInt(1, id);
            update01.executeUpdate();
        }
    }
}