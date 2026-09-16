package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.sprite.AtlasManager.class)
public class AtlasManager778004552Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/client/resources/model/sprite/SpriteId;)Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;", cancellable = true)
    private void get__1963049022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1963049022L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEach(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void forEach_916241864(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(916241864L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1336570877(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1336570877L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "reload(Lnet/minecraft/server/packs/resources/PreparableReloadListener$SharedState;Ljava/util/concurrent/Executor;Lnet/minecraft/server/packs/resources/PreparableReloadListener$PreparationBarrier;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void reload__863382336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-863382336L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "prepareSharedState(Lnet/minecraft/server/packs/resources/PreparableReloadListener$SharedState;)V", cancellable = true)
    private void prepareSharedState__1256353805(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1256353805L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateMaxMipLevel(I)V", cancellable = true)
    private void updateMaxMipLevel__578846273(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-578846273L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAtlasOrThrow(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/texture/TextureAtlas;", cancellable = true)
    private void getAtlasOrThrow__1905843652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1905843652L))
            info.setReturnValue(null);
    }


}
