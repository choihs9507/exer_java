package JavaEx;

public class FixerRate {
	public String base;
	public String date;
	public double usd;
	public double krw;
	public double jpy;
	public double cny;
	public double eur;
	
	@Override
	public String toString() {
		return "FixerRate [base = "+base+", date = "+date+","+"usd = "+usd+", jpy ="+jpy+", krw = "+krw+", cny = "+cny+", eur = "+eur+"]";
	}
}
