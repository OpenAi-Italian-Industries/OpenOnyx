/*
 * Decompiled with CFR.
 */
package openonyx.history.internal;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Predicate;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;
import openonyx.history.Setting;
import openonyx.history.SettingValue;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class BlockSetSetting
extends SettingValue<Set<Block>> {
    final public static Comparator<Block> e = Comparator.comparing(BlockSetSetting::L);

    @Override
    public Setting L(BooleanSupplier object) {
        Object a = object;
        object = this;
return ((BlockSetSetting)object).L((BooleanSupplier)a);
    }

    @Override
    public void L(JsonElement jsonElement) {
        Iterator<JsonElement> a = jsonElement;
        BlockSetSetting a2 = this;
if (!((JsonElement)((Object)a)).isJsonArray()) {
            return;
        }
        TreeSet<Block> treeSet = new TreeSet<Block>(e);
        a = ((JsonElement)((Object)a)).getAsJsonArray().iterator();
        block0: while (true) {
            Iterator<JsonElement> iterator = a;
            while (iterator.hasNext()) {
                Object object = a.next();
                if (!((JsonElement)object).isJsonPrimitive()) continue block0;
                if (!((JsonElement)object).getAsJsonPrimitive().isString()) {
                    iterator = a;
                    continue;
                }
                if (!Block.blockRegistry.containsKey((ResourceLocation)(object = new ResourceLocation(((JsonElement)object).getAsString())))) {
                    iterator = a;
                    continue;
                }
                treeSet.add(Block.blockRegistry.getObject((ResourceLocation)object));
                iterator = a;
            }
            break;
        }
        a2.i(treeSet);
    }

    @Override
    public SettingValue L(String object) {
        Object a = object;
        object = this;
return ((BlockSetSetting)object).L((String)a);
    }

    public void D(Block block) {
        Block a = block;
        BlockSetSetting a2 = this;
BlockSetSetting class_044 = a2;
        if (a2.L(a)) {
            class_044.d(a);
            return;
        }
        class_044.L(a);
    }

    @Override
    public JsonElement L() {
        Object a;
        BlockSetSetting class_044 = this;
JsonArray jsonArray = new JsonArray();
        Object object = a = ((Set)class_044.L()).iterator();
        while (object.hasNext()) {
            Block block = (Block)a.next();
            object = a;
            jsonArray.add(new JsonPrimitive(BlockSetSetting.L(block)));
        }
        return jsonArray;
    }

    @Override
    public SettingValue L(BooleanSupplier object) {
        Object a = object;
        object = this;
return ((BlockSetSetting)object).L((BooleanSupplier)a);
    }

    @Override
    public boolean L(Block block) {
        Block a = block;
        BlockSetSetting a2 = this;
return ((Set)a2.L()).contains(a);
    }

    @Override
    public BlockSetSetting L(String string) {
        String a = string;
        BlockSetSetting a2 = this;
BlockSetSetting class_044 = a2;
        super.L(a);
        return class_044;
    }

    @Override
    public Setting L(String object) {
        Object a = object;
        object = this;
return ((BlockSetSetting)object).L((String)a);
    }

    /*
     * WARNING - void declaration
     */
    public <O> BlockSetSetting L(SettingValue<O> class_038, Predicate<O> predicate) {
        void a;
        Predicate<O> a2 = predicate;
        BlockSetSetting a3 = this;
BlockSetSetting class_044 = a3;
        super.L(a, a2);
        return class_044;
    }

    @Override
    protected Set<Block> L(Set<Block> set) {
        Set<Block> a = set;
        BlockSetSetting a2 = this;
return BlockSetSetting.L((Iterable<Block>)a);
    }

    public static String L(Block a) {
return String.valueOf(Block.blockRegistry.getNameForObject(a));
    }

    @Override
    public BlockSetSetting L(Consumer<Set<Block>> consumer) {
        Consumer<Set<Block>> a = consumer;
        BlockSetSetting a2 = this;
BlockSetSetting class_044 = a2;
        super.L(a);
        return class_044;
    }

    @Override
    public BlockSetSetting L(SettingValue<Boolean> class_038) {
        SettingValue a = class_038;
        BlockSetSetting a2 = this;
BlockSetSetting class_044 = a2;
        super.L(a);
        return class_044;
    }

    public static Set<Block> L(Iterable<Block> iterable) {
        Iterable<Block> iterable2 = iterable;
TreeSet<Block> treeSet = new TreeSet<Block>(e);
        for (Block block : iterable2) {
            if (block == null) continue;
            treeSet.add(block);
        }
        return treeSet;
    }

    /*
     * WARNING - void declaration
     */
    public void d(Block block) {
        void a;
        BlockSetSetting class_044 = this;
TreeSet<Block> a2 = new TreeSet<Block>(e);
        a2.addAll((Collection)class_044.L());
        a2.remove(a);
        class_044.i(a2);
    }

    @Override
    protected Object L(Object object) {
        Object a = object;
        object = this;
return ((BlockSetSetting)object).L((Set)a);
    }

    /*
     * WARNING - void declaration
     */
    public BlockSetSetting(String string, Block ... blockArray) {
        void a;
        Block[] a2 = blockArray;
        Block[] a3 = this;
        super((String)a, BlockSetSetting.L(List.of(a2)));
    }

    @Override
    public SettingValue L(SettingValue class_038) {
        SettingValue a = class_038;
        class_038 = this;
return ((BlockSetSetting)class_038).L(a);
    }

    @Override
    public BlockSetSetting L(BooleanSupplier booleanSupplier) {
        BooleanSupplier a = booleanSupplier;
        BlockSetSetting a2 = this;
BlockSetSetting class_044 = a2;
        super.L(a);
        return class_044;
    }

    @Override
    public SettingValue L(Consumer object) {
        Object a = object;
        object = this;
return ((BlockSetSetting)object).L((Consumer)a);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void L(Block block) {
        void a;
        BlockSetSetting class_044 = this;
TreeSet<Block> a2 = new TreeSet<Block>(e);
        a2.addAll((Collection)class_044.L());
        a2.add((Block)a);
        class_044.i(a2);
    }

    @Override
    public SettingValue L(SettingValue class_038, Predicate object) {
        Object a = object;
        object = this;
return ((BlockSetSetting)object).L(class_038, (Predicate)a);
    }
}

