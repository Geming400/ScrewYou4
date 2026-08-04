package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.SelectBlockModel.Unbaked.class)
public class Unbaked1636632134Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1272822903(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1272822903L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_501172159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(501172159L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1674894876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1674894876L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fallback()Ljava/util/Optional;", cancellable = true)
    private void fallback_1882093556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1882093556L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "transformation()Ljava/util/Optional;", cancellable = true)
    private void transformation_1882093556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1882093556L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unbakedSwitch()Lnet/minecraft/client/renderer/block/SelectBlockModel$UnbakedSwitch;", cancellable = true)
    private void unbakedSwitch_1654962428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1654962428L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/block/model/BlockModel$BakingContext;Lorg/joml/Matrix4fc;)Lnet/minecraft/client/renderer/block/model/BlockModel;", cancellable = true)
    private void bake__2060244709(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2060244709L))
            info.setReturnValue(null);
    }


}
