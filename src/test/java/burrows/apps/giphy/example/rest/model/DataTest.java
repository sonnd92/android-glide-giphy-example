package burrows.apps.giphy.example.rest.model;

import org.junit.Test;
import test.TestBase;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class DataTest extends TestBase {
  private Images mImages = new Images();
  private Data sut = new Data(mImages);

  @Test public void testGetImages() {
    assertThat(sut.getImages()).isEqualTo(mImages);
  }

  @Test public void testSetImages() {
    final Images expected = new Images();

    sut.setImages(expected);

    assertThat(sut.getImages()).isEqualTo(expected);
  }
}
