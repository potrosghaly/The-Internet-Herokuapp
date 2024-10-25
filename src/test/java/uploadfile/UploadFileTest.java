package uploadfile;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class UploadFileTest extends BaseTest {

    String imagename = "smile.png";
    String imagepath = System.getProperty("user.dir") + "/upload/" + imagename;
    @Test
    public void testUploadImage() {
        var upload = homePage.clickon_fileUpload_button();
        upload.sendimage(imagepath);
        var lastpage = upload.clickon_submit_button();
        String actual = lastpage.getActualText();
        assertTrue(actual.contains(imagename));

    }
}
