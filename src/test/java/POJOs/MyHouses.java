package POJOs;

import java.util.List;

public class MyHouses{
	private String headOfHouse;
	private String houseGhost;
	private String mascot;
	private String school;
	private String founder;
	private int __v;
	private List<String> members;
	private List<String> values;
	private String name;
	private String _id;
	private List<String> colors;

	public void setHeadOfHouse(String headOfHouse){
		this.headOfHouse = headOfHouse;
	}

	public String getHeadOfHouse(){
		return headOfHouse;
	}

	public void setHouseGhost(String houseGhost){
		this.houseGhost = houseGhost;
	}

	public String getHouseGhost(){
		return houseGhost;
	}

	public void setMascot(String mascot){
		this.mascot = mascot;
	}

	public String getMascot(){
		return mascot;
	}

	public void setSchool(String school){
		this.school = school;
	}

	public String getSchool(){
		return school;
	}

	public void setFounder(String founder){
		this.founder = founder;
	}

	public String getFounder(){
		return founder;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}


	@Override
	public String toString() {
		return "MyHouses{" +
				"headOfHouse='" + headOfHouse + '\'' +
				", houseGhost='" + houseGhost + '\'' +
				", mascot='" + mascot + '\'' +
				", school='" + school + '\'' +
				", founder='" + founder + '\'' +
				", __v=" + __v +
				", members=" + members +
				", values=" + values +
				", name='" + name + '\'' +
				", _id='" + _id + '\'' +
				", colors=" + colors +
				'}';
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

	public List<String> getMembers() {
		return members;
	}

	public void setMembers(List<String> members) {
		this.members = members;
	}

	public List<String> getValues() {
		return values;
	}

	public void setValues(List<String> values) {
		this.values = values;
	}

	public List<String> getColors() {
		return colors;
	}

	public void setColors(List<String> colors) {
		this.colors = colors;
	}
}