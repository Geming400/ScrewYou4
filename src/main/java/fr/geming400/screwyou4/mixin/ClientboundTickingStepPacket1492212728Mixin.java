package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundTickingStepPacket.class)
public class ClientboundTickingStepPacket1492212728Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1648080318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1648080318L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_583586460(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(583586460L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2032331043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2032331043L))
            info.setReturnValue(":eZ\uA3BCiZb#IVsqv\u404CQ]9b6oueR[ay#RZk\uACB0Q$)'G:y41Kc\u880E_mnyuJ@V\u8FA8_\u0641\u8220+|q\u1827`!:kkIlX\u06C85-k Cq4UO-\uCD5Am#inht\uA864$h:GP/l4");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2049564819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2049564819L))
            info.setReturnValue(607558292);
    }

    @Inject(at = @At("HEAD"), method = "from(Lnet/minecraft/world/TickRateManager;)Lnet/minecraft/network/protocol/game/ClientboundTickingStepPacket;", cancellable = true)
    private static void from__1913438981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1913438981L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__99264866(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-99264866L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1196500865(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1196500865L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tickSteps()I", cancellable = true)
    private void tickSteps_73387156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(73387156L))
            info.setReturnValue(1130715825);
    }


}
