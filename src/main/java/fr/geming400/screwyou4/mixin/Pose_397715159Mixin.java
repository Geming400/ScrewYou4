package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.CopperGolemStatueBlock.Pose.class)
public class Pose_397715159Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/block/CopperGolemStatueBlock$Pose;", cancellable = true)
    private static void values_2077517946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2077517946L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/block/CopperGolemStatueBlock$Pose;", cancellable = true)
    private static void valueOf__616965549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-616965549L))
            info.setReturnValue(net.minecraft.world.level.block.CopperGolemStatueBlock.Pose.STANDING);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_485923780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(485923780L))
            info.setReturnValue("$P\u8330tE?aOv/");
    }

    @Inject(at = @At("HEAD"), method = "getNextPose()Lnet/minecraft/world/level/block/CopperGolemStatueBlock$Pose;", cancellable = true)
    private void getNextPose_751647775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(751647775L))
            info.setReturnValue(net.minecraft.world.level.block.CopperGolemStatueBlock.Pose.STANDING);
    }


}
