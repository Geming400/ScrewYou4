package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.BlockModelSet.class)
public class BlockModelSet1373451608Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/client/renderer/block/model/BlockModel;", cancellable = true)
    private void get__232754675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-232754675L))
            info.setReturnValue(null);
    }


}
