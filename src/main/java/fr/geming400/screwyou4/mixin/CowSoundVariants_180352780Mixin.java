package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.cow.CowSoundVariants.class)
public class CowSoundVariants_180352780Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/data/worldgen/BootstrapContext;)V", cancellable = true)
    private static void bootstrap__1012165724(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1012165724L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pickRandomSoundVariant(Lnet/minecraft/core/RegistryAccess;Lnet/minecraft/util/RandomSource;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void pickRandomSoundVariant__107623739(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-107623739L))
            info.setReturnValue(null);
    }


}
