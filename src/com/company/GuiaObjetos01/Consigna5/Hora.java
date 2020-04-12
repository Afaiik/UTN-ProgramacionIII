package com.company.GuiaObjetos01.Consigna5;


import java.time.LocalDateTime;

public class Hora {
    private int Hora;
    private int Minuto;
    private int Segundo;

    public Hora(){
        //Constructor por defecto asigna la hora del momento de instanciar el objeto
        LocalDateTime now = LocalDateTime.now();
        this.Hora = now.getHour();
        this.Minuto = now.getMinute();
        this.Segundo = now.getSecond();
    }

    public Hora(int hora, int minuto, int segundo) {
        if(hora > 23 || hora < 0)
            throw new IllegalArgumentException("Argumento 'Hora' fuera de los limites permitidos");
        else if (minuto > 59 || minuto < 0)
            throw new IllegalArgumentException("Argumento 'Minuto' fuera de los limites permitidos");
        else if(segundo > 59 || segundo < 0)
            throw new IllegalArgumentException("Argumento 'Segundo' fuera de los limites permitidos");
        else{
            Hora = hora;
            Minuto = minuto;
            Segundo = segundo;
        }
    }

    public int getHora() {
        return Hora;
    }

    public void setHora(int hora) {
        if(hora > 23 || hora < 0)
            throw new IllegalArgumentException("Argumento 'Hora' fuera de los limites permitidos");
        else
            Hora = hora;
    }

    public int getMinuto() {
        return Minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto > 59 || minuto < 0)
            throw new IllegalArgumentException("Argumento 'Minuto' fuera de los limites permitidos");
        else
            Minuto = minuto;
    }

    public int getSegundo() {
        return Segundo;
    }

    public void setSegundo(int segundo) {
        if(segundo > 59 || segundo < 0)
            throw new IllegalArgumentException("Argumento 'Segundo' fuera de los limites permitidos");
        else
            Segundo = segundo;
    }

    @Override
    public String toString() {
        String horaString;
        String minutoString;
        String segundoString;
        String separador = ":";

        if(getHora() < 10)
            horaString = "0"+getHora();
        else
            horaString = ""+getHora();
        if(getMinuto() < 10)
            minutoString = "0"+getMinuto();
        else
            minutoString = ""+getMinuto();
        if(getSegundo() < 10)
            segundoString = "0"+getSegundo();
        else
            segundoString = ""+getSegundo();

        return horaString+separador+minutoString+separador+segundoString;
    }
}
