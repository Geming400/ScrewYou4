package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.NullOps.class)
public class NullOps_591932867Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", cancellable = true)
    private void remove__1135544009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1135544009L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/util/Unit;Ljava/lang/String;)Lnet/minecraft/util/Unit;", cancellable = true)
    private void remove__1933599955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1933599955L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__543527605(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-543527605L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "empty()Lnet/minecraft/util/Unit;", cancellable = true)
    private void empty__2070374391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2070374391L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "empty()Ljava/lang/Object;", cancellable = true)
    private void empty__1843713251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1843713251L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emptyList()Ljava/lang/Object;", cancellable = true)
    private void emptyList__1843713251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1843713251L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emptyList()Lnet/minecraft/util/Unit;", cancellable = true)
    private void emptyList__2070374391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2070374391L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getByteBuffer(Lnet/minecraft/util/Unit;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getByteBuffer__1370627509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1370627509L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getByteBuffer(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getByteBuffer__453861107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-453861107L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emptyMap()Lnet/minecraft/util/Unit;", cancellable = true)
    private void emptyMap__2070374391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2070374391L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emptyMap()Ljava/lang/Object;", cancellable = true)
    private void emptyMap__1843713251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1843713251L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMap(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getMap__453861107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-453861107L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMap(Lnet/minecraft/util/Unit;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getMap__1370627509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1370627509L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMap(Ljava/util/Map;)Lnet/minecraft/util/Unit;", cancellable = true)
    private void createMap__1957302204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1957302204L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMap(Ljava/util/stream/Stream;)Lnet/minecraft/util/Unit;", cancellable = true)
    private void createMap_930867281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(930867281L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMap(Ljava/util/Map;)Ljava/lang/Object;", cancellable = true)
    private void createMap_1527304002(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1527304002L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMap(Ljava/util/stream/Stream;)Ljava/lang/Object;", cancellable = true)
    private void createMap_677518293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(677518293L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createLong(J)Ljava/lang/Object;", cancellable = true)
    private void createLong_127788643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(127788643L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createLong(J)Lnet/minecraft/util/Unit;", cancellable = true)
    private void createLong_472891907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(472891907L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createString(Ljava/lang/String;)Lnet/minecraft/util/Unit;", cancellable = true)
    private void createString_1523529235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1523529235L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createString(Ljava/lang/String;)Ljava/lang/Object;", cancellable = true)
    private void createString_504489043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(504489043L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStream(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getStream__453861107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-453861107L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStream(Lnet/minecraft/util/Unit;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getStream__1370627509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1370627509L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBooleanValue(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getBooleanValue__453861107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-453861107L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBooleanValue(Lnet/minecraft/util/Unit;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getBooleanValue__1370627509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1370627509L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getList(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getList__453861107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-453861107L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getList(Lnet/minecraft/util/Unit;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getList__1370627509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1370627509L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBoolean(Z)Ljava/lang/Object;", cancellable = true)
    private void createBoolean_1878626387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1878626387L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBoolean(Z)Lnet/minecraft/util/Unit;", cancellable = true)
    private void createBoolean__1322382829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1322382829L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createIntList(Ljava/util/stream/IntStream;)Ljava/lang/Object;", cancellable = true)
    private void createIntList__1146548050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1146548050L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createIntList(Ljava/util/stream/IntStream;)Lnet/minecraft/util/Unit;", cancellable = true)
    private void createIntList_907640152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(907640152L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDouble(D)Ljava/lang/Object;", cancellable = true)
    private void createDouble__528775511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-528775511L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDouble(D)Lnet/minecraft/util/Unit;", cancellable = true)
    private void createDouble_609249021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(609249021L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createLongList(Ljava/util/stream/LongStream;)Ljava/lang/Object;", cancellable = true)
    private void createLongList_1337587441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1337587441L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createLongList(Ljava/util/stream/LongStream;)Lnet/minecraft/util/Unit;", cancellable = true)
    private void createLongList_1850250677(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1850250677L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNumberValue(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getNumberValue__453861107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-453861107L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNumberValue(Lnet/minecraft/util/Unit;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getNumberValue__1370627509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1370627509L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLongStream(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getLongStream__453861107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-453861107L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLongStream(Lnet/minecraft/util/Unit;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getLongStream__1370627509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1370627509L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMapEntries(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getMapEntries__453861107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-453861107L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMapEntries(Lnet/minecraft/util/Unit;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getMapEntries__1370627509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1370627509L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToList(Ljava/lang/Object;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToList_959838633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(959838633L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToList(Lnet/minecraft/util/Unit;Lnet/minecraft/util/Unit;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToList_912335601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(912335601L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToList(Ljava/lang/Object;Ljava/util/List;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToList_1142566718(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1142566718L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToList(Lnet/minecraft/util/Unit;Ljava/util/List;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToList__460344196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-460344196L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFloat(F)Lnet/minecraft/util/Unit;", cancellable = true)
    private void createFloat_1995452415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1995452415L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFloat(F)Ljava/lang/Object;", cancellable = true)
    private void createFloat__309920793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-309920793L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMapValues(Lnet/minecraft/util/Unit;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getMapValues__1370627509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1370627509L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMapValues(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getMapValues__453861107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-453861107L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStringValue(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getStringValue__453861107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-453861107L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStringValue(Lnet/minecraft/util/Unit;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getStringValue__1370627509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1370627509L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createShort(S)Ljava/lang/Object;", cancellable = true)
    private void createShort__1034848774(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1034848774L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createShort(S)Lnet/minecraft/util/Unit;", cancellable = true)
    private void createShort__1879127412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1879127412L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createByteList(Ljava/nio/ByteBuffer;)Lnet/minecraft/util/Unit;", cancellable = true)
    private void createByteList_78186192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(78186192L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createByteList(Ljava/nio/ByteBuffer;)Ljava/lang/Object;", cancellable = true)
    private void createByteList_1856814646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1856814646L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getIntStream(Lnet/minecraft/util/Unit;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getIntStream__1370627509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1370627509L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getIntStream(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getIntStream__453861107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-453861107L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createNumeric(Ljava/lang/Number;)Ljava/lang/Object;", cancellable = true)
    private void createNumeric_1355851147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1355851147L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createNumeric(Ljava/lang/Number;)Lnet/minecraft/util/Unit;", cancellable = true)
    private void createNumeric__1301862949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1301862949L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listBuilder()Lcom/mojang/serialization/ListBuilder;", cancellable = true)
    private void listBuilder_445509985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(445509985L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToMap(Lnet/minecraft/util/Unit;Lcom/mojang/serialization/MapLike;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToMap__1586400075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1586400075L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToMap(Ljava/lang/Object;Lcom/mojang/serialization/MapLike;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToMap__95030537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-95030537L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToMap(Ljava/lang/Object;Ljava/util/Map;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToMap__304366064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-304366064L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToMap(Lnet/minecraft/util/Unit;Lnet/minecraft/util/Unit;Lnet/minecraft/util/Unit;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToMap_1633798411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1633798411L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToMap(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToMap_136766277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(136766277L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToMap(Lnet/minecraft/util/Unit;Ljava/util/Map;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToMap_1444917650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1444917650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mapBuilder()Lcom/mojang/serialization/RecordBuilder;", cancellable = true)
    private void mapBuilder_1806793876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1806793876L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createList(Ljava/util/stream/Stream;)Lnet/minecraft/util/Unit;", cancellable = true)
    private void createList_930867281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(930867281L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createList(Ljava/util/stream/Stream;)Ljava/lang/Object;", cancellable = true)
    private void createList_677518293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(677518293L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createByte(B)Lnet/minecraft/util/Unit;", cancellable = true)
    private void createByte__776954373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-776954373L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createByte(B)Ljava/lang/Object;", cancellable = true)
    private void createByte__747630229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-747630229L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createInt(I)Ljava/lang/Object;", cancellable = true)
    private void createInt__2129122364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2129122364L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createInt(I)Lnet/minecraft/util/Unit;", cancellable = true)
    private void createInt__220209790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-220209790L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "convertTo(Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void convertTo_1488245643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1488245643L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "convertTo(Lcom/mojang/serialization/DynamicOps;Lnet/minecraft/util/Unit;)Ljava/lang/Object;", cancellable = true)
    private void convertTo__1472634055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1472634055L))
            info.setReturnValue(null);
    }


}
