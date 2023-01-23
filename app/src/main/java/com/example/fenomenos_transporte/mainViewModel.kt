package com.example.fenomenos_transporte

import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    data class problemas(var problema: String, var solucion: String) {
    }
    data class problemasR(var problemaR: String, var solucionR: String) {
    }
    data class problemasV(var problemaV: String, var solucionV: String) {
    }
    data class problemasC(var problemaC: String, var solucionC: String) {
    }
    data class problemasT(var problemaT: String, var solucionT: String) {
    }

    val actividades: Array<problemas> = arrayOf(
        problemas(
            "Z = F*a^2" + System.lineSeparator() +
                    " Donde: a = longitud y F = fuerza", "[Z] = ML^3T^-2"
        ),
        problemas(
            "G = (F*(L)^2)/M^2" + System.lineSeparator() +
                    " Donde: F = fuerza, L = longitud y M = masa",
            "[G] = M^-1L^3T^-2"
        ),
        problemas(
            "P = F/A " + System.lineSeparator() +
                    " Donde: F= fuerza y A = area", "[P]=ML^-1T^-2"
        ),
        problemas(
            "X = at/V " + System.lineSeparator() +
                    "Donde: a = aceleracion, V = velocidad y t = tiempo",
            "[x] = L^-2T^-1"
        ),
        problemas(
            "A = v/t " + System.lineSeparator() +
                    " Donde: v = velocidad y t = tiempo", "[A] = LT^-2"
        ),
        problemas(
            "D = m/v " + System.lineSeparator() +
                    "Donde: m = masa y v = volumen", "D = ML^-3"
        )
    )
    val actividadesV: Array<problemasV> = arrayOf(
        problemasV("El sistema de embrague que se muestra se utiliza para transmitir el par a traves de una pelicula de aceite de 3mm dd espesor con u= 0.38 Ns/m^2" +
                "entre dos discos identicos de 30 cm de diametro. Cuando el eje de conduccion gira a una velocidad de 1450 rpm, se obserca que el eje accionado gira a 1398 rpm." +
                "Determine el par de torsion transmitido en lbf.ft.", "0.405 lbf.ft"
        ),
        problemasV(
            "Una capa delgada de glicerina fluye hacia abajo de una placa inclinada, Para h = 0.3 in y a 20 grados, determine la velocidad de la superficie. Tenga en cuenta que," +
                    "para el equilibrio, el componente de peso que actua en paralelo a la superficie de la placa debe ser equilibrado por la fuerza de cizalladura desarrollada a lo largo de la superficie de la placa, exprese su velociada en ft/s.",
            "0.285 ft/s"
        ),
        problemasV(
            "Contrariamente a lo que se puede esperar, una bola de aluminio puede flotar en el agua al efecto de tension superficial. Determine el diametro de la bola de aluminio que flotara en el agua a 20 grados, si la densidad del aluminio es 7800 kg/m^3.",
            "0.161 in"
        )
    )
    val actividadesR: Array<problemasR> = arrayOf(
        problemasR("Calcular el numero de reynols de una tuberia de 4 pulg de diamtero que conduce 0.20 pie^3/s de glicerina (sg =1.26) a 100 grados farenheit. ", "248.54"),
        problemasR("Calcule el número de Reynolds para el flujo de 325 L/min de agua a 10°C en unatubería de acero estándar de 2 pulg, con espesor de pared de 0.065 pulg.", "1.12*10^5"),
        problemasR("Calcule el número de Reynolds para la circulación del agua a 60 grados Farenheit, en una tubería de 2 pulg, cedula 40, si el flujo volumétrico es 0.25pie3/s", "1.532*10^5")
    )
    val actividadesC: Array<problemasC> = arrayOf(
        problemasC("Una chimenea de hormigón armado con diámetro interior D2 = 800 mm, diámetro exterior D3 = 1300 mm, debe ser revestida por dentro con refractario. Determinar la temperatura de la superficie exterior de la chimenea, " +
                "partiendo de la condición de que las pérdidas de calos de un metro de la chimenea no excedan de 2000 W/m, " +
                "y de que la temperatura T2 de la superficie interior de la pared de hormigón armado no supere 200 °C","59.5 grados C"),
        problemasC("Una persona está de pie en una habitación con brisa a 18°C. Determine la tasa total de transferencia de calor desde esta persona, si el área superficial expuesta y la temperatura de su piel son 1.6 m2 y 36°C, respectivamente, " +
                "y el coeficiente de transferencia de calor por convección es 6 W/m2*K. ", "172.8 Watts (W)."),
        problemasC("Calcular las pérdidas de calor de 1m de una tubería no aislada con diámetro d1/d2 = 150/165 mm tenía al aire libre cuando por el interior de ésta corre agua con una temperatura media T1 = 90°C y la temperatura ambiente Ta = -15°C." +
                " El coeficiente de conductividad térmica del material del tubo es K = 50 W/m°C. ","88.44 grados C")
    )
    val actividadesT: Array<problemasT> = arrayOf(problemasT("Crear los ejemplos", "0"))

    val aleatorio = (0..5).shuffled().last()
    val ejercicio = actividades[aleatorio]
    val solucion = ejercicio.solucion
    val problema = ejercicio.problema

    val ejercicioV = actividadesV[aleatorio]
    val solucionVis = ejercicioV.solucionV
    val problemaVis = ejercicioV.problemaV

    val ejercicioC = actividadesC[aleatorio]
    val solucionCon = ejercicioC.solucionC
    val problemasCon = ejercicioC.problemaC

    val ejercicioR = actividadesR[aleatorio]
    val solucionRey = ejercicioR.solucionR
    val problemasRey = ejercicioR.problemaR

    val ejercicioT = actividadesT[aleatorio]
    val solucionTra = ejercicioT.solucionT
    val problemasTra= ejercicioT.problemaT

}