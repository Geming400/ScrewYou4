package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundSetCommandBlockPacket.class)
public class ServerboundSetCommandBlockPacket789264851Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__889760237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-889760237L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAutomatic()Z", cancellable = true)
    private void isAutomatic_827543434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(827543434L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1079357143(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1079357143L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1467333764(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1467333764L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMode()Lnet/minecraft/world/level/block/entity/CommandBlockEntity$Mode;", cancellable = true)
    private void getMode__1549408467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1549408467L))
            info.setReturnValue(net.minecraft.world.level.block.entity.CommandBlockEntity.Mode.AUTO);
    }

    @Inject(at = @At("HEAD"), method = "isTrackOutput()Z", cancellable = true)
    private void isTrackOutput_827543434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(827543434L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getPos__1104122028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1104122028L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isConditional()Z", cancellable = true)
    private void isConditional_827543434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(827543434L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getCommand()Ljava/lang/String;", cancellable = true)
    private void getCommand__346195620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-346195620L))
            info.setReturnValue("/8Nu(XTKx\u5AC1't3\u8571]Bx");
    }


}
