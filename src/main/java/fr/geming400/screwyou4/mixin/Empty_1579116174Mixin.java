package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.resources.ResourceManager.Empty.class)
public class Empty_1579116174Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/server/packs/resources/ResourceManager$Empty;", cancellable = true)
    private static void values_2038266169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2038266169L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/server/packs/resources/ResourceManager$Empty;", cancellable = true)
    private static void valueOf__819599296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-819599296L))
            info.setReturnValue(net.minecraft.server.packs.resources.ResourceManager.Empty.INSTANCE);
    }

    @Inject(at = @At("HEAD"), method = "getResource(Lnet/minecraft/resources/Identifier;)Ljava/util/Optional;", cancellable = true)
    private void getResource__821697993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-821697993L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listPacks()Ljava/util/stream/Stream;", cancellable = true)
    private void listPacks__1056025338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1056025338L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getResourceStack(Lnet/minecraft/resources/Identifier;)Ljava/util/List;", cancellable = true)
    private void getResourceStack_1120255641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1120255641L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNamespaces()Ljava/util/Set;", cancellable = true)
    private void getNamespaces_223729537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(223729537L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listResourceStacks(Ljava/lang/String;Ljava/util/function/Predicate;)Ljava/util/Map;", cancellable = true)
    private void listResourceStacks_1385825175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1385825175L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listResources(Ljava/lang/String;Ljava/util/function/Predicate;)Ljava/util/Map;", cancellable = true)
    private void listResources_1622748999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1622748999L))
            info.setReturnValue(null);
    }


}
