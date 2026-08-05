package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.decoration.GlowItemFrame.class)
public class GlowItemFrame_1454036545Mixin {
        @Inject(at = @At("HEAD"), method = "getRotateItemSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getRotateItemSound__1750717854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1750717854L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAddItemSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getAddItemSound__1750717854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1750717854L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRemoveItemSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getRemoveItemSound__1750717854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1750717854L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlaceSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getPlaceSound__1750717854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1750717854L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreakSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getBreakSound__1750717854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1750717854L))
            info.setReturnValue(null);
    }


}
