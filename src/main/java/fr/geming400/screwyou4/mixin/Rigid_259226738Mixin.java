package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.Beardifier.Rigid.class)
public class Rigid_259226738Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1644738996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1644738996L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__876233238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-876233238L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_297489479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(297489479L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "box()Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private void box_429374523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(429374523L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "groundLevelDelta()I", cancellable = true)
    private void groundLevelDelta_297488983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(297488983L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "terrainAdjustment()Lnet/minecraft/world/level/levelgen/structure/TerrainAdjustment;", cancellable = true)
    private void terrainAdjustment_471382880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(471382880L))
            info.setReturnValue(null);
    }


}
