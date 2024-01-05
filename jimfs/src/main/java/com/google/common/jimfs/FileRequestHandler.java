package com.google.common.jimfs;

import java.util.ArrayList;

public class FileRequestHandler {

    private static final ArrayList<FileRequest> fileRequestList = new ArrayList<>();

    public static ArrayList<FileRequest> getFileRequestList() {
        return fileRequestList;
    }

    public static void register(FileRequest fileRequest){
        fileRequestList.add(fileRequest);
    }
}
