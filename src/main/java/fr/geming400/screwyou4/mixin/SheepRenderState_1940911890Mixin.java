package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.state.SheepRenderState.class)
public class SheepRenderState_1940911890Mixin {
        @Inject(at = @At("HEAD"), method = "getWoolColor()I", cancellable = true)
    private void getWoolColor_1979174135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1979174135L))
            info.setReturnValue(1761879731);
    }


}
