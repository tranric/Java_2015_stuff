//Nickolaus Lunz N01027509
package lab3;
public class Shooter implements IShooter{
	Warrior warroir = new Warrior();
	private int healthAdd, healthSub;
	@Override
	public void incHealth() {
		warroir.addHealth(healthAdd);
	}
	@Override
	public void decHealth() {
		warroir.subHealth(healthSub);
	}
	@Override
	public int getHealth() {
		return warroir.getHealth();
	}
}