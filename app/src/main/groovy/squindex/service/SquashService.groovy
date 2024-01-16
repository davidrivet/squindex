package squindex.service

import groovy.json.JsonSlurper
import groovyx.net.http.RESTClient
import squindex.api.FolderViewResponse

class SquashService {
    static FolderViewResponse fetchFolderView(String url) {
        def urlObject = new URL(url)
        HttpURLConnection connection = (HttpURLConnection) urlObject.openConnection();
        connection.addRequestProperty("Accept", "application/json")
        // * TODO change token every authentication in squash until a permanent api token is obtained
        connection.addRequestProperty("Cookie", "JSESSIONID=75108E92E5B4BF0DCA8E6653F99DFFD1; XSRF-TOKEN=9c6140d0-f5e1-4961-9d7b-5d01f5f4e78d")
        connection.with {
            doOutput = true
            requestMethod = 'GET'
        }
        String response = connection.content.text
        def rawFolderViewResponse = new JsonSlurper().parseText(response)
        println rawFolderViewResponse.
//        URL folderViewRequestUrl = new URI(url)
//        def rawFolderViewResponse = new JsonSlurper().parse(folderViewRequestUrl)
//        return rawFolderViewResponse;
        return null
        //https://tools.akio.fr/squash/backend/test-case-folder-view/14527?frontEndErrorIsHandled=true
        //https://tools.akio.fr/squash/backend/test-case-folder-view/21508?frontEndErrorIsHandled=true
    }
}
