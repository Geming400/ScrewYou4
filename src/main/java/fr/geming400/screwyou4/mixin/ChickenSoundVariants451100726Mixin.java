package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.chicken.ChickenSoundVariants.class)
public class ChickenSoundVariants451100726Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/data/worldgen/BootstrapContext;)V", cancellable = true)
    private static void bootstrap__103504991(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-103504991L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pickRandomSoundVariant(Lnet/minecraft/core/RegistryAccess;Lnet/minecraft/util/RandomSource;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void pickRandomSoundVariant_458900182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(458900182L))
            info.setReturnValue(null);
    }


}
