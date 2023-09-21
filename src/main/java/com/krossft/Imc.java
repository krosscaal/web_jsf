package com.krossft;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "imcBean", eager = true)
public class Imc {
    private Double peso;
    private Double altura;
    private String mensagem;

    private Double imc = 0.0;

    public String onCalcularImc(){
        if((peso == null) || (altura == null)){
            mensagem = "Entre com valores válidos";
            return "result";
        }
        imc=peso /((altura/100) * (altura/100));
        if(imc < 18.5){
            mensagem = "O seu IMC foir calculado com sucesso! \"Você está Abaixo do peso \"";
        }
        if(imc >= 18.5 && imc <= 24.89){
            mensagem = "O seu IMC foir calculado com sucesso! \"Você está com peso normal \"";
        }
        if(imc >= 25 && imc <= 29.9){
            mensagem = "O seu IMC foir calculado com sucesso! \"Você está Acima do peso(sobrepeso) \"";
        }
        if(imc >=30 && imc <= 34.9){
            mensagem = "O seu IMC foir calculado com sucesso! \"Você está com Obesidade I \"";
        }
        if(imc > 35 && imc <= 39.9){
            mensagem = "O seu IMC foir calculado com sucesso! \"Você está com Obesidade II \"";
        }
        if(imc > 40){
            mensagem = "O seu IMC foir calculado com sucesso! \"Você está com Obesidade III \"";
        }

        return "result";
    }


    public Double getImc() {
        return imc;
    }

    public void setImc(Double imc) {
        this.imc = imc;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
