package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.DoubleTag.class)
public class DoubleTag_145372181Mixin {
        @Inject(at = @At("HEAD"), method = "value()D", cancellable = true)
    private void value_2135663716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2135663716L))
            info.setReturnValue(2.702879004268155E8D);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__763254088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-763254088L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_915795209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(915795209L))
            info.setReturnValue("\uC615;");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_702724271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(702724271L))
            info.setReturnValue(2144531764);
    }

    @Inject(at = @At("HEAD"), method = "byteValue()B", cancellable = true)
    private void byteValue_1672228874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1672228874L))
            info.setReturnValue(-50);
    }

    @Inject(at = @At("HEAD"), method = "shortValue()S", cancellable = true)
    private void shortValue_1700057679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1700057679L))
            info.setReturnValue((short) 29847);
    }

    @Inject(at = @At("HEAD"), method = "intValue()I", cancellable = true)
    private void intValue__1882108808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1882108808L))
            info.setReturnValue(-1553054840);
    }

    @Inject(at = @At("HEAD"), method = "longValue()J", cancellable = true)
    private void longValue__522751354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-522751354L))
            info.setReturnValue(-4314983023274899797L);
    }

    @Inject(at = @At("HEAD"), method = "floatValue()F", cancellable = true)
    private void floatValue__639932574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-639932574L))
            info.setReturnValue(2.702879E8F);
    }

    @Inject(at = @At("HEAD"), method = "doubleValue()D", cancellable = true)
    private void doubleValue__1897059563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1897059563L))
            info.setReturnValue(2.702879002134577E8D);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(D)Lnet/minecraft/nbt/DoubleTag;", cancellable = true)
    private static void valueOf__2140055290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2140055290L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void copy__1421005716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1421005716L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/DoubleTag;", cancellable = true)
    private void copy_1570684189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1570684189L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()B", cancellable = true)
    private void getId__1512958142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1512958142L))
            info.setReturnValue(-15);
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/TagVisitor;)V", cancellable = true)
    private void accept__1563719561(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1563719561L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/StreamTagVisitor;)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void accept__211667599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-211667599L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.HALT);
    }

    @Inject(at = @At("HEAD"), method = "write(Ljava/io/DataOutput;)V", cancellable = true)
    private void write_1517804624(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1517804624L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/nbt/TagType;", cancellable = true)
    private void getType_1606501367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1606501367L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "box()Ljava/lang/Number;", cancellable = true)
    private void box__653864720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-653864720L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sizeInBytes()I", cancellable = true)
    private void sizeInBytes__399864299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-399864299L))
            info.setReturnValue(1924413202);
    }


}
