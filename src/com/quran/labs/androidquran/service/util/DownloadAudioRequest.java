package com.quran.labs.androidquran.service.util;

import com.quran.labs.androidquran.common.QuranAyah;

public class DownloadAudioRequest extends AudioRequest {

   private int mQariId = -1;
   private String mLocalDirectoryPath = null;

   public DownloadAudioRequest(String baseUrl, QuranAyah verse,
                               int qariId, String localPath){
      super(baseUrl, verse);
      mQariId = qariId;
      mLocalDirectoryPath = localPath;
   }

   public int getQariId(){ return mQariId; }
   public String getLocalPath(){ return mLocalDirectoryPath; }
}
