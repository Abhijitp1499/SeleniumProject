import java.io.IOException;
import java.util.ArrayList;

public class usedata {

	public static void main(String[] args) throws IOException {
		dataDriven d = new dataDriven();
		ArrayList data = d.getData("Add Profile");

		for (int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i));
		}

	}

}
