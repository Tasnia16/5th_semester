package Facade;

public class ShapeMaker {


        private Shape circle;
        private Shape square;
        private Shape triangle;


       public ShapeMaker()
        {
            circle=new Circle();
            square=new Square();
            triangle=new Triangle();
        }

        public void drawCircle()
        {
            circle.draw();
        }

        public void drawSquare()
        {
            square.draw();
        }

        public void drawTriangle()
        {
            triangle.draw();
        }

    }


