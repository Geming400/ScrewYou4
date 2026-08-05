package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.feline.CatSoundVariants.class)
public class CatSoundVariants933479909Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/data/worldgen/BootstrapContext;)V", cancellable = true)
    private static void bootstrap_378874192(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(378874192L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pickRandomSoundVariant(Lnet/minecraft/core/RegistryAccess;Lnet/minecraft/util/RandomSource;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void pickRandomSoundVariant_941279365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(941279365L))
            info.setReturnValue(null);
    }


}
