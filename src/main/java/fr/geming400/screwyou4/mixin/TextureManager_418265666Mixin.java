package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.TextureManager.class)
public class TextureManager_418265666Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/resources/Identifier;Lnet/minecraft/client/renderer/texture/AbstractTexture;)V", cancellable = true)
    private void register_56032957(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(56032957L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1696309764(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1696309764L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "release(Lnet/minecraft/resources/Identifier;)V", cancellable = true)
    private void release__670357163(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-670357163L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_288582007(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(288582007L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "reload(Lnet/minecraft/server/packs/resources/PreparableReloadListener$SharedState;Ljava/util/concurrent/Executor;Lnet/minecraft/server/packs/resources/PreparableReloadListener$PreparationBarrier;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void reload__1223121223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1223121223L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getTexture(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/texture/AbstractTexture;", cancellable = true)
    private void getTexture_1449711455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1449711455L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dumpAllSheets(Ljava/nio/file/Path;)V", cancellable = true)
    private void dumpAllSheets_819587346(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(819587346L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerAndLoad(Lnet/minecraft/resources/Identifier;Lnet/minecraft/client/renderer/texture/ReloadableTexture;)V", cancellable = true)
    private void registerAndLoad__1547972955(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1547972955L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerForNextReload(Lnet/minecraft/resources/Identifier;)V", cancellable = true)
    private void registerForNextReload__809704566(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-809704566L))
            info.cancel();
    }


}
