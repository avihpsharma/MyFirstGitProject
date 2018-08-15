/**
 * 
 */

/**
 * @author avisharma
 *
 */
public class Marks {

	int maths;
	int chem;
	int phy;
	int geo;
	/**
	 * @param maths
	 * @param chem
	 * @param phy
	 * @param geo
	 */
	public Marks(int maths, int chem, int phy, int geo) {
		super();
		this.maths = maths;
		this.chem = chem;
		this.phy = phy;
		this.geo = geo;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getChem() {
		return chem;
	}
	public void setChem(int chem) {
		this.chem = chem;
	}
	public int getPhy() {
		return phy;
	}
	public void setPhy(int phy) {
		this.phy = phy;
	}
	public int getGeo() {
		return geo;
	}
	public void setGeo(int geo) {
		this.geo = geo;
	}
	@Override
	public String toString() {
		return "Marks [maths=" + maths + ", chem=" + chem + ", phy=" + phy + ", geo=" + geo + "]";
	}
	

	
	
	
}
