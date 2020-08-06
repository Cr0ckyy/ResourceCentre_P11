
public class Camcorder extends Item{
	private int opticalZoom;

	public Camcorder(String assetTag, String description, int opticalZoom) {
		super(assetTag, description);
		this.opticalZoom = opticalZoom;
	}

	public int getOpticalZoom() {
		return opticalZoom;
	}
	
	public String toString(){
		String ccInfo = super.toString();
		String output = String.format("%-63s %-20d", ccInfo, opticalZoom);
		// Write your codes here
		return output;
	}
}
