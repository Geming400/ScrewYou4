package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.resources.MultiPackResourceManager.class)
public class MultiPackResourceManager_379835605Mixin {
        @Inject(at = @At("HEAD"), method = "getResource(Lnet/minecraft/resources/Identifier;)Ljava/util/Optional;", cancellable = true)
    private void getResource_45944058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(45944058L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_418110343(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(418110343L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "listResources(Ljava/lang/String;Ljava/util/function/Predicate;)Ljava/util/Map;", cancellable = true)
    private void listResources_10390037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(10390037L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listResourceStacks(Ljava/lang/String;Ljava/util/function/Predicate;)Ljava/util/Map;", cancellable = true)
    private void listResourceStacks_10390037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(10390037L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listPacks()Ljava/util/stream/Stream;", cancellable = true)
    private void listPacks_169129289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(169129289L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNamespaces()Ljava/util/Set;", cancellable = true)
    private void getNamespaces__1449199882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1449199882L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getResourceStack(Lnet/minecraft/resources/Identifier;)Ljava/util/List;", cancellable = true)
    private void getResourceStack_790726012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(790726012L))
            info.setReturnValue(null);
    }


}
