/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author edson_home
 */
public class TesteFuncionario {
        public static void main(String[] args){
            
            
            
            Funcionario F = new Funcionario();
            
            F.setNumMatricula(1);
            F.setNome("João");
            F.setNivel('T'); // T = TRAINEE, J = JUNIOR, P = PLENO, S = SENIOR
            F.setSalario(1042.00);
            F.setAfastado(true);     
            
            
            if (F.isAfastado()){F.setLiberado("SIM");}else{F.setLiberado("NAO");}
            
            
            switch (F.getNivel()) {
                case 'T':
                    F.setApresentaNivel("TRAINEE");
                    break;
                case 'J':
                    F.setApresentaNivel("JUNIOR");
                    break;
                case 'P':
                    F.setApresentaNivel("PLENO");
                    break;
                case 'S':
                    F.setApresentaNivel("SENIOR");
                    break;
                default:
                    break;
                            }

            
            //Testando o calculo de INSS
            F.calcularINSS();
            
            //Testando a impresão dos dados 
            F.imprimirFuncionario();
                       
            //Outro Funcionario
            Funcionario outroFuncionario = new Funcionario(10,"Pedro", "Sim", "Sim", 'Ṕ', 1000, 1000, 1000, false);
   
            //Testando a impresão dos dados 
            F.imprimirOutroFuncionario();

                   

    }   
}