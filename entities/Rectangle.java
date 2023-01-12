/* Rio de Janeiro 11/01/2023
 Exercício 1
Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal.
Usar uma classe como mostrado no projeto abaixo:

Rectangle
- Width: double
- Height: double

+ Area(): double
+ Perimeter(): double
+ Diagonal(): double

Exemplo:

Enter rectangle width and height:
3.00
4.00
AREA = 12.00
PERIMETER = 14.00
DIAGONAL = 5.00
 */
package entities;

public class Rectangle {

	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return 2 * (width + height);
	}
	
	public double diagonal() {
		return Math.sqrt(width * width + height * height);
	}
	
}
