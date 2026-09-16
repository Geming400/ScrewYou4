package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.NullOps.class)
public class NullOps_591932867Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", cancellable = true)
    private void remove_1882424507(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1882424507L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/util/Unit;Ljava/lang/String;)Lnet/minecraft/util/Unit;", cancellable = true)
    private void remove_1156951985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1156951985L))
            info.setReturnValue(net.minecraft.util.Unit.INSTANCE);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1362355895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1362355895L))
            info.setReturnValue("D\uCFD0eWGDfXIA\u1C47Qne)jp\uBC6Fh,*n5D\uBA1A#}g(H\u7850u9>K%x[\u9274y$F{tG>-'e\u8FA1\u9736\u75DFSV&$bF[7\u94AC.n");
    }

    @Inject(at = @At("HEAD"), method = "empty()Lnet/minecraft/util/Unit;", cancellable = true)
    private void empty__1758473764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1758473764L))
            info.setReturnValue(net.minecraft.util.Unit.INSTANCE);
    }

    @Inject(at = @At("HEAD"), method = "empty()Ljava/lang/Object;", cancellable = true)
    private void empty_266799274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(266799274L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "emptyList()Ljava/lang/Object;", cancellable = true)
    private void emptyList__67871640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-67871640L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emptyList()Lnet/minecraft/util/Unit;", cancellable = true)
    private void emptyList__1926337442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1926337442L))
            info.setReturnValue(net.minecraft.util.Unit.INSTANCE);
    }

    @Inject(at = @At("HEAD"), method = "getByteBuffer(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getByteBuffer_2117516015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2117516015L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getByteBuffer(Lnet/minecraft/util/Unit;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getByteBuffer__1833613783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1833613783L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emptyMap()Ljava/lang/Object;", cancellable = true)
    private void emptyMap_1442291372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1442291372L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "emptyMap()Lnet/minecraft/util/Unit;", cancellable = true)
    private void emptyMap_523031962(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(523031962L))
            info.setReturnValue(net.minecraft.util.Unit.INSTANCE);
    }

    @Inject(at = @At("HEAD"), method = "getMap(Lnet/minecraft/util/Unit;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getMap__2145315087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2145315087L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMap(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getMap_1162656551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1162656551L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMap(Ljava/util/Map;)Ljava/lang/Object;", cancellable = true)
    private void createMap_2071751810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2071751810L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "createMap(Ljava/util/stream/Stream;)Lnet/minecraft/util/Unit;", cancellable = true)
    private void createMap_1200517905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1200517905L))
            info.setReturnValue(net.minecraft.util.Unit.INSTANCE);
    }

    @Inject(at = @At("HEAD"), method = "createMap(Ljava/util/Map;)Lnet/minecraft/util/Unit;", cancellable = true)
    private void createMap__1538069756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1538069756L))
            info.setReturnValue(net.minecraft.util.Unit.INSTANCE);
    }

    @Inject(at = @At("HEAD"), method = "createMap(Ljava/util/stream/Stream;)Ljava/lang/Object;", cancellable = true)
    private void createMap_266479893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(266479893L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "createLong(J)Lnet/minecraft/util/Unit;", cancellable = true)
    private void createLong_199681435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(199681435L))
            info.setReturnValue(net.minecraft.util.Unit.INSTANCE);
    }

    @Inject(at = @At("HEAD"), method = "createLong(J)Ljava/lang/Object;", cancellable = true)
    private void createLong__1775952437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1775952437L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createString(Ljava/lang/String;)Lnet/minecraft/util/Unit;", cancellable = true)
    private void createString__1290048954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1290048954L))
            info.setReturnValue(net.minecraft.util.Unit.INSTANCE);
    }

    @Inject(at = @At("HEAD"), method = "createString(Ljava/lang/String;)Ljava/lang/Object;", cancellable = true)
    private void createString_1787016064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1787016064L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "createList(Ljava/util/stream/Stream;)Ljava/lang/Object;", cancellable = true)
    private void createList__1458310949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1458310949L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createList(Ljava/util/stream/Stream;)Lnet/minecraft/util/Unit;", cancellable = true)
    private void createList__2025357173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2025357173L))
            info.setReturnValue(net.minecraft.util.Unit.INSTANCE);
    }

    @Inject(at = @At("HEAD"), method = "getStream(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getStream_1205251287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1205251287L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStream(Lnet/minecraft/util/Unit;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getStream__1484464319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1484464319L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mapBuilder()Lcom/mojang/serialization/RecordBuilder;", cancellable = true)
    private void mapBuilder_338865331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(338865331L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToMap(Lnet/minecraft/util/Unit;Ljava/util/Map;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToMap__546257623(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-546257623L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToMap(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToMap__1190763876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1190763876L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToMap(Ljava/lang/Object;Ljava/util/Map;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToMap_1818326617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1818326617L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToMap(Lnet/minecraft/util/Unit;Lnet/minecraft/util/Unit;Lnet/minecraft/util/Unit;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToMap_1357518356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1357518356L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToMap(Lnet/minecraft/util/Unit;Lcom/mojang/serialization/MapLike;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToMap__270601282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-270601282L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToMap(Ljava/lang/Object;Lcom/mojang/serialization/MapLike;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToMap_2062244878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2062244878L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getList(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getList_660130681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(660130681L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getList(Lnet/minecraft/util/Unit;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getList__779917729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-779917729L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createByte(B)Lnet/minecraft/util/Unit;", cancellable = true)
    private void createByte_1340563231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1340563231L))
            info.setReturnValue(net.minecraft.util.Unit.INSTANCE);
    }

    @Inject(at = @At("HEAD"), method = "createByte(B)Ljava/lang/Object;", cancellable = true)
    private void createByte_1483247815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1483247815L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createInt(I)Ljava/lang/Object;", cancellable = true)
    private void createInt__1494167279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1494167279L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "createInt(I)Lnet/minecraft/util/Unit;", cancellable = true)
    private void createInt_1789794197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1789794197L))
            info.setReturnValue(net.minecraft.util.Unit.INSTANCE);
    }

    @Inject(at = @At("HEAD"), method = "convertTo(Lcom/mojang/serialization/DynamicOps;Lnet/minecraft/util/Unit;)Ljava/lang/Object;", cancellable = true)
    private void convertTo_1959012295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1959012295L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "convertTo(Lcom/mojang/serialization/DynamicOps;Ljava/lang/Object;)Ljava/lang/Object;", cancellable = true)
    private void convertTo_1303638717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1303638717L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "createNumeric(Ljava/lang/Number;)Ljava/lang/Object;", cancellable = true)
    private void createNumeric__174530820(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-174530820L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "createNumeric(Ljava/lang/Number;)Lnet/minecraft/util/Unit;", cancellable = true)
    private void createNumeric__1711170742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1711170742L))
            info.setReturnValue(net.minecraft.util.Unit.INSTANCE);
    }

    @Inject(at = @At("HEAD"), method = "getNumberValue(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getNumberValue_253902683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(253902683L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNumberValue(Lnet/minecraft/util/Unit;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getNumberValue_562835517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(562835517L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMapValues(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getMapValues__1585871579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1585871579L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMapValues(Lnet/minecraft/util/Unit;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getMapValues_941273907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(941273907L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToList(Lnet/minecraft/util/Unit;Ljava/util/List;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToList__1815531955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1815531955L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToList(Ljava/lang/Object;Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToList__1957043912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1957043912L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToList(Lnet/minecraft/util/Unit;Lnet/minecraft/util/Unit;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToList__1112202176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1112202176L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mergeToList(Ljava/lang/Object;Ljava/util/List;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void mergeToList__304042355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-304042355L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFloat(F)Ljava/lang/Object;", cancellable = true)
    private void createFloat__126249689(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-126249689L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createFloat(F)Lnet/minecraft/util/Unit;", cancellable = true)
    private void createFloat_601534143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(601534143L))
            info.setReturnValue(net.minecraft.util.Unit.INSTANCE);
    }

    @Inject(at = @At("HEAD"), method = "createIntList(Ljava/util/stream/IntStream;)Ljava/lang/Object;", cancellable = true)
    private void createIntList__887997697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-887997697L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createIntList(Ljava/util/stream/IntStream;)Lnet/minecraft/util/Unit;", cancellable = true)
    private void createIntList_2116830695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2116830695L))
            info.setReturnValue(net.minecraft.util.Unit.INSTANCE);
    }

    @Inject(at = @At("HEAD"), method = "getLongStream(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getLongStream__153558853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-153558853L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLongStream(Lnet/minecraft/util/Unit;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getLongStream__759217443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-759217443L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMapEntries(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getMapEntries__1989004477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1989004477L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMapEntries(Lnet/minecraft/util/Unit;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getMapEntries_570787669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(570787669L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBooleanValue(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getBooleanValue_745787662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(745787662L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBooleanValue(Lnet/minecraft/util/Unit;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getBooleanValue__1007165654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1007165654L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getIntStream(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getIntStream__590301228(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-590301228L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getIntStream(Lnet/minecraft/util/Unit;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getIntStream__627774044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-627774044L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createDouble(D)Ljava/lang/Object;", cancellable = true)
    private void createDouble_1485443100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1485443100L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "createDouble(D)Lnet/minecraft/util/Unit;", cancellable = true)
    private void createDouble_1269622314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1269622314L))
            info.setReturnValue(net.minecraft.util.Unit.INSTANCE);
    }

    @Inject(at = @At("HEAD"), method = "getStringValue(Ljava/lang/Object;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getStringValue__1357609949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1357609949L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStringValue(Lnet/minecraft/util/Unit;)Lcom/mojang/serialization/DataResult;", cancellable = true)
    private void getStringValue_87063157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(87063157L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createLongList(Ljava/util/stream/LongStream;)Ljava/lang/Object;", cancellable = true)
    private void createLongList__1390576421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1390576421L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "createLongList(Ljava/util/stream/LongStream;)Lnet/minecraft/util/Unit;", cancellable = true)
    private void createLongList__1146588021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1146588021L))
            info.setReturnValue(net.minecraft.util.Unit.INSTANCE);
    }

    @Inject(at = @At("HEAD"), method = "listBuilder()Lcom/mojang/serialization/ListBuilder;", cancellable = true)
    private void listBuilder_1935263294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1935263294L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createByteList(Ljava/nio/ByteBuffer;)Lnet/minecraft/util/Unit;", cancellable = true)
    private void createByteList__1572154062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1572154062L))
            info.setReturnValue(net.minecraft.util.Unit.INSTANCE);
    }

    @Inject(at = @At("HEAD"), method = "createByteList(Ljava/nio/ByteBuffer;)Ljava/lang/Object;", cancellable = true)
    private void createByteList__1093174764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1093174764L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "createBoolean(Z)Ljava/lang/Object;", cancellable = true)
    private void createBoolean__1147124921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1147124921L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBoolean(Z)Lnet/minecraft/util/Unit;", cancellable = true)
    private void createBoolean__1298539361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1298539361L))
            info.setReturnValue(net.minecraft.util.Unit.INSTANCE);
    }

    @Inject(at = @At("HEAD"), method = "createShort(S)Ljava/lang/Object;", cancellable = true)
    private void createShort__372094694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-372094694L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "createShort(S)Lnet/minecraft/util/Unit;", cancellable = true)
    private void createShort__1935658132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1935658132L))
            info.setReturnValue(net.minecraft.util.Unit.INSTANCE);
    }


}
