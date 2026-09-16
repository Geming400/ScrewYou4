package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundRemoveMobEffectPacket.class)
public class ClientboundRemoveMobEffectPacket341801076Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_497668666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(497668666L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__566825192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-566825192L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1112224601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1112224601L))
            info.setReturnValue("C&byO#I*|\u92B1(q7K\uA0E7J.:>#G+TC\u5B90\u11AB$}\u4565\uCEFEv-Mx5=C?MN+)%^EMYCc*Z8E\u5B5A\uC38Bz\u4E07]r");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_899153167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(899153167L))
            info.setReturnValue(-520627620);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__1249676518(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1249676518L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_46089213(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(46089213L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEntity(Lnet/minecraft/world/level/Level;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getEntity_1781725186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1781725186L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "effect()Lnet/minecraft/core/Holder;", cancellable = true)
    private void effect__79182657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-79182657L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityId()I", cancellable = true)
    private void entityId_824858812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(824858812L))
            info.setReturnValue(-1552576581);
    }


}
