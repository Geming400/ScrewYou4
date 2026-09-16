package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.presets.WorldPresets.class)
public class WorldPresets_2124988068Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/data/worldgen/BootstrapContext;)V", cancellable = true)
    private static void bootstrap_1570382350(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1570382350L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNormalOverworld(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/world/level/dimension/LevelStem;", cancellable = true)
    private static void getNormalOverworld_1788382290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1788382290L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createNormalWorldDimensions(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/world/level/levelgen/WorldDimensions;", cancellable = true)
    private static void createNormalWorldDimensions_595908081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(595908081L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromSettings(Lnet/minecraft/world/level/levelgen/WorldDimensions;)Ljava/util/Optional;", cancellable = true)
    private static void fromSettings__983359329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-983359329L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createTestWorldDimensions(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/world/level/levelgen/WorldDimensions;", cancellable = true)
    private static void createTestWorldDimensions_1353025190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1353025190L))
            info.setReturnValue(null);
    }


}
