package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.presets.WorldPresets.class)
public class WorldPresets_2124988068Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/data/worldgen/BootstrapContext;)V", cancellable = true)
    private static void bootstrap_932469564(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(932469564L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fromSettings(Lnet/minecraft/world/level/levelgen/WorldDimensions;)Ljava/util/Optional;", cancellable = true)
    private static void fromSettings_144938546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(144938546L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createTestWorldDimensions(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/world/level/levelgen/WorldDimensions;", cancellable = true)
    private static void createTestWorldDimensions__1769171083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1769171083L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createNormalWorldDimensions(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/world/level/levelgen/WorldDimensions;", cancellable = true)
    private static void createNormalWorldDimensions__1769171083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1769171083L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNormalOverworld(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/world/level/dimension/LevelStem;", cancellable = true)
    private static void getNormalOverworld__1170286445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1170286445L))
            info.setReturnValue(null);
    }


}
