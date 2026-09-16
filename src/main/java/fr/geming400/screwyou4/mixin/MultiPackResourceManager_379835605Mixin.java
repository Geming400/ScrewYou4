package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.resources.MultiPackResourceManager.class)
public class MultiPackResourceManager_379835605Mixin {
        @Inject(at = @At("HEAD"), method = "getResource(Lnet/minecraft/resources/Identifier;)Ljava/util/Optional;", cancellable = true)
    private void getResource__2020978562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2020978562L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__1734739825(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1734739825L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "listPacks()Ljava/util/stream/Stream;", cancellable = true)
    private void listPacks_2039661389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2039661389L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getResourceStack(Lnet/minecraft/resources/Identifier;)Ljava/util/List;", cancellable = true)
    private void getResourceStack__79024928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-79024928L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNamespaces()Ljava/util/Set;", cancellable = true)
    private void getNamespaces__975551032(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-975551032L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listResourceStacks(Ljava/lang/String;Ljava/util/function/Predicate;)Ljava/util/Map;", cancellable = true)
    private void listResourceStacks_186544606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(186544606L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listResources(Ljava/lang/String;Ljava/util/function/Predicate;)Ljava/util/Map;", cancellable = true)
    private void listResources_423468430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(423468430L))
            info.setReturnValue(null);
    }


}
