package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.model.BlockDisplayContext.class)
public class BlockDisplayContext_756814324Mixin {
        @Inject(at = @At("HEAD"), method = "create()Lnet/minecraft/client/renderer/block/model/BlockDisplayContext;", cancellable = true)
    private static void create_1689561725(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1689561725L))
            info.setReturnValue(null);
    }


}
