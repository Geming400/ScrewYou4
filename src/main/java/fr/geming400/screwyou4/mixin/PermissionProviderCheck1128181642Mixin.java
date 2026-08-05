package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.permissions.PermissionProviderCheck.class)
public class PermissionProviderCheck1128181642Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1781273395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1781273395L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__7278333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-7278333L))
            info.setReturnValue("\uA717eb+^+\u861AcxYt%=7&h2|OupQi1S'1'\u743AZ?}r5\u845B\u0188Gs]2TF/DKXv\u3D0Az}gKm2F3[2_|!wI#:d(\u5B65^K\u4F2F+L\u1C2Da\uA2D9\u6D70kWvp$p");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1166444384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1166444384L))
            info.setReturnValue(-1907329063);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/server/permissions/PermissionSetSupplier;)Z", cancellable = true)
    private void test_1996344852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1996344852L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test()Lnet/minecraft/server/permissions/PermissionCheck;", cancellable = true)
    private void test_1320069538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1320069538L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__1781144931(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1781144931L))
            info.setReturnValue(true);
    }


}
