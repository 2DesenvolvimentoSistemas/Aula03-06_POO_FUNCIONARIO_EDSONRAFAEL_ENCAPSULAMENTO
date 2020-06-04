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

    public class Funcionario {
    private int numMatricula;
    private String nome;
    private String liberado; 
    private String apresentaNivel;
    private char nivel; 
    private double salario;
    private double salarioLiquido;
    private double calcularInss;
    private boolean afastado;

    public void imprimirFuncionario(){
    System.out.println("Numero da Matricula: "+getNumMatricula());
    System.out.println("Esta liberado para trabalho? "+getLiberado());
    System.out.println("Nome: "+getNome());
    System.out.println("Nivel: "+getApresentaNivel());
    System.out.println("Salario Bruto: R$ "+getSalario());
    System.out.println("O salario Bruto de R$ " +getSalario()+ ", sofreu um desconto de R$ " +getCalcularInss()+ " pertinente ao INSS ");
    System.out.println("O salario Liquido será de R$ " +getSalarioLiquido()+" ");
                                  }
    
    public void calcularINSS(){
            if (getSalario() <= 720) {
            setCalcularInss(getSalario() * 0.0765);
            setSalarioLiquido(getSalario() - getCalcularInss());
                                }
            else {
            if (getSalario() <= 1200) {
                setCalcularInss(getSalario() * 0.09);
                setSalarioLiquido(getSalario() - getCalcularInss());
            } else {
            if (getSalario() <= 2400) {
                    setCalcularInss(getSalario() * 0.11);
                    setSalarioLiquido(getSalario() - getCalcularInss());
            } else {
            if (    getSalario() > 2400) {
                        setCalcularInss(2400 * 0.11);
                        setSalarioLiquido(getSalario() - getCalcularInss());
                                }    
                }
            } 
        }
            
}

    /**
     * @return the numMatricula
     */
    public int getNumMatricula() {
        return numMatricula;
    }

    /**
     * @param numMatricula the numMatricula to set
     */
    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the liberado
     */
    public String getLiberado() {
        return liberado;
    }

    /**
     * @param liberado the liberado to set
     */
    public void setLiberado(String liberado) {
        this.liberado = liberado;
    }

    /**
     * @return the apresentaNivel
     */
    public String getApresentaNivel() {
        return apresentaNivel;
    }

    /**
     * @param apresentaNivel the apresentaNivel to set
     */
    public void setApresentaNivel(String apresentaNivel) {
        this.apresentaNivel = apresentaNivel;
    }

    /**
     * @return the nivel
     */
    public char getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(char nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the salarioLiquido
     */
    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    /**
     * @param salarioLiquido the salarioLiquido to set
     */
    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    /**
     * @return the calcularInss
     */
    public double getCalcularInss() {
        return calcularInss;
    }

    /**
     * @param calcularInss the calcularInss to set
     */
    public void setCalcularInss(double calcularInss) {
        this.calcularInss = calcularInss;
    }

    /**
     * @return the afastado
     */
    public boolean isAfastado() {
        return afastado;
    }

    /**
     * @param afastado the afastado to set
     */
    public void setAfastado(boolean afastado) {
        this.afastado = afastado;
    }

    public Funcionario(int numMatricula, String nome, String liberado, String apresentaNivel, char nivel, double salario, double salarioLiquido, double calcularInss, boolean afastado) {
        this.numMatricula = numMatricula;
        this.nome = nome;
        this.liberado = liberado;
        this.apresentaNivel = apresentaNivel;
        this.nivel = nivel;
        this.salario = salario;
        this.salarioLiquido = salarioLiquido;
        this.calcularInss = calcularInss;
        this.afastado = afastado;
    }
    
    public Funcionario() {
    }

    
}