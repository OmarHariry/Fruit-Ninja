package Objects;

import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.ImageView;

import javax.imageio.IIOException;
import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class FatalBomb implements IDrops {
    private static  FatalBomb INSTANCE ;
    private boolean slice = false;
    private int x;
    private int y;
    private FatalBomb() {}


    public static FatalBomb getInstance() {
        if(INSTANCE==null)
            INSTANCE=new FatalBomb();
        return INSTANCE;

    }

    @Override
    public boolean isSlice() {
        return slice;
    }

    public void setSlice(boolean slice) {
        this.slice = slice;
    }

    public int rand(int min, int max) {
        return (int) (Math.random() * max + min);
    }

    @Override
    public ImageView getImage() {
        BufferedImage img = null;

        File file = new File("src/bomb1.png");
        try {
            img = ImageIO.read(file);
        } catch (IIOException e) {
            e.printStackTrace();
        } catch (IOException e) {

        }
        ImageView dropImg = new ImageView(SwingFXUtils.toFXImage(
                img, null));
        dropImg.setFitHeight(70);
        dropImg.setFitWidth(70);
        dropImg.setLayoutX(rand(0, 900));
        return dropImg;
    }
    public ImageView getHalfImage() {
        BufferedImage img = null;

        File file = new File("src/fruit1S.png");
        try {
            img = ImageIO.read(file);
        } catch (IIOException e) {
            e.printStackTrace();
        } catch (IOException e) {

        }
        ImageView dropImg = new ImageView(SwingFXUtils.toFXImage(
                img, null));
        dropImg.setFitHeight(70);
        dropImg.setFitWidth(70);
        dropImg.setLayoutX(rand(0, 700));
        return dropImg;

    }
    public ImageView getSecHalfImage() {
        BufferedImage img = null;

        File file = new File("src/fruit1S.png");
        try {
            img = ImageIO.read(file);
        } catch (IIOException e) {
            e.printStackTrace();
        } catch (IOException e) {

        }
        ImageView dropImg = new ImageView(SwingFXUtils.toFXImage(
                img, null));
        dropImg.setFitHeight(70);
        dropImg.setFitWidth(70);
        dropImg.setLayoutX(rand(0, 700));
        return dropImg;

    }


	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		this.x=x;
		
	}


	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		this.y=y;
	}


	@Override
	public int setX() {
		// TODO Auto-generated method stub
		return x;
	}


	@Override
	public int setY() {
		// TODO Auto-generated method stub
		return y;
	}
}
