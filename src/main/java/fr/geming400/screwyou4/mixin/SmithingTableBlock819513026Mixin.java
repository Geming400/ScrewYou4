package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.SmithingTableBlock.class)
public class SmithingTableBlock819513026Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1885958280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1885958280L))
            info.setReturnValue(null);
    }


}
