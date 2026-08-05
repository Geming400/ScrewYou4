package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.skeleton.Bogged.class)
public class Bogged128383934Mixin {
        @Inject(at = @At("HEAD"), method = "isSheared()Z", cancellable = true)
    private void isSheared_166662517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(166662517L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setSheared(Z)V", cancellable = true)
    private void setSheared_1358000763(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1358000763L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shear(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/sounds/SoundSource;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void shear_606007043(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(606007043L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createAttributes()Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", cancellable = true)
    private static void createAttributes__571834511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-571834511L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readyForShearing()Z", cancellable = true)
    private void readyForShearing_166662517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(166662517L))
            info.setReturnValue(true);
    }


}
