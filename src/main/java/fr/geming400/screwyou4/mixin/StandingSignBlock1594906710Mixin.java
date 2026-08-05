package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.StandingSignBlock.class)
public class StandingSignBlock1594906710Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1633615332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1633615332L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__874281770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-874281770L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attachmentPoint(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/PlainSignBlock$Attachment;", cancellable = true)
    private void attachmentPoint__1511959431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1511959431L))
            info.setReturnValue(net.minecraft.world.level.block.PlainSignBlock.Attachment.GROUND);
    }

    @Inject(at = @At("HEAD"), method = "getYRotationDegrees(Lnet/minecraft/world/level/block/state/BlockState;)F", cancellable = true)
    private void getYRotationDegrees__1063553054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1063553054L))
            info.setReturnValue(1.314247E8F);
    }


}
