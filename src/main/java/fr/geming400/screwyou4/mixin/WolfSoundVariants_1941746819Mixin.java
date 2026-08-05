package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.wolf.WolfSoundVariants.class)
public class WolfSoundVariants_1941746819Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/data/worldgen/BootstrapContext;)V", cancellable = true)
    private static void bootstrap_1387141101(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1387141101L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pickRandomSoundVariant(Lnet/minecraft/core/RegistryAccess;Lnet/minecraft/util/RandomSource;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void pickRandomSoundVariant_1949546274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1949546274L))
            info.setReturnValue(null);
    }


}
