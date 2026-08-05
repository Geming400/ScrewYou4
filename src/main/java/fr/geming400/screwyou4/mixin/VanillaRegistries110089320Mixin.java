package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.registries.VanillaRegistries.class)
public class VanillaRegistries110089320Mixin {
        @Inject(at = @At("HEAD"), method = "validateThatAllBiomeFeaturesHaveBiomeFilter(Lnet/minecraft/core/HolderGetter;Lnet/minecraft/core/HolderLookup;)V", cancellable = true)
    private static void validateThatAllBiomeFeaturesHaveBiomeFilter_1188728845(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1188728845L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createLookup()Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private static void createLookup_725605969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(725605969L))
            info.setReturnValue(null);
    }


}
