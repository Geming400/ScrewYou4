package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundSetCommandMinecartPacket.class)
public class ServerboundSetCommandMinecartPacket_216383535Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1462641554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1462641554L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1652238460(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1652238460L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_894452447(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(894452447L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCommandBlock(Lnet/minecraft/world/level/Level;)Lnet/minecraft/world/level/BaseCommandBlock;", cancellable = true)
    private void getCommandBlock_810683198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(810683198L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isTrackOutput()Z", cancellable = true)
    private void isTrackOutput_254662117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(254662117L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getCommand()Ljava/lang/String;", cancellable = true)
    private void getCommand__919076937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-919076937L))
            info.setReturnValue("k_3Y sV&qU.1/ e'\uC236?iF)GGE3`E\uF9CA=(rAgp+X l\u1F7CwP\u5B93+\uFD84^_b");
    }


}
