package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.Structure.StructureSettings.class)
public class StructureSettings_756882769Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2142395027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2142395027L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__378577207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-378577207L))
            info.setReturnValue(":MA;RK=u㱱^pL흆M)羻}4P<wnA# j㵽K<<JWH0l@ヱO@y%Wh@yTfyu_`+b䖋b;||Sw`0﹖d\"\"t9&v^C衏47豘*S&dy뻺JWQ3a[歅MD");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_795145510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(795145510L))
            info.setReturnValue(-2124961583);
    }

    @Inject(at = @At("HEAD"), method = "step()Lnet/minecraft/world/level/levelgen/GenerationStep$Decoration;", cancellable = true)
    private void step_333392501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(333392501L))
            info.setReturnValue(net.minecraft.world.level.levelgen.GenerationStep.Decoration.RAW_GENERATION);
    }

    @Inject(at = @At("HEAD"), method = "biomes()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void biomes__1918131484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1918131484L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "terrainAdaptation()Lnet/minecraft/world/level/levelgen/structure/TerrainAdjustment;", cancellable = true)
    private void terrainAdaptation_969038911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(969038911L))
            info.setReturnValue(net.minecraft.world.level.levelgen.structure.TerrainAdjustment.BEARD_BOX);
    }

    @Inject(at = @At("HEAD"), method = "spawnOverrides()Ljava/util/Map;", cancellable = true)
    private void spawnOverrides__1247740872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1247740872L))
            info.setReturnValue(null);
    }


}
