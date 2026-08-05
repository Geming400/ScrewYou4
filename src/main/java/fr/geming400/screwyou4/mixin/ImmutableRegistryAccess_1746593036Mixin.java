package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.RegistryAccess.ImmutableRegistryAccess.class)
public class ImmutableRegistryAccess_1746593036Mixin {
        @Inject(at = @At("HEAD"), method = "lookup(Lnet/minecraft/resources/ResourceKey;)Ljava/util/Optional;", cancellable = true)
    private void lookup_1384969339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1384969339L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registries()Ljava/util/stream/Stream;", cancellable = true)
    private void registries_856484293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(856484293L))
            info.setReturnValue(null);
    }


}
