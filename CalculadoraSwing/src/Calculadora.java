import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Esta clase representa una calculadora simple con una interfaz gráfica de usuario.
 * Permite a los usuarios realizar operaciones matemáticas básicas, como suma, resta, multiplicación,
 * división y calcular la raíz cuadrada de un número.
 */

public class Calculadora extends JFrame {
    private JPanel Calculadora;
    private JButton btnDos;
    private JButton btnCinco;
    private JButton btnOcho;
    private JButton btnPunto;
    private JButton btnUno;
    private JButton btnCuatro;
    private JButton btnSiete;
    private JButton btnCero;
    private JButton btnTres;
    private JButton btnSeis;
    private JButton btnNueve;
    private JButton btnResetear;
    private JButton btnDividir;
    private JButton btnSumar;
    private JButton btnRaiz;
    private JButton btnMultiplicar;
    private JButton btnIgual;
    private JButton btnRestar;
    private JTextField txtFieldNumeros;
    private JLabel labelNumero;
    private JButton btnSimbolo;


    private String cadena = "";
    private String operacion = "nula";

    private double numero;

    private double numeroDos;


    private double resultado;
    private boolean activado = true;
    private boolean punto = true;

    /**
     * Método principal de la aplicación que crea una instancia de la calculadora y muestra la interfaz gráfica.
     *
     * @param args Los argumentos de línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(new Calculadora().Calculadora);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);

        // Centrar la ventana en el medio de la pantalla
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }

    /**
     * Constructor de la clase Calculadora.
     * Inicializa la calculadora y los ActionListeners.
     */

