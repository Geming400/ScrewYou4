package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundExplodePacket.class)
public class ClientboundExplodePacket_164025912Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_319893501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(319893501L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__744600357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-744600357L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_934449436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(934449436L))
            info.setReturnValue("^NyEXL");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_721378002(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(721378002L))
            info.setReturnValue(839608370);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__131685952(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-131685952L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__1427451683(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1427451683L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "center()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void center_153896891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(153896891L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockCount()I", cancellable = true)
    private void blockCount__1889156901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1889156901L))
            info.setReturnValue(-989621736);
    }

    @Inject(at = @At("HEAD"), method = "radius()F", cancellable = true)
    private void radius_1632059272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1632059272L))
            info.setReturnValue(1.110257E8F);
    }

    @Inject(at = @At("HEAD"), method = "playerKnockback()Ljava/util/Optional;", cancellable = true)
    private void playerKnockback_567347135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(567347135L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "explosionParticle()Lnet/minecraft/core/particles/ParticleOptions;", cancellable = true)
    private void explosionParticle__1344218362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1344218362L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockParticles()Lnet/minecraft/util/random/WeightedList;", cancellable = true)
    private void blockParticles__1788240323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1788240323L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "explosionSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void explosionSound__512842759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-512842759L))
            info.setReturnValue(null);
    }


}
