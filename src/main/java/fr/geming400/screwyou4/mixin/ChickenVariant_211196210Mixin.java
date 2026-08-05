package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.chicken.ChickenVariant.class)
public class ChickenVariant_211196210Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1596708468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1596708468L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__924263766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-924263766L))
            info.setReturnValue("俖eM%bl3/Yㄶ*[ZS4D^AJAᅘwPL=1kQ2YsD>0宴}6Ynu>IEwNTQ,MJf%.P08N윙p]Zc>kyR_砇}`a|繬");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_249458951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(249458951L))
            info.setReturnValue(60755691);
    }

    @Inject(at = @At("HEAD"), method = "spawnConditions()Lnet/minecraft/world/entity/variant/SpawnPrioritySelectors;", cancellable = true)
    private void spawnConditions__695465637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-695465637L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "modelAndTexture()Lnet/minecraft/world/entity/variant/ModelAndTexture;", cancellable = true)
    private void modelAndTexture_1039924279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1039924279L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "babyTexture()Lnet/minecraft/core/ClientAsset$ResourceTexture;", cancellable = true)
    private void babyTexture__1040985011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1040985011L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selectors()Ljava/util/List;", cancellable = true)
    private void selectors_1837533025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1837533025L))
            info.setReturnValue(null);
    }


}
