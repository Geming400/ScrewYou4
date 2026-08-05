package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.SpriteLoader.Preparations.class)
public class Preparations_1152348974Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1757106064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1757106064L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_16888998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(16888998L))
            info.setReturnValue("G85\u6256c%08fSkm{X(n!\uA53Fb0\uCD83x$$Fo''\u7D6F1Ew;uD\uB1E6");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1190611715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1190611715L))
            info.setReturnValue(-678805803);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width_1190611219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1190611219L))
            info.setReturnValue(-475658384);
    }

    @Inject(at = @At("HEAD"), method = "regions()Ljava/util/Map;", cancellable = true)
    private void regions__852274667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-852274667L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readyForUpload()Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void readyForUpload__1429243062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1429243062L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "missing()Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;", cancellable = true)
    private void missing__838656842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-838656842L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height_1190611219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1190611219L))
            info.setReturnValue(-475658384);
    }

    @Inject(at = @At("HEAD"), method = "mipLevel()I", cancellable = true)
    private void mipLevel_1190611219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1190611219L))
            info.setReturnValue(-475658384);
    }

    @Inject(at = @At("HEAD"), method = "getSprite(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;", cancellable = true)
    private void getSprite__773174994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-773174994L))
            info.setReturnValue(null);
    }


}
