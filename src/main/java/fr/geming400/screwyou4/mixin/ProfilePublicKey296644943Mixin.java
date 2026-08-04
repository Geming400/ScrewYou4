package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.player.ProfilePublicKey.class)
public class ProfilePublicKey296644943Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1682157202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1682157202L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__838815032(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-838815032L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_334907685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(334907685L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "data()Lnet/minecraft/world/entity/player/ProfilePublicKey$Data;", cancellable = true)
    private void data_599056677(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(599056677L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createValidated(Lnet/minecraft/util/SignatureValidator;Ljava/util/UUID;Lnet/minecraft/world/entity/player/ProfilePublicKey$Data;)Lnet/minecraft/world/entity/player/ProfilePublicKey;", cancellable = true)
    private static void createValidated_1149412036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1149412036L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createSignatureValidator()Lnet/minecraft/util/SignatureValidator;", cancellable = true)
    private void createSignatureValidator_1786597472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1786597472L))
            info.setReturnValue(null);
    }


}
