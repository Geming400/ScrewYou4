package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetEntityDataPacket.class)
public class ClientboundSetEntityDataPacket_579547306Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_735414895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(735414895L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__329078963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-329078963L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1349970830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1349970830L))
            info.setReturnValue(",5D\u0636I\u52F0\u25C3|3.\u4475\uB55D\u89AAl96\uC9D2,;0\u8820V\uA72C6=]'jn\u975E{q^(ZoGWvc\u056F\u1BE11WxCCl+'oD]uHU)\u7E59/D*V-V\u9031\u16AEl/VC\u9461\u1C28@");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1136899396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1136899396L))
            info.setReturnValue(-1282479015);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id__2115636652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2115636652L))
            info.setReturnValue(-462883772);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__1011930289(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1011930289L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_283835442(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(283835442L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "packedItems()Ljava/util/List;", cancellable = true)
    private void packedItems__107597567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-107597567L))
            info.setReturnValue(null);
    }


}
