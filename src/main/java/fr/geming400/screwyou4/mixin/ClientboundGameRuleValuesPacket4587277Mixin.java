package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundGameRuleValuesPacket.class)
public class ClientboundGameRuleValuesPacket4587277Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1674437811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1674437811L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1390099536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1390099536L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1130872698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1130872698L))
            info.setReturnValue("5)-0u,ાzdP1Ṗ톭H@_cEfk(鲑r(;%'Kgl:CRuX0 GnC5\"FnOT劚湸Aa2{K/虹R컒Cy|f}yae[>XUSסo9O!斍㥀");
    }

    @Inject(at = @At("HEAD"), method = "values()Ljava/util/Map;", cancellable = true)
    private void values__2000036363(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2000036363L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_42850019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(42850019L))
            info.setReturnValue(-431928387);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_682656190(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(682656190L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_202094811(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(202094811L))
            info.cancel();
    }


}
