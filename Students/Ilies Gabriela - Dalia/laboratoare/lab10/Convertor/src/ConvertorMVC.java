
public class ConvertorMVC {
		
	public static void main(String[] args) {
		ConvertorModel model = new ConvertorModel();
		ConvertorView view = new ConvertorView(model);
		ConvertorController controller = new ConvertorController(model, view);
	}
}
