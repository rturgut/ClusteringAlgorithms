package org.resat;

import java.util.TreeMap;

public class HierarchicalClustering {

    //initial set that will hold the hierarchical data
    TreeMap activeSet = null;

    /**
     * Construct a HierarchicalClustering, given a linkage object (measured by a distance
     * between two clusters)
     * @param linkage
     */
    public HierarchicalClustering(Linkage linkage) {
        //TODO: implement me
    }

    /**
     * Initializer that sets up HierarchicalClustering with initial parameters
     */
    private void init() {
        //TODO: implement me
    }

    /**
     * Create a map of clusters and merge them until there is only one left (root cluster)
     * @param ds
     */
    public  void cluster(DataSet ds) {
        //TODO: implement me
    }

    /**
     * Helper method that merges two clusters
     * @param c1
     * @param c2
     */
    private void mergeClusters(Cluster c1, Cluster c2) {
        //TODO: implement me
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

}
