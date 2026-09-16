package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.Structure.StructureSettings.Builder.class)
public class Builder1690034102Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/level/levelgen/structure/Structure$StructureSettings;", cancellable = true)
    private void build__270454640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-270454640L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "terrainAdapation(Lnet/minecraft/world/level/levelgen/structure/TerrainAdjustment;)Lnet/minecraft/world/level/levelgen/structure/Structure$StructureSettings$Builder;", cancellable = true)
    private void terrainAdapation__357029335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-357029335L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generationStep(Lnet/minecraft/world/level/levelgen/GenerationStep$Decoration;)Lnet/minecraft/world/level/levelgen/structure/Structure$StructureSettings$Builder;", cancellable = true)
    private void generationStep_66809865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(66809865L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnOverrides(Ljava/util/Map;)Lnet/minecraft/world/level/levelgen/structure/Structure$StructureSettings$Builder;", cancellable = true)
    private void spawnOverrides__1983041500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1983041500L))
            info.setReturnValue(null);
    }


}
