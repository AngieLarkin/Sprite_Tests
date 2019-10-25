public class Alien extends Sprite {

    private final int INITIAL_X = 400;

    public Alien(int x, int y) {
        super(x, y);

        initAlien();
    }

    private void initAlien() {

        loadImage("src/main/resources/alien.png");
        getImageDimensions();
    }

    //если ублюдки залетели за левую границу экрана - отправляем их  на смерть повторно
    // и переносим в правую часть
    public void move() {

        if (x < 0) {
            x = INITIAL_X;
        }

        x -= 1;
    }
}