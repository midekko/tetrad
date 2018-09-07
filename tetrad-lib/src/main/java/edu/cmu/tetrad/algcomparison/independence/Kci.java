package edu.cmu.tetrad.algcomparison.independence;

import edu.cmu.tetrad.annotation.TestOfIndependence;
import edu.cmu.tetrad.data.DataModel;
import edu.cmu.tetrad.data.DataType;
import edu.cmu.tetrad.data.DataUtils;
import edu.cmu.tetrad.search.IndependenceTest;
import edu.cmu.tetrad.util.Parameters;
import edu.pitt.csb.KCI;

import java.util.ArrayList;
import java.util.List;

/**
 * Wrapper for Fisher Z test.
 *
 * @author jdramsey
 */
@TestOfIndependence(
        name = "Kernel Independence Test (Java)",
        command = "kci",
        dataType = DataType.Continuous
)
public class Kci implements IndependenceWrapper {

    static final long serialVersionUID = 23L;


    @Override
    public IndependenceTest getTest(DataModel dataSet, Parameters parameters) {
        final KCI kci = new KCI(DataUtils.getContinuousDataSet(dataSet),
                parameters.getDouble("kciAlpha"));
        kci.setApproximate(parameters.getBoolean("kciUseAppromation"));
        kci.setWidthMultiplier(parameters.getDouble("kernelMultiplier"));
        kci.setNumBootstraps(parameters.getInt("kciNumBootstraps"));
        kci.setThreshold(parameters.getDouble("thresholdForNumEigenvalues"));
        kci.setEpsilon(parameters.getDouble("kciEpsilon"));
        return kci;
    }

    @Override
    public String getDescription() {
        return "KCI (Java)";
    }

    @Override
    public DataType getDataType() {
        return DataType.Continuous;
    }

    @Override
    public List<String> getParameters() {
        List<String> params = new ArrayList<>();
        params.add("kciUseAppromation");
        params.add("kciAlpha");
        params.add("kernelMultiplier");
        params.add("kciNumBootstraps");
        params.add("thresholdForNumEigenvalues");
        params.add("kciEpsilon");
        return params;
    }
}
