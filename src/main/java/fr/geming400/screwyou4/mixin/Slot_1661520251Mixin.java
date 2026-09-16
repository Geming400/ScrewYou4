package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.render.DynamicAtlasAllocator.Slot.class)
public class Slot_1661520251Mixin {
        @Inject(at = @At("HEAD"), method = "x()I", cancellable = true)
    private void x_840313320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(840313320L))
            info.setReturnValue(1628835927);
    }

    @Inject(at = @At("HEAD"), method = "state()Lnet/minecraft/client/gui/render/DynamicAtlasAllocator$SlotState;", cancellable = true)
    private void state_1675701972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1675701972L))
            info.setReturnValue(net.minecraft.client.gui.render.DynamicAtlasAllocator.SlotState.EMPTY);
    }

    @Inject(at = @At("HEAD"), method = "y()I", cancellable = true)
    private void y_868942471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(868942471L))
            info.setReturnValue(240448478);
    }


}
