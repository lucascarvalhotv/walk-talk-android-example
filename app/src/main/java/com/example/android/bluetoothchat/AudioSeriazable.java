package com.example.android.bluetoothchat;

import android.media.MediaPlayer;

import java.io.Serializable;

public class AudioSeriazable implements Serializable {

    public MediaPlayer mediaPlayer;

    public AudioSeriazable(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }
}
