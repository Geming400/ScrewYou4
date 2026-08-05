package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.repository.PackCompatibility.class)
public class PackCompatibility660795609Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/server/packs/repository/PackCompatibility;", cancellable = true)
    private static void values_704802653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(704802653L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/server/packs/repository/PackCompatibility;", cancellable = true)
    private static void valueOf__1481008256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1481008256L))
            info.setReturnValue(net.minecraft.server.packs.repository.PackCompatibility.TOO_NEW);
    }

    @Inject(at = @At("HEAD"), method = "getDescription()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDescription__1516113556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1516113556L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isCompatible()Z", cancellable = true)
    private void isCompatible_699074192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(699074192L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "forVersion(Lnet/minecraft/util/InclusiveRange;Lnet/minecraft/server/packs/metadata/pack/PackFormat;)Lnet/minecraft/server/packs/repository/PackCompatibility;", cancellable = true)
    private static void forVersion__1676167923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1676167923L))
            info.setReturnValue(net.minecraft.server.packs.repository.PackCompatibility.TOO_OLD);
    }

    @Inject(at = @At("HEAD"), method = "getConfirmation()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getConfirmation__1516113556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1516113556L))
            info.setReturnValue(null);
    }


}
