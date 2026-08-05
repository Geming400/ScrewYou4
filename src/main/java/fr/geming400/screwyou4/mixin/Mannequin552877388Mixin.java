package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.decoration.Mannequin.class)
public class Mannequin552877388Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/core/component/DataComponentType;)Ljava/lang/Object;", cancellable = true)
    private void get_389784983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(389784983L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)Lnet/minecraft/world/entity/decoration/Mannequin;", cancellable = true)
    private static void create__1842815166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1842815166L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEffectiveAi()Z", cancellable = true)
    private void isEffectiveAi_591155971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(591155971L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "aiStep()V", cancellable = true)
    private void aiStep_591152127(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(591152127L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getProfile()Lnet/minecraft/world/item/component/ResolvableProfile;", cancellable = true)
    private void getProfile_1349082913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1349082913L))
            info.setReturnValue(null);
    }


}
