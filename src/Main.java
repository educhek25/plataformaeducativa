import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                final String usuarioCorrecto = "admin";
                final String contrasenaCorrecta = "123";
                int intentos = 3;

                while (intentos > 0) {
                    System.out.print("Ingrese su usuario: ");
                    String usuario = sc.nextLine();

                    System.out.print("Ingrese su contraseña: ");
                    String contrasena = sc.nextLine();

                    if (usuario.equals(usuarioCorrecto) && contrasena.equals(contrasenaCorrecta)) {
                        System.out.println("Inicio de sesión exitoso.\n");

                        System.out.println("Seleccione su rol:");
                        System.out.println("1 - Profe");
                        System.out.println("2 - Estudiante");
                        String rol = sc.nextLine();

                        switch (rol) {
                            case "1":
                                System.out.println("\nBienvenido profe, puede ingresar las notas de un estudiante:");
                                double nota, sumaNotas = 0;
                                for (int i = 1; i <= 3; i++) {
                                    do {
                                        System.out.print("Ingrese la nota " + i + " (0 a 5): ");
                                        nota = sc.nextDouble();
                                        if (nota < 0 || nota > 5) {
                                            System.out.println("Nota inválida. Intente nuevamente.");
                                        }
                                    } while (nota < 0 || nota > 5);
                                    sumaNotas += nota;
                                }
                                double promedio = sumaNotas / 3;
                                System.out.println("Promedio final del estudiante: " + promedio);
                                break;

                            case "2":
                                System.out.println("\nBienvenido estudiante. Menú de materias:");
                                System.out.println("1 - Matemáticas");
                                System.out.println("2 - Español");
                                System.out.println("3 - Ciencias");
                                System.out.println("4 - Historia");
                                System.out.println("5 - Inglés");
                                System.out.print("Seleccione una opción para ver detalles (o cualquier otra tecla para salir): ");
                                String materia = sc.nextLine();
                                switch (materia) {
                                    case "1":
                                        System.out.println("Matemáticas: Álgebra, Geometría, Cálculo.");
                                        break;
                                    case "2":
                                        System.out.println("Español: Literatura, Gramática, Ortografía.");
                                        break;
                                    case "3":
                                        System.out.println("Ciencias: Física, Química, Biología.");
                                        break;
                                    case "4":
                                        System.out.println("Historia: Historia universal y de Colombia.");
                                        break;
                                    case "5":
                                        System.out.println("Inglés: Lectura, escritura y conversación.");
                                        break;
                                    default:
                                        System.out.println("Saliendo del menú.");
                                        break;
                                }
                                break;

                            default:
                                System.out.println("Opción de rol no válida.");
                                break;
                        }

                        break; // Termina el programa tras acceso exitoso
                    } else {
                        intentos--;
                        System.out.println("Credenciales incorrectas. Intentos restantes: " + intentos + "\n");
                    }
                }

                if (intentos == 0) {
                    System.out.println("Acceso bloqueado por demasiados intentos fallidos.");
                }

                sc.close();
            }
        }
