package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.decoration.GlowItemFrame.class)
public class GlowItemFrame_1454036545Mixin {
        @Inject(at = @At("HEAD"), method = "getAddItemSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getAddItemSound__1810943887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1810943887L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRotateItemSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getRotateItemSound_1685120215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1685120215L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRemoveItemSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getRemoveItemSound__1837506496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1837506496L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreakSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getBreakSound__155623716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-155623716L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlaceSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getPlaceSound__966306588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-966306588L))
            info.setReturnValue(null);
    }


}
