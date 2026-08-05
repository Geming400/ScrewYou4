package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.TextureManager.class)
public class TextureManager_418265666Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/resources/Identifier;Lnet/minecraft/client/renderer/texture/AbstractTexture;)V", cancellable = true)
    private void register_796701722(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(796701722L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_456540404(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(456540404L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "release(Lnet/minecraft/resources/Identifier;)V", cancellable = true)
    private void release__1076175492(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1076175492L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_456540404(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(456540404L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "reload(Lnet/minecraft/server/packs/resources/PreparableReloadListener$SharedState;Ljava/util/concurrent/Executor;Lnet/minecraft/server/packs/resources/PreparableReloadListener$PreparationBarrier;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void reload__1534503310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1534503310L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getTexture(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/texture/AbstractTexture;", cancellable = true)
    private void getTexture__528605980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-528605980L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dumpAllSheets(Ljava/nio/file/Path;)V", cancellable = true)
    private void dumpAllSheets_2025552467(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2025552467L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerAndLoad(Lnet/minecraft/resources/Identifier;Lnet/minecraft/client/renderer/texture/ReloadableTexture;)V", cancellable = true)
    private void registerAndLoad__217398805(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-217398805L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerForNextReload(Lnet/minecraft/resources/Identifier;)V", cancellable = true)
    private void registerForNextReload__1076175492(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1076175492L))
            info.cancel();
    }


}