    public Calculadora() {

        /**
         * Maneja el evento del botón uno.
         */
        btnUno.addActionListener(e -> {

            if (txtFieldNumeros.getText().equals("0")) {
                cadena = "1";
            } else {
                cadena += "1";
            }
            txtFieldNumeros.setText(cadena);
            activado = true;
        });
/**
 * Maneja el evento del botón dos.
 */
        btnDos.addActionListener(e -> {

            if (txtFieldNumeros.getText().equals("0")) {
                cadena = "2";
            } else {
                cadena += "2";
            }
            txtFieldNumeros.setText(cadena);
            activado = true;

        });

        /**
         * Maneja el evento del botón tres.
         */

        btnTres.addActionListener(e -> {

            if (txtFieldNumeros.getText().equals("0")) {
                cadena = "3";
            } else {
                cadena += "3";
            }
            txtFieldNumeros.setText(cadena);
            activado = true;

        });
/**
 * Maneja el evento del botón cuatro.
 */
        btnCuatro.addActionListener(e -> {

            if (txtFieldNumeros.getText().equals("0")) {
                cadena = "4";
            } else {
                cadena += "4";
            }
            txtFieldNumeros.setText(cadena);
            activado = true;

        });
/**
 * Maneja el evento del botón cinco.
 */
        btnCinco.addActionListener(e -> {

            if (txtFieldNumeros.getText().equals("0")) {
                cadena = "5";
            } else {
                cadena += "5";
            }
            txtFieldNumeros.setText(cadena);
            activado = true;

        });
        /**
         * Maneja el evento del botón seis.
         */

        btnSeis.addActionListener(e -> {

            if (txtFieldNumeros.getText().equals("0")) {
                cadena = "6";
            } else {
                cadena += "6";
            }
            txtFieldNumeros.setText(cadena);
            activado = true;

        });
/**
 * Maneja el evento del botón siete.
 */
        btnSiete.addActionListener(e -> {

            if (txtFieldNumeros.getText().equals("0")) {
                cadena = "7";
            } else {
                cadena += "7";
            }
            txtFieldNumeros.setText(cadena);
            activado = true;

        });
/**
 * Maneja el evento del botón ocho.
 */
        btnOcho.addActionListener(e -> {

            if (txtFieldNumeros.getText().equals("0")) {
                cadena = "8";
            } else {
                cadena += "8";
            }
            txtFieldNumeros.setText(cadena);
            activado = true;

        });
/**
 * Maneja el evento del botón nueve.
 */
        btnNueve.addActionListener(e -> {

            if (txtFieldNumeros.getText().equals("0")) {
                cadena = "9";
            } else {
                cadena += "9";
            }
            txtFieldNumeros.setText(cadena);
            activado = true;

        });
/**
 * Maneja el evento del botón cero.
 */
        btnCero.addActionListener(e -> {

            if (txtFieldNumeros.getText().equals("0")) {
                cadena = "0";
            } else {
                cadena += "0";
            }
            txtFieldNumeros.setText(cadena);
            activado = true;


        });

        /**
         * Maneja el evento del botón de suma.
         */
        btnSumar.addActionListener(e -> {

            if (activado == true) {
                if (cadena == "") {

                    txtFieldNumeros.setText("Introduce un numero");

                } else {

                    numero = Double.parseDouble(cadena);
                    labelNumero.setText(cadena + " + ");
                    operacion = "sumar";
                    cadena = "";
                    activado = false;


                }
            }

        });
        /**
         * Maneja el evento del botón de restar.
         */

        btnRestar.addActionListener(e -> {

            if (activado == true) {
                if (cadena == "") {

                    txtFieldNumeros.setText("Introduce un numero");

                } else {

                    numero = Double.parseDouble(cadena);
                    labelNumero.setText(cadena + " - ");
                    cadena = "";
                    operacion = "restar";

                    activado = false;


                }
            }
        });
        /**
         * Maneja el evento del botón de multiplicar.
         */

        btnMultiplicar.addActionListener(e -> {
            if (activado == true) {
                if (cadena == "") {

                    txtFieldNumeros.setText("Introduce un numero");

                } else {


                    numero = Double.parseDouble(cadena);
                    labelNumero.setText(cadena + " * ");
                    cadena = "";
                    operacion = "multiplicar";

                    activado = false;


                }
            }
        });
        /**
         * Maneja el evento del botón de dividir.
         */
        btnDividir.addActionListener(e -> {
            if (activado == true) {
                if (cadena == "") {

                    txtFieldNumeros.setText("Introduce un numero");

                } else {


                    numero = Double.parseDouble(cadena);
                    labelNumero.setText(cadena + " / ");
                    cadena = "";
                    operacion = "dividir";

                    activado = false;


                }
            }
        });
        /**
         * Maneja el evento del botón de raiz.
         */
        btnRaiz.addActionListener(e -> {
            if (cadena == "") {

                txtFieldNumeros.setText("Introduce un numero");

            } else {

                numero = Double.parseDouble(cadena);
                labelNumero.setText("sqrt(" + cadena + ")");
                resultado = Math.sqrt(numero);
                txtFieldNumeros.setText(String.format("%.2f", resultado));
                cadena = String.valueOf(resultado);
                punto = true;
            }

        });
        /**
         * Maneja el evento del botón igual.
         */
        btnIgual.addActionListener(e -> {

            if (operacion.equals("nula")) {

                txtFieldNumeros.setText("0");

            } else if (operacion.equals("sumar")) {

                numeroDos = Double.parseDouble(cadena);

                resultado = numero + numeroDos;
                txtFieldNumeros.setText(String.format("% .2f", resultado));
                cadena = String.valueOf(resultado);
                operacion = "nula";
            } else if (operacion.equals("restar")) {

                numeroDos = Double.parseDouble(cadena);

                resultado = numero - numeroDos;
                txtFieldNumeros.setText(String.format("% .2f", resultado));
                cadena = String.valueOf(resultado);
                operacion = "nula";
            } else if (operacion.equals("multiplicar")) {

                numeroDos = Double.parseDouble(cadena);


                resultado = numero * numeroDos;
                txtFieldNumeros.setText(String.format("% .2f", resultado));
                cadena = String.valueOf(resultado);
                operacion = "nula";

            } else if (operacion.equals("dividir")) {
                numeroDos = Double.parseDouble(cadena);

                if (numeroDos == 0) {

                    txtFieldNumeros.setText("IMPOSIBLE DIVIDIR ENTRE 0");
                } else {

                    numeroDos = Double.parseDouble(cadena);

                    resultado = numero / numeroDos;
                    txtFieldNumeros.setText(String.format("% .2f", resultado));
                    cadena = String.valueOf(resultado);
                    operacion = "nula";
                }
            }
            labelNumero.setText("");
            activado = true;
            punto = false;


        });



        btnPunto.addActionListener(e -> {
            if (punto == true) {

                if (cadena.equals("")) {

                    cadena = "0.";


                } else {

                    cadena += ".";


                }
                txtFieldNumeros.setText(cadena);
                punto = false;


            }

        });
        /**
         * Maneja el evento del botón resetar.
         */
        btnResetear.addActionListener(e -> {

            txtFieldNumeros.setText("0");
            labelNumero.setText("");
            cadena = "";
            operacion = "nula";
            activado = true;
            punto = true;


        });
        /**
         * Maneja el evento del botón negativo.
         */

        btnSimbolo.addActionListener(e -> {

            if (cadena == "") {

                cadena = "-" + cadena;


            }

            if (cadena.charAt(0) != '-') {

                cadena = "-" + cadena;

            } else {

                cadena = cadena.substring(1, cadena.length());

            }

            txtFieldNumeros.setText(cadena);

        });
    }

}
