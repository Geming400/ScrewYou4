package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetObjectivePacket.class)
public class ClientboundSetObjectivePacket_1513432860Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1669300449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1669300449L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMethod()I", cancellable = true)
    private void getMethod__106834038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-106834038L))
            info.setReturnValue(476557759);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__78044735(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-78044735L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1217720996(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1217720996L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDisplayName__1601122267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1601122267L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNumberFormat()Ljava/util/Optional;", cancellable = true)
    private void getNumberFormat__1766904353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1766904353L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRenderType()Lnet/minecraft/world/scores/criteria/ObjectiveCriteria$RenderType;", cancellable = true)
    private void getRenderType__216004928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-216004928L))
            info.setReturnValue(net.minecraft.world.scores.criteria.ObjectiveCriteria.RenderType.INTEGER);
    }

    @Inject(at = @At("HEAD"), method = "getObjectiveName()Ljava/lang/String;", cancellable = true)
    private void getObjectiveName__769232942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-769232942L))
            info.setReturnValue("(@F`#`1H,GS4/+IL4l9%rl66YL\"r/@1`P-3]{B@'P0,B6*AK0;a>\uAC935quG[0Q\uC512P \u6AF0[\"`\uFD52Qp\uC7FEY\uC258y&O>m\uB1DAuu\u7702_Ec");
    }


}
