public class Geometry extends Maths{
    float areaOfRectangle(float length,float breadth){
        return multiply(length,breadth);
    }

    float areaOfSquare(float length){
        return powTwo(length);

    }

    float areaOfTriangle(float length,float breadth){
        return divide(1,2)* length* breadth;
    }
}
