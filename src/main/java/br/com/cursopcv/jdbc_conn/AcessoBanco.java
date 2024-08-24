package br.com.cursopcv.jdbc_conn;
import java.sql.SQLException;
import java.util.Scanner;

public class AcessoBanco {

    public static void main(String[] args) throws SQLException {

        Conexao ds = new Conexao();
        //ds.criarTabela();
        //ds.inserirRegTab();
        //ds.alteraRegistro(2,null);

        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o nome do café que deseja pesquisar:");
        String nomeCafe = scan.nextLine();

        System.out.println(ds.getDadosCafe(nomeCafe));

    }




}