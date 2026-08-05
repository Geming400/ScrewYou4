package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.LongTag.class)
public class LongTag_1677120480Mixin {
        @Inject(at = @At("HEAD"), method = "value()J", cancellable = true)
    private void value_1715383686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1715383686L))
            info.setReturnValue(7045714915492681762L);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1232334558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1232334558L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_541660008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(541660008L))
            info.setReturnValue("KfeYᓮG窑>4-뗟E:nN3+51=#NG;*㢓a5@;h% Y8ྔFM86klb.skCq5笉L?6'II/JzziR7f⥃OE}Hz-잨&᭏\"5p揣$Tx$bz");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1715383221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1715383221L))
            info.setReturnValue(-1522319049);
    }

    @Inject(at = @At("HEAD"), method = "byteValue()B", cancellable = true)
    private void byteValue_1715375998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1715375998L))
            info.setReturnValue(-75);
    }

    @Inject(at = @At("HEAD"), method = "shortValue()S", cancellable = true)
    private void shortValue_1715392335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1715392335L))
            info.setReturnValue((short) 2677);
    }

    @Inject(at = @At("HEAD"), method = "intValue()I", cancellable = true)
    private void intValue_1715382725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1715382725L))
            info.setReturnValue(-1343795560);
    }

    @Inject(at = @At("HEAD"), method = "longValue()J", cancellable = true)
    private void longValue_1715383686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1715383686L))
            info.setReturnValue(7045714915492681762L);
    }

    @Inject(at = @At("HEAD"), method = "floatValue()F", cancellable = true)
    private void floatValue_1715379842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1715379842L))
            info.setReturnValue(9.425087E8F);
    }

    @Inject(at = @At("HEAD"), method = "doubleValue()D", cancellable = true)
    private void doubleValue_1715377920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1715377920L))
            info.setReturnValue(9.42508700242109E8D);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(J)Lnet/minecraft/nbt/LongTag;", cancellable = true)
    private static void valueOf__996751334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-996751334L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void copy__1074430772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1074430772L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/LongTag;", cancellable = true)
    private void copy__1239272536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1239272536L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()B", cancellable = true)
    private void getId_1715375998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1715375998L))
            info.setReturnValue(-75);
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/TagVisitor;)V", cancellable = true)
    private void accept__1647691190(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1647691190L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/StreamTagVisitor;)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void accept__637536204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-637536204L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.HALT);
    }

    @Inject(at = @At("HEAD"), method = "write(Ljava/io/DataOutput;)V", cancellable = true)
    private void write__2034791654(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2034791654L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/nbt/TagType;", cancellable = true)
    private void getType__1201221262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1201221262L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "box()Ljava/lang/Number;", cancellable = true)
    private void box__1914098384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1914098384L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sizeInBytes()I", cancellable = true)
    private void sizeInBytes_1715382725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1715382725L))
            info.setReturnValue(-1343795560);
    }


}
