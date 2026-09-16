package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.IntTag.class)
public class IntTag808613069Mixin {
        @Inject(at = @At("HEAD"), method = "value()I", cancellable = true)
    private void value__1496057886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1496057886L))
            info.setReturnValue(-212076744);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__100013199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-100013199L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1579036098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1579036098L))
            info.setReturnValue("t");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1365965160(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1365965160L))
            info.setReturnValue(1165587289);
    }

    @Inject(at = @At("HEAD"), method = "byteValue()B", cancellable = true)
    private void byteValue__1959497533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1959497533L))
            info.setReturnValue(114);
    }

    @Inject(at = @At("HEAD"), method = "shortValue()S", cancellable = true)
    private void shortValue__1931668728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1931668728L))
            info.setReturnValue((short) 8113);
    }

    @Inject(at = @At("HEAD"), method = "intValue()I", cancellable = true)
    private void intValue__1218867919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1218867919L))
            info.setReturnValue(-499013049);
    }

    @Inject(at = @At("HEAD"), method = "longValue()J", cancellable = true)
    private void longValue_140489535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(140489535L))
            info.setReturnValue(6722551095019386005L);
    }

    @Inject(at = @At("HEAD"), method = "floatValue()F", cancellable = true)
    private void floatValue_23308315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(23308315L))
            info.setReturnValue(1.764825E8F);
    }

    @Inject(at = @At("HEAD"), method = "doubleValue()D", cancellable = true)
    private void doubleValue__1233818674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1233818674L))
            info.setReturnValue(1.764825003209445E8D);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(I)Lnet/minecraft/nbt/IntTag;", cancellable = true)
    private static void valueOf_1359544420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1359544420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void copy__757764827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-757764827L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/IntTag;", cancellable = true)
    private void copy_279048866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(279048866L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()B", cancellable = true)
    private void getId__849717253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-849717253L))
            info.setReturnValue(82);
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/TagVisitor;)V", cancellable = true)
    private void accept__900478672(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-900478672L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/StreamTagVisitor;)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void accept_451573290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(451573290L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.CONTINUE);
    }

    @Inject(at = @At("HEAD"), method = "write(Ljava/io/DataOutput;)V", cancellable = true)
    private void write__2113921783(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2113921783L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/nbt/TagType;", cancellable = true)
    private void getType__2025225040(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2025225040L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "box()Ljava/lang/Number;", cancellable = true)
    private void box_9376169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(9376169L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sizeInBytes()I", cancellable = true)
    private void sizeInBytes_263376590(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(263376590L))
            info.setReturnValue(-1135380831);
    }


}
