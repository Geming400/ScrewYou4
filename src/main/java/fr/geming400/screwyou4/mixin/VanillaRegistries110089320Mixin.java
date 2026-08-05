package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.registries.VanillaRegistries.class)
public class VanillaRegistries110089320Mixin {
        @Inject(at = @At("HEAD"), method = "validateThatAllBiomeFeaturesHaveBiomeFilter(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderLookup;)V", cancellable = true)
    private static void validateThatAllBiomeFeaturesHaveBiomeFilter_252455300(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(252455300L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createLookup()Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private static void createLookup__203117765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-203117765L))
            info.setReturnValue(null);
    }


}
