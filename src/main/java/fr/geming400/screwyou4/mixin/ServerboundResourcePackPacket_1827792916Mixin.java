package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.common.ServerboundResourcePackPacket.class)
public class ServerboundResourcePackPacket_1827792916Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_148767827(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(148767827L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1081662122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1081662122L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_692332940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(692332940L))
            info.setReturnValue("Y2BC");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1866055657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1866055657L))
            info.setReturnValue(-550170961);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/util/UUID;", cancellable = true)
    private void id__2056039898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2056039898L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "action()Lnet/minecraft/network/protocol/common/ServerboundResourcePackPacket$Action;", cancellable = true)
    private void action_713577807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(713577807L))
            info.setReturnValue(net.minecraft.network.protocol.common.ServerboundResourcePackPacket.Action.ACCEPTED);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1789105468(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1789105468L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/common/ServerCommonPacketListener;)V", cancellable = true)
    private void handle__908042295(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-908042295L))
            info.cancel();
    }


}
