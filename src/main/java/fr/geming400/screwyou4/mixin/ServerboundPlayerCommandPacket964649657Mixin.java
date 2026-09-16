package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundPlayerCommandPacket.class)
public class ServerboundPlayerCommandPacket964649657Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1120517247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1120517247L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId__693673938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-693673938L))
            info.setReturnValue(-1889815540);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_668937794(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(668937794L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_1602009831(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1602009831L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getData()I", cancellable = true)
    private void getData_538637439(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(538637439L))
            info.setReturnValue(1502763289);
    }

    @Inject(at = @At("HEAD"), method = "getAction()Lnet/minecraft/network/protocol/game/ServerboundPlayerCommandPacket$Action;", cancellable = true)
    private void getAction_225375465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(225375465L))
            info.setReturnValue(net.minecraft.network.protocol.game.ServerboundPlayerCommandPacket.Action.START_RIDING_JUMP);
    }


}
