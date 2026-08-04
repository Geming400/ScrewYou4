package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.CactusBlock.class)
public class CactusBlock1893211410Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__665902162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-665902162L))
            info.setReturnValue(null);
    }


}
