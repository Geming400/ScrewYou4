package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.StagedVertexBuffer.Draw.class)
public class Draw_1942968232Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty__1292882693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1292882693L))
            info.setReturnValue(true);
    }


}
