package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundUpdateAdvancementsPacket.class)
public class ClientboundUpdateAdvancementsPacket_790057047Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_945924636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(945924636L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_494345183(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(494345183L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__801420548(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-801420548L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldReset()Z", cancellable = true)
    private void shouldReset_1842475057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1842475057L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "shouldShowAdvancements()Z", cancellable = true)
    private void shouldShowAdvancements_1912942826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1912942826L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getProgress()Ljava/util/Map;", cancellable = true)
    private void getProgress__1388228933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1388228933L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAdded()Ljava/util/List;", cancellable = true)
    private void getAdded__497533744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-497533744L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRemoved()Ljava/util/Set;", cancellable = true)
    private void getRemoved_141937166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(141937166L))
            info.setReturnValue(null);
    }


}
