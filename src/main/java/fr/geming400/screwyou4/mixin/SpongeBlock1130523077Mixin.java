package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.SpongeBlock.class)
public class SpongeBlock1130523077Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2097998965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2097998965L))
            info.setReturnValue(null);
    }


}
