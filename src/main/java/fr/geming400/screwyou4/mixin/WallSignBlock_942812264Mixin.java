package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WallSignBlock.class)
public class WallSignBlock_942812264Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1616301309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1616301309L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__315787504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-315787504L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attachmentPoint(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/PlainSignBlock$Attachment;", cancellable = true)
    private void attachmentPoint_979244823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(979244823L))
            info.setReturnValue(net.minecraft.world.level.block.PlainSignBlock.Attachment.WALL);
    }

    @Inject(at = @At("HEAD"), method = "getYRotationDegrees(Lnet/minecraft/world/level/block/state/BlockState;)F", cancellable = true)
    private void getYRotationDegrees_797504057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(797504057L))
            info.setReturnValue(4.387707E8F);
    }

    @Inject(at = @At("HEAD"), method = "getSignHitboxCenterPosition(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getSignHitboxCenterPosition__1253920433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1253920433L))
            info.setReturnValue(null);
    }


}
