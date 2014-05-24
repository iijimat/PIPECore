package uk.ac.imperial.pipe.io.adapters.modelAdapter;

import uk.ac.imperial.pipe.io.adapters.model.AdaptedRateParameter;
import uk.ac.imperial.pipe.models.component.rate.RateParameter;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.HashMap;
import java.util.Map;

public class RateParameterAdapter extends XmlAdapter<AdaptedRateParameter, RateParameter> {
    private final Map<String, RateParameter> rateParameters;

    public RateParameterAdapter() {
        this.rateParameters = new HashMap<>();
    }

    public RateParameterAdapter(Map<String, RateParameter> rateParameters) {

        this.rateParameters = rateParameters;
    }

    @Override
    public RateParameter unmarshal(AdaptedRateParameter adaptedRateParameter) {
        RateParameter rateParameter = new RateParameter(adaptedRateParameter.getExpression(), adaptedRateParameter.getId(), adaptedRateParameter.getName());
        rateParameters.put(rateParameter.getId(), rateParameter);
        return rateParameter;
    }

    @Override
    public AdaptedRateParameter marshal(RateParameter rateParameter)  {
        AdaptedRateParameter adaptedRateParameter = new AdaptedRateParameter();
        adaptedRateParameter.setExpression(rateParameter.getExpression());
        adaptedRateParameter.setId(rateParameter.getId());
        adaptedRateParameter.setName(rateParameter.getId());
        return adaptedRateParameter;
    }
}