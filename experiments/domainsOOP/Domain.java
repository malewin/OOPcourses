package experiments.domainsOOP;

public class Domain extends NFT{
    private String walletAddress;
    private String adnlAddrSite;
    private String hexStorage;
    private String subdomainAddr;
    public double priceOffer = 0;
    public String type = "domain";


    public Domain(int id, String name, int amount, String type,
                  double priceMint, double priceOffer) {
        super(id, name, amount, type, priceMint);
        this.priceOffer = priceOffer;
    }

    @Override
    public String toString() {
        return "{" + "id=" + id +
                ", name=" + name +
                ", amount=" + amount +
                ", type=" + type +
                ", description=" + description +
                ", walletAddress=" + walletAddress +
                ", adnlAddrSite=" + adnlAddrSite +
                ", hexStorage=" + hexStorage +
                " subdomainAddr=" + subdomainAddr +
                ", priceMint=" + priceMint +
                ", priceOffer=" + priceOffer + "}";
    }
   
    public String getWalletAddress() {
        return walletAddress;
    }

    public void setWalletAddress(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    public String getAdnlAddrSite() {
        return adnlAddrSite;
    }

    public void setAdnlAddrSite(String adnlAddrSite) {
        this.adnlAddrSite = adnlAddrSite;
    }

    public String getHexStorage() {
        return hexStorage;
    }

    public void setHexStorage(String hexStorage) {
        this.hexStorage = hexStorage;
    }

    public String getSubdomainAddr() {
        return subdomainAddr;
    }

    public void setSubdomainAddr(String subdomainAddr) {
        this.subdomainAddr = subdomainAddr;
    }

    public double getPriceMint() {
        return priceMint;
    }

    public void setPriceMint(double priceMint) {
        this.priceMint = priceMint;
    }

    public double getPriceOffer() {
        return priceOffer;
    }

    public void setPriceOffer(double priceOffer) {
        this.priceOffer = priceOffer;
    }
}
