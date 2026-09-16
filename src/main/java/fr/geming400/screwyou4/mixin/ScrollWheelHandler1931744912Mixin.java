package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.ScrollWheelHandler.class)
public class ScrollWheelHandler1931744912Mixin {
        @Inject(at = @At("HEAD"), method = "onMouseScroll(DD)Lorg/joml/Vector2i;", cancellable = true)
    private void onMouseScroll_1060828263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1060828263L))
            info.setReturnValue(new org.joml.Vector2i());
    }

    @Inject(at = @At("HEAD"), method = "getNextScrollWheelSelection(DII)I", cancellable = true)
    private static void getNextScrollWheelSelection_1759179049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1759179049L))
            info.setReturnValue(-1325020430);
    }


}
