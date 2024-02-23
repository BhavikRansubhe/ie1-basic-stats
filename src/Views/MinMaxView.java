import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class MinMaxView implements View {

  // Instance variables
  double minValue;
  double maxValue;
  JTextField jtfMinMax;
  String name;

  public MinMaxView() {
    minValue = 0;
    maxValue = 0;
    jtfMinMax = new JTextField(10);
    jtfMinMax.setEditable(false);
    name = "Min/Max";
  }

  @Override
  public void update(ArrayList<Double> numbers) {
    double[] numArray = BasicStats.getArrayDouble(numbers);
    minValue = BasicStats.min(numArray);
    maxValue = BasicStats.max(numArray);

    // Set text
    jtfMinMax.setText("Min: " + minValue + " | Max: " + maxValue);
  }

  @Override
  public void reset() {
    jtfMinMax.setText("");
  }

  @Override
  public JTextComponent show() {
    return jtfMinMax;
  }

  @Override
  public String getName() {
    return name;
  }

  public double getMinValue() {
    return minValue;
  }

  public double getMaxValue() {
    return maxValue;
  }
}
