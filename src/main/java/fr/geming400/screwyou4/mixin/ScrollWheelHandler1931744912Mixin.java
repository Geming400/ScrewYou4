package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.ScrollWheelHandler.class)
public class ScrollWheelHandler1931744912Mixin {
        @Inject(at = @At("HEAD"), method = "getNextScrollWheelSelection(DII)I", cancellable = true)
    private static void getNextScrollWheelSelection_1009089154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1009089154L))
            info.setReturnValue(1785248346);
    }

    @Inject(at = @At("HEAD"), method = "onMouseScroll(DD)Lorg/joml/Vector2i;", cancellable = true)
    private void onMouseScroll_142501242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(142501242L))
            info.setReturnValue(new org.joml.Vector2i());
    }


}
