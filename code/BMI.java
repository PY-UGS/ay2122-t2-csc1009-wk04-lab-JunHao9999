import java.util.*;


public class BMI {
    Scanner sc=new Scanner(System.in);
    final double kg=0.45359237;
    final double meters=0.0254;
    private double height;
    private double weight;

    //don't even need to create default constructor
    public BMI(){
        this.height=height;
        this.weight=weight;
    }

    //getter and setters
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(){
        this.weight=weight;
    }

    //return bmi
    public double setDetails(){
        System.out.print("Input weight in pounds: ");
        double pounds=sc.nextDouble();
        System.out.print("Input height in inches: ");
        double inches=sc.nextDouble();
        // weight in kilogram and dividing it by the square of your
        //height in meters.
        double bmi=(pounds*kg)/((inches*meters)*(inches*meters));
        return bmi;
    }

    public void getDetails(double bmi){
        System.out.println("BMI is "+bmi);
        if (bmi<18.5)
            System.out.println("Underweight");
        else if(bmi>=18.5 && bmi<25)
            System.out.println("Normal");
        else if(bmi>=25.0 && bmi<30)
            System.out.println("Overweight");
        else if (bmi>=30)
            System.out.println("Obese");
        else
            System.out.println("error");

    }
}


