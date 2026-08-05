package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.SulfurCubeArchetype.KnockbackModifiers.class)
public class KnockbackModifiers100852974Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1486365233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1486365233L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1034607001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1034607001L))
            info.setReturnValue("AD^\uBA8DY\u9865c&'JD^\u43EDyVJv2&i|&\u867FM=,k\u1B61;fW8^\u7D2E]");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_139115716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(139115716L))
            info.setReturnValue(1421630420);
    }

    @Inject(at = @At("HEAD"), method = "horizontalPower()F", cancellable = true)
    private void horizontalPower_139112337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(139112337L))
            info.setReturnValue(7.066992E8F);
    }

    @Inject(at = @At("HEAD"), method = "verticalPower()F", cancellable = true)
    private void verticalPower_139112337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(139112337L))
            info.setReturnValue(7.066992E8F);
    }


}
