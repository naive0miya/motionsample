package org.youtwo.motionsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

  private ImageButton imageButton;
  private Button button;
  private Button button2;
  private Button button3;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    imageButton = (ImageButton) findViewById(R.id.fab);
    imageButton.setOnClickListener(v -> {
      Intent intent = new Intent(this,MultipleChaoticElements.class);
      startActivity(intent);
    });
    button = (Button) findViewById(R.id.button);
    button.setOnClickListener(v -> {
      Intent intent = new Intent(this,CurveMotionList.class);
      startActivity(intent);
    });
    button2 = (Button) findViewById(R.id.button2);
    button2.setOnClickListener(v -> {
      Intent intent = new Intent(this,MultipleElements.class);
      startActivity(intent);
    });
    button3 = (Button) findViewById(R.id.button3);
    button3.setOnClickListener(v -> {
      Intent intent = new Intent(this,SizeChange.class);
      startActivity(intent);
    });
  }
}
