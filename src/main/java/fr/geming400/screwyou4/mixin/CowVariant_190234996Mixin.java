package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.cow.CowVariant.class)
public class CowVariant_190234996Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1575747254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1575747254L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__945224980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-945224980L))
            info.setReturnValue("buCVmA N鴱[b}@ys蚾w辨L'fzd3H1DHrU2z|!Gb5]捪FsOC1T鞱,r64b!-尉A+xvkzmB9kOtCi쓱y❏p৻Ev_芣E}'6Xa");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_228497737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(228497737L))
            info.setReturnValue(104204306);
    }

    @Inject(at = @At("HEAD"), method = "spawnConditions()Lnet/minecraft/world/entity/variant/SpawnPrioritySelectors;", cancellable = true)
    private void spawnConditions__716426851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-716426851L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "modelAndTexture()Lnet/minecraft/world/entity/variant/ModelAndTexture;", cancellable = true)
    private void modelAndTexture_1018963065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1018963065L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "babyTexture()Lnet/minecraft/core/ClientAsset$ResourceTexture;", cancellable = true)
    private void babyTexture__1061946225(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1061946225L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selectors()Ljava/util/List;", cancellable = true)
    private void selectors_1816571811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1816571811L))
            info.setReturnValue(null);
    }


}
