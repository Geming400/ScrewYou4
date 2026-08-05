package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundAttackPacket.class)
public class ServerboundAttackPacket_631403251Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_787270840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(787270840L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__277223018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-277223018L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1401826775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1401826775L))
            info.setReturnValue("90p]?7{0kk)P+ 'qP\u5697t&T G'fe$\uADC4|Euf .>\uCF58P7h\"\u337B\uCFE7hvrL7%9sJ=m\u61759\u1898\uAD6A'@y*0\uFE7A\u40B4'");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1188755341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1188755341L))
            info.setReturnValue(-781214924);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_335691387(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(335691387L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_1268763424(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1268763424L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "entityId()I", cancellable = true)
    private void entityId_1114460986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1114460986L))
            info.setReturnValue(-1810085894);
    }


}
