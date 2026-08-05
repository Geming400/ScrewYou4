package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundDebugEntityValuePacket.class)
public class ClientboundDebugEntityValuePacket_1859434632Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_180409543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(180409543L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1050020406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1050020406L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_723974656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(723974656L))
            info.setReturnValue("P.vCC+ D\",/!Q_;6XwpYqE\uA0C7YLS\"VxCzz");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1897697373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1897697373L))
            info.setReturnValue(1481135533);
    }

    @Inject(at = @At("HEAD"), method = "update()Lnet/minecraft/util/debug/DebugSubscription$Update;", cancellable = true)
    private void update_1218535545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1218535545L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1757463752(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1757463752L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_2056942165(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2056942165L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "entityId()I", cancellable = true)
    private void entityId_1897696877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1897696877L))
            info.setReturnValue(83727528);
    }


}
