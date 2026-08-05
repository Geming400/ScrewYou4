package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.NbtOps.class)
public class NbtOps_1131538652Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", cancellable = true)
    private void remove__595938224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-595938224L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/nbt/Tag;Ljava/lang/String;)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void remove_1581930450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1581930450L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__3921820(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-3921820L))
            info.setReturnValue("D@ӵf0)>vQ!}+=<U\"Yg]4|酵v? {DdU-D<zꍥZgQ觿]^磶-ꌸh`ཛྷMf7tppO,[h꽪sU");
    }

    @Inject(at = @At("HEAD"), method = "empty()Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void empty__1620141560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1620141560L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "empty()Ljava/lang/Object;", cancellable = true)
    private void empty__1304107466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1304107466L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "emptyList()Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void emptyList__1620141560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1620141560L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emptyList()Ljava/lang/Object;", cancellable = true)
    private void emptyList__1304107466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1304107466L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getByteBuffer(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getByteBuffer_85744678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(85744678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getByteBuffer(Lnet/minecraft/nbt/Tag;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getByteBuffer_1589420554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1589420554L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emptyMap()Ljava/lang/Object;", cancellable = true)
    private void emptyMap__1304107466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1304107466L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "emptyMap()Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void emptyMap__1620141560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1620141560L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMap(Lnet/minecraft/nbt/Tag;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getMap_1589420554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1589420554L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMap(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getMap_85744678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(85744678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMap(Ljava/util/stream/Stream;)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void createMap__906404784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-906404784L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMap(Ljava/util/stream/Stream;)Ljava/lang/Object;", cancellable = true)
    private void createMap_1217124078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1217124078L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createLong(J)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void createLong__589563262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-589563262L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createLong(J)Ljava/lang/Object;", cancellable = true)
    private void createLong_667394428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(667394428L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "createString(Ljava/lang/String;)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void createString_703148690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(703148690L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createString(Ljava/lang/String;)Ljava/lang/Object;", cancellable = true)
    private void createString_1044094828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1044094828L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "mapBuilder()Lcom/mojang/serialization/RecordBuilder;", cancellable = true)
    private void mapBuilder__1948567635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1948567635L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStream(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getStream_85744678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(85744678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStream(Lnet/minecraft/nbt/Tag;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getStream_1589420554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1589420554L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "convertTo(Lcom/mojang/serialization/DynamicOps;Lnet/minecraft/nbt/Tag;)Ljava/lang/Object;", cancellable = true)
    private void convertTo_963269868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(963269868L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "convertTo(Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void convertTo_2027851428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2027851428L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getList(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getList_85744678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(85744678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getList(Lnet/minecraft/nbt/Tag;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getList_1589420554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1589420554L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createByte(B)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void createByte_307459194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(307459194L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createByte(B)Ljava/lang/Object;", cancellable = true)
    private void createByte__208024444(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-208024444L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createInt(I)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void createInt__1551177279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1551177279L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createInt(I)Ljava/lang/Object;", cancellable = true)
    private void createInt__1589516579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1589516579L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "mergeToMap(Ljava/lang/Object;Ljava/util/Map;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToMap_235239721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(235239721L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToMap(Ljava/lang/Object;Lcom/mojang/serialization/MapLike;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToMap_444575248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(444575248L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToMap(Lnet/minecraft/nbt/Tag;Lcom/mojang/serialization/MapLike;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToMap_338397940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(338397940L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToMap(Lnet/minecraft/nbt/Tag;Lnet/minecraft/nbt/Tag;Lnet/minecraft/nbt/Tag;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToMap_564890122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(564890122L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToMap(Lnet/minecraft/nbt/Tag;Ljava/util/Map;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToMap_1064421189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1064421189L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToMap(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToMap_676372062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(676372062L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createList(Ljava/util/stream/Stream;)Ljava/lang/Object;", cancellable = true)
    private void createList_1217124078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1217124078L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createList(Ljava/util/stream/Stream;)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void createList__906404784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-906404784L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFloat(F)Ljava/lang/Object;", cancellable = true)
    private void createFloat_229684992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(229684992L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "createFloat(F)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void createFloat__141052034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-141052034L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNumberValue(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getNumberValue_85744678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(85744678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNumberValue(Lnet/minecraft/nbt/Tag;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getNumberValue_1589420554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1589420554L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMapEntries(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getMapEntries_85744678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(85744678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMapEntries(Lnet/minecraft/nbt/Tag;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getMapEntries_1589420554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1589420554L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToList(Lnet/minecraft/nbt/Tag;Lnet/minecraft/nbt/Tag;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToList_825029834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(825029834L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToList(Ljava/lang/Object;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToList_1499444418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1499444418L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToList(Ljava/lang/Object;Ljava/util/List;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToList_1682172503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1682172503L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToList(Lnet/minecraft/nbt/Tag;Ljava/util/List;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToList_1620863035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1620863035L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMapValues(Lnet/minecraft/nbt/Tag;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getMapValues_1589420554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1589420554L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMapValues(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getMapValues_85744678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(85744678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBooleanValue(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getBooleanValue_85744678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(85744678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBooleanValue(Lnet/minecraft/nbt/Tag;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getBooleanValue_1589420554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1589420554L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createByteList(Ljava/nio/ByteBuffer;)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void createByteList__125170033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-125170033L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createByteList(Ljava/nio/ByteBuffer;)Ljava/lang/Object;", cancellable = true)
    private void createByteList__1898546865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1898546865L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getIntStream(Lnet/minecraft/nbt/Tag;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getIntStream_1589420554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1589420554L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getIntStream(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getIntStream_85744678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(85744678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBoolean(Z)Ljava/lang/Object;", cancellable = true)
    private void createBoolean__1876735124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1876735124L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBoolean(Z)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void createBoolean_1911359122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1911359122L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createIntList(Ljava/util/stream/IntStream;)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void createIntList_590776087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(590776087L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createIntList(Ljava/util/stream/IntStream;)Ljava/lang/Object;", cancellable = true)
    private void createIntList__606942265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-606942265L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLongStream(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getLongStream_85744678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(85744678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLongStream(Lnet/minecraft/nbt/Tag;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getLongStream_1589420554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1589420554L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createLongList(Ljava/util/stream/LongStream;)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void createLongList__2045111628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2045111628L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createLongList(Ljava/util/stream/LongStream;)Ljava/lang/Object;", cancellable = true)
    private void createLongList_1877193226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1877193226L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDouble(D)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void createDouble__2064280068(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2064280068L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDouble(D)Ljava/lang/Object;", cancellable = true)
    private void createDouble_10830274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(10830274L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "createShort(S)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void createShort__524971701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-524971701L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createShort(S)Ljava/lang/Object;", cancellable = true)
    private void createShort__495242989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-495242989L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "createNumeric(Ljava/lang/Number;)Ljava/lang/Object;", cancellable = true)
    private void createNumeric_1895456932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1895456932L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "createNumeric(Ljava/lang/Number;)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void createNumeric__1261800358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1261800358L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStringValue(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getStringValue_85744678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(85744678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStringValue(Lnet/minecraft/nbt/Tag;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getStringValue_1589420554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1589420554L))
            info.setReturnValue(null);
    }


}
