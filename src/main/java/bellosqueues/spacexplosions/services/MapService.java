package bellosqueues.spacexplosions.services;

  import bellosqueues.spacexplosions.persistence.model.position.LogicPosition;
  import bellosqueues.spacexplosions.persistence.model.position.grid.Map;
  import org.academiadecodigo.simplegraphics.pictures.Picture;

/**
 * Our Map Logic | Binds all the other models together in the same place
 */
public class MapService {

  private Map map;
  private LogicPosition mapPosition;
  private int cols;
  private int rows;

  private Picture background = new Picture(10,10,"src/main/resources/images/space_arena.png");

  public MapService(int cols, int rows){
      this.cols = cols;
      this.rows = rows;
  }

  public void init(){

      map = new Map(cols, rows);
      background.draw();
      mapPosition = new LogicPosition(cols, rows);

  }

}
