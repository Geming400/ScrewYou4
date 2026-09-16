package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.chicken.ChickenSoundVariant.ChickenSoundSet.class)
public class ChickenSoundSet_635833639Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__272792630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-272792630L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1406257163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1406257163L))
            info.setReturnValue("%CP7R\u3E49!+i/#r,&");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1193185729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1193185729L))
            info.setReturnValue(-1811238003);
    }

    @Inject(at = @At("HEAD"), method = "hurtSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void hurtSound__2144125214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2144125214L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deathSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void deathSound__1944176953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1944176953L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stepSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void stepSound_900357919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(900357919L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ambientSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void ambientSound__1691724565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1691724565L))
            info.setReturnValue(null);
    }


}
