package org.example.AplicacionBancaria;

import java.util.HashMap;
import java.util.Map;

public class Banco {
    private HashMap<String,Double> mapaBanco = new HashMap<>();

    public void depositar(String cuenta,double monto){

        for (Map.Entry<String,Double> mapita : mapaBanco.entrySet()){
            if (mapita.getKey().equals(cuenta)){
                double saldo = mapita.getValue()+monto;

                mapita.setValue(saldo);
            }
        }

    }

    public void retirar(String cuenta,double monto){

        for (Map.Entry<String,Double> mapita : mapaBanco.entrySet()){
            if (mapita.getKey().equals(cuenta)){
                double saldo = mapita.getValue()-monto;

                mapita.setValue(saldo);
            }
        }
    }

    public double consultarSaldo(String cuenta){

        return mapaBanco.get(cuenta);
    }
}
