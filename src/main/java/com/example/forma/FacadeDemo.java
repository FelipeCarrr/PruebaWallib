package com.example.forma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FacadeDemo {

		public static void main(String[] args) {
			ShapeMaker shapeMaker = new ShapeMaker();

			shapeMaker.drawCircle();
			shapeMaker.drawRectangle();
			shapeMaker.drawSquare();
		}
		static class Circulo implements Forma {
			@Override
			public void dibujar() {
				System.out.println("Dibujando un círculo");
			}
		}

		static class Rectangulo implements Forma {
			@Override
			public void dibujar() {
				System.out.println("Dibujando un rectángulo");
			}
		}

		static class Cuadrado implements Forma {
			@Override
			public void dibujar() {
				System.out.println("Dibujando un cuadrado");
			}
		}
		static class ShapeMaker {
			private final Forma circulo;
			private final Forma rectangulo;
			private final Forma cuadrado;

			public ShapeMaker() {
				circulo = new Circulo();
				rectangulo = new Rectangulo();
				cuadrado = new Cuadrado();
			}

			public void drawCircle() {
				circulo.dibujar();
			}

			public void drawRectangle() {
				rectangulo.dibujar();
			}

			public void drawSquare() {
				cuadrado.dibujar();
			}
		}

	}


