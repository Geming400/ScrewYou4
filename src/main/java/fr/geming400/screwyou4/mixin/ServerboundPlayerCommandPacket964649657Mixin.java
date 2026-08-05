package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundPlayerCommandPacket.class)
public class ServerboundPlayerCommandPacket964649657Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__714375431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-714375431L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId_1002911903(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1002911903L))
            info.setReturnValue(19770611);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1642718570(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1642718570L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__903972337(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-903972337L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getData()I", cancellable = true)
    private void getData_1002911903(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1002911903L))
            info.setReturnValue(19770611);
    }

    @Inject(at = @At("HEAD"), method = "getAction()Lnet/minecraft/network/protocol/game/ServerboundPlayerCommandPacket$Action;", cancellable = true)
    private void getAction_160314261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(160314261L))
            info.setReturnValue(net.minecraft.network.protocol.game.ServerboundPlayerCommandPacket.Action.START_SPRINTING);
    }


}
