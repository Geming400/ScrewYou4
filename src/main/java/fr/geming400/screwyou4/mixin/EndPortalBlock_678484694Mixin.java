package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.EndPortalBlock.class)
public class EndPortalBlock_678484694Mixin {
        @Inject(at = @At("HEAD"), method = "getPortalDestination(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/portal/TeleportTransition;", cancellable = true)
    private void getPortalDestination__1137553838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1137553838L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1744929947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1744929947L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick_1083166226(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1083166226L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity_820060078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(820060078L))
            info.setReturnValue(null);
    }


}
