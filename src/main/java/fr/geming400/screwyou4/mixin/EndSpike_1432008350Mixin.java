package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.EndSpikeFeature.EndSpike.class)
public class EndSpike_1432008350Mixin {
        @Inject(at = @At("HEAD"), method = "getCenterX()I", cancellable = true)
    private void getCenterX__1214575050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1214575050L))
            info.setReturnValue(-269318093);
    }

    @Inject(at = @At("HEAD"), method = "getCenterZ()I", cancellable = true)
    private void getCenterZ__1157316748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1157316748L))
            info.setReturnValue(1507900550);
    }

    @Inject(at = @At("HEAD"), method = "isGuarded()Z", cancellable = true)
    private void isGuarded_50187034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(50187034L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getRadius()I", cancellable = true)
    private void getRadius__2035191301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2035191301L))
            info.setReturnValue(-1234743342);
    }

    @Inject(at = @At("HEAD"), method = "isCenterWithinChunk(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void isCenterWithinChunk_1723052683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1723052683L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getTopBoundingBox()Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void getTopBoundingBox_1441284333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1441284333L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight__293608826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-293608826L))
            info.setReturnValue(1531961128);
    }


}
