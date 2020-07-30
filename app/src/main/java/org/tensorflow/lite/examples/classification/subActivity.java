package org.tensorflow.lite.examples.classification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class subActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Intent intent = getIntent();
        TextView textViewName = (TextView) findViewById(R.id.textViewName);
        String pestname = intent.getStringExtra("pestname");


        switch (pestname) {
            case "potato_earlyblight":
                textViewName.setText("감자_겹둥근무늬병");
                try {
                    // getResources().openRawResource()로 raw 폴더의 원본 파일을 가져온다.
                    // txt 파일을 InpuStream에 넣는다. (open 한다)
                    InputStream in = getResources().openRawResource(R.raw.p_1);

                    InputStreamReader stream = new InputStreamReader(in, "utf-8");
                    BufferedReader buffer = new BufferedReader(stream);

                    String read;
                    StringBuilder sb = new StringBuilder("");

                    while ((read = buffer.readLine()) != null) {
                        sb.append(read+'\n');
                    }


                    in.close();
                    TextView textView = (TextView) findViewById(R.id.textView01);
                    textView.setText(sb.toString());

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;

            case "potato_lateblight":
                textViewName.setText("감자_역병");
                try {
                    // getResources().openRawResource()로 raw 폴더의 원본 파일을 가져온다.
                    // txt 파일을 InpuStream에 넣는다. (open 한다)
                    InputStream in = getResources().openRawResource(R.raw.p_2);

                    InputStreamReader stream = new InputStreamReader(in, "utf-8");
                    BufferedReader buffer = new BufferedReader(stream);

                    String read;
                    StringBuilder sb = new StringBuilder("");

                    while ((read = buffer.readLine()) != null) {
                        sb.append(read+'\n');
                    }


                    in.close();
                    TextView textView = (TextView) findViewById(R.id.textView01);
                    textView.setText(sb.toString());

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "potato_leafroll":
                textViewName.setText("감자_잎마름병");
                try {
                    // getResources().openRawResource()로 raw 폴더의 원본 파일을 가져온다.
                    // txt 파일을 InpuStream에 넣는다. (open 한다)
                    InputStream in = getResources().openRawResource(R.raw.p_3);

                    InputStreamReader stream = new InputStreamReader(in, "utf-8");
                    BufferedReader buffer = new BufferedReader(stream);

                    String read;
                    StringBuilder sb = new StringBuilder("");

                    while ((read = buffer.readLine()) != null) {
                        sb.append(read+'\n');
                    }


                    in.close();
                    TextView textView = (TextView) findViewById(R.id.textView01);
                    textView.setText(sb.toString());

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "potato_blackleg":
                textViewName.setText("감자_줄기검은병");
                try {
                    // getResources().openRawResource()로 raw 폴더의 원본 파일을 가져온다.
                    // txt 파일을 InpuStream에 넣는다. (open 한다)
                    InputStream in = getResources().openRawResource(R.raw.p_4);

                    InputStreamReader stream = new InputStreamReader(in, "utf-8");
                    BufferedReader buffer = new BufferedReader(stream);

                    String read;
                    StringBuilder sb = new StringBuilder("");

                    while ((read = buffer.readLine()) != null) {
                        sb.append(read+'\n');
                    }


                    in.close();
                    TextView textView = (TextView) findViewById(R.id.textView01);
                    textView.setText(sb.toString());

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "pepper_cercospora":
                textViewName.setText("고추_갈색점무늬병");
                try {
                    // getResources().openRawResource()로 raw 폴더의 원본 파일을 가져온다.
                    // txt 파일을 InpuStream에 넣는다. (open 한다)
                    InputStream in = getResources().openRawResource(R.raw.pp_1);

                    InputStreamReader stream = new InputStreamReader(in, "utf-8");
                    BufferedReader buffer = new BufferedReader(stream);

                    String read;
                    StringBuilder sb = new StringBuilder("");

                    while ((read = buffer.readLine()) != null) {
                        sb.append(read+'\n');
                    }


                    in.close();
                    TextView textView = (TextView) findViewById(R.id.textView01);
                    textView.setText(sb.toString());

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "pepper_mosaic":
                textViewName.setText("고추_모자이크병");
                try {
                    // getResources().openRawResource()로 raw 폴더의 원본 파일을 가져온다.
                    // txt 파일을 InpuStream에 넣는다. (open 한다)
                    InputStream in = getResources().openRawResource(R.raw.pp_2);

                    InputStreamReader stream = new InputStreamReader(in, "utf-8");
                    BufferedReader buffer = new BufferedReader(stream);

                    String read;
                    StringBuilder sb = new StringBuilder("");

                    while ((read = buffer.readLine()) != null) {
                        sb.append(read+'\n');
                    }


                    in.close();
                    TextView textView = (TextView) findViewById(R.id.textView01);
                    textView.setText(sb.toString());

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "pepper_bacterialspot":
                textViewName.setText("고추_세균점무늬병");
                try {
                    // getResources().openRawResource()로 raw 폴더의 원본 파일을 가져온다.
                    // txt 파일을 InpuStream에 넣는다. (open 한다)
                    InputStream in = getResources().openRawResource(R.raw.pp_3);

                    InputStreamReader stream = new InputStreamReader(in, "utf-8");
                    BufferedReader buffer = new BufferedReader(stream);

                    String read;
                    StringBuilder sb = new StringBuilder("");

                    while ((read = buffer.readLine()) != null) {
                        sb.append(read+'\n');
                    }


                    in.close();
                    TextView textView = (TextView) findViewById(R.id.textView01);
                    textView.setText(sb.toString());

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "pepper_powdery":
                textViewName.setText("고추_흰가루병");
                try {
                    // getResources().openRawResource()로 raw 폴더의 원본 파일을 가져온다.
                    // txt 파일을 InpuStream에 넣는다. (open 한다)
                    InputStream in = getResources().openRawResource(R.raw.pp_4);

                    InputStreamReader stream = new InputStreamReader(in, "utf-8");
                    BufferedReader buffer = new BufferedReader(stream);

                    String read;
                    StringBuilder sb = new StringBuilder("");

                    while ((read = buffer.readLine()) != null) {
                        sb.append(read+'\n');
                    }


                    in.close();
                    TextView textView = (TextView) findViewById(R.id.textView01);
                    textView.setText(sb.toString());

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "corn_blackstreaked":
                textViewName.setText("옥수수_검은줄오갈병");
                try {
                    // getResources().openRawResource()로 raw 폴더의 원본 파일을 가져온다.
                    // txt 파일을 InpuStream에 넣는다. (open 한다)
                    InputStream in = getResources().openRawResource(R.raw.c_1);

                    InputStreamReader stream = new InputStreamReader(in, "utf-8");
                    BufferedReader buffer = new BufferedReader(stream);

                    String read;
                    StringBuilder sb = new StringBuilder("");

                    while ((read = buffer.readLine()) != null) {
                        sb.append(read+'\n');
                    }


                    in.close();
                    TextView textView = (TextView) findViewById(R.id.textView01);
                    textView.setText(sb.toString());

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "corn_smut":
                textViewName.setText("옥수수_깜부기병");
                try {
                    // getResources().openRawResource()로 raw 폴더의 원본 파일을 가져온다.
                    // txt 파일을 InpuStream에 넣는다. (open 한다)
                    InputStream in = getResources().openRawResource(R.raw.c_2);

                    InputStreamReader stream = new InputStreamReader(in, "utf-8");
                    BufferedReader buffer = new BufferedReader(stream);

                    String read;
                    StringBuilder sb = new StringBuilder("");

                    while ((read = buffer.readLine()) != null) {
                        sb.append(read+'\n');
                    }


                    in.close();
                    TextView textView = (TextView) findViewById(R.id.textView01);
                    textView.setText(sb.toString());

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "corn_southern":
                textViewName.setText("옥수수_깨씨무늬병");
                try {
                    // getResources().openRawResource()로 raw 폴더의 원본 파일을 가져온다.
                    // txt 파일을 InpuStream에 넣는다. (open 한다)
                    InputStream in = getResources().openRawResource(R.raw.c_3);

                    InputStreamReader stream = new InputStreamReader(in, "utf-8");
                    BufferedReader buffer = new BufferedReader(stream);

                    String read;
                    StringBuilder sb = new StringBuilder("");

                    while ((read = buffer.readLine()) != null) {
                        sb.append(read+'\n');
                    }


                    in.close();
                    TextView textView = (TextView) findViewById(R.id.textView01);
                    textView.setText(sb.toString());

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "corn_sheath":
                textViewName.setText("옥수수_잎집무늬마름병");
                try {
                    // getResources().openRawResource()로 raw 폴더의 원본 파일을 가져온다.
                    // txt 파일을 InpuStream에 넣는다. (open 한다)
                    InputStream in = getResources().openRawResource(R.raw.c_4);

                    InputStreamReader stream = new InputStreamReader(in, "utf-8");
                    BufferedReader buffer = new BufferedReader(stream);

                    String read;
                    StringBuilder sb = new StringBuilder("");

                    while ((read = buffer.readLine()) != null) {
                        sb.append(read+'\n');
                    }


                    in.close();
                    TextView textView = (TextView) findViewById(R.id.textView01);
                    textView.setText(sb.toString());

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "bean_sclerotinia":
                textViewName.setText("콩_균핵병");
                try {
                    // getResources().openRawResource()로 raw 폴더의 원본 파일을 가져온다.
                    // txt 파일을 InpuStream에 넣는다. (open 한다)
                    InputStream in = getResources().openRawResource(R.raw.b_1);

                    InputStreamReader stream = new InputStreamReader(in, "utf-8");
                    BufferedReader buffer = new BufferedReader(stream);

                    String read;
                    StringBuilder sb = new StringBuilder("");

                    while ((read = buffer.readLine()) != null) {
                        sb.append(read+'\n');
                    }


                    in.close();
                    TextView textView = (TextView) findViewById(R.id.textView01);
                    textView.setText(sb.toString());

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "bean_downy":
                textViewName.setText("콩_노균병");
                try {
                    // getResources().openRawResource()로 raw 폴더의 원본 파일을 가져온다.
                    // txt 파일을 InpuStream에 넣는다. (open 한다)
                    InputStream in = getResources().openRawResource(R.raw.b_2);

                    InputStreamReader stream = new InputStreamReader(in, "utf-8");
                    BufferedReader buffer = new BufferedReader(stream);

                    String read;
                    StringBuilder sb = new StringBuilder("");

                    while ((read = buffer.readLine()) != null) {
                        sb.append(read+'\n');
                    }


                    in.close();
                    TextView textView = (TextView) findViewById(R.id.textView01);
                    textView.setText(sb.toString());

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "bean_podandstem":
                textViewName.setText("콩_미이라병");
                try {
                    // getResources().openRawResource()로 raw 폴더의 원본 파일을 가져온다.
                    // txt 파일을 InpuStream에 넣는다. (open 한다)
                    InputStream in = getResources().openRawResource(R.raw.b_3);

                    InputStreamReader stream = new InputStreamReader(in, "utf-8");
                    BufferedReader buffer = new BufferedReader(stream);

                    String read;
                    StringBuilder sb = new StringBuilder("");

                    while ((read = buffer.readLine()) != null) {
                        sb.append(read+'\n');
                    }


                    in.close();
                    TextView textView = (TextView) findViewById(R.id.textView01);
                    textView.setText(sb.toString());

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "bean_bacterialpustule":
                textViewName.setText("콩_불마름병");
                try {
                    // getResources().openRawResource()로 raw 폴더의 원본 파일을 가져온다.
                    // txt 파일을 InpuStream에 넣는다. (open 한다)
                    InputStream in = getResources().openRawResource(R.raw.b_4);

                    InputStreamReader stream = new InputStreamReader(in, "utf-8");
                    BufferedReader buffer = new BufferedReader(stream);

                    String read;
                    StringBuilder sb = new StringBuilder("");

                    while ((read = buffer.readLine()) != null) {
                        sb.append(read+'\n');
                    }


                    in.close();
                    TextView textView = (TextView) findViewById(R.id.textView01);
                    textView.setText(sb.toString());

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "bean_purpleblotch":
                textViewName.setText("콩_자주무늬병");
                try {
                    // getResources().openRawResource()로 raw 폴더의 원본 파일을 가져온다.
                    // txt 파일을 InpuStream에 넣는다. (open 한다)
                    InputStream in = getResources().openRawResource(R.raw.b_5);

                    InputStreamReader stream = new InputStreamReader(in, "utf-8");
                    BufferedReader buffer = new BufferedReader(stream);

                    String read;
                    StringBuilder sb = new StringBuilder("");

                    while ((read = buffer.readLine()) != null) {
                        sb.append(read+'\n');
                    }


                    in.close();
                    TextView textView = (TextView) findViewById(R.id.textView01);
                    textView.setText(sb.toString());

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "bean_leafspot":
                textViewName.setText("콩_점무늬병");
                try {
                    // getResources().openRawResource()로 raw 폴더의 원본 파일을 가져온다.
                    // txt 파일을 InpuStream에 넣는다. (open 한다)
                    InputStream in = getResources().openRawResource(R.raw.b_6);

                    InputStreamReader stream = new InputStreamReader(in, "utf-8");
                    BufferedReader buffer = new BufferedReader(stream);

                    String read;
                    StringBuilder sb = new StringBuilder("");

                    while ((read = buffer.readLine()) != null) {
                        sb.append(read+'\n');
                    }


                    in.close();
                    TextView textView = (TextView) findViewById(R.id.textView01);
                    textView.setText(sb.toString());

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "bean_yellowmottle":
                textViewName.setText("콩_콩황화모틀모자이크바이러스");
                try {
                    // getResources().openRawResource()로 raw 폴더의 원본 파일을 가져온다.
                    // txt 파일을 InpuStream에 넣는다. (open 한다)
                    InputStream in = getResources().openRawResource(R.raw.b_7);

                    InputStreamReader stream = new InputStreamReader(in, "utf-8");
                    BufferedReader buffer = new BufferedReader(stream);

                    String read;
                    StringBuilder sb = new StringBuilder("");

                    while ((read = buffer.readLine()) != null) {
                        sb.append(read+'\n');
                    }


                    in.close();
                    TextView textView = (TextView) findViewById(R.id.textView01);
                    textView.setText(sb.toString());

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "bean_anthracnose":
                textViewName.setText("콩_탄저병");
                try {
                    // getResources().openRawResource()로 raw 폴더의 원본 파일을 가져온다.
                    // txt 파일을 InpuStream에 넣는다. (open 한다)
                    InputStream in = getResources().openRawResource(R.raw.b_8);

                    InputStreamReader stream = new InputStreamReader(in, "utf-8");
                    BufferedReader buffer = new BufferedReader(stream);

                    String read;
                    StringBuilder sb = new StringBuilder("");

                    while ((read = buffer.readLine()) != null) {
                        sb.append(read+'\n');
                    }


                    in.close();
                    TextView textView = (TextView) findViewById(R.id.textView01);
                    textView.setText(sb.toString());

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "tomato_earlyblight":
                textViewName.setText("토마토_겹무늬병");
                try {
                    // getResources().openRawResource()로 raw 폴더의 원본 파일을 가져온다.
                    // txt 파일을 InpuStream에 넣는다. (open 한다)
                    InputStream in = getResources().openRawResource(R.raw.t_1);

                    InputStreamReader stream = new InputStreamReader(in, "utf-8");
                    BufferedReader buffer = new BufferedReader(stream);

                    String read;
                    StringBuilder sb = new StringBuilder("");

                    while ((read = buffer.readLine()) != null) {
                        sb.append(read+'\n');
                    }


                    in.close();
                    TextView textView = (TextView) findViewById(R.id.textView01);
                    textView.setText(sb.toString());

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "tomato_mosaic":
                textViewName.setText("토마토_모자이크병");
                try {
                    // getResources().openRawResource()로 raw 폴더의 원본 파일을 가져온다.
                    // txt 파일을 InpuStream에 넣는다. (open 한다)
                    InputStream in = getResources().openRawResource(R.raw.t_2);

                    InputStreamReader stream = new InputStreamReader(in, "utf-8");
                    BufferedReader buffer = new BufferedReader(stream);

                    String read;
                    StringBuilder sb = new StringBuilder("");

                    while ((read = buffer.readLine()) != null) {
                        sb.append(read+'\n');
                    }


                    in.close();
                    TextView textView = (TextView) findViewById(R.id.textView01);
                    textView.setText(sb.toString());

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "tomato_bacteriaspot":
                textViewName.setText("토마토_세균점무늬병");
                try {
                    // getResources().openRawResource()로 raw 폴더의 원본 파일을 가져온다.
                    // txt 파일을 InpuStream에 넣는다. (open 한다)
                    InputStream in = getResources().openRawResource(R.raw.t_3);

                    InputStreamReader stream = new InputStreamReader(in, "utf-8");
                    BufferedReader buffer = new BufferedReader(stream);

                    String read;
                    StringBuilder sb = new StringBuilder("");

                    while ((read = buffer.readLine()) != null) {
                        sb.append(read+'\n');
                    }


                    in.close();
                    TextView textView = (TextView) findViewById(R.id.textView01);
                    textView.setText(sb.toString());

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "tomato_leafmold":
                textViewName.setText("토마토_잎곰팡이");
                try {
                    // getResources().openRawResource()로 raw 폴더의 원본 파일을 가져온다.
                    // txt 파일을 InpuStream에 넣는다. (open 한다)
                    InputStream in = getResources().openRawResource(R.raw.t_4);

                    InputStreamReader stream = new InputStreamReader(in, "utf-8");
                    BufferedReader buffer = new BufferedReader(stream);

                    String read;
                    StringBuilder sb = new StringBuilder("");

                    while ((read = buffer.readLine()) != null) {
                        sb.append(read+'\n');
                    }


                    in.close();
                    TextView textView = (TextView) findViewById(R.id.textView01);
                    textView.setText(sb.toString());

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "tomato_lateblight":
                textViewName.setText("토마토_잎마름역병");
                try {
                    // getResources().openRawResource()로 raw 폴더의 원본 파일을 가져온다.
                    // txt 파일을 InpuStream에 넣는다. (open 한다)
                    InputStream in = getResources().openRawResource(R.raw.t_5);

                    InputStreamReader stream = new InputStreamReader(in, "utf-8");
                    BufferedReader buffer = new BufferedReader(stream);

                    String read;
                    StringBuilder sb = new StringBuilder("");

                    while ((read = buffer.readLine()) != null) {
                        sb.append(read+'\n');
                    }


                    in.close();
                    TextView textView = (TextView) findViewById(R.id.textView01);
                    textView.setText(sb.toString());

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "tomato_spidermites":
                textViewName.setText("토마토_점박이응애");
                try {
                    // getResources().openRawResource()로 raw 폴더의 원본 파일을 가져온다.
                    // txt 파일을 InpuStream에 넣는다. (open 한다)
                    InputStream in = getResources().openRawResource(R.raw.t_6);

                    InputStreamReader stream = new InputStreamReader(in, "utf-8");
                    BufferedReader buffer = new BufferedReader(stream);

                    String read;
                    StringBuilder sb = new StringBuilder("");

                    while ((read = buffer.readLine()) != null) {
                        sb.append(read+'\n');
                    }


                    in.close();
                    TextView textView = (TextView) findViewById(R.id.textView01);
                    textView.setText(sb.toString());

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "tomato_targetspot":
                textViewName.setText("토마토_탄저병");
                try {
                    // getResources().openRawResource()로 raw 폴더의 원본 파일을 가져온다.
                    // txt 파일을 InpuStream에 넣는다. (open 한다)
                    InputStream in = getResources().openRawResource(R.raw.t_7);

                    InputStreamReader stream = new InputStreamReader(in, "utf-8");
                    BufferedReader buffer = new BufferedReader(stream);

                    String read;
                    StringBuilder sb = new StringBuilder("");

                    while ((read = buffer.readLine()) != null) {
                        sb.append(read+'\n');
                    }


                    in.close();
                    TextView textView = (TextView) findViewById(R.id.textView01);
                    textView.setText(sb.toString());

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "tomato_yellowleaf":
                textViewName.setText("토마토_황화잎말림바이러스");
                try {
                    // getResources().openRawResource()로 raw 폴더의 원본 파일을 가져온다.
                    // txt 파일을 InpuStream에 넣는다. (open 한다)
                    InputStream in = getResources().openRawResource(R.raw.t_8);

                    InputStreamReader stream = new InputStreamReader(in, "utf-8");
                    BufferedReader buffer = new BufferedReader(stream);

                    String read;
                    StringBuilder sb = new StringBuilder("");

                    while ((read = buffer.readLine()) != null) {
                        sb.append(read+'\n');
                    }


                    in.close();
                    TextView textView = (TextView) findViewById(R.id.textView01);
                    textView.setText(sb.toString());

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "tomato_septoria":
                textViewName.setText("토마토_흰무늬병");
                try {
                    // getResources().openRawResource()로 raw 폴더의 원본 파일을 가져온다.
                    // txt 파일을 InpuStream에 넣는다. (open 한다)
                    InputStream in = getResources().openRawResource(R.raw.t_9);

                    InputStreamReader stream = new InputStreamReader(in, "utf-8");
                    BufferedReader buffer = new BufferedReader(stream);

                    String read;
                    StringBuilder sb = new StringBuilder("");

                    while ((read = buffer.readLine()) != null) {
                        sb.append(read+'\n');
                    }


                    in.close();
                    TextView textView = (TextView) findViewById(R.id.textView01);
                    textView.setText(sb.toString());

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;

            default:
                textViewName.setText(pestname);
                try {
                    InputStream in = getResources().openRawResource(R.raw.a);

                    InputStreamReader stream = new InputStreamReader(in, "utf-8");
                    BufferedReader buffer = new BufferedReader(stream);

                    String read;
                    StringBuilder sb = new StringBuilder("");

                    while ((read = buffer.readLine()) != null) {
                        sb.append(read+'\n');
                    }


                    in.close();
                    TextView textView = (TextView) findViewById(R.id.textView01);
                    textView.setText(sb.toString());

                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;


        }
    }
}
