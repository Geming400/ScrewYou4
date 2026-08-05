package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundRemoveMobEffectPacket.class)
public class ClientboundRemoveMobEffectPacket341801076Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1337224012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1337224012L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1727313335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1727313335L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__793658899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-793658899L))
            info.setReturnValue("VV/O\uBA23_\u8267(5\uBEBE`!8sNY\uC531=}s[Ux7}jUM=l70\"\uA097@,$e\u0234J{2:\u14D08Q\uC29EL5W]kq\u970B\u59E1}.A9");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_380063818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(380063818L))
            info.setReturnValue(312725391);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_539308610(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(539308610L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1019869989(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1019869989L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEntity(Lnet/minecraft/world/level/Level;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getEntity__16965079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-16965079L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityId()I", cancellable = true)
    private void entityId_380063322(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(380063322L))
            info.setReturnValue(-1060058684);
    }

    @Inject(at = @At("HEAD"), method = "effect()Lnet/minecraft/core/Holder;", cancellable = true)
    private void effect_1890676848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1890676848L))
            info.setReturnValue(null);
    }


}
