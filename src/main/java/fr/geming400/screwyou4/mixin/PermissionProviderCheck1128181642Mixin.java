package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.permissions.PermissionProviderCheck.class)
public class PermissionProviderCheck1128181642Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_219555374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(219555374L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1898605167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1898605167L))
            info.setReturnValue("HGkGV\u73C2d8;;\u5BD1\u53DDCB.CRvvBaV[\"<\"\uC546\u45DC!7H%hz_aVM*\u89D8T\u8C2DmK^");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1685533733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1685533733L))
            info.setReturnValue(-1806958727);
    }

    @Inject(at = @At("HEAD"), method = "test(Lnet/minecraft/server/permissions/PermissionSetSupplier;)Z", cancellable = true)
    private void test_600421058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(600421058L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test()Lnet/minecraft/server/permissions/PermissionCheck;", cancellable = true)
    private void test_1126337716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1126337716L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__608790069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-608790069L))
            info.setReturnValue(true);
    }


}
