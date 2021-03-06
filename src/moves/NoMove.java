package moves;

import heroes.Hero;

public class NoMove implements Move {
  @Override
  public final void acceptMove(final Hero hero) {
    hero.visitMove(this);
  }
}
