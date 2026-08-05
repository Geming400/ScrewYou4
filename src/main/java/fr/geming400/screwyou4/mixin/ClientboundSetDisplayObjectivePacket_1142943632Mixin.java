package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetDisplayObjectivePacket.class)
public class ClientboundSetDisplayObjectivePacket_1142943632Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__536081457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-536081457L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSlot()Lnet/minecraft/world/scores/DisplaySlot;", cancellable = true)
    private void getSlot__1183412902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1183412902L))
            info.setReturnValue(net.minecraft.world.scores.DisplaySlot.TEAM_DARK_GRAY);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1821012544(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1821012544L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1340451165(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1340451165L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getObjectiveName()Ljava/lang/String;", cancellable = true)
    private void getObjectiveName_7483160(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(7483160L))
            info.setReturnValue("mehsC'Gav錋Fаꬳᔇ?WK<o㷍,⋣pA17Akv퀏d78>|a-r(_a%霕=S}DWzl.3}2^81i");
    }


}
