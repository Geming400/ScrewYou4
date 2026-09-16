package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.pig.PigVariant.class)
public class PigVariant_769106141Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__139520128(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-139520128L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1539529665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1539529665L))
            info.setReturnValue("OyUJ3QP<*U");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1326458231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1326458231L))
            info.setReturnValue(-1109630540);
    }

    @Inject(at = @At("HEAD"), method = "selectors()Ljava/util/List;", cancellable = true)
    private void selectors_339432832(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(339432832L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnConditions()Lnet/minecraft/world/entity/variant/SpawnPrioritySelectors;", cancellable = true)
    private void spawnConditions__1659887085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1659887085L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "modelAndTexture()Lnet/minecraft/world/entity/variant/ModelAndTexture;", cancellable = true)
    private void modelAndTexture__270076881(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-270076881L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "babyTexture()Lnet/minecraft/core/ClientAsset$ResourceTexture;", cancellable = true)
    private void babyTexture__3879203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-3879203L))
            info.setReturnValue(null);
    }


}
