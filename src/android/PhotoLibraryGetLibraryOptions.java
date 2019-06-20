package com.terikon.cordova.photolibrary;

public class PhotoLibraryGetLibraryOptions {

  public final int itemsInChunk;
  public final double chunkTimeSec;
  public final boolean includeAlbumData;
  public final boolean includeVideos;

  public PhotoLibraryGetLibraryOptions(int itemsInChunk, double chunkTimeSec, boolean includeAlbumData,boolean includeVideos) {
    this.itemsInChunk = itemsInChunk;
    this.chunkTimeSec = chunkTimeSec;
    this.includeAlbumData = includeAlbumData;
    this.includeVideos = includeVideos;
  }

}
