package jam.valeryfardeli.com;

import android.graphics.Canvas;
import android.graphics.Rect;

/**
 * Created by valeryfardeli on 11/7/17.
 */

public class AnimationManager {
  private Animation[] animations;
  private int animationIndex;

  public AnimationManager(Animation[] animations) {
    this.animations = animations;
    animationIndex = 0;
  }

  public void playAnimation(int index) {
    for (int i = 0; i < animations.length; i++) {
      if (i == index) {
        if (!animations[index].isPlaying()) {
          animations[i].play();
        }
      } else {
        animations[i].stop();
      }
    }
    animationIndex = index;
  }

  public void draw(Canvas canvas, Rect rect) {
    if (animations[animationIndex].isPlaying()) {
      animations[animationIndex].draw(canvas, rect);
    }
  }

  public void update() {
    if (animations[animationIndex].isPlaying()) {
      animations[animationIndex].update();
    }
  }
}
