package Inter;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		
		ObjetGeometrique [] tab = {new Cercle(4), new Rectangle(2, 4)};

		for(ObjetGeometrique obj: tab) {
			System.out.println(obj.perimetre() + " " + obj.surface());
		}
	}

}
