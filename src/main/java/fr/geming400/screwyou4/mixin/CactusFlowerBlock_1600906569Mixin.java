package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.CactusFlowerBlock.class)
public class CactusFlowerBlock_1600906569Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1627615474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1627615474L))
            info.setReturnValue(null);
    }


}
