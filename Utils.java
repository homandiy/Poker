package ru.andremoniy.jcocoa;

import ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSRange;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.List;

import static ru.andremoniy.jcocoa.Frameworks.Foundation.Versions.C.Headers.INSGeometry.NSRect;

/**
 * User: 1
 * Date: 25.08.12
 * Time: 9:45
 */
public class Utils {

    public static boolean NSEqualRects(Object obj1, Object obj2) {
        throw new RuntimeException("not implemented");
    }

    public static Number NSMinX(Object rect) {
        throw new RuntimeException("not implemented");
    }

    public static Number NSMinY(Object rect) {
        throw new RuntimeException("not implemented");
    }

    public static Number NSMidX(NSRect rect) {
        throw new RuntimeException("not implemented");
    }

    public static Number NSMidX(Object rect) {
        throw new RuntimeException("not implemented");
    }

    public static Number NSMaxX(NSRect rect) {
        throw new RuntimeException("not implemented");
    }

    public static Number NSMidY(Object rect) {
        throw new RuntimeException("not implemented");
    }

    public static Number NSMaxY(NSRect rect) {
        throw new RuntimeException("not implemented");
    }

    public static String NSLocalizedString(String s1, String s2) {
        throw new RuntimeException("not implemented");
    }

    public static void LogEvent_(NSEvent event, String msg, Object... objs) {
        throw new RuntimeException("not implemented");
    }

    public static void NSLog(String msg, Object obj, Exception ex) {
        throw new RuntimeException("not implemented");
    }

    public static void NSLog(String msg, Object obj, String txt) {
        throw new RuntimeException("not implemented");
    }

    public static void NSLog(String msg, Object obj) {
        throw new RuntimeException("not implemented");
    }

    public static void NSLog(String msg) {
        throw new RuntimeException("not implemented");
    }

    private static NSSize NSMakeSize(double width, double height) {
        throw new RuntimeException("not implemented");
    }

    public static NSSize NSMakeSize(Object width, Object height) {
        throw new RuntimeException("not implemented");
    }

    public static NSPoint NSMakePoint(double x, double y) {
        throw new RuntimeException("not implemented");
    }

    public static NSPoint NSMakePoint(Object x, Object y) {
        throw new RuntimeException("not implemented");
    }

    public static void NSBeep() {
        throw new RuntimeException("not implemented");
    }

    public static boolean NSContainsRect(NSRect rect1, NSRect rect2) {
        throw new RuntimeException("not implemented");
    }

    public static Integer LineLength(NSPoint point1, NSPoint point2) {
        throw new RuntimeException("not implemented");
    }

    public static boolean NSEqualPoints(Object point1, Object point2) {
        throw new RuntimeException("not implemented");
    }

    public static void NSAssert(Object condition, String msg) {
        assert (Boolean)condition : msg;
    }

    public static NSRect NSRectFromTwoPoints(Object p1, Object p2) {
        throw new RuntimeException("not implemented");
    }

    public static boolean NSIntersectsRect(NSRect rect1, NSRect rect2) {
        throw new RuntimeException("not implemented");
    }

    public static boolean NSMouseInRect(NSPoint point, Object rect, Object isFlipped) {
        throw new RuntimeException("not implemented");
    }

    public static NSRect NSRectCentredOnPoint(NSPoint point, NSSize size) {
        throw new RuntimeException("not implemented");
    }

    public static boolean NSEqualSizes(Object size1, Object size2) {
        throw new RuntimeException("not implemented");
    }

    public static NSRect NSMakeRect(Object x1, Object y1, Object width, Object height) {
        throw new RuntimeException("not implemented");
    }

    public static NSRect NSRectFromString(Object str) {
        throw new RuntimeException("not implemented");
    }

    public static NSPoint LengthenLine(NSPoint p1, NSPoint p2, Number number) {
        throw new RuntimeException("not implemented");
    }

