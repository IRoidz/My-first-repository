public class ArrayCopier {

    public void copy(int[] src, int[] dest) {

        for (int i = 0; i < src.length; i++) {
            dest[i] = src[i];
            if (i == dest.length - 1) {
                break;
            }
        }
    }
}
