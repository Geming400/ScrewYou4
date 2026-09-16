package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WallSignBlock.class)
public class WallSignBlock_942812264Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2009257517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2009257517L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSignHitboxCenterPosition(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getSignHitboxCenterPosition__1580556794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1580556794L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attachmentPoint(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/PlainSignBlock$Attachment;", cancellable = true)
    private void attachmentPoint_2130913418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2130913418L))
            info.setReturnValue(net.minecraft.world.level.block.PlainSignBlock.Attachment.WALL);
    }

    @Inject(at = @At("HEAD"), method = "getYRotationDegrees(Lnet/minecraft/world/level/block/state/BlockState;)F", cancellable = true)
    private void getYRotationDegrees__1715647501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1715647501L))
            info.setReturnValue(1.279429E8F);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__1526376217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1526376217L))
            info.setReturnValue(null);
    }


}
