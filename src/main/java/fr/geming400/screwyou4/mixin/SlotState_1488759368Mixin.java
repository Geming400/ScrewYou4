package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.render.DynamicAtlasAllocator.SlotState.class)
public class SlotState_1488759368Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/render/DynamicAtlasAllocator$SlotState;", cancellable = true)
    private static void values__357921423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-357921423L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/render/DynamicAtlasAllocator$SlotState;", cancellable = true)
    private static void valueOf__909056364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-909056364L))
            info.setReturnValue(net.minecraft.client.gui.render.DynamicAtlasAllocator.SlotState.READY);
    }


}
