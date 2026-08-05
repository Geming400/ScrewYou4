package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.PlaceholderLookupProvider.class)
public class PlaceholderLookupProvider_1152429520Mixin {
        @Inject(at = @At("HEAD"), method = "lookup(Lnet/minecraft/resources/ResourceKey;)Ljava/util/Optional;", cancellable = true)
    private void lookup__1167289223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1167289223L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createSwapper()Lnet/minecraft/util/RegistryContextSwapper;", cancellable = true)
    private void createSwapper__49084158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-49084158L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasRegisteredPlaceholders()Z", cancellable = true)
    private void hasRegisteredPlaceholders_1190708102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1190708102L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createSerializationContext(Lcom/mojang/serialization/DynamicOps;)Lnet/minecraft/resources/RegistryOps;", cancellable = true)
    private void createSerializationContext_2086350194(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2086350194L))
            info.setReturnValue(null);
    }


}
