package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.Structure.StructureSettings.Builder.class)
public class Builder1690034102Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/levelgen/structure/Structure$StructureSettings;", cancellable = true)
    private void build__84495710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-84495710L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnOverrides(Ljava/util/Map;)Lnet/minecraft/world/level/levelgen/structure/Structure$StructureSettings$Builder;", cancellable = true)
    private void spawnOverrides__1205259888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1205259888L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "terrainAdapation(Lnet/minecraft/world/level/levelgen/structure/TerrainAdjustment;)Lnet/minecraft/world/level/levelgen/structure/Structure$StructureSettings$Builder;", cancellable = true)
    private void terrainAdapation_546713019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(546713019L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generationStep(Lnet/minecraft/world/level/levelgen/GenerationStep$Decoration;)Lnet/minecraft/world/level/levelgen/structure/Structure$StructureSettings$Builder;", cancellable = true)
    private void generationStep_1671561733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1671561733L))
            info.setReturnValue(null);
    }


}
