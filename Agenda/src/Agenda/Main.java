package Agenda;
/*import java.util.Scanner;
import java.util.regex.Pattern;


public class Main {

				Scanner s = new Scanner(System.in);
				Pattern p = Pattern.compile("(?:(?:\\d{1,2}|1\\d{2}|2[0-4]\\d|25[0-5]).){3}(?:\\d{1,2}|1\\d{2}|2[0-4]\\d|25[0-5])");
				System.out.print("IP: ");
				System.out.println(p.matcher(s.nextLine()).matches());
			}
	
	
	*/
/*Usar*/

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.swing.JFrame;

public class Main {
	
	public  void Agenda(){
	
	}


	public static void main(String[] args) throws IOException {
		Map<String, String> agenda = new HashMap<>(); /*Se crear un mapa que tiene como clave y contenido dos String*/
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		boolean fin = false; 
		do {
			System.out.print("> ");
			Scanner s = new Scanner(in.readLine());
			int estado = 0;
			String token;
			String nombre = null;
			while (estado != 5) {
				switch (estado) {
				case 0:
					try {
						token = s.skip("fin|buscar|\\p{L}+(\\s+\\p{L}+)*").match().group();
						if (token.equals("fin")) {/*Si token almacena fin*/
							estado = 5;
							fin = true;/*Fin pasa a true y se acaba el programa*/
						}
						else if (token.equals("buscar"))/*Si almacena buscar pasa al estado 2*/
							estado = 2;/*Pasa al estado 2*/
						else {
							nombre = token;
							estado = 1;
						}
					} catch (NoSuchElementException e) {
						System.out.println("Se esperaba 'buscar' o 'fin' o un nombre");
						estado = 5;/*Se pasa al estado 5*/
					}
					break;
				case 1:
					try {
						s.skip("-");
						estado = 3;
					}catch (NoSuchElementException e) {
						System.out.println("Se esperaba '-'");
						estado = 5;
					}
					break;
				case 2:
					try {
						s.skip(":");
						estado = 4;
					}catch (NoSuchElementException e) {
						System.out.println("Se esperaba ':'");
						estado = 5;
					}
					break;
				case 3:
					try {
						token = s.skip("\\d{9}").match().group();
						agenda.put(nombre, token);
						estado = 5;
					}catch (NoSuchElementException e) {
						System.out.println("Se esperaba un teléfono");
						estado = 5;
					}
					break;
				case 4:
					try {
						token = s.skip("\\p{L}+(\\s+\\p{L}+)*").match().group();
						String telefono = agenda.get(token);
						if (telefono != null)
							System.out.println(token + " -> " + telefono);
						else
							System.out.println(token + " no se encuentra en la agenda");
						estado = 5;
					} catch (NoSuchElementException e) {
						System.out.println("Se esperaba un nombre");
						estado = 5;
					}
					break;
				}
			}
		} while (!fin);
	}
	
}



