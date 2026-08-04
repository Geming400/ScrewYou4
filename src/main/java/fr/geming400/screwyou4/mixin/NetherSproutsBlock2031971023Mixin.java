package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.NetherSproutsBlock.class)
public class NetherSproutsBlock2031971023Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__527142549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-527142549L))
            info.setReturnValue(null);
    }


}
