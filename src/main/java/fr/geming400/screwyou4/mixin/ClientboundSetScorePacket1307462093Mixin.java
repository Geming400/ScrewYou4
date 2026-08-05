package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetScorePacket.class)
public class ClientboundSetScorePacket1307462093Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__371562995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-371562995L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1601992944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1601992944L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_172002118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(172002118L))
            info.setReturnValue("3Qԓm:J^+m꜡)y:(v뜇o^W@*[!<@6H\"e1⒀\"w=,㢩n-I]doZK=ሌ}hＫfcK鞆go:㻋kp");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1345724835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1345724835L))
            info.setReturnValue(-2141193230);
    }

    @Inject(at = @At("HEAD"), method = "owner()Ljava/lang/String;", cancellable = true)
    private void owner_172001622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(172001622L))
            info.setReturnValue("f7ᒂ7C00A櫟RS䴨&3yJY5煢$㛥%");
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1985531006(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1985531006L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1504969627(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1504969627L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "display()Ljava/util/Optional;", cancellable = true)
    private void display_1552923515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1552923515L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "numberFormat()Ljava/util/Optional;", cancellable = true)
    private void numberFormat_1552923515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1552923515L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "objectiveName()Ljava/lang/String;", cancellable = true)
    private void objectiveName_172001622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(172001622L))
            info.setReturnValue("f7ᒂ7C00A櫟RS䴨&3yJY5煢$㛥%");
    }

    @Inject(at = @At("HEAD"), method = "score()I", cancellable = true)
    private void score_1345724339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1345724339L))
            info.setReturnValue(-1505218623);
    }


}
