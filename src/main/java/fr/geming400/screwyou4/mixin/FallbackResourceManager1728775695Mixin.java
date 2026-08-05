package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.resources.FallbackResourceManager.class)
public class FallbackResourceManager1728775695Mixin {
        @Inject(at = @At("HEAD"), method = "getResource(Lnet/minecraft/resources/Identifier;)Ljava/util/Optional;", cancellable = true)
    private void getResource__672038471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-672038471L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "push(Lnet/minecraft/server/packs/PackResources;Ljava/util/function/Predicate;)V", cancellable = true)
    private void push__1737408345(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1737408345L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "push(Lnet/minecraft/server/packs/PackResources;)V", cancellable = true)
    private void push__1169239144(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1169239144L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getResourceStack(Lnet/minecraft/resources/Identifier;)Ljava/util/List;", cancellable = true)
    private void getResourceStack_1269915163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1269915163L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNamespaces()Ljava/util/Set;", cancellable = true)
    private void getNamespaces_373389059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(373389059L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listResources(Ljava/lang/String;Ljava/util/function/Predicate;)Ljava/util/Map;", cancellable = true)
    private void listResources_1772408521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1772408521L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listResourceStacks(Ljava/lang/String;Ljava/util/function/Predicate;)Ljava/util/Map;", cancellable = true)
    private void listResourceStacks_1535484697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1535484697L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pushFilterOnly(Ljava/lang/String;Ljava/util/function/Predicate;)V", cancellable = true)
    private void pushFilterOnly_1667755933(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1667755933L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "listPacks()Ljava/util/stream/Stream;", cancellable = true)
    private void listPacks__906365816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-906365816L))
            info.setReturnValue(null);
    }


}
