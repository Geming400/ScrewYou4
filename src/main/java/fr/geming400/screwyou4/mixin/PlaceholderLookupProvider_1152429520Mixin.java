package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.PlaceholderLookupProvider.class)
public class PlaceholderLookupProvider_1152429520Mixin {
        @Inject(at = @At("HEAD"), method = "lookup(Lnet/minecraft/resources/ResourceKey;)Ljava/util/Optional;", cancellable = true)
    private void lookup_790805823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(790805823L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createSerializationContext(Lcom/mojang/serialization/DynamicOps;)Lnet/minecraft/resources/RegistryOps;", cancellable = true)
    private void createSerializationContext__238549779(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-238549779L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasRegisteredPlaceholders()Z", cancellable = true)
    private void hasRegisteredPlaceholders_779137226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(779137226L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createSwapper()Lnet/minecraft/util/RegistryContextSwapper;", cancellable = true)
    private void createSwapper__1008390860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1008390860L))
            info.setReturnValue(null);
    }


}
