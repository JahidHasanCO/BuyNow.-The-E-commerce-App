package com.example.buynow.ml;

import android.content.Context;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.lang.Integer;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import org.tensorflow.lite.DataType;
import org.tensorflow.lite.support.metadata.MetadataExtractor;
import org.tensorflow.lite.support.model.Model;
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer;

/**
 * This model doesn't have metadata, so no javadoc can be generated. */
public final class MobilenetV110224Quant {
  @NonNull
  private final Model model;

  private MobilenetV110224Quant(@NonNull Context context, @NonNull Model.Options options) throws
      IOException {
    model = Model.createModel(context, "mobilenet_v1_1.0_224_quant.tflite", options);
    MetadataExtractor extractor = new MetadataExtractor(model.getData());
  }

  @NonNull
  public static MobilenetV110224Quant newInstance(@NonNull Context context) throws IOException {
    return new MobilenetV110224Quant(context, (new Model.Options.Builder()).build());
  }

  @NonNull
  public static MobilenetV110224Quant newInstance(@NonNull Context context,
      @NonNull Model.Options options) throws IOException {
    return new MobilenetV110224Quant(context, options);
  }

  @NonNull
  public Outputs process(@NonNull TensorBuffer inputFeature0) {
    TensorBuffer processedinputFeature0 = inputFeature0;
    Outputs outputs = new Outputs(model);
    model.run(new Object[] {processedinputFeature0.getBuffer()}, outputs.getBuffer());
    return outputs;
  }

  public void close() {
    model.close();
  }

  public class Outputs {
    private TensorBuffer outputFeature0;

    private Outputs(Model model) {
      this.outputFeature0 = TensorBuffer.createFixedSize(model.getOutputTensorShape(0), DataType.UINT8);
    }

    @NonNull
    public TensorBuffer getOutputFeature0AsTensorBuffer() {
      return outputFeature0;
    }

    @NonNull
    private Map<Integer, Object> getBuffer() {
      Map<Integer, Object> outputs = new HashMap<>();
      outputs.put(0, outputFeature0.getBuffer());
      return outputs;
    }
  }
}
