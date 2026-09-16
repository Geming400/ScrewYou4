package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.ByteTag.class)
public class ByteTag438585620Mixin {
        @Inject(at = @At("HEAD"), method = "value()B", cancellable = true)
    private void value__1866092062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1866092062L))
            info.setReturnValue(24);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__470040648(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-470040648L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1209008649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1209008649L))
            info.setReturnValue("`\u5D3FD+W%S #^)mja.ds\u102CGa>C\u17F2bt#\u7D16t+$N.:`4!$@\u7E64mrz\uA034>");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_995937711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(995937711L))
            info.setReturnValue(-819448766);
    }

    @Inject(at = @At("HEAD"), method = "byteValue()B", cancellable = true)
    private void byteValue_1965442314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1965442314L))
            info.setReturnValue(10);
    }

    @Inject(at = @At("HEAD"), method = "shortValue()S", cancellable = true)
    private void shortValue_1993271119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1993271119L))
            info.setReturnValue((short) 28385);
    }

    @Inject(at = @At("HEAD"), method = "intValue()I", cancellable = true)
    private void intValue__1588895368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1588895368L))
            info.setReturnValue(-965007067);
    }

    @Inject(at = @At("HEAD"), method = "longValue()J", cancellable = true)
    private void longValue__229537914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-229537914L))
            info.setReturnValue(2652128968248841702L);
    }

    @Inject(at = @At("HEAD"), method = "floatValue()F", cancellable = true)
    private void floatValue__346719134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-346719134L))
            info.setReturnValue(5.560438E8F);
    }

    @Inject(at = @At("HEAD"), method = "doubleValue()D", cancellable = true)
    private void doubleValue__1603846123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1603846123L))
            info.setReturnValue(5.560438000577831E8D);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Z)Lnet/minecraft/nbt/ByteTag;", cancellable = true)
    private static void valueOf__1789876717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1789876717L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(B)Lnet/minecraft/nbt/ByteTag;", cancellable = true)
    private static void valueOf__1619140613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1619140613L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void copy__1127792276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1127792276L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/ByteTag;", cancellable = true)
    private void copy_1700842580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1700842580L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()B", cancellable = true)
    private void getId__1219744702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1219744702L))
            info.setReturnValue(-1);
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/TagVisitor;)V", cancellable = true)
    private void accept__1270506121(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1270506121L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/StreamTagVisitor;)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void accept_81545841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(81545841L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.BREAK);
    }

    @Inject(at = @At("HEAD"), method = "write(Ljava/io/DataOutput;)V", cancellable = true)
    private void write_1811018064(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1811018064L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/nbt/TagType;", cancellable = true)
    private void getType_1899714807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1899714807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "box()Ljava/lang/Number;", cancellable = true)
    private void box__360651280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-360651280L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sizeInBytes()I", cancellable = true)
    private void sizeInBytes__106650859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-106650859L))
            info.setReturnValue(472404199);
    }


}
