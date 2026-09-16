package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.Structure.StructureSettings.class)
public class StructureSettings_756882769Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__151743500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-151743500L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1527306293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1527306293L))
            info.setReturnValue("\u2E5DBr,kzcz/\u9E33\uA2B2S10\u2B5C\uBEED9`U'6p\uB3703^ -`V,\uAB62 ;XpTgpHQe)");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1314234859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1314234859L))
            info.setReturnValue(-1630673131);
    }

    @Inject(at = @At("HEAD"), method = "step()Lnet/minecraft/world/level/levelgen/GenerationStep$Decoration;", cancellable = true)
    private void step__710259135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-710259135L))
            info.setReturnValue(net.minecraft.world.level.levelgen.GenerationStep.Decoration.VEGETAL_DECORATION);
    }

    @Inject(at = @At("HEAD"), method = "biomes()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void biomes__98723337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-98723337L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnOverrides()Ljava/util/Map;", cancellable = true)
    private void spawnOverrides_1558435788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1558435788L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "terrainAdaptation()Lnet/minecraft/world/level/levelgen/structure/TerrainAdjustment;", cancellable = true)
    private void terrainAdaptation__873102745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-873102745L))
            info.setReturnValue(net.minecraft.world.level.levelgen.structure.TerrainAdjustment.BEARD_THIN);
    }


}
