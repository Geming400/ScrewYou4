package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.feline.CatSoundVariant.CatSoundSet.class)
public class CatSoundSet1206569755Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1702885282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1702885282L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_71109780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(71109780L))
            info.setReturnValue("-\uAA7BK \u26E7W3N)o G^NH;\u8194:UNoQ$)\u844B7D7/`k\u44EA@?('L\u1526;^D \u96D3Wp6j)+3\u025EFya\uBE97B\u4BE2hs5_YM:Pcq4Rq\u8A3BP9%V=gD\u60E2ZwAmr\uFE2BUR@");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1244832497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1244832497L))
            info.setReturnValue(-1936333057);
    }

    @Inject(at = @At("HEAD"), method = "begForFoodSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void begForFoodSound__1539521769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1539521769L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "purreowSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void purreowSound__1539521769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1539521769L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "strayAmbientSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void strayAmbientSound__1539521769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1539521769L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ambientSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void ambientSound__1539521769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1539521769L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deathSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void deathSound__1539521769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1539521769L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hurtSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void hurtSound__1539521769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1539521769L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "eatSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void eatSound__1539521769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1539521769L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hissSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void hissSound__1539521769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1539521769L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "purrSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void purrSound__1539521769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1539521769L))
            info.setReturnValue(null);
    }


}
