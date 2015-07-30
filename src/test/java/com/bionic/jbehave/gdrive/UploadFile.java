package com.bionic.jbehave.gdrive;

import com.bionic.google.DriveFiles;
import com.bionic.google.GmailAuthorization;
import com.bionic.utils.PropertyLoader;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.model.FileList;
import com.google.api.services.gmail.Gmail;
import com.google.api.services.gmail.model.Label;
import com.google.api.services.gmail.model.ListLabelsResponse;
import net.thucydides.core.annotations.Pending;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import java.util.List;

import javax.activation.MimetypesFileTypeMap;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;


/**
 * Created by 1 on 28.07.2015.
 */
public class UploadFile {

    public static String getFileAbsPath(String filePath) {
        filePath = PropertyLoader.loadProperty("project.dir") + filePath;
        File file = new File(filePath);
        String absolutePath = file.getAbsolutePath();
        return absolutePath;
    }
    private static final String TXT_FILE =
            getFileAbsPath("/src/test/resources/testData/testTxt.txt");

    @Given("authorized connection to $user drive")
    public void authorizedConnection(String user) throws IOException {
        PropertyLoader.loadProperties();
        GmailAuthorization gmailAuthorization = null;
        try {
            gmailAuthorization = new GmailAuthorization("bdd-project", "src/main/resources/secrets/client_secret_drive.json");
        } catch (GeneralSecurityException e) {
            e.printStackTrace();
        }
        Drive service = gmailAuthorization.getDriveService(user);


        MimetypesFileTypeMap mimetypesFileTypeMap = new MimetypesFileTypeMap();
        String mimeType = mimetypesFileTypeMap.getContentType(TXT_FILE);
        DriveFiles driveFiles = new DriveFiles();
        driveFiles.insertFile(service,"testTxt.txt","test",mimeType,TXT_FILE);

//        // Print the names and IDs for up to 10 files.
//        FileList result = service.files().list()
//                .setMaxResults(10)
//                .execute();
//        List<com.google.api.services.drive.model.File> files = result.getItems();
//        if (files == null || files.size() == 0) {
//            System.out.println("No files found.");
//        } else {
//            System.out.println("Files:");
//            for (com.google.api.services.drive.model.File file : files) {
//                System.out.printf("%s (%s)\n", file.getTitle(), file.getId());
//            }
//        }
    }

    @When("I upload file to Google drive")
    @Pending
    public void whenIUploadFileToGoogleDrive() {
    }

    @Then("I see file is on the drive")
    @Pending
    public void thenISeeFileIsOnTheDrive() {
        // PENDING
    }
}
