package com.mycompany.administracaoescolar;

class Pessoa {
    String nome;
    boolean educador=false;
    
    public Pessoa(String nome) {
        /*Representa a instância que está sendo criada pelo construtor, garantindo que toda Pessoa tenha um nome*/
    this.nome = nome;}
    
        public boolean iseducador() {
        return educador;
    }

    public void seteducador(boolean educador) {
        this.educador = educador;
    }
    
    public String estudo(){
        if(this.educador) {
            return "Ensinando...";
        } else return "Aprendendo...";
        }
                    
        }
