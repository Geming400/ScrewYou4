package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.player.ProfileKeyPair.class)
public class ProfileKeyPair144681202Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1530193461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1530193461L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__990778773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-990778773L))
            info.setReturnValue("勌K6X%o8C &Kz>3^wh!n\"!+깸䔈L74Vro#G>h憙L0e.VV)C7@T옓W");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_182943944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(182943944L))
            info.setReturnValue(-1635357054);
    }

    @Inject(at = @At("HEAD"), method = "publicKey()Lnet/minecraft/world/entity/player/ProfilePublicKey;", cancellable = true)
    private void publicKey__950890112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-950890112L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "privateKey()Ljava/security/PrivateKey;", cancellable = true)
    private void privateKey__1130350814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1130350814L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dueRefresh()Z", cancellable = true)
    private void dueRefresh_182959785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(182959785L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "refreshedAfter()Ljava/time/Instant;", cancellable = true)
    private void refreshedAfter_1241915402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1241915402L))
            info.setReturnValue(null);
    }


}
