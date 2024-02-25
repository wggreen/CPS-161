package rpg;

public class Player {
	private String name;
	private String status;
	private int experience;
	private int level;
	private int currentHitPoints;
	private int maxHitPoints;
	private int damage;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
		setLevel();
	}

	public int getLevel() {
		return level;
	}

	public void setLevel() {
		this.level = this.experience / 100;

		if (level < 1) {
			level = 1;
		}

		setMaxHitPoints();
		setDamage();

	}

	public Player(String name, int experience, int currentHitPoints) {
		super();
		this.name = name;
		setExperience(experience);
		setCurrentHitPoints(currentHitPoints);
        this.status = "alive";
        setLevel();
        setMaxHitPoints();
        setDamage();
	}

	public int getCurrentHitPoints() {
		return currentHitPoints;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", status=" + status + ", experience=" + experience + ", level=" + level
				+ ", currentHitPoints=" + currentHitPoints + ", maxHitPoints=" + maxHitPoints + ", damage=" + damage
				+ "]";
	}

	public void setCurrentHitPoints(int currentHitPoints) {
		this.currentHitPoints = currentHitPoints;

		if (this.currentHitPoints <= 0) {
			setStatus("dead");
		}
		else if (this.currentHitPoints >= maxHitPoints)
            this.currentHitPoints = maxHitPoints;
	}

	public int getMaxHitPoints() {
		return maxHitPoints;
	}

	public void setMaxHitPoints() {
		this.maxHitPoints = (int) (this.level * 100 * (1 + this.level / 10.0));
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage() {
		this.damage = this.level * 30;
	}
	
	public void battle(Player opponent) {
		opponent.setCurrentHitPoints(opponent.getCurrentHitPoints() - this.damage);
		setCurrentHitPoints(this.currentHitPoints - opponent.getDamage());
		experience += 50;
		opponent.setExperience(opponent.getExperience() + 50);
	}
}
