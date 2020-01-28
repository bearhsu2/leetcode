package idv.kuma.easy.first_bad_version;

public class VersionControl {
    public boolean isBadVersion(int v){
        if  (v >= 1702766719) {
           return true;
        } else {
            return false;
        }

    }
}
