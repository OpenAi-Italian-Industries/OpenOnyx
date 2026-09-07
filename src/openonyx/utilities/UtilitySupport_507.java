/*
 * Decompiled with CFR.
 */
package openonyx.utilities;

import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import openonyx.utilities.UtilitySupport_508;
import openonyx.utilities.internal.UtilitySupport_516;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class UtilitySupport_507 {
    public static double L(AxisAlignedBB a, double a2, double a3, double a4) {
AxisAlignedBB axisAlignedBB = a;
        a2 = Math.max(Math.max(axisAlignedBB.minX - a2, a2 - a.maxX), 0.0);
        a3 = Math.max(Math.max(axisAlignedBB.minY - a3, a3 - a.maxY), 0.0);
        a4 = Math.max(Math.max(axisAlignedBB.minZ - a4, a4 - a.maxZ), 0.0);
        double d = a2;
        double d2 = a3;
        double d3 = a4;
        return d * d + d2 * d2 + d3 * d3;
    }

    public static double L(AxisAlignedBB axisAlignedBB, EnumFacing enumFacing) {
        EnumFacing a = enumFacing;
        AxisAlignedBB a2 = axisAlignedBB;
if (a.getAxisDirection() == EnumFacing.AxisDirection.POSITIVE) {
            return a2.max(a.getAxis());
        }
        return a2.min(a.getAxis());
    }

    public static Vec3 L(AxisAlignedBB axisAlignedBB, EnumFacing enumFacing) {
        EnumFacing a = enumFacing;
        AxisAlignedBB a2 = axisAlignedBB;
AxisAlignedBB axisAlignedBB2 = a2;
        double d = axisAlignedBB2.minX + a2.getXsize() * 0.5;
        AxisAlignedBB axisAlignedBB3 = a2;
        double d2 = axisAlignedBB2.minY + axisAlignedBB3.getYsize() * 0.5;
        double d3 = axisAlignedBB3.minZ + a2.getZsize() * 0.5;
        return UtilitySupport_507.L(axisAlignedBB2, 0.0, 0.0, d3, a);
    }

    public static Vec3 L(AxisAlignedBB axisAlignedBB, Vec3 vec3) {
        Vec3 a = vec3;
        AxisAlignedBB a2 = axisAlignedBB;
return new Vec3(MathHelper.clamp_double(a.xCoord, a2.minX, a2.maxX), MathHelper.clamp_double(a.yCoord, a2.minY, a2.maxY), MathHelper.clamp_double(a.zCoord, a2.minZ, a2.maxZ));
    }

    /*
     * WARNING - void declaration
     */
    public static Vec3 L(AxisAlignedBB axisAlignedBB, Vec3 vec3, EnumFacing enumFacing) {
        void a;
        Object a2 = vec3;
        AxisAlignedBB a3 = axisAlignedBB;
AxisAlignedBB axisAlignedBB2 = a3;
        a2 = UtilitySupport_507.L(axisAlignedBB2, (Vec3)a2);
        return UtilitySupport_507.L(axisAlignedBB2, ((Vec3)a2).xCoord, ((Vec3)a2).yCoord, ((Vec3)a2).zCoord, (EnumFacing)a);
    }

    /*
     * WARNING - void declaration
     */
    private static Vec3 L(AxisAlignedBB object, double d, double d2, double d3, EnumFacing enumFacing) {
        void a;
        void a2;
        AxisAlignedBB a3;
        AxisAlignedBB axisAlignedBB = object;
        object = enumFacing;
        AxisAlignedBB a4 = axisAlignedBB;
switch (UtilitySupport_508.e[((Enum)((Object)a3)).ordinal()]) {
            default: {
                throw new MatchException(null, null);
            }
            case 1: {
                void a5;
                return new Vec3((double)a5, a4.minY, (double)a2);
            }
            case 2: {
                void a5;
                return new Vec3((double)a5, a4.maxY, (double)a2);
            }
            case 3: {
                void a5;
                return new Vec3((double)a5, (double)a, a4.minZ);
            }
            case 4: {
                void a5;
                return new Vec3((double)a5, (double)a, a4.maxZ);
            }
            case 5: {
                return new Vec3(a4.minX, (double)a, (double)a2);
            }
            case 6: 
        }
        return new Vec3(a4.maxX, (double)a, (double)a2);
    }

    public static UtilitySupport_516 L(AxisAlignedBB axisAlignedBB, EnumFacing enumFacing) {
        EnumFacing a = enumFacing;
        AxisAlignedBB a2 = axisAlignedBB;
switch (a) {
            default: {
                throw new MatchException(null, null);
            }
            case DOWN: {
                return new UtilitySupport_516(new Vec3(a2.minX, a2.minY, a2.minZ), new Vec3(a2.maxX, a2.minY, a2.maxZ));
            }
            case UP: {
                return new UtilitySupport_516(new Vec3(a2.minX, a2.maxY, a2.minZ), new Vec3(a2.maxX, a2.maxY, a2.maxZ));
            }
            case SOUTH: {
                return new UtilitySupport_516(new Vec3(a2.minX, a2.minY, a2.maxZ), new Vec3(a2.maxX, a2.maxY, a2.maxZ));
            }
            case NORTH: {
                return new UtilitySupport_516(new Vec3(a2.minX, a2.minY, a2.minZ), new Vec3(a2.maxX, a2.maxY, a2.minZ));
            }
            case EAST: {
                return new UtilitySupport_516(new Vec3(a2.maxX, a2.minY, a2.minZ), new Vec3(a2.maxX, a2.maxY, a2.maxZ));
            }
            case WEST: 
        }
        return new UtilitySupport_516(new Vec3(a2.minX, a2.minY, a2.minZ), new Vec3(a2.minX, a2.maxY, a2.maxZ));
    }

    public UtilitySupport_507() {
        UtilitySupport_507 a;
    }

    public static double L(AxisAlignedBB axisAlignedBB, Vec3 vec3) {
        Vec3 a = vec3;
        AxisAlignedBB a2 = axisAlignedBB;
return UtilitySupport_507.L(a2, a.xCoord, a.yCoord, a.zCoord);
    }

    public static Vec3[] L(AxisAlignedBB a) {
Vec3[] vec3Array = new Vec3[8];
        vec3Array[0] = new Vec3(a.minX, a.minY, a.minZ);
        vec3Array[1] = new Vec3(a.minX, a.minY, a.maxZ);
        vec3Array[2] = new Vec3(a.minX, a.maxY, a.minZ);
        vec3Array[3] = new Vec3(a.minX, a.maxY, a.maxZ);
        vec3Array[4] = new Vec3(a.maxX, a.minY, a.minZ);
        vec3Array[5] = new Vec3(a.maxX, a.minY, a.maxZ);
        vec3Array[6] = new Vec3(a.maxX, a.maxY, a.minZ);
        vec3Array[7] = new Vec3(a.maxX, a.maxY, a.maxZ);
        return vec3Array;
    }
}

