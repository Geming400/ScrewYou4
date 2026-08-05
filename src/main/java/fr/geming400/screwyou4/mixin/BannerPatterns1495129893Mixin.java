package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.BannerPatterns.class)
public class BannerPatterns1495129893Mixin {
        @Inject(at = @At("HEAD"), method = "register(Lnet/minecraft/data/worldgen/BootstrapContext;Lnet/minecraft/resources/ResourceKey;)V", cancellable = true)
    private static void register_1293459657(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1293459657L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/data/worldgen/BootstrapContext;)V", cancellable = true)
    private static void bootstrap_940524176(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(940524176L))
            info.cancel();
    }


}
