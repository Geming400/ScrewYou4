package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.decoration.Mannequin.class)
public class Mannequin552877388Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get__2075382675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2075382675L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)Lnet/minecraft/world/entity/decoration/Mannequin;", cancellable = true)
    private static void create__1797849146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1797849146L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEffectiveAi()Z", cancellable = true)
    private void isEffectiveAi__911937154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-911937154L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep__2110792341(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2110792341L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getProfile()Lnet/minecraft/world/item/component/ResolvableProfile;", cancellable = true)
    private void getProfile__331358508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-331358508L))
            info.setReturnValue(null);
    }


}
