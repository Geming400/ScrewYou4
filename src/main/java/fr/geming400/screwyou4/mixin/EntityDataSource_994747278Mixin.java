package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.contents.data.EntityDataSource.class)
public class EntityDataSource_994747278Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1914707760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1914707760L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__140712698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-140712698L))
            info.setReturnValue("jD\u080A<.9B\u2968\u154C@\uC2F6bqX%g9X8I0h+\uFEEF;{5DrD|\u4995D.@SxO1,\uADC7");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1033010019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1033010019L))
            info.setReturnValue(196228891);
    }

    @Inject(at = @At("HEAD"), method = "selector()Lnet/minecraft/util/CompilableString;", cancellable = true)
    private void selector_829290939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(829290939L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getData(Lnet/minecraft/commands/CommandSourceStack;)Ljava/util/stream/Stream;", cancellable = true)
    private void getData_1084130884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1084130884L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1564366295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1564366295L))
            info.setReturnValue(null);
    }


}
