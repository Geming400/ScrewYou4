package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.pig.PigSoundVariants.class)
public class PigSoundVariants44865035Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/data/worldgen/BootstrapContext;)V", cancellable = true)
    private static void bootstrap__1147653468(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1147653468L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pickRandomSoundVariant(Lnet/minecraft/core/RegistryAccess;Lnet/minecraft/util/RandomSource;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void pickRandomSoundVariant__243111483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-243111483L))
            info.setReturnValue(null);
    }


}
