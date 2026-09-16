package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundEditBookPacket.class)
public class ServerboundEditBookPacket_2005926120Mixin {
        @Inject(at = @At("HEAD"), method = "slot()I", cancellable = true)
    private void slot__1655014513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1655014513L))
            info.setReturnValue(-298377350);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__2133173587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2133173587L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1097299851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1097299851L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1518617652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1518617652L))
            info.setReturnValue("\u870C]RvehBAw\u8AFCG<):brx|\uCD9D^*yi\u2F82k#TUyMv'n4WRdZ\"?\u87F8M;|\uFE8F\uC93A\u0A0A!wHD4OmE\u6378:3=E9\uAD9F&.QW$\uA7D9`!`/NoNXdxN\u55BC\u0827e\uC107n\u5512k@udN=u#7Wq");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1731689086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1731689086L))
            info.setReturnValue(1033478691);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1651681003(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1651681003L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1710214256(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1710214256L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "title()Ljava/util/Optional;", cancellable = true)
    private void title__342225683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-342225683L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pages()Ljava/util/List;", cancellable = true)
    private void pages__1079618341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1079618341L))
            info.setReturnValue(null);
    }


}
