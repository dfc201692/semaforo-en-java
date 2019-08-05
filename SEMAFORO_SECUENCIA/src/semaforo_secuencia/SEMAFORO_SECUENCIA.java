package semaforo_secuencia;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.Timer;
import java.util.TimerTask;

/* @author David Cruz */
public class SEMAFORO_SECUENCIA {

    static int contador = 0;

    public static void main(String[] args) {

        int velocidad = 2; //velocidad en segundos de la imagen

        Timer timer;
        TimerTask tarea;

        int velmil = velocidad * 1000;

        SEMAFORO semaforo = new SEMAFORO();
        semaforo.setVisible(true);

        tarea = new TimerTask() {
            @Override
            public void run() {

                Icon icono;
                switch (contador) {
                    case 0:
                        contador = 1;
                        icono = new ImageIcon(getClass().getResource("/iconos/amarillo.png"));
                        semaforo.jLabel1.setIcon(icono);
                        break;
                    case 1:
                        contador = 2;
                        icono = new ImageIcon(getClass().getResource("/iconos/verde.png"));
                        semaforo.jLabel1.setIcon(icono);
                        break;
                    case 2:
                        contador = 0;
                        icono = new ImageIcon(getClass().getResource("/iconos/rojo.png"));
                        semaforo.jLabel1.setIcon(icono);
                        break;
                    case 3:
                        contador = 1;
                        icono = new ImageIcon(getClass().getResource("/iconos/amarilo.png"));
                        semaforo.jLabel1.setIcon(icono);
                        break;

                }

            }
        };

        timer = new Timer();
        timer.scheduleAtFixedRate(tarea, velmil, velmil);

    }

}
