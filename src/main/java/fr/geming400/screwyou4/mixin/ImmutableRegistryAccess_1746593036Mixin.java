package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.RegistryAccess.ImmutableRegistryAccess.class)
public class ImmutableRegistryAccess_1746593036Mixin {
        @Inject(at = @At("HEAD"), method = "lookup(Lnet/minecraft/resources/ResourceKey;)Ljava/util/Optional;", cancellable = true)
    private void lookup__573125707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-573125707L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "registries()Ljava/util/stream/Stream;", cancellable = true)
    private void registries_1535886720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1535886720L))
            info.setReturnValue(null);
    }


}
