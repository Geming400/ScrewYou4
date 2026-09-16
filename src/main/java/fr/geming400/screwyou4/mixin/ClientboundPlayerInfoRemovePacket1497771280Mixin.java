package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundPlayerInfoRemovePacket.class)
public class ClientboundPlayerInfoRemovePacket1497771280Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1653638870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1653638870L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_589145012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(589145012L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2026772491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2026772491L))
            info.setReturnValue("t4d^Q<G\"u?f*4#a\uB5A30\u633BggA,va-es\u7E3EuY\u860F_/k\u9797.k3gFa\uFD4B<QmYYE!w/Yn\u6987N|dEZ7");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2055123371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2055123371L))
            info.setReturnValue(1950953987);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__93706314(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-93706314L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1202059417(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1202059417L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "profileIds()Ljava/util/List;", cancellable = true)
    private void profileIds__58939889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-58939889L))
            info.setReturnValue(null);
    }


}
