package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetHealthPacket.class)
public class ClientboundSetHealthPacket_523513867Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_679381456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(679381456L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__1067963728(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1067963728L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_227802003(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(227802003L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSaturation()F", cancellable = true)
    private void getSaturation__476486683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-476486683L))
            info.setReturnValue(7.61579E7F);
    }

    @Inject(at = @At("HEAD"), method = "getFood()I", cancellable = true)
    private void getFood__649562724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-649562724L))
            info.setReturnValue(1284870645);
    }

    @Inject(at = @At("HEAD"), method = "getHealth()F", cancellable = true)
    private void getHealth__2081662821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2081662821L))
            info.setReturnValue(7.61579E7F);
    }


}
