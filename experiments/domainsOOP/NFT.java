package experiments.domainsOOP;

import java.util.Arrays;
import java.util.List;

public abstract class NFT {
    public int id;
    static public String name;
    public int amount;
    public String type;
    public String description = null;
    public double priceMint;
    protected String addrMinter;

    public NFT(int id, String name, int amount, String type, double priceMint){
        this.id = id; this.name = name; this.amount = amount;
        this.type = type; this.priceMint = priceMint;
    }

    public String toString(){
        return ("{" + "id=" + id +
                            ", name=" + name +
                            ", amount=" + amount +
                            ", type=" + type +
                            ", description=" + description +
                            ", priceMint=" + priceMint + "}");
    }

    public String getAddrMinter() {
        return addrMinter;
    }

    public void setAddrMinter(String addrMinter) {
        this.addrMinter = addrMinter;
    }

    public double getPriceMint() {
        return priceMint;
    }

    public void setPriceMint(double priceMint) {
        this.priceMint = priceMint;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // public static String showList(List<NFT> nftList){
    //     for (NFT nft: nftList) {
    //         nft.toString();
    //     }
    // }
}
