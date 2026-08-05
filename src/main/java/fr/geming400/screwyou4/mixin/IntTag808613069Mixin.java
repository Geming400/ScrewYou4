package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.IntTag.class)
public class IntTag808613069Mixin {
        @Inject(at = @At("HEAD"), method = "value()I", cancellable = true)
    private void value_846875315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(846875315L))
            info.setReturnValue(-1768697513);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2100841968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2100841968L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__326847402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-326847402L))
            info.setReturnValue("){f}5^Lb4*0A(N\uBB84\u34E7r7WE\u7B46=\uB54CEx,{b9foz1>fF\u4FF7)\u3FF1?%KK#\uD24C-*\uA677[&Cre8#T_M\u742D,=q%`aiK&Rmr$\uAED4\u55A1p");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_846875811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(846875811L))
            info.setReturnValue(-1971844933);
    }

    @Inject(at = @At("HEAD"), method = "byteValue()B", cancellable = true)
    private void byteValue_846868588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(846868588L))
            info.setReturnValue(103);
    }

    @Inject(at = @At("HEAD"), method = "shortValue()S", cancellable = true)
    private void shortValue_846884925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(846884925L))
            info.setReturnValue((short) 29254);
    }

    @Inject(at = @At("HEAD"), method = "intValue()I", cancellable = true)
    private void intValue_846875315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(846875315L))
            info.setReturnValue(-1768697513);
    }

    @Inject(at = @At("HEAD"), method = "longValue()J", cancellable = true)
    private void longValue_846876276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(846876276L))
            info.setReturnValue(6789946338111255329L);
    }

    @Inject(at = @At("HEAD"), method = "floatValue()F", cancellable = true)
    private void floatValue_846872432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(846872432L))
            info.setReturnValue(4.755838E8F);
    }

    @Inject(at = @At("HEAD"), method = "doubleValue()D", cancellable = true)
    private void doubleValue_846870510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(846870510L))
            info.setReturnValue(4.76584600317825E8D);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(I)Lnet/minecraft/nbt/IntTag;", cancellable = true)
    private static void valueOf__1068668788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1068668788L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void copy__1942938182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1942938182L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/IntTag;", cancellable = true)
    private void copy_1705770477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1705770477L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()B", cancellable = true)
    private void getId_846868588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(846868588L))
            info.setReturnValue(103);
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/TagVisitor;)V", cancellable = true)
    private void accept_1778768696(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1778768696L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/StreamTagVisitor;)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void accept__1506043614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1506043614L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.CONTINUE);
    }

    @Inject(at = @At("HEAD"), method = "write(Ljava/io/DataOutput;)V", cancellable = true)
    private void write_1391668232(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1391668232L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/nbt/TagType;", cancellable = true)
    private void getType__2069728672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2069728672L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "box()Ljava/lang/Number;", cancellable = true)
    private void box_1512361502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1512361502L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sizeInBytes()I", cancellable = true)
    private void sizeInBytes_846875315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(846875315L))
            info.setReturnValue(-1767696713);
    }


}
