
class Result{

    private double num = .0;
    private Vector vec = null;

    public Result(double n){ this.num = n;}
    public Result(Vector vec){ this.vec = vec;}

    public Vector vector(){ return vec;}
    public double number(){ return num;}

    @Override
    public String toString(){
        if (vec != null){ return vec.toString();}
        return String.valueOf(num);
    }

}