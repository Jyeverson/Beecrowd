package src;

import java.io.IOException;
import java.text.DecimalFormat;

public class _1098 {

	public static void main(String[] args) throws IOException {
		DecimalFormat df = new DecimalFormat("0.0");
		double i = 0;
		double j = 1;
		while (i <= 2) {
			for (int l = 0; l < 3; l++) {
				if (df.format(i).endsWith("0")) {
					System.out.println("I=" + df.format(i).substring(0, 1) + " J=" + df.format(j).substring(0, 1));
				} else {
					System.out.println("I=" + df.format(i) + " J=" + df.format(j));
				}
				j++;
			}
			j -= 3;
			j += 0.2;
			i += 0.2;
		}
	}

}