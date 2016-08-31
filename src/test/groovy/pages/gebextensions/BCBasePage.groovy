package pages.gebextensions


class BCBasePage extends geb.Page{

    /**
     * Override the getPageUrl() to return BC specific url
     * @return pageUrl
     */
    @Override
    String getPageUrl() {
        def rawConfig = new geb.ConfigurationLoader().conf.rawConfig
        if(rawConfig.bcUrl.isEmpty()) throw new Exception("bcUrl is not specified in the GebConfig.groovy!")
        else if(super.getPageUrl().isEmpty()) "${rawConfig.bcUrl}"
        else "${super.getPageUrl()}/${rawConfig.bcUrl}"
    }
}
