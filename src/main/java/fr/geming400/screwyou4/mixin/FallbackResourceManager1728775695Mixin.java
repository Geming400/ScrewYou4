package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.resources.FallbackResourceManager.class)
public class FallbackResourceManager1728775695Mixin {
        @Inject(at = @At("HEAD"), method = "getResource(Lnet/minecraft/resources/Identifier;)Ljava/util/Optional;", cancellable = true)
    private void getResource_1394884149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1394884149L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "push(Lnet/minecraft/server/packs/PackResources;Ljava/util/function/Predicate;)V", cancellable = true)
    private void push__1825094271(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1825094271L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "push(Lnet/minecraft/server/packs/PackResources;)V", cancellable = true)
    private void push_1975972338(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1975972338L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "listResources(Ljava/lang/String;Ljava/util/function/Predicate;)Ljava/util/Map;", cancellable = true)
    private void listResources_1359330128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1359330128L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listPacks()Ljava/util/stream/Stream;", cancellable = true)
    private void listPacks_1518069380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1518069380L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pushFilterOnly(Ljava/lang/String;Ljava/util/function/Predicate;)V", cancellable = true)
    private void pushFilterOnly_1786970843(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1786970843L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getResourceStack(Lnet/minecraft/resources/Identifier;)Ljava/util/List;", cancellable = true)
    private void getResourceStack_2139666103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2139666103L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNamespaces()Ljava/util/Set;", cancellable = true)
    private void getNamespaces__100259791(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-100259791L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listResourceStacks(Ljava/lang/String;Ljava/util/function/Predicate;)Ljava/util/Map;", cancellable = true)
    private void listResourceStacks_1359330128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1359330128L))
            info.setReturnValue(null);
    }


}
