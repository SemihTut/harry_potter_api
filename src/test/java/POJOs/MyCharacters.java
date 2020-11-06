package POJOs;

public class MyCharacters{
	private String role;
	private String bloodStatus;
	private String school;
	private String species;
	private boolean deathEater;
	private int __v;
	private boolean dumbledoresArmy;
	private String name;
	private boolean ministryOfMagic;
	private String _id;
	private boolean orderOfThePhoenix;
	private String house;
	private String alias;
	private String wand;
	private String boggart;
	private String patronus;
	private String animagus;

	public String getAnimagus() {
		return animagus;
	}

	public void setAnimagus(String animagus) {
		this.animagus = animagus;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getWand() {
		return wand;
	}

	public void setWand(String wand) {
		this.wand = wand;
	}

	public String getBoggart() {
		return boggart;
	}

	public void setBoggart(String boggart) {
		this.boggart = boggart;
	}

	public String getPatronus() {
		return patronus;
	}

	public void setPatronus(String patronus) {
		this.patronus = patronus;
	}

	public void setRole(String role){
		this.role = role;
	}

	public String getRole(){
		return role;
	}

	public void setBloodStatus(String bloodStatus){
		this.bloodStatus = bloodStatus;
	}

	public String getBloodStatus(){
		return bloodStatus;
	}

	public void setSchool(String school){
		this.school = school;
	}

	public String getSchool(){
		return school;
	}

	public void setSpecies(String species){
		this.species = species;
	}

	public String getSpecies(){
		return species;
	}

	public void setDeathEater(boolean deathEater){
		this.deathEater = deathEater;
	}

	public boolean isDeathEater(){
		return deathEater;
	}

	public void setV(int V){
		this.__v = V;
	}

	public int getV(){
		return __v;
	}

	public void setDumbledoresArmy(boolean dumbledoresArmy){
		this.dumbledoresArmy = dumbledoresArmy;
	}

	public boolean isDumbledoresArmy(){
		return dumbledoresArmy;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setMinistryOfMagic(boolean ministryOfMagic){
		this.ministryOfMagic = ministryOfMagic;
	}

	public boolean isMinistryOfMagic(){
		return ministryOfMagic;
	}

	public int get__v() {
		return __v;
	}

	public void set__v(int __v) {
		this.__v = __v;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public void setOrderOfThePhoenix(boolean orderOfThePhoenix){
		this.orderOfThePhoenix = orderOfThePhoenix;
	}

	public boolean isOrderOfThePhoenix(){
		return orderOfThePhoenix;
	}

	public void setHouse(String house){
		this.house = house;
	}

	public String getHouse(){
		return house;
	}

	@Override
	public String toString() {
		return "MyCharacters{" +
				"role='" + role + '\'' +
				", bloodStatus='" + bloodStatus + '\'' +
				", school='" + school + '\'' +
				", species='" + species + '\'' +
				", deathEater=" + deathEater +
				", __v=" + __v +
				", dumbledoresArmy=" + dumbledoresArmy +
				", name='" + name + '\'' +
				", ministryOfMagic=" + ministryOfMagic +
				", _id='" + _id + '\'' +
				", orderOfThePhoenix=" + orderOfThePhoenix +
				", house='" + house + '\'' +
				", alias='" + alias + '\'' +
				", wand='" + wand + '\'' +
				", boggart='" + boggart + '\'' +
				", patronus='" + patronus + '\'' +
				'}';
	}
}
