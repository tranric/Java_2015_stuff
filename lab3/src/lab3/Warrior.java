//Nickolaus Lunz N01027509
package lab3;
class Warrior {
	private int health = 100;
	public void addHealth(int amt) { health += amt; }
	public void subHealth(int amt) { health -= amt; }
	public int getHealth() { return health; }
}