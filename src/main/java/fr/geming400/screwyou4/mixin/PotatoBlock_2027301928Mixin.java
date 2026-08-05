package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.PotatoBlock.class)
public class PotatoBlock_2027301928Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1201220115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1201220115L))
            info.setReturnValue(null);
    }


}
