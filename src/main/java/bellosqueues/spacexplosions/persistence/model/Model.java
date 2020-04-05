package bellosqueues.spacexplosions.persistence.model;

import bellosqueues.spacexplosions.utilities.Direction;

/**
 * Programming for the Interface
 */
public interface Model {

   int getPositionX();

   int getPositionY();

   int getSpeed();

   int getDamage();

   void setPositionX(int positionX);

   void setPositionY(int positionY);

   void setSpeed(int speed);

   void setDamage(int damage);

   void move(Direction direction);

   void explode();
}