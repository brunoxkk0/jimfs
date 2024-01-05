package com.google.common.jimfs;

import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Set;

@FunctionalInterface
public interface FileRequest {

    //Read only magic
    void onFileRequest(Path path, Set<OpenOption> options, FileAttribute<?>... attrs);

}
