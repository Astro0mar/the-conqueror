package buildings;

public abstract class Building {

  private int cost; // The cost for creating a building. READ ONLY
  private int level = 1; // The current level of the building.
  private int upgradeCost; // The cost for upgrading buildings level.
  private boolean coolDown = true; // variable stating if the building is cooling down.

  public int getCost() {
    return cost;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public int getUpgradeCost() {
    return upgradeCost;
  }

  public void setUpgradeCost(int upgradeCost) {
    this.upgradeCost = upgradeCost;
  }

  public boolean isCoolDown() {
    return coolDown;
  }

  public void setCoolDown(boolean coolDown) {
    this.coolDown = coolDown;
  }

  public Building() {

  }

  public Building(int cost, int upgradeCost) {
    this.cost = cost;
    this.upgradeCost = upgradeCost;
  }
}
