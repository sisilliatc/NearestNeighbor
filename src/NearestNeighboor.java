import java.util.ArrayList;
import java.util.HashMap;

public class NearestNeighboor{
    public static void main(String[] args){
        ArrayList<NearestNeighboor.DataEntry> data = new ArrayList<NearestNeighboor.DataEntry>();
        data.add(new DataEntry(new double[]{5.1,3.5,1.4,0.2}, "Iris-setosa"));
        data.add(new DataEntry(new double[]{4.9,3.0,1.4,0.2}, "Iris-setosa"));
        data.add(new DataEntry(new double[]{4.7,3.2,1.3,0.2}, "Iris-setosa"));
        data.add(new DataEntry(new double[]{4.6,3.1,1.5,0.2}, "Iris-setosa"));
        data.add(new DataEntry(new double[]{5.0,3.6,1.4,0.2}, "Iris-setosa"));
        data.add(new DataEntry(new double[]{5.4,3.9,1.7,0.4}, "Iris-setosa"));
        data.add(new DataEntry(new double[]{4.6,3.4,1.4,0.3}, "Iris-setosa"));
        data.add(new DataEntry(new double[]{5.0,3.4,1.5,0.2}, "Iris-setosa"));
        data.add(new DataEntry(new double[]{4.4,2.9,1.4,0.2}, "Iris-setosa"));
        data.add(new DataEntry(new double[]{4.9,3.1,1.5,0.1}, "Iris-setosa"));
        data.add(new DataEntry(new double[]{5.4,3.7,1.5,0.2}, "Iris-setosa"));
        data.add(new DataEntry(new double[]{4.8,3.4,1.6,0.2}, "Iris-setosa"));
        data.add(new DataEntry(new double[]{4.8,3.0,1.4,0.1}, "Iris-setosa"));
        data.add(new DataEntry(new double[]{4.3,3.0,1.1,0.1}, "Iris-setosa"));
        data.add(new DataEntry(new double[]{5.8,4.0,1.2,0.2}, "Iris-setosa"));
        data.add(new DataEntry(new double[]{5.7,4.4,1.5,0.4}, "Iris-setosa"));
        data.add(new DataEntry(new double[]{5.4,3.9,1.3,0.4}, "Iris-setosa"));
        data.add(new DataEntry(new double[]{5.1,3.5,1.4,0.3}, "Iris-setosa"));
        data.add(new DataEntry(new double[]{5.7,3.8,1.7,0.3}, "Iris-setosa"));
        data.add(new DataEntry(new double[]{5.1,3.8,1.5,0.3}, "Iris-setosa"));
        data.add(new DataEntry(new double[]{5.4,3.4,1.7,0.2}, "Iris-setosa"));
        data.add(new DataEntry(new double[]{5.1,3.7,1.5,0.4}, "Iris-setosa"));
        data.add(new DataEntry(new double[]{4.6,3.6,1.0,0.2}, "Iris-setosa"));
        data.add(new DataEntry(new double[]{5.1,3.3,1.7,0.5}, "Iris-setosa"));
        data.add(new DataEntry(new double[]{4.8,3.4,1.9,0.2}, "Iris-setosa"));
        data.add(new DataEntry(new double[]{5.0,3.0,1.6,0.2}, "Iris-setosa"));
        data.add(new DataEntry(new double[]{5.0,3.4,1.6,0.4}, "Iris-setosa"));
        data.add(new DataEntry(new double[]{5.2,3.5,1.5,0.2}, "Iris-setosa"));
        data.add(new DataEntry(new double[]{5.2,3.4,1.4,0.2}, "Iris-setosa"));
        data.add(new DataEntry(new double[]{4.7,3.2,1.6,0.2}, "Iris-setosa"));
        data.add(new DataEntry(new double[]{4.8,3.1,1.6,0.2}, "Iris-setosa"));
        data.add(new DataEntry(new double[]{5.4,3.4,1.5,0.4}, "Iris-setosa"));
        data.add(new DataEntry(new double[]{5.2,4.1,1.5,0.1}, "Iris-setosa"));
        data.add(new DataEntry(new double[]{5.5,4.2,1.4,0.2}, "Iris-setosa"));
        data.add(new DataEntry(new double[]{4.9,3.1,1.5,0.1}, "Iris-setosa"));
        data.add(new DataEntry(new double[]{7.0,3.2,4.7,1.4}, "Iris-versicolor"));
        data.add(new DataEntry(new double[]{6.4,3.2,4.5,1.5}, "Iris-versicolor"));
        data.add(new DataEntry(new double[]{6.9,3.1,4.9,1.5}, "Iris-versicolor"));
        data.add(new DataEntry(new double[]{5.5,2.3,4.0,1.3}, "Iris-versicolor"));
        data.add(new DataEntry(new double[]{6.5,2.8,4.6,1.5}, "Iris-versicolor"));
        data.add(new DataEntry(new double[]{5.7,2.8,4.5,1.3}, "Iris-versicolor"));
        data.add(new DataEntry(new double[]{6.3,3.3,4.7,1.6}, "Iris-versicolor"));
        data.add(new DataEntry(new double[]{4.9,2.4,3.3,1.0}, "Iris-versicolor"));
        data.add(new DataEntry(new double[]{6.6,2.9,4.6,1.3}, "Iris-versicolor"));
        data.add(new DataEntry(new double[]{5.2,2.7,3.9,1.4}, "Iris-versicolor"));
        data.add(new DataEntry(new double[]{5.0,2.0,3.5,1.0}, "Iris-versicolor"));
        data.add(new DataEntry(new double[]{5.9,3.0,4.2,1.5}, "Iris-versicolor"));
        data.add(new DataEntry(new double[]{6.0,2.2,4.0,1.0}, "Iris-versicolor"));
        data.add(new DataEntry(new double[]{6.1,2.9,4.7,1.4}, "Iris-versicolor"));
        data.add(new DataEntry(new double[]{5.6,2.9,3.6,1.3}, "Iris-versicolor"));
        data.add(new DataEntry(new double[]{6.7,3.1,4.4,1.4}, "Iris-versicolor"));
        data.add(new DataEntry(new double[]{5.6,3.0,4.5,1.5}, "Iris-versicolor"));
        data.add(new DataEntry(new double[]{5.8,2.7,4.1,1.0}, "Iris-versicolor"));
        data.add(new DataEntry(new double[]{6.2,2.2,4.5,1.5}, "Iris-versicolor"));
        data.add(new DataEntry(new double[]{5.6,2.5,3.9,1.1}, "Iris-versicolor"));
        data.add(new DataEntry(new double[]{5.9,3.2,4.8,1.8}, "Iris-versicolor"));
        data.add(new DataEntry(new double[]{6.1,2.8,4.0,1.3}, "Iris-versicolor"));
        data.add(new DataEntry(new double[]{6.3,2.5,4.9,1.5}, "Iris-versicolor"));
        data.add(new DataEntry(new double[]{6.1,2.8,4.7,1.2}, "Iris-versicolor"));
        data.add(new DataEntry(new double[]{6.4,2.9,4.3,1.3}, "Iris-versicolor"));
        data.add(new DataEntry(new double[]{6.6,3.0,4.4,1.4}, "Iris-versicolor"));
        data.add(new DataEntry(new double[]{6.8,2.8,4.8,1.4}, "Iris-versicolor"));
        data.add(new DataEntry(new double[]{6.7,3.0,5.0,1.7}, "Iris-versicolor"));
        data.add(new DataEntry(new double[]{6.0,2.9,4.5,1.5}, "Iris-versicolor"));
        data.add(new DataEntry(new double[]{5.7,2.6,3.5,1.0}, "Iris-versicolor"));
        data.add(new DataEntry(new double[]{5.5,2.4,3.8,1.1}, "Iris-versicolor"));
        data.add(new DataEntry(new double[]{5.5,2.4,3.7,1.0}, "Iris-versicolor"));
        data.add(new DataEntry(new double[]{5.8,2.7,3.9,1.2}, "Iris-versicolor"));
        data.add(new DataEntry(new double[]{6.0,2.7,5.1,1.6}, "Iris-versicolor"));
        data.add(new DataEntry(new double[]{5.4,3.0,4.5,1.5}, "Iris-versicolor"));
        data.add(new DataEntry(new double[]{6.3,3.3,6.0,2.5}, "Iris-virginica"));
        data.add(new DataEntry(new double[]{5.8,2.7,5.1,1.9}, "Iris-virginica"));
        data.add(new DataEntry(new double[]{7.1,3.0,5.9,2.1}, "Iris-virginica"));
        data.add(new DataEntry(new double[]{6.3,2.9,5.6,1.8}, "Iris-virginica"));
        data.add(new DataEntry(new double[]{6.5,3.0,5.8,2.2}, "Iris-virginica"));
        data.add(new DataEntry(new double[]{7.6,3.0,6.6,2.1}, "Iris-virginica"));
        data.add(new DataEntry(new double[]{4.9,2.5,4.5,1.7}, "Iris-virginica"));
        data.add(new DataEntry(new double[]{7.3,2.9,6.3,1.8}, "Iris-virginica"));
        data.add(new DataEntry(new double[]{6.7,2.5,5.8,1.8}, "Iris-virginica"));
        data.add(new DataEntry(new double[]{7.2,3.6,6.1,2.5}, "Iris-virginica"));
        data.add(new DataEntry(new double[]{6.5,3.2,5.1,2.0}, "Iris-virginica"));
        data.add(new DataEntry(new double[]{6.4,2.7,5.3,1.9}, "Iris-virginica"));
        data.add(new DataEntry(new double[]{6.8,3.0,5.5,2.1}, "Iris-virginica"));
        data.add(new DataEntry(new double[]{5.7,2.5,5.0,2.0}, "Iris-virginica"));
        data.add(new DataEntry(new double[]{5.8,2.8,5.1,2.4}, "Iris-virginica"));
        data.add(new DataEntry(new double[]{6.4,3.2,5.3,2.3}, "Iris-virginica"));
        data.add(new DataEntry(new double[]{6.5,3.0,5.5,1.8}, "Iris-virginica"));
        data.add(new DataEntry(new double[]{7.7,3.8,6.7,2.2}, "Iris-virginica"));
        data.add(new DataEntry(new double[]{7.7,2.6,6.9,2.3}, "Iris-virginica"));
        data.add(new DataEntry(new double[]{6.0,2.2,5.0,1.5}, "Iris-virginica"));
        data.add(new DataEntry(new double[]{6.9,3.2,5.7,2.3}, "Iris-virginica"));
        data.add(new DataEntry(new double[]{5.6,2.8,4.9,2.0}, "Iris-virginica"));
        data.add(new DataEntry(new double[]{7.7,2.8,6.7,2.0}, "Iris-virginica"));
        data.add(new DataEntry(new double[]{6.3,2.7,4.9,1.8}, "Iris-virginica"));
        data.add(new DataEntry(new double[]{6.7,3.3,5.7,2.1}, "Iris-virginica"));
        data.add(new DataEntry(new double[]{7.2,3.2,6.0,1.8}, "Iris-virginica"));
        data.add(new DataEntry(new double[]{6.2,2.8,4.8,1.8}, "Iris-virginica"));
        data.add(new DataEntry(new double[]{6.1,3.0,4.9,1.8}, "Iris-virginica"));
        data.add(new DataEntry(new double[]{6.4,2.8,5.6,2.1}, "Iris-virginica"));
        data.add(new DataEntry(new double[]{7.2,3.0,5.8,1.6}, "Iris-virginica"));
        data.add(new DataEntry(new double[]{7.4,2.8,6.1,1.9}, "Iris-virginica"));
        data.add(new DataEntry(new double[]{7.9,3.8,6.4,2.0}, "Iris-virginica"));
        data.add(new DataEntry(new double[]{6.4,2.8,5.6,2.2}, "Iris-virginica"));
        data.add(new DataEntry(new double[]{6.3,2.8,5.1,1.5}, "Iris-virginica"));
        data.add(new DataEntry(new double[]{6.1,2.6,5.6,1.4}, "Iris-virginica"));

        NearestNeighboor nn = new NearestNeighboor(data, 3); //3 neighbours
        System.out.println("Data Test 1 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{7.7,3.0,6.1,2.3},"Ignore")));
        System.out.println("Data Test 2 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{6.3,3.4,5.6,2.4},"Ignore")));
        System.out.println("Data Test 3 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{6.4,3.1,5.5,1.8},"Ignore")));
        System.out.println("Data Test 4 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{6.0,3.0,4.8,1.8},"Ignore")));
        System.out.println("Data Test 5 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{6.9,3.1,5.4,2.1},"Ignore")));
        System.out.println("Data Test 6 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{6.7,3.1,5.6,2.4},"Ignore")));
        System.out.println("Data Test 7 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{6.9,3.1,5.1,2.3},"Ignore")));
        System.out.println("Data Test 8 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{5.8,2.7,5.1,1.9},"Ignore")));
        System.out.println("Data Test 9 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{6.8,3.2,5.9,2.3},"Ignore")));
        System.out.println("Data Test 10 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{6.7,3.3,5.7,2.5},"Ignore")));
        System.out.println("Data Test 11 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{6.7,3.0,5.2,2.3},"Ignore")));
        System.out.println("Data Test 12 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{6.3,2.5,5.0,1.9},"Ignore")));
        System.out.println("Data Test 13 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{6.5,3.0,5.2,2.0},"Ignore")));
        System.out.println("Data Test 14 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{6.2,3.4,5.4,2.3},"Ignore")));
        System.out.println("Data Test 15 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{5.9,3.0,5.1,1.8},"Ignore")));

        System.out.println("Data Test 16 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{6.0,3.4,4.5,1.6},"Ignore")));
        System.out.println("Data Test 17 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{6.7,3.1,4.7,1.5},"Ignore")));
        System.out.println("Data Test 18 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{6.3,2.3,4.4,1.3},"Ignore")));
        System.out.println("Data Test 19 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{5.6,3.0,4.1,1.3},"Ignore")));
        System.out.println("Data Test 20 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{5.5,2.5,4.0,1.3},"Ignore")));
        System.out.println("Data Test 21 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{5.5,2.6,4.4,1.2},"Ignore")));
        System.out.println("Data Test 22 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{6.1,3.0,4.6,1.4},"Ignore")));
        System.out.println("Data Test 23 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{5.8,2.6,4.0,1.2},"Ignore")));
        System.out.println("Data Test 24 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{5.0,2.3,3.3,1.0},"Ignore")));
        System.out.println("Data Test 25 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{5.6,2.7,4.2,1.3},"Ignore")));
        System.out.println("Data Test 26 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{5.7,3.0,4.2,1.2},"Ignore")));
        System.out.println("Data Test 27 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{5.7,2.9,4.2,1.3},"Ignore")));
        System.out.println("Data Test 28 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{6.2,2.9,4.3,1.3},"Ignore")));
        System.out.println("Data Test 29 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{5.1,2.5,3.0,1.1},"Ignore")));
        System.out.println("Data Test 30 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{5.7,2.8,4.1,1.3},"Ignore")));

        System.out.println("Data Test 31 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{5.0,3.2,1.2,0.2},"Ignore")));
        System.out.println("Data Test 32 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{5.5,3.5,1.3,0.2},"Ignore")));
        System.out.println("Data Test 33 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{4.9,3.1,1.5,0.1},"Ignore")));
        System.out.println("Data Test 34 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{4.4,3.0,1.3,0.2},"Ignore")));
        System.out.println("Data Test 35 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{5.1,3.4,1.5,0.2},"Ignore")));
        System.out.println("Data Test 36 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{5.0,3.5,1.3,0.3},"Ignore")));
        System.out.println("Data Test 37 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{4.5,2.3,1.3,0.3},"Ignore")));
        System.out.println("Data Test 38 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{4.4,3.2,1.3,0.2},"Ignore")));
        System.out.println("Data Test 39 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{5.0,3.5,1.6,0.6},"Ignore")));
        System.out.println("Data Test 40 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{5.1,3.8,1.9,0.4},"Ignore")));
        System.out.println("Data Test 41 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{4.8,3.0,1.4,0.3},"Ignore")));
        System.out.println("Data Test 42 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{5.1,3.8,1.6,0.2},"Ignore")));
        System.out.println("Data Test 43 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{4.6,3.2,1.4,0.2},"Ignore")));
        System.out.println("Data Test 44 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{5.3,3.7,1.5,0.2},"Ignore")));
        System.out.println("Data Test 45 Diklasifikasikan pada kelas: "+nn.classify(new DataEntry(new double[]{5.0,3.3,1.4,0.2},"Ignore")));
    }


    private int k;
    private ArrayList<Object> classes;
    private ArrayList<DataEntry> dataSet;
    /**
     *
     * @param dataSet The set
     * @param k The number of neighbours to use
     */
    public NearestNeighboor(ArrayList<DataEntry> dataSet, int k){
        this.classes = new ArrayList<Object>();
        this.k = k;
        this.dataSet = dataSet;

        //Load different classes
        for(DataEntry entry : dataSet){
            if(!classes.contains(entry.getY())) classes.add(entry.getY());
        }
    }

    private DataEntry[] getNearestNeighboorType(DataEntry x){
        DataEntry[] retur = new DataEntry[this.k];
        double fjernest = Double.MIN_VALUE;
        int index = 0;
        for(DataEntry tse : this.dataSet){
            double distance = distance(x,tse);
            if(retur[retur.length-1] == null){ //Hvis ikke fyldt
                int j = 0;
                while(j < retur.length){
                    if(retur[j] == null){
                        retur[j] = tse; break;
                    }
                    j++;
                }
                if(distance > fjernest){
                    index = j;
                    fjernest = distance;
                }
            }
            else{
                if(distance < fjernest){
                    retur[index] = tse;
                    double f = 0.0;
                    int ind = 0;
                    for(int j = 0; j < retur.length; j++){
                        double dt = distance(retur[j],x);
                        if(dt > f){
                            f = dt;
                            ind = j;
                        }
                    }
                    fjernest = f;
                    index = ind;
                }
            }
        }
        return retur;
    }

    private static double convertDistance(double d){
        return 1.0/d;
    }

    /**
     * Computes Euclidean distance
     * @param a From
     * @param b To
     * @return Distance
     */
    public static double distance(DataEntry a, DataEntry b){
        double distance = 0.0;
        int length = a.getX().length;
        for(int i = 0; i < length; i++){
            double t = a.getX()[i]-b.getX()[i];
            distance = distance+t*t;
        }
        return Math.sqrt(distance);
    }
    /**
     *
     * @param e Entry to be classifies
     * @return The class of the most probable class
     */
    public Object classify(DataEntry e){
        HashMap<Object,Double> classcount = new HashMap<Object,Double>();
        DataEntry[] de = this.getNearestNeighboorType(e);
        for(int i = 0; i < de.length; i++){
            double distance = NearestNeighboor.convertDistance(NearestNeighboor.distance(de[i], e));
            if(!classcount.containsKey(de[i].getY())){
                classcount.put(de[i].getY(), distance);
            }
            else{
                classcount.put(de[i].getY(), classcount.get(de[i].getY())+distance);
            }
        }
        //Find right choice
        Object o = null;
        double max = 0;
        for(Object ob : classcount.keySet()){
            if(classcount.get(ob) > max){
                max = classcount.get(ob);
                o = ob;
            }
        }

        return o;
    }

    public static class DataEntry{
        private double[] x;
        private Object y;

        public DataEntry(double[] x, Object y){
            this.x = x;
            this.y = y;
        }

        public double[] getX(){
            return this.x;
        }

        public Object getY(){
            return this.y;
        }
    }
}