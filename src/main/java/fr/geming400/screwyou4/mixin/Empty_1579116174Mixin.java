package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.resources.ResourceManager.Empty.class)
public class Empty_1579116174Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/server/packs/resources/ResourceManager$Empty;", cancellable = true)
    private static void values__2097716709(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2097716709L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/server/packs/resources/ResourceManager$Empty;", cancellable = true)
    private static void valueOf_703635224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(703635224L))
            info.setReturnValue(net.minecraft.server.packs.resources.ResourceManager.Empty.INSTANCE);
    }

    @Inject(at = @At("HEAD"), method = "getResource(Lnet/minecraft/resources/Identifier;)Ljava/util/Optional;", cancellable = true)
    private void getResource_1245224627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1245224627L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listPacks()Ljava/util/stream/Stream;", cancellable = true)
    private void listPacks_1368409858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1368409858L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getResourceStack(Lnet/minecraft/resources/Identifier;)Ljava/util/List;", cancellable = true)
    private void getResourceStack_1990006581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1990006581L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNamespaces()Ljava/util/Set;", cancellable = true)
    private void getNamespaces__249919313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-249919313L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listResources(Ljava/lang/String;Ljava/util/function/Predicate;)Ljava/util/Map;", cancellable = true)
    private void listResources_1209670606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1209670606L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listResourceStacks(Ljava/lang/String;Ljava/util/function/Predicate;)Ljava/util/Map;", cancellable = true)
    private void listResourceStacks_1209670606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1209670606L))
            info.setReturnValue(null);
    }


}
