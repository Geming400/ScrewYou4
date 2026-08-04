package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundPlayerInfoUpdatePacket.class)
public class ClientboundPlayerInfoUpdatePacket_332572603Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1346452486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1346452486L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__802887869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-802887869L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entries()Ljava/util/List;", cancellable = true)
    private void entries_1958909418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1958909418L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1010641515(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1010641515L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_530080136(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(530080136L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "actions()Ljava/util/EnumSet;", cancellable = true)
    private void actions_1398401213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1398401213L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newEntries()Ljava/util/List;", cancellable = true)
    private void newEntries_1958909418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1958909418L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createPlayerInitializing(Ljava/util/Collection;)Lnet/minecraft/network/protocol/game/ClientboundPlayerInfoUpdatePacket;", cancellable = true)
    private static void createPlayerInitializing_437595887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(437595887L))
            info.setReturnValue(null);
    }


}
