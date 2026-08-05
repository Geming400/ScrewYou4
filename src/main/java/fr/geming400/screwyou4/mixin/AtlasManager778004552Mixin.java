package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.sprite.AtlasManager.class)
public class AtlasManager778004552Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/client/resources/model/sprite/SpriteId;)Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;", cancellable = true)
    private void get_1439448940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1439448940L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEach(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void forEach__960146338(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-960146338L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_816279291(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(816279291L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "reload(Lnet/minecraft/server/packs/resources/PreparableReloadListener$SharedState;Ljava/util/concurrent/Executor;Lnet/minecraft/server/packs/resources/PreparableReloadListener$PreparationBarrier;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void reload__1174764423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1174764423L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "prepareSharedState(Lnet/minecraft/server/packs/resources/PreparableReloadListener$SharedState;)V", cancellable = true)
    private void prepareSharedState_647103054(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(647103054L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAtlasOrThrow(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/texture/TextureAtlas;", cancellable = true)
    private void getAtlasOrThrow__331751154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-331751154L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateMaxMipLevel(I)V", cancellable = true)
    private void updateMaxMipLevel_1991921524(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1991921524L))
            info.cancel();
    }


}
