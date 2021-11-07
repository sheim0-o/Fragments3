package com.example.fragments3;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class MyDialog extends DialogFragment {
    public interface MyDialogHost
    {
        void positive();
        void negative();
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle("Удаление файла");
        builder.setMessage("А вы уверены?");
        builder.setNegativeButton("Отменить", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    ((MyDialogHost) getActivity()).negative();
                }
                catch (Exception e) {
                }
                finally {
                    dialogInterface.cancel();
                }
            }
        });

        builder.setPositiveButton("Удалить", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    ((MyDialogHost) getActivity()).positive();
                }
                catch (Exception e) {}
                finally {
                    dialogInterface.dismiss();
                }
            }
        });
        return  builder.create();
    }
}
