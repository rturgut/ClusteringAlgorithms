package org.resat;

public class KMeans {

    /**
     * Construct a default KMEans cluesterer with 20 iterations and 3 clusters
     */
    public KMeans() {
        //TODO: implement me
    }


    /**
     * Construct a KMeans clusteres with given parameters
     *
     * @param clusters
     * @param iterators
     */
    public KMeans(int clusters, int iterators) {
        //TODO: implement me
    }

    /**
     * Rerturns centroids for initialization based on a math.random
     *
     * @return
     */
    private List<Centroid> getRandomCentroids() {
        //TODO: implement me
        return null;
    }

    /**
     * Load given file as a DataSet. Expects a CSV file with a certain format.
     * Will discard entries that do not match the expected format.
     *
     * @param file
     */
    private DataSet loadDataSets(String fileName) {
        //TODO: implement me
        return null;
    }

    /**
     * Porvide kmeans clustering with given number of clusters and distance.
     * Operates with Euclidian distance calculation. Employs simple looping for calculations.
     * May override this method with other distance calculation methods if time permits
     *
     * @param numOfClusters
     * @param distance
     */
    public void performClustering(int numOfClusters, int distance){

    }

    /**
     * Return an Euclidian distance given two points.
     *
     * @param dataPoint
     * @return
     */
    private double calcDistance(double a, double b){
        //TODO: implement me
        return 0.0;
    }

}


}
