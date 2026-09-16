package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.player.ProfileKeyPair.class)
public class ProfileKeyPair144681202Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__763945066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-763945066L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_915104727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(915104727L))
            info.setReturnValue("-(\u5193:\u282DsK6]yz9`Da1:fG");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_702033293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(702033293L))
            info.setReturnValue(354498890);
    }

    @Inject(at = @At("HEAD"), method = "publicKey()Lnet/minecraft/world/entity/player/ProfilePublicKey;", cancellable = true)
    private void publicKey_1680959158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1680959158L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "privateKey()Ljava/security/PrivateKey;", cancellable = true)
    private void privateKey__1789068290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1789068290L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dueRefresh()Z", cancellable = true)
    private void dueRefresh_2051360962(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2051360962L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "refreshedAfter()Ljava/time/Instant;", cancellable = true)
    private void refreshedAfter_92188808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(92188808L))
            info.setReturnValue(null);
    }


}
