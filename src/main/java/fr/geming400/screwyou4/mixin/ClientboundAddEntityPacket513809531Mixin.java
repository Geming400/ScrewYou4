package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundAddEntityPacket.class)
public class ClientboundAddEntityPacket513809531Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1165215557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1165215557L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()I", cancellable = true)
    private void getId_552071777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(552071777L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/entity/EntityType;", cancellable = true)
    private void getType__1739246617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1739246617L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_711317065(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(711317065L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1191878444(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1191878444L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getY()D", cancellable = true)
    private void getY_552066972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(552066972L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getData()I", cancellable = true)
    private void getData_552071777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(552071777L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getX()D", cancellable = true)
    private void getX_552066972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(552066972L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getZ()D", cancellable = true)
    private void getZ_552066972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(552066972L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUUID()Ljava/util/UUID;", cancellable = true)
    private void getUUID_924944014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(924944014L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getYRot()F", cancellable = true)
    private void getYRot_552068894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(552068894L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getXRot()F", cancellable = true)
    private void getXRot_552068894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(552068894L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getYHeadRot()F", cancellable = true)
    private void getYHeadRot_552068894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(552068894L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMovement()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getMovement_1611539060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1611539060L))
            info.setReturnValue(null);
    }


}
