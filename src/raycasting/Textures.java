package raycasting;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Textures {
	public static Textures wood = new Textures("ressource/wood.png", 64);
	public static Textures brick = new Textures("ressource/redbrick.png", 64);
	public static Textures bluestone = new Textures("ressource/bluestone.png", 64);
	public static Textures stone = new Textures("ressource/stone.png", 64);
	
	public int[] pixels;
	private String loc;
	public final int SIZE;

	public Textures(String location, int size) {
		loc = location;
		SIZE = size;
		pixels = new int[SIZE * SIZE];
		load();
	}
	
	private void load() {
		try {
			BufferedImage image = ImageIO.read(new File(loc));
			int w = image.getWidth();
			int h = image.getHeight();
			image.getRGB(0, 0, w, h, pixels, 0, w);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}