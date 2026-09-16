package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.skeleton.Bogged.class)
public class Bogged128383934Mixin {
        @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes_1503485924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1503485924L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shear(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/sounds/SoundSource;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void shear__146257790(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-146257790L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readyForShearing()Z", cancellable = true)
    private void readyForShearing__406918098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-406918098L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isSheared()Z", cancellable = true)
    private void isSheared_686528127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(686528127L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setSheared(Z)V", cancellable = true)
    private void setSheared__528721287(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-528721287L))
            info.cancel();
    }


}
