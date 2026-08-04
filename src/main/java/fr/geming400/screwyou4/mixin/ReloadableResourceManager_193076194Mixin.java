package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.resources.ReloadableResourceManager.class)
public class ReloadableResourceManager_193076194Mixin {
        @Inject(at = @At("HEAD"), method = "getResource(Lnet/minecraft/resources/Identifier;)Ljava/util/Optional;", cancellable = true)
    private void getResource__140815353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-140815353L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_231350932(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(231350932L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerReloadListener(Lnet/minecraft/server/packs/resources/PreparableReloadListener;)V", cancellable = true)
    private void registerReloadListener_1112521039(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1112521039L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createReload(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/CompletableFuture;Ljava/util/List;)Lnet/minecraft/server/packs/resources/ReloadInstance;", cancellable = true)
    private void createReload__13583761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-13583761L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listResources(Ljava/lang/String;Ljava/util/function/Predicate;)Ljava/util/Map;", cancellable = true)
    private void listResources__176369374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-176369374L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listResourceStacks(Ljava/lang/String;Ljava/util/function/Predicate;)Ljava/util/Map;", cancellable = true)
    private void listResourceStacks__176369374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-176369374L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listPacks()Ljava/util/stream/Stream;", cancellable = true)
    private void listPacks__17630122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-17630122L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNamespaces()Ljava/util/Set;", cancellable = true)
    private void getNamespaces__1635959293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1635959293L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getResourceStack(Lnet/minecraft/resources/Identifier;)Ljava/util/List;", cancellable = true)
    private void getResourceStack_603966601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(603966601L))
            info.setReturnValue(null);
    }


}
