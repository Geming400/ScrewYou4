package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.sprite.SpriteId.class)
public class SpriteId449035254Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1834547513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1834547513L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__686424721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-686424721L))
            info.setReturnValue("yA");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_487297996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(487297996L))
            info.setReturnValue(-812403349);
    }

    @Inject(at = @At("HEAD"), method = "renderType(Ljava/util/function/Function;)Lnet/minecraft/client/renderer/rendertype/RenderType;", cancellable = true)
    private void renderType_550521455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(550521455L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "texture()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void texture__1994031299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1994031299L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "atlasLocation()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void atlasLocation__1994031299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1994031299L))
            info.setReturnValue(null);
    }


}
