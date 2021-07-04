public abstract class Imagem {
	// Classe abstrata que define a imagem
	public abstract int getHeight();
	public abstract int getWidth();
	public abstract Color getPixel(int width, int height);
	public abstract void setPixel(int width, int height,Color cor);
}
