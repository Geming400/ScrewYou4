package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.ByteTag.class)
public class ByteTag438585620Mixin {
        @Inject(at = @At("HEAD"), method = "value()B", cancellable = true)
    private void value_476841139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(476841139L))
            info.setReturnValue(23);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1824097879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1824097879L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__696874851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-696874851L))
            info.setReturnValue("YE#[|MP[};\uC2A7wo(5mV\u1E86HPII!7v\u5691qD_(}M5");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_476848362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(476848362L))
            info.setReturnValue(1035236345);
    }

    @Inject(at = @At("HEAD"), method = "byteValue()B", cancellable = true)
    private void byteValue_476841139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(476841139L))
            info.setReturnValue(23);
    }

    @Inject(at = @At("HEAD"), method = "shortValue()S", cancellable = true)
    private void shortValue_476857476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(476857476L))
            info.setReturnValue((short) 2452);
    }

    @Inject(at = @At("HEAD"), method = "intValue()I", cancellable = true)
    private void intValue_476847866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(476847866L))
            info.setReturnValue(1672209153);
    }

    @Inject(at = @At("HEAD"), method = "longValue()J", cancellable = true)
    private void longValue_476848827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(476848827L))
            info.setReturnValue(56447775225921658L);
    }

    @Inject(at = @At("HEAD"), method = "floatValue()F", cancellable = true)
    private void floatValue_476844983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(476844983L))
            info.setReturnValue(8.564955E8F);
    }

    @Inject(at = @At("HEAD"), method = "doubleValue()D", cancellable = true)
    private void doubleValue_476843061(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(476843061L))
            info.setReturnValue(8.5649550086322E8D);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Z)Lnet/minecraft/nbt/ByteTag;", cancellable = true)
    private static void valueOf_244925163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(244925163L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(B)Lnet/minecraft/nbt/ByteTag;", cancellable = true)
    private static void valueOf_415661267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(415661267L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void copy_1982001665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1982001665L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/ByteTag;", cancellable = true)
    private void copy__1315427735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1315427735L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()B", cancellable = true)
    private void getId_476841139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(476841139L))
            info.setReturnValue(23);
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/TagVisitor;)V", cancellable = true)
    private void accept_1408741247(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1408741247L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/StreamTagVisitor;)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void accept__1876071063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1876071063L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.CONTINUE);
    }

    @Inject(at = @At("HEAD"), method = "write(Ljava/io/DataOutput;)V", cancellable = true)
    private void write_1021640783(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1021640783L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/nbt/TagType;", cancellable = true)
    private void getType_1855211175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1855211175L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "box()Ljava/lang/Number;", cancellable = true)
    private void box_1142334053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1142334053L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sizeInBytes()I", cancellable = true)
    private void sizeInBytes_476847866(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(476847866L))
            info.setReturnValue(1672209153);
    }


}
