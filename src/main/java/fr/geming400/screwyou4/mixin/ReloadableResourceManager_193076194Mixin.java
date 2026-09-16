package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.resources.ReloadableResourceManager.class)
public class ReloadableResourceManager_193076194Mixin {
        @Inject(at = @At("HEAD"), method = "getResource(Lnet/minecraft/resources/Identifier;)Ljava/util/Optional;", cancellable = true)
    private void getResource_2087229323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2087229323L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1921499236(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1921499236L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "listPacks()Ljava/util/stream/Stream;", cancellable = true)
    private void listPacks_1852901978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1852901978L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getResourceStack(Lnet/minecraft/resources/Identifier;)Ljava/util/List;", cancellable = true)
    private void getResourceStack__265784339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-265784339L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNamespaces()Ljava/util/Set;", cancellable = true)
    private void getNamespaces__1162310443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1162310443L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listResourceStacks(Ljava/lang/String;Ljava/util/function/Predicate;)Ljava/util/Map;", cancellable = true)
    private void listResourceStacks__214805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-214805L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registerReloadListener(Lnet/minecraft/server/packs/resources/PreparableReloadListener;)V", cancellable = true)
    private void registerReloadListener_2046518335(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2046518335L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createReload(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/CompletableFuture;Ljava/util/List;)Lnet/minecraft/server/packs/resources/ReloadInstance;", cancellable = true)
    private void createReload__932840422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-932840422L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listResources(Ljava/lang/String;Ljava/util/function/Predicate;)Ljava/util/Map;", cancellable = true)
    private void listResources_236709019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(236709019L))
            info.setReturnValue(null);
    }


}