    public static NSSet DifferenceOfTwoRects(NSRect r1, NSRect r2) {
        throw new RuntimeException("not implemented");
    }

    public static boolean NSIsEmptyRect(Object rect) {
        throw new RuntimeException("not implemented");
    }

    public static String NSHomeDirectory() {
        throw new RuntimeException("not implemented");
    }

    public static NSRect NSInsetRect(Object rect, Number x, Number y) {
        throw new RuntimeException("not implemented");
    }

    public static NSRect NSInsetRect(Object rect, int x, int y) {
        throw new RuntimeException("not implemented");
    }

    public static INSRange.NSRange NSMakeRange(Object i1, Object i2) {
        throw new RuntimeException("not implemented");
    }

    public static String NSStringFromPoint(NSPoint point) {
        throw new RuntimeException("not implemented");
    }

    public static boolean NSPointInRect(Object point, Object rect) {
        throw new RuntimeException("not implemented");
    }

    public static NSRect NSOffsetRect(NSRect rect, Number v1, Number v2) {
        throw new RuntimeException("not implemented");
    }

    public static NSRect NSUnionRect(NSRect rect1, Object rect2) {
        throw new RuntimeException("not implemented");
    }

    public static NSRect NSIntersectionRect(Object rect1, Object rect2) {
        throw new RuntimeException("not implemented");
    }

    public static String NSStringFromClass(Class clazz) {
        throw new RuntimeException("not implemented");
    }

    public static void _NSAssertBody(Object condition, String message, int a1, int a2, int a3, int a4, int a5) {
        throw new RuntimeException("not implemented");
    }

    public static NSRect CentreRectOnPoint(NSRect rect, NSPoint point) {
        throw new RuntimeException("not implemented");
    }

    public static NSRect ScaleRect(Object rect, double v) {
        throw new RuntimeException("not implemented");
    }

    public static boolean AreSimilarRects(Object rect1, Object rect2, double v) {
        throw new RuntimeException("not implemented");
    }

    public static Number NSWidth(Object rect) {
        throw new RuntimeException("not implemented");
    }

    public static Number NSHeight(Object rect) {
        throw new RuntimeException("not implemented");
    }

    public static SEL NSSelectorFromString(Object obj) {
        throw new RuntimeException("not implemented");
    }

    public static String NSStringFromSelector(Object obj) {
        throw new RuntimeException("not implemented");
    }

    public static NSRect NormalizedRect(Object obj) {
        throw new RuntimeException("not implemented");
    }

    public static Integer strcmp(Object str1, Object str2) {
        return ((String) str1).compareTo((String) str2);
    }

    public static String NSStringFromRect(Object rect) {
        throw new RuntimeException("not implemented");
    }

    public static NSSize NSSizeFromString(Object str) {
        throw new RuntimeException("not implemented");
    }

    public static NSPoint NSPointFromString(Object str) {
        throw new RuntimeException("not implemented");
    }

    public static enum NSBezierPathElementEnum {
        NSMoveToBezierPathElement,
        NSLineToBezierPathElement,
        NSCurveToBezierPathElement,
        NSClosePathBezierPathElement
    }

    public static enum kDKArcPathEnum {
        kDKArcPathRadiusPart,
        kDKArcPathStartAnglePart,
        kDKArcPathEndAnglePart,
        kDKArcPathRotationKnobPart
    }

    public static <T extends Enum> T getEnum(Object obj) {
        switch (obj.getClass().getName()) {
            case "NSBezierPathElement":
                return (T) NSBezierPathElementEnum.valueOf(obj.toString());
//            case "Integer":
//                return kDKArcPathEnum;
        }
        return null;
    }

    public static boolean wrapIf(boolean value) {
        return value;
    }

    public static boolean logic(Boolean value) {
        return value;
    }

    public static boolean logic(Number number) {
        return number != null && number.intValue() != 0;
    }

    public static boolean logic(Object obj) {
        return obj != null;
    }

    public static boolean _not(Boolean value) {
        return !value;
    }

