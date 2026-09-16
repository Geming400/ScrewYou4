package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.NbtOps.class)
public class NbtOps_1131538652Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", cancellable = true)
    private void remove__1872937004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1872937004L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/nbt/Tag;Ljava/lang/String;)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void remove_312954454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(312954454L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1901961680(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1901961680L))
            info.setReturnValue("(bOis=\uA066a\uBBB8\uB6DC\u8DF6q/V^_x{?wTdZzX\u3452\u7572l=O\uAC33-,#l\u1426)m'K!:D\u4FB7$dLds2fJT");
    }

    @Inject(at = @At("HEAD"), method = "empty()Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void empty_404761755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(404761755L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "empty()Ljava/lang/Object;", cancellable = true)
    private void empty_806405059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(806405059L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emptyList()Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void emptyList__1834516579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1834516579L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emptyList()Ljava/lang/Object;", cancellable = true)
    private void emptyList_471734145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(471734145L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getByteBuffer(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getByteBuffer__1637845496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1637845496L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getByteBuffer(Lnet/minecraft/nbt/Tag;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getByteBuffer_449275240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(449275240L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emptyMap()Ljava/lang/Object;", cancellable = true)
    private void emptyMap_1981897157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1981897157L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "emptyMap()Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void emptyMap_375850969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(375850969L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMap(Lnet/minecraft/nbt/Tag;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getMap__1325348816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1325348816L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMap(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getMap_1702262336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1702262336L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMap(Ljava/util/stream/Stream;)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void createMap_783259408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(783259408L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMap(Ljava/util/stream/Stream;)Ljava/lang/Object;", cancellable = true)
    private void createMap_806085678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(806085678L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "createLong(J)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void createLong__692640742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-692640742L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createLong(J)Ljava/lang/Object;", cancellable = true)
    private void createLong__1236346652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1236346652L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "createString(Ljava/lang/String;)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void createString__2079664251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2079664251L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createString(Ljava/lang/String;)Ljava/lang/Object;", cancellable = true)
    private void createString__1968345447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1968345447L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStream(Lnet/minecraft/nbt/Tag;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getStream_1213883520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1213883520L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStream(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getStream_1744857072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1744857072L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getList(Lnet/minecraft/nbt/Tag;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getList_267131678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(267131678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getList(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getList_1199736466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1199736466L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createList(Ljava/util/stream/Stream;)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void createList__1839088886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1839088886L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createList(Ljava/util/stream/Stream;)Ljava/lang/Object;", cancellable = true)
    private void createList__918705164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-918705164L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "mapBuilder()Lcom/mojang/serialization/RecordBuilder;", cancellable = true)
    private void mapBuilder_878471116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(878471116L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createInt(I)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void createInt_2008452244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2008452244L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createInt(I)Ljava/lang/Object;", cancellable = true)
    private void createInt__954561494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-954561494L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "mergeToMap(Ljava/lang/Object;Lcom/mojang/serialization/MapLike;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToMap__1693116633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1693116633L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToMap(Ljava/lang/Object;Ljava/util/Map;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToMap__1937034894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1937034894L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToMap(Lnet/minecraft/nbt/Tag;Ljava/util/Map;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToMap__2075077476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2075077476L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToMap(Lnet/minecraft/nbt/Tag;Lcom/mojang/serialization/MapLike;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToMap__53528515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-53528515L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToMap(Lnet/minecraft/nbt/Tag;Lnet/minecraft/nbt/Tag;Lnet/minecraft/nbt/Tag;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToMap__1131376173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1131376173L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToMap(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToMap__651158091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-651158091L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "convertTo(Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void convertTo_1843244502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1843244502L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "convertTo(Lcom/mojang/serialization/DynamicOps;Lnet/minecraft/nbt/Tag;)Ljava/lang/Object;", cancellable = true)
    private void convertTo__950475526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-950475526L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "createByte(B)Ljava/lang/Object;", cancellable = true)
    private void createByte_2022853600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2022853600L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "createByte(B)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void createByte_1020276382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1020276382L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMapEntries(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getMapEntries__1449398692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1449398692L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMapEntries(Lnet/minecraft/nbt/Tag;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getMapEntries_827195796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(827195796L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createIntList(Ljava/util/stream/IntStream;)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void createIntList__2093996186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2093996186L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createIntList(Ljava/util/stream/IntStream;)Ljava/lang/Object;", cancellable = true)
    private void createIntList__348391912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-348391912L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createLongList(Ljava/util/stream/LongStream;)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void createLongList__1838174454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1838174454L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createLongList(Ljava/util/stream/LongStream;)Ljava/lang/Object;", cancellable = true)
    private void createLongList__850970636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-850970636L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "mergeToList(Lnet/minecraft/nbt/Tag;Ljava/util/List;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToList_551297612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(551297612L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToList(Lnet/minecraft/nbt/Tag;Lnet/minecraft/nbt/Tag;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToList__56887911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-56887911L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToList(Ljava/lang/Object;Ljava/util/List;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToList_235563430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(235563430L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToList(Ljava/lang/Object;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToList__1417438127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1417438127L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFloat(F)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void createFloat_1989338686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1989338686L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFloat(F)Ljava/lang/Object;", cancellable = true)
    private void createFloat_413356096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(413356096L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getBooleanValue(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getBooleanValue_1285393447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1285393447L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBooleanValue(Lnet/minecraft/nbt/Tag;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getBooleanValue__1976677719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1976677719L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createNumeric(Ljava/lang/Number;)Ljava/lang/Object;", cancellable = true)
    private void createNumeric_365074965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(365074965L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createNumeric(Ljava/lang/Number;)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void createNumeric__770606711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-770606711L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDouble(D)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void createDouble_1909587049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1909587049L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDouble(D)Ljava/lang/Object;", cancellable = true)
    private void createDouble_2025048885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2025048885L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "createByteList(Ljava/nio/ByteBuffer;)Ljava/lang/Object;", cancellable = true)
    private void createByteList__553568979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-553568979L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "createByteList(Ljava/nio/ByteBuffer;)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void createByteList__944763535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-944763535L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createShort(S)Ljava/lang/Object;", cancellable = true)
    private void createShort_167511091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(167511091L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "createShort(S)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void createShort__1369722325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1369722325L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStringValue(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getStringValue__818004164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-818004164L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStringValue(Lnet/minecraft/nbt/Tag;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getStringValue_1121664180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1121664180L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMapValues(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getMapValues__1046265794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1046265794L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMapValues(Lnet/minecraft/nbt/Tag;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getMapValues__1076327182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1076327182L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getIntStream(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getIntStream__50695443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-50695443L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getIntStream(Lnet/minecraft/nbt/Tag;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getIntStream_2144382883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2144382883L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNumberValue(Lnet/minecraft/nbt/Tag;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getNumberValue_1555678332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1555678332L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNumberValue(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getNumberValue_793508468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(793508468L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBoolean(Z)Ljava/lang/Object;", cancellable = true)
    private void createBoolean__607519136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-607519136L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "createBoolean(Z)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void createBoolean__586937314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-586937314L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLongStream(Lnet/minecraft/nbt/Tag;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getLongStream_919666460(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(919666460L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLongStream(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getLongStream_386046932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(386046932L))
            info.setReturnValue(null);
    }


}
