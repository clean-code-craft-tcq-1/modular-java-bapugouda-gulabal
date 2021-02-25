package colorcoder;

public class ColorCoding {
	
	static ColorPair GetColorFromPairNumber(int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        MajorColor majorColor = 
            (MajorColor) fromIndex(MajorColor.values(), zeroBasedPairNumber / ColorNames.numberOfMinorColors);
        MinorColor minorColor =
            (MinorColor) fromIndex(MinorColor.values(), zeroBasedPairNumber % ColorNames.numberOfMinorColors);
        return new ColorPair(majorColor, minorColor);
    }
		
    static int GetPairNumberFromColor(MajorColor major, MinorColor minor) {
        return major.getIndex() * ColorNames.numberOfMinorColors + minor.getIndex() + 1;
    }
    
    public static colorInterface fromIndex(Object[] colors, int index){
    	for(Object obj: colors){
    		colorInterface color = (colorInterface)obj;
    		if(color.getIndex() == index){
    			return color;
    		}
    	}
		return null;
    }

}
