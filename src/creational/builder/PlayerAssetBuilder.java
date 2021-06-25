package creational.builder;

public abstract class PlayerAssetBuilder {

    public Asset asset;

    public PlayerAssetBuilder() {
        this.reset();
    }

    abstract void reset();

    void setShooting(Integer shooting) {
        asset.setShooting(shooting);
    }

    void setDribbling(Integer dribbling) {
        asset.setDribbling(dribbling);
    }

    void setPassing(Integer passing) {
        asset.setPassing(passing);
    }

    Asset getInstance() {
        Asset oldAsset = asset;
        this.reset();
        return oldAsset;
    }
}
