package squindex.service

import groovy.json.JsonSlurper
import squindex.api.FolderViewResponse

class SquashService {

    static FolderViewResponse fetchFolderView(String url) {
        URL folderViewRequestUrl = new URI(url)
        def rawFolderViewResponse = new JsonSlurper().parse(folderViewRequestUrl)
        return rawFolderViewResponse;
        //https://tools.akio.fr/squash/backend/test-case-folder-view/14527?frontEndErrorIsHandled=true
        //https://tools.akio.fr/squash/backend/test-case-folder-view/21508?frontEndErrorIsHandled=true
    }
}
