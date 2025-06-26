import java.util.List;
import java.util.ArrayList;

public class Vector{

    private List<Double> content = new ArrayList<>();
    public Vector(){}

    public void insert(double d){content.add(d);}

    public Vector multAll(double d){
        Vector res = new Vector();
        for ( double n : content){
            res.insert(d*n);
        }
        return res;
    }

    public void verifySize(Vector other)throws Exception{
        if (size() != other.size()){
            throw new Exception("Vectors must have the same size!");
        }
       
    }


    /*
    *Sums all the elements of the two vectors
    *op = 1  -> add
    *op = -1 -> sub
    */
    public Vector add(Vector other, int op)throws Exception{
        verifySize(other);

        // verify operator
        if ( Math.abs(op) != 1) {
            throw new Exception("Op must be 1 or -1.");
        }

        Vector res = new Vector();
        for ( int i = 0; i < size(); ++i){
            res.insert(at(i) + other.at(i)*op );
        }

        return res;
    }

    public double dot(Vector other) throws Exception{
        
        verifySize(other);
        
        double res = 0;
        for ( int i = 0; i < size(); ++i ){
            res += at(i) * other.at(i);
        }

        return res;
    }

    public double at(int i)throws Exception{ 
        if (i >= size()){
            throw new Exception("Index out of range!");
        }
        return content.get(i);
    }

    public int size(){ return content.size();}

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < content.size(); i++) {
            sb.append(content.get(i));
            if (i != content.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");

        return sb.toString();
    }

}