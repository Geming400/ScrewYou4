package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundSetCommandMinecartPacket.class)
public class ServerboundSetCommandMinecartPacket_216383535Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_372251124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(372251124L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_853743708(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(853743708L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__79328329(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-79328329L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCommand()Ljava/lang/String;", cancellable = true)
    private void getCommand__391746292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-391746292L))
            info.setReturnValue("3\uD567\u8900BYh|XXM%j U($|u\u98E8h\uD3FF1\uFED02;\uACEBi\u5A6Eu7X\uFB99jzy\uAA30-[Vo*x>8\u70C5cx-p?");
    }

    @Inject(at = @At("HEAD"), method = "getCommandBlock(Lnet/minecraft/world/level/Level;)Lnet/minecraft/world/level/BaseCommandBlock;", cancellable = true)
    private void getCommandBlock_1115892678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1115892678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isTrackOutput()Z", cancellable = true)
    private void isTrackOutput_682523779(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(682523779L))
            info.setReturnValue(false);
    }


}
