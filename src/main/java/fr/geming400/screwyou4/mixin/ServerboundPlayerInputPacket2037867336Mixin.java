package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundPlayerInputPacket.class)
public class ServerboundPlayerInputPacket2037867336Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__2101232370(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2101232370L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1129241068(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1129241068L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1486676435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1486676435L))
            info.setReturnValue("nC4gN\u48B8UoaaX:Q{Y|\u3DC6NR2YaYSwQ\u49FFa\"&\u26D4-0\u5342E");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1699747869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1699747869L))
            info.setReturnValue(-137607639);
    }

    @Inject(at = @At("HEAD"), method = "input()Lnet/minecraft/world/entity/player/Input;", cancellable = true)
    private void input__1069146709(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1069146709L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1742155473(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1742155473L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1619739786(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1619739786L))
            info.cancel();
    }


}
