package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ServerEntity.class)
public class ServerEntity314368862Mixin {
        @Inject(at = @At("HEAD"), method = "addPairing(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void addPairing_1842264328(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1842264328L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendChanges()V", cancellable = true)
    private void sendChanges_1239802070(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1239802070L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sendPairingData(Lnet/minecraft/server/level/ServerPlayer;Ljava/util/function/Consumer;)V", cancellable = true)
    private void sendPairingData__1330719423(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1330719423L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removePairing(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void removePairing__1957175035(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1957175035L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPositionBase()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getPositionBase__787200697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-787200697L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLastSentXRot()F", cancellable = true)
    private void getLastSentXRot__1698573634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1698573634L))
            info.setReturnValue(6.286832E8F);
    }

    @Inject(at = @At("HEAD"), method = "getLastSentYHeadRot()F", cancellable = true)
    private void getLastSentYHeadRot_264827199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(264827199L))
            info.setReturnValue(6.286832E8F);
    }

    @Inject(at = @At("HEAD"), method = "getLastSentMovement()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getLastSentMovement_1739550436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1739550436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLastSentYRot()F", cancellable = true)
    private void getLastSentYRot_788939199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(788939199L))
            info.setReturnValue(6.286832E8F);
    }


}
