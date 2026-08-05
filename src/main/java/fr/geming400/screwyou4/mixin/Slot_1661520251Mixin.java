package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.render.DynamicAtlasAllocator.Slot.class)
public class Slot_1661520251Mixin {
        @Inject(at = @At("HEAD"), method = "x()I", cancellable = true)
    private void x_1699782496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1699782496L))
            info.setReturnValue(231367637);
    }

    @Inject(at = @At("HEAD"), method = "state()Lnet/minecraft/client/gui/render/DynamicAtlasAllocator$SlotState;", cancellable = true)
    private void state__1826965307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1826965307L))
            info.setReturnValue(net.minecraft.client.gui.render.DynamicAtlasAllocator.SlotState.STALE);
    }

    @Inject(at = @At("HEAD"), method = "y()I", cancellable = true)
    private void y_1699782496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1699782496L))
            info.setReturnValue(231367637);
    }


}
