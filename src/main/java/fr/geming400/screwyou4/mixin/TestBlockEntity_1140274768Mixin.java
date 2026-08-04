package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.TestBlockEntity.class)
public class TestBlockEntity_1140274768Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset_1178549506(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1178549506L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "log()V", cancellable = true)
    private void log_1178549506(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1178549506L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "trigger()V", cancellable = true)
    private void trigger_1178549506(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1178549506L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMessage()Ljava/lang/String;", cancellable = true)
    private void getMessage_4814296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(4814296L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setMode(Lnet/minecraft/world/level/block/state/properties/TestBlockMode;)V", cancellable = true)
    private void setMode_1498475443(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1498475443L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMessage(Ljava/lang/String;)V", cancellable = true)
    private void setMessage__2002331380(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2002331380L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMode()Lnet/minecraft/world/level/block/state/properties/TestBlockMode;", cancellable = true)
    private void getMode_1028182655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1028182655L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdateTag(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUpdateTag__26346781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-26346781L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isPowered()Z", cancellable = true)
    private void isPowered_1178553350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1178553350L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getUpdatePacket_125721705(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(125721705L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;", cancellable = true)
    private void getUpdatePacket_143422995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(143422995L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPowered(Z)V", cancellable = true)
    private void setPowered__1925075700(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1925075700L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasTriggered()Z", cancellable = true)
    private void hasTriggered_1178553350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1178553350L))
            info.setReturnValue(null);
    }


}
