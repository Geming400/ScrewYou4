package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.BannerPattern.class)
public class BannerPattern_500565082Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1886077340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1886077340L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__634894894(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-634894894L))
            info.setReturnValue("7k2୶{&PbL)pa:KM#LHhQh'^zyGy-aTa6CILaU[]R̊ΎK=鉀");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_538827823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(538827823L))
            info.setReturnValue(-848734423);
    }

    @Inject(at = @At("HEAD"), method = "assetId()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void assetId__1942501472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1942501472L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "translationKey()Ljava/lang/String;", cancellable = true)
    private void translationKey__634895390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-634895390L))
            info.setReturnValue("穒?#LH끈%T?묜\"㤥cKJᏨVN*DYﯷ쭑W)Ux8:K$G媰'gy(弟x(*e?牪w`ut꿙Qd%'xnrhe9wRpttQ56韂2Rko-RFYR(cPh=#]ZW|`vw늼");
    }


}
