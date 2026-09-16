package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundCommandSuggestionPacket.class)
public class ServerboundCommandSuggestionPacket2143288766Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1995810940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1995810940L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId_484965171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(484965171L))
            info.setReturnValue(1312507873);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1847576903(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1847576903L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1514318356(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1514318356L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCommand()Ljava/lang/String;", cancellable = true)
    private void getCommand_1535158940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1535158940L))
            info.setReturnValue("_`N i7Sy0X\u8F5C8}fooPt@\uCD4D_U?Q FPQaK?#BcO\u9CA8");
    }


}
