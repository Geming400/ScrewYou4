package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundExplodePacket.class)
public class ClientboundExplodePacket_164025912Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1514999177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1514999177L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1549538170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1549538170L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__971434064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-971434064L))
            info.setReturnValue("|'祧x`K䋒䃃/pZQn3Z@j&稺68.fzV!4-hn穐pU(VINnmA4?敾캈;㒁ꂅQo|iϙv4H9B(EᱳL>O|ArhuV6멼#v@3sFoFLo");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_202288653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(202288653L))
            info.setReturnValue(1624859291);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_361533445(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(361533445L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_842094824(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(842094824L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "explosionSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void explosionSound_1712901683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1712901683L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockParticles()Lnet/minecraft/util/random/WeightedList;", cancellable = true)
    private void blockParticles__342457955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-342457955L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerKnockback()Ljava/util/Optional;", cancellable = true)
    private void playerKnockback_409487333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(409487333L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "explosionParticle()Lnet/minecraft/core/particles/ParticleOptions;", cancellable = true)
    private void explosionParticle__1904935157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1904935157L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "radius()F", cancellable = true)
    private void radius_202285274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(202285274L))
            info.setReturnValue(3.634183E8F);
    }

    @Inject(at = @At("HEAD"), method = "center()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void center_1261755440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1261755440L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockCount()I", cancellable = true)
    private void blockCount_202288157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(202288157L))
            info.setReturnValue(1828006710);
    }


}
