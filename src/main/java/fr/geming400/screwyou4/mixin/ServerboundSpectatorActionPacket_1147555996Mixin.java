package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundSpectatorActionPacket.class)
public class ServerboundSpectatorActionPacket_1147555996Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__531469093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-531469093L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1761899042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1761899042L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_12096020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(12096020L))
            info.setReturnValue("☹p鰑3sZ%-#pI&욽,AZX'HhEn^:혣&F㪁CokEpn2怺X峛Ew=ut磛/:{B708302x:9䁋=递o_dKUz1[|0U");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1185818737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1185818737L))
            info.setReturnValue(-2047190322);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1825624908(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1825624908L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__721065999(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-721065999L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spectateEntityId()Ljava/util/OptionalInt;", cancellable = true)
    private void spectateEntityId__1023015792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1023015792L))
            info.setReturnValue(null);
    }


}
