package com.example.cv_builder;

import android.view.View;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import java.io.IOException;

public class ProfilePicActivity extends AppCompatActivity {
    private static final int PICK_IMAGE = 1;
    private ImageView imgProfile;

    private Button btnUpload, btnSave, btnBack;
    private Bitmap selectedBitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_pic);

        /*imgProfile = findViewById(R.id.img_profile);
        Button btnUpload = findViewById(R.id.btn_upload);

        // Open gallery when button is clicked
        btnUpload.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            startActivityForResult(intent, PICK_IMAGE);
        });*/

        imgProfile = findViewById(R.id.img_profile);
        btnUpload = findViewById(R.id.btn_upload);
        btnSave = findViewById(R.id.btn_save);
        btnBack = findViewById(R.id.btn_back);

        // Initially, Save button is hidden
        btnSave.setVisibility(View.GONE);

        // Open gallery when "Upload Picture" is clicked
        btnUpload.setOnClickListener(v -> openGallery());

        // "Save" button redirects to MainActivity
        btnSave.setOnClickListener(v -> navigateToMainActivity());

        // "Back" button always redirects to MainActivity
        btnBack.setOnClickListener(v -> navigateToMainActivity());

    }

    private void openGallery() {
        Intent galleryIntent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(galleryIntent, PICK_IMAGE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_IMAGE && resultCode == RESULT_OK && data != null) {
            Uri imageUri = data.getData();
            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), imageUri);
                imgProfile.setImageBitmap(bitmap);

                // ✅ Show Save button after image selection
                btnSave.setVisibility(View.VISIBLE);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void navigateToMainActivity() {
        Intent intent = new Intent(ProfilePicActivity.this, MainActivity.class);
        startActivity(intent);
        finish();  // Close current activity
    }
}

