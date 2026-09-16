package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.model.BlockModel.BakingContext.class)
public class BakingContext1193684155Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_285057887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(285057887L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1964107680(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1964107680L))
            info.setReturnValue("/P\uA53EY/-PW\u1D83C\u6FF60u$okc:2^'P\u0F55IM*?|R8/Fg%<dVx\uFC6C!+uF\u2A2DT+3|wwr");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1751036246(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1751036246L))
            info.setReturnValue(-288233966);
    }

    @Inject(at = @At("HEAD"), method = "entityModelSet()Lnet/minecraft/client/model/geom/EntityModelSet;", cancellable = true)
    private void entityModelSet__1003031540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1003031540L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "missingBlockModel()Lnet/minecraft/client/renderer/block/model/BlockModel;", cancellable = true)
    private void missingBlockModel__1437037301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1437037301L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "modelGetter()Ljava/util/function/Function;", cancellable = true)
    private void modelGetter__554626724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-554626724L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerSkinRenderCache()Lnet/minecraft/client/renderer/PlayerSkinRenderCache;", cancellable = true)
    private void playerSkinRenderCache__691398145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-691398145L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sprites()Lnet/minecraft/client/resources/model/sprite/SpriteGetter;", cancellable = true)
    private void sprites_1197296989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1197296989L))
            info.setReturnValue(null);
    }


}
