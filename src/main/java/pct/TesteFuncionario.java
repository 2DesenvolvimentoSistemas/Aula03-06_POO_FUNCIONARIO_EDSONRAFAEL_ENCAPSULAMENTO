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
            
            
            
            Funcionario funcionario = new Funcionario();
            
            funcionario.setNumMatricula(1);
            funcionario.setNome("João");
            funcionario.setNivel('T'); // T = TRAINEE, J = JUNIOR, P = PLENO, S = SENIOR
            funcionario.setSalario(1042.00);
            funcionario.setAfastado(true);     
            
            
            if (funcionario.isAfastado()){funcionario.setLiberado("SIM");}else{funcionario.setLiberado("NAO");}
            
            
            switch (funcionario.getNivel()) {
                case 'T':
                    funcionario.setApresentaNivel("TRAINEE");
                    break;
                case 'J':
                    funcionario.setApresentaNivel("JUNIOR");
                    break;
                case 'P':
                    funcionario.setApresentaNivel("PLENO");
                    break;
                case 'S':
                    funcionario.setApresentaNivel("SENIOR");
                    break;
                default:
                    break;
                            }

            
            //Testando o calculo de INSS
            funcionario.calcularINSS();
            
            //Testando a impresão dos dados 
            funcionario.imprimirFuncionario();
                       
            //Outro Funcionario
            Funcionario outroFuncionario = new Funcionario(10,"Pedro", "Sim", "Sim", 'P', 1000, 1000, 1000, false);
   
            //Testando a impresão dos dados 
            outroFuncionario.imprimirFuncionario();

                   

    }   
}