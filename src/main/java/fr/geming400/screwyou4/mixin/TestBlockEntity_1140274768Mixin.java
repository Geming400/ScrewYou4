package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.TestBlockEntity.class)
public class TestBlockEntity_1140274768Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset__589162221(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-589162221L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "log()V", cancellable = true)
    private void log__1193999298(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1193999298L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "trigger()V", cancellable = true)
    private void trigger_1463073354(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1463073354L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMessage()Ljava/lang/String;", cancellable = true)
    private void getMessage_500272873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(500272873L))
            info.setReturnValue("yJzYz-6\u094Ez1\u4054$`p_IP\u3921. a&SbcQ'5T49\u2125Cd\uAC0CS^8CCE[Z>:\u62C89e");
    }

    @Inject(at = @At("HEAD"), method = "setMode(Lnet/minecraft/world/level/block/state/properties/TestBlockMode;)V", cancellable = true)
    private void setMode__214754898(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-214754898L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMessage(Ljava/lang/String;)V", cancellable = true)
    private void setMessage_37663271(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(37663271L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMode()Lnet/minecraft/world/level/block/state/properties/TestBlockMode;", cancellable = true)
    private void getMode__980322280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-980322280L))
            info.setReturnValue(net.minecraft.world.level.block.state.properties.TestBlockMode.START);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getUpdatePacket__982499102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-982499102L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdatePacket()Lnet/minecraft/network/protocol/game/ClientboundBlockEntityDataPacket;", cancellable = true)
    private void getUpdatePacket_606880378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(606880378L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUpdateTag(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUpdateTag_562134888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(562134888L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "hasTriggered()Z", cancellable = true)
    private void hasTriggered__664576183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-664576183L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isPowered()Z", cancellable = true)
    private void isPowered__559713172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-559713172L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setPowered(Z)V", cancellable = true)
    private void setPowered__799449810(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-799449810L))
            info.cancel();
    }


}
