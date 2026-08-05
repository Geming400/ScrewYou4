package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ServerEntity.class)
public class ServerEntity314368862Mixin {
        @Inject(at = @At("HEAD"), method = "getPositionBase()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getPositionBase_1412098391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1412098391L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLastSentYRot()F", cancellable = true)
    private void getLastSentYRot_352628225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(352628225L))
            info.setReturnValue(2.774109E8F);
    }

    @Inject(at = @At("HEAD"), method = "getLastSentXRot()F", cancellable = true)
    private void getLastSentXRot_352628225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(352628225L))
            info.setReturnValue(2.774109E8F);
    }

    @Inject(at = @At("HEAD"), method = "getLastSentMovement()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getLastSentMovement_1412098391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1412098391L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLastSentYHeadRot()F", cancellable = true)
    private void getLastSentYHeadRot_352628225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(352628225L))
            info.setReturnValue(2.778898E8F);
    }

    @Inject(at = @At("HEAD"), method = "sendChanges()V", cancellable = true)
    private void sendChanges_352643601(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(352643601L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removePairing(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void removePairing__455192991(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-455192991L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendPairingData(Lnet/minecraft/server/level/ServerPlayer;Ljava/util/function/Consumer;)V", cancellable = true)
    private void sendPairingData__283435669(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-283435669L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addPairing(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void addPairing__455192991(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-455192991L))
            info.cancel();
    }


}
