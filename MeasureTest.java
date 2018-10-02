import tec.units.ri.unit.MetricPrefix;

import javax.measure.Unit;
import javax.measure.UnitConverter;
import javax.measure.quantity.Length;

import static tec.units.ri.unit.MetricPrefix.CENTI;
import static tec.units.ri.unit.Units.METRE;




public class MeasureTest {

    public static void main(String[] args) {

        System.out.println(fromMtoCM(5));

        Unit<Length> c = CENTI(METRE);
        System.out.println(cmToInch(c));

    }

    // double to double using javax.measure
    static public double fromMtoCM(double m){

        UnitConverter mToCm = METRE.getConverterTo(CENTI(METRE));

        return m = mToCm.convert(m);
    }

    // unit to unit using javax.measure
    static public Unit<Length> cmToInch(Unit<Length> cm){

        cm = CENTI(METRE).multiply(2.54).asType(Length.class);

        return cm;
    }

}
