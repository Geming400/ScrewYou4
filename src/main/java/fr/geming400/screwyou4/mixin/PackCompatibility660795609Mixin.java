package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.packs.repository.PackCompatibility.class)
public class PackCompatibility660795609Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/server/packs/repository/PackCompatibility;", cancellable = true)
    private static void values_592633087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(592633087L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/server/packs/repository/PackCompatibility;", cancellable = true)
    private static void valueOf_2087002968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2087002968L))
            info.setReturnValue(net.minecraft.server.packs.repository.PackCompatibility.TOO_OLD);
    }

    @Inject(at = @At("HEAD"), method = "getDescription()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getDescription_216851634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(216851634L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isCompatible()Z", cancellable = true)
    private void isCompatible__1599782478(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1599782478L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getConfirmation()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getConfirmation_740461143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(740461143L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forVersion(Lnet/minecraft/util/InclusiveRange;Lnet/minecraft/server/packs/metadata/pack/PackFormat;)Lnet/minecraft/server/packs/repository/PackCompatibility;", cancellable = true)
    private static void forVersion_1552451742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1552451742L))
            info.setReturnValue(net.minecraft.server.packs.repository.PackCompatibility.TOO_NEW);
    }


}
