package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.HashOps.class)
public class HashOps_1325534442Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", cancellable = true)
    private void remove__401942434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-401942434L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "remove(Lcom/google/common/hash/HashCode;Ljava/lang/String;)Lcom/google/common/hash/HashCode;", cancellable = true)
    private void remove__1025685874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1025685874L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(Lcom/google/common/hash/HashCode;Ljava/lang/String;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void get__1235769127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1235769127L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(Ljava/lang/Object;Ljava/lang/String;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void get__1616629698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1616629698L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_190073970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(190073970L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "update(Ljava/lang/Object;Ljava/lang/String;Ljava/util/function/Function;)Ljava/lang/Object;", cancellable = true)
    private void update__139478942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-139478942L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "update(Lcom/google/common/hash/HashCode;Ljava/lang/String;Ljava/util/function/Function;)Lcom/google/common/hash/HashCode;", cancellable = true)
    private void update__2062343116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2062343116L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "empty()Lcom/google/common/hash/HashCode;", cancellable = true)
    private void empty_784233997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(784233997L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "empty()Ljava/lang/Object;", cancellable = true)
    private void empty__1110111676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1110111676L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Lcom/google/common/hash/HashCode;Ljava/lang/String;Lcom/google/common/hash/HashCode;)Lcom/google/common/hash/HashCode;", cancellable = true)
    private void set_1629050339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1629050339L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "set(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void set_883461058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(883461058L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emptyList()Lcom/google/common/hash/HashCode;", cancellable = true)
    private void emptyList_784233997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(784233997L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emptyList()Ljava/lang/Object;", cancellable = true)
    private void emptyList__1110111676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1110111676L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getByteBuffer(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getByteBuffer_279740468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(279740468L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getByteBuffer(Lcom/google/common/hash/HashCode;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getByteBuffer_1042147727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1042147727L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emptyMap()Lcom/google/common/hash/HashCode;", cancellable = true)
    private void emptyMap_784233997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(784233997L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emptyMap()Ljava/lang/Object;", cancellable = true)
    private void emptyMap__1110111676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1110111676L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMap(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getMap_279740468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(279740468L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMap(Lcom/google/common/hash/HashCode;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getMap_1042147727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1042147727L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMap(Ljava/util/Map;)Ljava/lang/Object;", cancellable = true)
    private void createMap__2034061719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2034061719L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMap(Ljava/util/Map;)Lcom/google/common/hash/HashCode;", cancellable = true)
    private void createMap__630627512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-630627512L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMap(Ljava/util/stream/Stream;)Ljava/lang/Object;", cancellable = true)
    private void createMap_1411119868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1411119868L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMap(Ljava/util/stream/Stream;)Lcom/google/common/hash/HashCode;", cancellable = true)
    private void createMap_1687223893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1687223893L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createLong(J)Ljava/lang/Object;", cancellable = true)
    private void createLong_861390218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(861390218L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createLong(J)Lcom/google/common/hash/HashCode;", cancellable = true)
    private void createLong__981497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-981497L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createString(Ljava/lang/String;)Lcom/google/common/hash/HashCode;", cancellable = true)
    private void createString_1982032407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1982032407L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createString(Ljava/lang/String;)Ljava/lang/Object;", cancellable = true)
    private void createString_1238090618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1238090618L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBooleanValue(Lcom/google/common/hash/HashCode;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getBooleanValue_1042147727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1042147727L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBooleanValue(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getBooleanValue_279740468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(279740468L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBoolean(Z)Lcom/google/common/hash/HashCode;", cancellable = true)
    private void createBoolean_980303383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(980303383L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBoolean(Z)Ljava/lang/Object;", cancellable = true)
    private void createBoolean__1682739334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1682739334L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getList(Lcom/google/common/hash/HashCode;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getList_1042147727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1042147727L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getList(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getList_279740468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(279740468L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createList(Ljava/util/stream/Stream;)Lcom/google/common/hash/HashCode;", cancellable = true)
    private void createList_1687223893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1687223893L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createList(Ljava/util/stream/Stream;)Ljava/lang/Object;", cancellable = true)
    private void createList_1411119868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1411119868L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createByte(B)Ljava/lang/Object;", cancellable = true)
    private void createByte__14028654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-14028654L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createByte(B)Lcom/google/common/hash/HashCode;", cancellable = true)
    private void createByte_1655859711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1655859711L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToMap(Ljava/lang/Object;Lcom/mojang/serialization/MapLike;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToMap_638571038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(638571038L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToMap(Lcom/google/common/hash/HashCode;Lcom/mojang/serialization/MapLike;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToMap_809841849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(809841849L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToMap(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToMap_870367852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(870367852L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToMap(Ljava/lang/Object;Ljava/util/Map;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToMap_429235511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(429235511L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToMap(Lcom/google/common/hash/HashCode;Lcom/google/common/hash/HashCode;Lcom/google/common/hash/HashCode;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToMap__968518993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-968518993L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToMap(Lcom/google/common/hash/HashCode;Ljava/util/Map;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToMap_120883964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(120883964L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "convertTo(Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void convertTo__2073120078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2073120078L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "convertTo(Lcom/mojang/serialization/DynamicOps;Lcom/google/common/hash/HashCode;)Ljava/lang/Object;", cancellable = true)
    private void convertTo_727983971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(727983971L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mapBuilder()Lcom/mojang/serialization/RecordBuilder;", cancellable = true)
    private void mapBuilder__1754571845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1754571845L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createInt(I)Lcom/google/common/hash/HashCode;", cancellable = true)
    private void createInt__330747258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-330747258L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createInt(I)Ljava/lang/Object;", cancellable = true)
    private void createInt__1395520789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1395520789L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getGeneric(Lcom/google/common/hash/HashCode;Lcom/google/common/hash/HashCode;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getGeneric_490288056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(490288056L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getGeneric(Ljava/lang/Object;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getGeneric_1693440208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1693440208L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createLongList(Ljava/util/stream/LongStream;)Lcom/google/common/hash/HashCode;", cancellable = true)
    private void createLongList_958138297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(958138297L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createLongList(Ljava/util/stream/LongStream;)Ljava/lang/Object;", cancellable = true)
    private void createLongList_2071189016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2071189016L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDouble(D)Ljava/lang/Object;", cancellable = true)
    private void createDouble_204826064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(204826064L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDouble(D)Lcom/google/common/hash/HashCode;", cancellable = true)
    private void createDouble__1979576063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1979576063L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getIntStream(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getIntStream_279740468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(279740468L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getIntStream(Lcom/google/common/hash/HashCode;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getIntStream_1042147727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1042147727L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLongStream(Lcom/google/common/hash/HashCode;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getLongStream_1042147727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1042147727L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLongStream(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getLongStream_279740468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(279740468L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMapValues(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getMapValues_279740468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(279740468L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMapValues(Lcom/google/common/hash/HashCode;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getMapValues_1042147727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1042147727L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFloat(F)Lcom/google/common/hash/HashCode;", cancellable = true)
    private void createFloat__1320044541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1320044541L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFloat(F)Ljava/lang/Object;", cancellable = true)
    private void createFloat_423680782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(423680782L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToList(Ljava/lang/Object;Ljava/util/List;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToList_1876168293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1876168293L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToList(Ljava/lang/Object;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToList_1693440208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1693440208L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToList(Lcom/google/common/hash/HashCode;Ljava/util/List;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToList_911073728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(911073728L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToList(Lcom/google/common/hash/HashCode;Lcom/google/common/hash/HashCode;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToList_490288056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(490288056L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createShort(S)Lcom/google/common/hash/HashCode;", cancellable = true)
    private void createShort__1328056944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1328056944L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createShort(S)Ljava/lang/Object;", cancellable = true)
    private void createShort__301247199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-301247199L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNumberValue(Lcom/google/common/hash/HashCode;Ljava/lang/Number;)Ljava/lang/Number;", cancellable = true)
    private void getNumberValue_1950844177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1950844177L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNumberValue(Lcom/google/common/hash/HashCode;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getNumberValue_1042147727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1042147727L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNumberValue(Ljava/lang/Object;Ljava/lang/Number;)Ljava/lang/Number;", cancellable = true)
    private void getNumberValue__706024116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-706024116L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNumberValue(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getNumberValue_279740468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(279740468L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMapEntries(Lcom/google/common/hash/HashCode;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getMapEntries_1042147727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1042147727L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMapEntries(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getMapEntries_279740468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(279740468L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createByteList(Ljava/nio/ByteBuffer;)Lcom/google/common/hash/HashCode;", cancellable = true)
    private void createByteList_1202925012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1202925012L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createByteList(Ljava/nio/ByteBuffer;)Ljava/lang/Object;", cancellable = true)
    private void createByteList__1704551075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1704551075L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStringValue(Lcom/google/common/hash/HashCode;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getStringValue_1042147727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1042147727L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStringValue(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getStringValue_279740468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(279740468L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createNumeric(Ljava/lang/Number;)Lcom/google/common/hash/HashCode;", cancellable = true)
    private void createNumeric__2944545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2944545L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createNumeric(Ljava/lang/Number;)Ljava/lang/Object;", cancellable = true)
    private void createNumeric_2089452722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2089452722L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createIntList(Ljava/util/stream/IntStream;)Ljava/lang/Object;", cancellable = true)
    private void createIntList__412946475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-412946475L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createIntList(Ljava/util/stream/IntStream;)Lcom/google/common/hash/HashCode;", cancellable = true)
    private void createIntList_1487445084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1487445084L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateGeneric(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", cancellable = true)
    private void updateGeneric__621325708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-621325708L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateGeneric(Lcom/google/common/hash/HashCode;Lcom/google/common/hash/HashCode;Ljava/util/function/Function;)Lcom/google/common/hash/HashCode;", cancellable = true)
    private void updateGeneric__1334820299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1334820299L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listBuilder()Lcom/mojang/serialization/ListBuilder;", cancellable = true)
    private void listBuilder_1179111560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1179111560L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStream(Lcom/google/common/hash/HashCode;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getStream_1042147727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1042147727L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStream(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getStream_279740468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(279740468L))
            info.setReturnValue(null);
    }


}
