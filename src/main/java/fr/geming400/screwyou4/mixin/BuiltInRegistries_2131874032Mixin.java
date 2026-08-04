package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.registries.BuiltInRegistries.class)
public class BuiltInRegistries_2131874032Mixin {
        @Inject(at = @At("HEAD"), method = "bootStrap()V", cancellable = true)
    private static void bootStrap__2124818278(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2124818278L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "acquireBootstrapRegistrationLookup(Lnet/minecraft/core/Registry;)Lnet/minecraft/core/HolderGetter;", cancellable = true)
    private static void acquireBootstrapRegistrationLookup_1477001334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1477001334L))
            info.setReturnValue(null);
    }


}
