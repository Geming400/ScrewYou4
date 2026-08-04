package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.DropExperienceBlock.class)
public class DropExperienceBlock_1892115706Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__666997867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-666997867L))
            info.setReturnValue(null);
    }


}
