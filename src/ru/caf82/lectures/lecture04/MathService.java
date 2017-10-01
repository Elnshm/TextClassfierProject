package ru.caf82.lectures.lecture04;

import ru.caf82.lectures.EmptyArrayException;
import ru.caf82.lectures.ExceptionBase;

public class MathService {

        public static double dotProduct(double[] a, double[] b){
          try {
              if (a.length == 0 || b.length == 0)
                  throw new EmptyArrayException();
              double result = 0;

              for (int i = 0; i < a.length; i++) {
                  result += a[i] * b[i];
              }

              return result;
          }
          catch(ExceptionBase ex) {
            return 0;
          }
        }

        public static double sigmoid(double x){

            double result=1/(1+Math.exp(-x));

            return result;

        }

        public static double sigmoid2(double[] x, double[] w){

            return sigmoid(dotProduct(x, w));

        }

        public static double[][] matrixNormalize(double[][] matrix){

            int rows = matrix.length;

            int cols = matrix[0].length;

            double[][] normalizeMatrix = new double[rows][cols];

            for(int i = 0; i<rows; i++){

                normalizeMatrix[i] = vectorNormalize(matrix[i]);

            }

            return normalizeMatrix;

        }

        public static double[] vectorNormalize(double[] vector) {

            double sum = 0;

            double value;

            double dispersion = 0;

            double[] normalizeVector = new double[vector.length];

            for (int i = 0; i<vector.length; i++){

                sum += vector[i];

            }

            value = sum/vector.length;

            for (int i = 0; i<vector.length; i++){

                dispersion += Math.pow(vector[i]-value, 2);

            }

            dispersion /= (vector.length-1);

            for (int i = 0; i<vector.length; i++){

                normalizeVector[i] = (vector[i]-value)/Math.sqrt(dispersion);

            }

            return normalizeVector;

        }

    }

}

    public static void main(String[]args) {

        double[] a = {1,2,3};

        double[] b = {4,5,6};

        double c = dotProduct(a,b);

    }

System.out.println(" dotProduct");

        System.out.println("a=( "+a[0]+","+a[1]+","+a[2]+")");

        System.out.println("b=( "+b[0]+","+b[1]+","+b[2]+")");

        System.out.println("(vec1*vec2)="+dotProduct(a,b));

        System.out.printl(" ");

        System.out.println("sigmoid");

        double x=3.4;

        System.out.println("x="+x);

        System.out.printl("1/(1+Math.exp(-x))="+sigmoid(x));

        System.out.printl(" ");

        System.out.println("vec1=( "+a[0]+","+a[1]+","+a[2]+")");

        System.out.println("vec2=( "+b[0]+","+b[1]+","+b[2]+")");

        System.out.println(sigmoid(a,b));

        System.out.printl(" ");

        System.out.println("vectorNormalize");

        System.out.println("a=( "+a[0]+","+a[1]+","+a[2]+")");

        double[] norm=vectorNormalize(a);

        System.out.println("after normalization a=("+norm[0]+","+norm[1]+","+norm[2]+")");

        System.out.printl(" ");

        System.out.printl("matrixNormalize");

        System.out.printl("Initial matrix");

        duuble[][] inmat={{1,2,3,4},

        {5,2,3.4,-5.6},

        {1.1,-2.3,8.3,0}};

        for (int i=0; i<inmat.lenght;i++){

        for (int k=0;k<inmat[i].lenght;k++){

        System.out.printl(inmat[i][k]+"");

        }

        System.out.println();

        }

        double aftmat=new double[inmat.lenght][];

        for (int j=0; j<inmat.lenght;j++);

        aftmat[j]=new double[inmat[j].lenght];

        aftmat=matixNormalize(inmat);

        System.out.println("after normalization:");

        for (int i=0; i<inmat.lenght;i++){

        for (int k=0; k<inmat.lenght;k++){

        System.out.print(aftmat[i][k])+"");

        }

        }
