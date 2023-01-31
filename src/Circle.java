
//implementation des methodes
class Circle {
    double radius;
    double area;
    Circle (double r){
        radius = r;
        area = Math.PI * radius * radius;
    }

    void display (){
        System.out.println("the radius is " + radius);
        System.out.println("the area is " + area);
    }
     //4 - A no-arg constructor set the default value of radius to 1.
    Circle(){
        radius = 1;
    }
    //5 - A getArea() function is used to return the area of circle.

    double getArea(){
        area = Math.PI * radius * radius;

        return area;
    }

    //mise en place de l'application

    public class RadiusArea{
        public static void main(String[] args) {
            // appel des instances de classe pour les radius de chaque objet declare plus haut circle(double r);
            Circle objet1 = new  Circle(2.0);
            Circle objet2 = new Circle(12);
            Circle objet3 = new Circle(24);

            // affichage des objets

            objet1.display();
            objet2.display();
            objet3.display();

            // declaration des objet pour les areas  par le constructor plus haut circle(){radius =r};

            Circle objet4 = new Circle();
            Circle objet5 = new Circle();
            Circle objet6 = new Circle();

            //attribution des valeurs

            double area1 = objet4.getArea();
            double area2 = objet5.getArea();
            double area3 = objet6.getArea();

            //affichage

            System.out.println("the area1 is " + area1);
            System.out.println("the area2 is " + area2);
            System.out.println("the area3 is " + area3);

        }
    }




}
