package org.example;



public class TMCC {
    public static void main(String[] args) {
        Figure[] figures = {
                new Line(),
                new Square(),
                new Z()
        };

        //создайте массив, содержащий 3 описанных в задании фигуры либо названия трех фигур на ваше усмотрение
        for (int i = 0; i < figures.length; i++) {
            figures[i].moveLeft();
            figures[i].moveRight();
            figures[i].rotate();
            figures[i].moveDown();
            System.out.println();
        }
    }
}

