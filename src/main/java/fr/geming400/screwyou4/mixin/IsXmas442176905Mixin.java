package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.model.properties.conditional.IsXmas.class)
public class IsXmas442176905Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void get_296887919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(296887919L))
            info.setReturnValue(false);
    }


}
