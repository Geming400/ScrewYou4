package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.CopperGolemStatueBlock.Pose.class)
public class Pose_397715159Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/CopperGolemStatueBlock$Pose;", cancellable = true)
    private static void values__1583899688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1583899688L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/CopperGolemStatueBlock$Pose;", cancellable = true)
    private static void valueOf__641335685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-641335685L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__737745313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-737745313L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNextPose()Lnet/minecraft/world/level/block/CopperGolemStatueBlock$Pose;", cancellable = true)
    private void getNextPose_225975417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(225975417L))
            info.setReturnValue(null);
    }


}
