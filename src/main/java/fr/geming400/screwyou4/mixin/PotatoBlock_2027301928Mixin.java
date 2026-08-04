package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.PotatoBlock.class)
public class PotatoBlock_2027301928Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__531811645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-531811645L))
            info.setReturnValue(null);
    }


}
