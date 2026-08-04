package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.repository.KnownPack.class)
public class KnownPack_2016907074Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__892547964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-892547964L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_881446602(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(881446602L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "version()Ljava/lang/String;", cancellable = true)
    private void version_881446602(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(881446602L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2055169815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2055169815L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "id()Ljava/lang/String;", cancellable = true)
    private void id_881446602(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(881446602L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "namespace()Ljava/lang/String;", cancellable = true)
    private void namespace_881446602(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(881446602L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "vanilla(Ljava/lang/String;)Lnet/minecraft/server/packs/repository/KnownPack;", cancellable = true)
    private static void vanilla_1162497187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1162497187L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isVanilla()Z", cancellable = true)
    private void isVanilla_2055185656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2055185656L))
            info.setReturnValue(null);
    }


}
