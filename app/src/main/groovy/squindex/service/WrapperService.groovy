package squindex.service

import squindex.api.FolderViewResponse

class WrapperService {

    static FolderViewResponse toFolderViewResponse(String rawFolderViewResponse) {
        return new FolderViewResponse()
    }
}
