package uk.ac.imperial.pipe.models.petrinet;

public interface MergeInterfaceStatus extends InterfaceStatus {

	public static final String AWAY = "away";
	public static final String HOME = "home";

	public Place getHomePlace();
	public void setHomePlace(Place homePlace);

	public String getAwayId();

	public Result<InterfacePlaceAction> add(PetriNet petriNet);

	public boolean canRemove();

	public String getXmlType();
	public void setAwayId(String awayId);


}
