package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.HashOps.class)
public class HashOps_1325534442Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", cancellable = true)
    private void remove__1678941214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1678941214L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "remove(Lcom/google/common/hash/HashCode;Ljava/lang/String;)Lcom/google/common/hash/HashCode;", cancellable = true)
    private void remove_738317074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(738317074L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(Lcom/google/common/hash/HashCode;Ljava/lang/String;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void get__216675537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-216675537L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(Ljava/lang/Object;Ljava/lang/String;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void get_340552872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(340552872L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2095957470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2095957470L))
            info.setReturnValue("\uA934Kl\u945F{b'tY9i8_\u418B[\u1288e,Pl\u7C3E\u1FB8D&RA%\u34AC8|?mlHm4ym_6\u62E9SY&qu#GW");
    }

    @Inject(at = @At("HEAD"), method = "update(Lcom/google/common/hash/HashCode;Ljava/lang/String;Ljava/util/function/Function;)Lcom/google/common/hash/HashCode;", cancellable = true)
    private void update__476438773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-476438773L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "update(Ljava/lang/Object;Ljava/lang/String;Ljava/util/function/Function;)Ljava/lang/Object;", cancellable = true)
    private void update__1875544711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1875544711L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "empty()Lcom/google/common/hash/HashCode;", cancellable = true)
    private void empty_729033952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(729033952L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "empty()Ljava/lang/Object;", cancellable = true)
    private void empty_1000400849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1000400849L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "set(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void set__1491290844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1491290844L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "set(Lcom/google/common/hash/HashCode;Ljava/lang/String;Lcom/google/common/hash/HashCode;)Lcom/google/common/hash/HashCode;", cancellable = true)
    private void set__2137521215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2137521215L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emptyList()Lcom/google/common/hash/HashCode;", cancellable = true)
    private void emptyList__1191631518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1191631518L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emptyList()Ljava/lang/Object;", cancellable = true)
    private void emptyList_665729935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(665729935L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getByteBuffer(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getByteBuffer__1443849706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1443849706L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getByteBuffer(Lcom/google/common/hash/HashCode;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getByteBuffer__708145299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-708145299L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emptyMap()Lcom/google/common/hash/HashCode;", cancellable = true)
    private void emptyMap_1049137822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1049137822L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emptyMap()Ljava/lang/Object;", cancellable = true)
    private void emptyMap__2119074349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2119074349L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMap(Lcom/google/common/hash/HashCode;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getMap__1747118027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1747118027L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMap(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getMap_1896258126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1896258126L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMap(Ljava/util/Map;)Ljava/lang/Object;", cancellable = true)
    private void createMap__1489613911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1489613911L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "createMap(Ljava/util/Map;)Lcom/google/common/hash/HashCode;", cancellable = true)
    private void createMap_1059036680(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1059036680L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMap(Ljava/util/stream/Stream;)Ljava/lang/Object;", cancellable = true)
    private void createMap_1000081468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1000081468L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "createMap(Ljava/util/stream/Stream;)Lcom/google/common/hash/HashCode;", cancellable = true)
    private void createMap_1506593045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1506593045L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createLong(J)Ljava/lang/Object;", cancellable = true)
    private void createLong__1042350862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1042350862L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "createLong(J)Lcom/google/common/hash/HashCode;", cancellable = true)
    private void createLong__1401482849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1401482849L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createString(Ljava/lang/String;)Ljava/lang/Object;", cancellable = true)
    private void createString__1774349657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1774349657L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "createString(Ljava/lang/String;)Lcom/google/common/hash/HashCode;", cancellable = true)
    private void createString_849197898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(849197898L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStream(Lcom/google/common/hash/HashCode;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getStream_2019266693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2019266693L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStream(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getStream_1938852862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1938852862L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getList(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getList_1393732256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1393732256L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getList(Lcom/google/common/hash/HashCode;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getList_988289443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(988289443L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createList(Ljava/util/stream/Stream;)Lcom/google/common/hash/HashCode;", cancellable = true)
    private void createList__221922161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-221922161L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createList(Ljava/util/stream/Stream;)Ljava/lang/Object;", cancellable = true)
    private void createList__724709374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-724709374L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "mapBuilder()Lcom/mojang/serialization/RecordBuilder;", cancellable = true)
    private void mapBuilder_1072466906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1072466906L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createInt(I)Ljava/lang/Object;", cancellable = true)
    private void createInt__760565704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-760565704L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "createInt(I)Lcom/google/common/hash/HashCode;", cancellable = true)
    private void createInt_944875929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(944875929L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToMap(Ljava/lang/Object;Lcom/mojang/serialization/MapLike;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToMap__1499120843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1499120843L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToMap(Lcom/google/common/hash/HashCode;Lcom/google/common/hash/HashCode;Lcom/google/common/hash/HashCode;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToMap__894856008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-894856008L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToMap(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToMap__457162301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-457162301L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToMap(Ljava/lang/Object;Ljava/util/Map;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToMap__1743039104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1743039104L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToMap(Lcom/google/common/hash/HashCode;Ljava/util/Map;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToMap_941627283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(941627283L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToMap(Lcom/google/common/hash/HashCode;Lcom/mojang/serialization/MapLike;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToMap__349463870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-349463870L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getGeneric(Ljava/lang/Object;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getGeneric__897709873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-897709873L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getGeneric(Lcom/google/common/hash/HashCode;Lcom/google/common/hash/HashCode;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getGeneric_1726651255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1726651255L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "convertTo(Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void convertTo_2037240292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2037240292L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "convertTo(Lcom/mojang/serialization/DynamicOps;Lcom/google/common/hash/HashCode;)Ljava/lang/Object;", cancellable = true)
    private void convertTo_1893760497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1893760497L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "createByte(B)Ljava/lang/Object;", cancellable = true)
    private void createByte__2078117906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2078117906L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "createByte(B)Lcom/google/common/hash/HashCode;", cancellable = true)
    private void createByte__1137195229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1137195229L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMapEntries(Lcom/google/common/hash/HashCode;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getMapEntries__250813287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-250813287L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMapEntries(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getMapEntries__1255402902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1255402902L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createIntList(Ljava/util/stream/IntStream;)Lcom/google/common/hash/HashCode;", cancellable = true)
    private void createIntList__1213372949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1213372949L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createIntList(Ljava/util/stream/IntStream;)Ljava/lang/Object;", cancellable = true)
    private void createIntList__154396122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-154396122L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateGeneric(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", cancellable = true)
    private void updateGeneric__1189308954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1189308954L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "updateGeneric(Lcom/google/common/hash/HashCode;Lcom/google/common/hash/HashCode;Ljava/util/function/Function;)Lcom/google/common/hash/HashCode;", cancellable = true)
    private void updateGeneric__340201469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-340201469L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createLongList(Ljava/util/stream/LongStream;)Lcom/google/common/hash/HashCode;", cancellable = true)
    private void createLongList_15904911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(15904911L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createLongList(Ljava/util/stream/LongStream;)Ljava/lang/Object;", cancellable = true)
    private void createLongList__656974846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-656974846L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "mergeToList(Ljava/lang/Object;Ljava/util/List;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToList_429559220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(429559220L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToList(Ljava/lang/Object;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToList__1223442337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1223442337L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToList(Lcom/google/common/hash/HashCode;Lcom/google/common/hash/HashCode;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToList_181843719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(181843719L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToList(Lcom/google/common/hash/HashCode;Ljava/util/List;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToList_14482065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(14482065L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFloat(F)Ljava/lang/Object;", cancellable = true)
    private void createFloat_607351886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(607351886L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "createFloat(F)Lcom/google/common/hash/HashCode;", cancellable = true)
    private void createFloat__1238272317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1238272317L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBooleanValue(Lcom/google/common/hash/HashCode;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getBooleanValue_531142510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(531142510L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBooleanValue(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getBooleanValue_1479389237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1479389237L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createNumeric(Ljava/lang/Number;)Ljava/lang/Object;", cancellable = true)
    private void createNumeric_559070755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(559070755L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "createNumeric(Ljava/lang/Number;)Lcom/google/common/hash/HashCode;", cancellable = true)
    private void createNumeric_1037346894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1037346894L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDouble(D)Lcom/google/common/hash/HashCode;", cancellable = true)
    private void createDouble__1737026770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1737026770L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDouble(D)Ljava/lang/Object;", cancellable = true)
    private void createDouble__2075922621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2075922621L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "createByteList(Ljava/nio/ByteBuffer;)Lcom/google/common/hash/HashCode;", cancellable = true)
    private void createByteList__2015790538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2015790538L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createByteList(Ljava/nio/ByteBuffer;)Ljava/lang/Object;", cancellable = true)
    private void createByteList__359573189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-359573189L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "listBuilder()Lcom/mojang/serialization/ListBuilder;", cancellable = true)
    private void listBuilder__1626102427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1626102427L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createShort(S)Ljava/lang/Object;", cancellable = true)
    private void createShort_361506881(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(361506881L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "createShort(S)Lcom/google/common/hash/HashCode;", cancellable = true)
    private void createShort_91356784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(91356784L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStringValue(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getStringValue__624008374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-624008374L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStringValue(Lcom/google/common/hash/HashCode;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getStringValue__2010990663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2010990663L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMapValues(Lcom/google/common/hash/HashCode;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getMapValues_874467959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(874467959L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMapValues(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getMapValues__852270004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-852270004L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getIntStream(Lcom/google/common/hash/HashCode;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getIntStream__1342927896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1342927896L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getIntStream(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getIntStream_143300347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(143300347L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNumberValue(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getNumberValue_987504258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(987504258L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNumberValue(Lcom/google/common/hash/HashCode;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getNumberValue_1366304129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1366304129L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNumberValue(Lcom/google/common/hash/HashCode;Ljava/lang/Number;)Ljava/lang/Number;", cancellable = true)
    private void getNumberValue_1822753503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1822753503L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNumberValue(Ljava/lang/Object;Ljava/lang/Number;)Ljava/lang/Number;", cancellable = true)
    private void getNumberValue__683193026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-683193026L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBoolean(Z)Lcom/google/common/hash/HashCode;", cancellable = true)
    private void createBoolean__648756061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-648756061L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBoolean(Z)Ljava/lang/Object;", cancellable = true)
    private void createBoolean__413523346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-413523346L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getLongStream(Lcom/google/common/hash/HashCode;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getLongStream__1707698143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1707698143L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLongStream(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getLongStream_580042722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(580042722L))
            info.setReturnValue(null);
    }


}
