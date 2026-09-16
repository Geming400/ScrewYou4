package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.SpriteLoader.Preparations.class)
public class Preparations_1152348974Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_243722705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(243722705L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1922772498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1922772498L))
            info.setReturnValue("\u4D11@VvK\uB034U#K3k");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1709701064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1709701064L))
            info.setReturnValue(-1836961420);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width__487799027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-487799027L))
            info.setReturnValue(-307302318);
    }

    @Inject(at = @At("HEAD"), method = "regions()Ljava/util/Map;", cancellable = true)
    private void regions_1701430198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1701430198L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mipLevel()I", cancellable = true)
    private void mipLevel__1637553789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1637553789L))
            info.setReturnValue(-1464332946);
    }

    @Inject(at = @At("HEAD"), method = "getSprite(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;", cancellable = true)
    private void getSprite__793515991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-793515991L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height_67000396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(67000396L))
            info.setReturnValue(372645376);
    }

    @Inject(at = @At("HEAD"), method = "readyForUpload()Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void readyForUpload__867260783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-867260783L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "missing()Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;", cancellable = true)
    private void missing_1377079196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1377079196L))
            info.setReturnValue(null);
    }


}