    public static boolean _not(Number number) {
        return !logic(number);
    }

    public static boolean _not(Object obj) {
        return !logic(obj);
    }

    public static SEL _selector_(String name) {
        throw new RuntimeException("not implemented");
    }

    public static SEL _protocol_(String name) {
        throw new RuntimeException("not implemented");
    }

    public static SEL _encode_(String name) {
        throw new RuntimeException("not implemented");
    }

    public static <T> T objc_msgSend(Object object, String methodName, List<String> categories, Object... msgList) {
        try {
            // TODO: using categories
            Class[] classes = new Class[msgList.length];
            for (int i = 0, msgListLength = msgList.length; i < msgListLength; i++) {
                Object msg = msgList[i];
                classes[i] = msg.getClass();
            }
            return (T) object.getClass().getMethod(methodName, classes).invoke(object, msgList);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T objc_field(Object object, String fieldName) {
        try {
            return (T) object.getClass().getDeclaredField(fieldName).get(object);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static boolean _notEquals(Object obj1, Object obj2) {
        if (obj1 == null) {
            return obj2 != null;
        } else {
            return !obj1.equals(obj2);
        }
    }

    public static boolean _equals(Object obj1, Object obj2) {
        if (obj1 == null) {
            return obj2 == null;
        } else {
            return obj1.equals(obj2);
        }
    }

    public static NSRect UnionOfTwoRects(Object obj1, Object obj2) {
        throw new RuntimeException("not implemented");
    }

    public static Number _uminus(Object obj) {
        return -((Number) obj).doubleValue();
    }

    public static Number _minus(Object obj1, Object obj2) {
        return ((Number) obj1).doubleValue() - ((Number) obj2).doubleValue();
    }

    public static Number _plus(Object obj1, Object obj2) {
        return ((Number) obj1).doubleValue() + ((Number) obj2).doubleValue();
    }

    public static Number _divide(Object obj1, Object obj2) {
        return ((Number) obj1).doubleValue() / ((Number) obj2).doubleValue();
    }

    public static Number _multiple(Object obj1, Object obj2) {
        return ((Number) obj1).doubleValue() / ((Number) obj2).doubleValue();
    }

    public static boolean _more(Object obj1, Object obj2) {
        return ((Number) obj1).doubleValue() > ((Number) obj2).doubleValue();
    }

    public static boolean _moreEquals(Object obj1, Object obj2) {
        return ((Number) obj1).doubleValue() > ((Number) obj2).doubleValue() || _equals(obj1, obj2);
    }

    public static boolean _less(Object obj1, Object obj2) {
        return ((Number) obj1).doubleValue() < ((Number) obj2).doubleValue();
    }

    public static boolean _lessEquals(Object obj1, Object obj2) {
        return ((Number) obj1).doubleValue() < ((Number) obj2).doubleValue() || _equals(obj1, obj2);
    }

    public static boolean _andAnd(Object obj1, Object obj2) {
        return (Boolean) obj1 && (Boolean) obj2;
    }

    public static Integer _and(Object obj1, Object obj2) {
        return (Integer) obj1 & (Integer) obj2;
    }

    public static boolean _orOr(Object obj1, Object obj2) {
        return (Boolean) obj1 || (Boolean) obj2;
    }

    public static Integer _or(Object obj1, Object obj2) {
        return ((Number) obj1).intValue() | ((Number) obj2).intValue();
    }

    public static Integer _xor(Object obj1, Object obj2) {
        return ((Number) obj1).intValue() ^ ((Number) obj2).intValue();
    }

    public static Integer _percent(Object obj1, Object obj2) {
        return ((Number) obj1).intValue() % ((Number) obj2).intValue();
    }

    public static Object _set(Object obj, String fieldName, Object value) {
        try {
            obj.getClass().getField(fieldName).set(obj, value);
            return value;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void _setMultiple(Object obj, String fieldName, Object value) {
        setOperation2(obj, fieldName, value, MULTIPLY);
    }

    public static void _setDivide(Object obj, String fieldName, Object value) {
        setOperation2(obj, fieldName, value, DIVIDE);
    }

    public static void _setPlus(Object obj, String fieldName, Object value) {
        setOperation2(obj, fieldName, value, PLUS);
    }

    public static void _setMinus(Object obj, String fieldName, Object value) {
        setOperation2(obj, fieldName, value, MINUS);
    }

    private static final int MULTIPLY = 0;
    private static final int DIVIDE = 1;
    private static final int PLUS = 2;
    private static final int MINUS = 3;
    private static final int PERCENT = 4;

    public static void setOperation2(Object obj, String fieldName, Object value, int operation) {
        try {
            BigDecimal newValue = null;
            if (value.getClass().equals(Integer.class)) {
                newValue = new BigDecimal((Integer) value);
            } else if (value.getClass().equals(Double.class)) {
                newValue = new BigDecimal((Double) value);
            } else if (value.getClass().equals(Float.class)) {
                newValue = new BigDecimal((Float) value);
            } else if (value.getClass().equals(Byte.class)) {
                newValue = new BigDecimal((Byte) value);
            } else if (value.getClass().equals(Long.class)) {
                newValue = new BigDecimal((Long) value);
            } else if (value.getClass().equals(Short.class)) {
                newValue = new BigDecimal((Short) value);
            }

            Field field = obj.getClass().getDeclaredField(fieldName);
            if (field.getType().equals(Integer.class)) {
                BigDecimal oldValue = new BigDecimal(field.getInt(obj));
                field.setInt(obj, doOperation(oldValue, newValue, operation).intValue());
            } else if (field.getType().equals(Double.class)) {
                BigDecimal oldValue = new BigDecimal(field.getDouble(obj));
                field.setDouble(obj, doOperation(oldValue, newValue, operation).doubleValue());
            } else if (field.getType().equals(Float.class)) {
                BigDecimal oldValue = new BigDecimal(field.getFloat(obj));
                field.setFloat(obj, doOperation(oldValue, newValue, operation).floatValue());
            } else if (field.getType().equals(Byte.class)) {
                BigDecimal oldValue = new BigDecimal(field.getByte(obj));
                field.setByte(obj, doOperation(oldValue, newValue, operation).byteValue());
            } else if (field.getType().equals(Long.class)) {
                BigDecimal oldValue = new BigDecimal(field.getLong(obj));
                field.setLong(obj, doOperation(oldValue, newValue, operation).longValue());
            } else if (field.getType().equals(Short.class)) {
                BigDecimal oldValue = new BigDecimal(field.getShort(obj));
                field.setShort(obj, doOperation(oldValue, newValue, operation).shortValue());
            }

        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }

    private static BigDecimal doOperation(BigDecimal oldValue, BigDecimal newValue, int operation) {
        switch (operation) {
            case MULTIPLY:
                return oldValue.multiply(newValue);
            case DIVIDE:
                return oldValue.divide(newValue);
            case PLUS:
                return oldValue.add(newValue);
            case MINUS:
                return oldValue.subtract(newValue);
            case PERCENT:
                return oldValue.remainder(newValue);
        }
        return oldValue;
    }

    public static String NSStringFromSize(NSSize size) {
        throw new RuntimeException("not implemented");
    }

    public static Object __CFRangeMake(int n, Object obj) {
        throw new RuntimeException("not implemented");
    }

    public static void CFArrayApplyFunction(CFArrayRef arrayRef, Object range, Object obj1, Object obj2) {
        throw new RuntimeException("not implemented");
    }

    public static Boolean _instanceof(Object object, Class clazz) {
        return clazz.isInstance(object);
    }

    public static Boolean _instanceof(Object object, Object classObj) {
        return classObj.getClass().isInstance(object);
    }

    public static void free(Object obj) {
        // do nothing.
    }

    public static int sizeof(Object obj) {
        throw new RuntimeException("not implemented");
    }

}



