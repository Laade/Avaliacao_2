public class ColorCMYK extends Color {

	private int c;
	private int m;
	private int y;
	private int k;

	public static ColorCMYK corBranca = new ColorCMYK(0, 0, 0, 0);

	public ColorCMYK(int c, int m, int y, int k) {
		this.setC(c);
		this.setM(m);
		this.setY(y);
		this.setK(k);
	}

	public ColorCMYK(ColorCMYK cor) {
		this(cor.getC(), cor.getM(), cor.getY(), cor.getK());
	}

	public ColorCMYK() {
		this(0, 0, 0, 0);
	}

	public int getC() { 
		return this.c;
	}

	private void setC(int C) { 
		int valor = (c < 0) ? 0 : c;
		valor = (valor > 100) ? 100 : valor;
		this.c = valor;
	}

	public int getM() {
		return this.m;
	}

	private void setM(int M) {
		int valor = (m < 0) ? 0 : m;
		valor = (valor > 100) ? 100 : valor;
		this.m = valor;
	}

	public int getY() {
		return this.y;
	}

	private void setY(int Y) {
		int valor = (y < 0) ? 0 : y;
		valor = (valor > 100) ? 100 : valor;
		this.y = valor;
	}

	public int getK() {
		return this.k;
	}

	private void setK(int K) {
		int valor = (k < 0) ? 0 : k;
		valor = (valor > 100) ? 100 : valor;
		this.k = valor;
	}
	//retornar a luminosidade de CMYK
	@Override //esse metódo é uma sobrescrita da herança do pai
	public int getLuminosidade() {
		return (int) ((this.getK() * 255) / 100);
	}


}
