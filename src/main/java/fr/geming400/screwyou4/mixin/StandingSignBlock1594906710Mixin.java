package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.StandingSignBlock.class)
public class StandingSignBlock1594906710Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__964206862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-964206862L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_336306943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(336306943L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attachmentPoint(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/PlainSignBlock$Attachment;", cancellable = true)
    private void attachmentPoint_1631339270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1631339270L))
            info.setReturnValue(net.minecraft.world.level.block.PlainSignBlock.Attachment.WALL);
    }

    @Inject(at = @At("HEAD"), method = "getYRotationDegrees(Lnet/minecraft/world/level/block/state/BlockState;)F", cancellable = true)
    private void getYRotationDegrees_1449598504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1449598504L))
            info.setReturnValue(8.3807E8F);
    }


}
