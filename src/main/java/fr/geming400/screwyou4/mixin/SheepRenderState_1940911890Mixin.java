package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.state.SheepRenderState.class)
public class SheepRenderState_1940911890Mixin {
        @Inject(at = @At("HEAD"), method = "getWoolColor()I", cancellable = true)
    private void getWoolColor__1304816385(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1304816385L))
            info.setReturnValue(-1603152680);
    }


}
